import java.util.regex.Matcher;
import java.util.regex.Pattern;


class TransactionParty {
    String seller;
    String buyer;

    public TransactionParty(String seller, String buyer) {
        this.seller = seller;
        this.buyer = buyer;
    }
}

class Receipt {
    TransactionParty transactionParty;
    String productsQR;

    public Receipt(TransactionParty transactionParty, String productsQR) {
        this.transactionParty = transactionParty;
        this.productsQR = productsQR;
    }
}

public class Example1 {

    public int verifyParty(Receipt r) {
        String sellerRegex = "^[a-zA-Z' -]+$";
        Pattern pattern = Pattern.compile(sellerRegex);

        Matcher sellerMatcher = pattern.matcher(r.transactionParty.seller);
        Matcher buyerMatcher = pattern.matcher(r.transactionParty.buyer);

        boolean isSellerValid = sellerMatcher.matches();
        boolean isBuyerValid = buyerMatcher.matches();

        if (isSellerValid && isBuyerValid) {
            return 2; // Both names are valid
        } else if (isSellerValid || isBuyerValid) {
            return 1; // Only one name is valid
        } else {
            return 0; // Both names are invalid
        }
    }

    public String calcGST(Receipt r) {
        String[] products = r.productsQR.split("@");
        double gstRate = 0.12;
        int gst = 0;

        for (String product : products) {
            String[] rateAndQuantity = product.split(",");
            int rate = Integer.parseInt(rateAndQuantity[0].trim());
            int quantity = Integer.parseInt(rateAndQuantity[1].trim());
            gst += (int) (rate * gstRate * quantity);
        }

        return Integer.toString(gst);
    }
}

