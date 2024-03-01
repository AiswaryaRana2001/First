package com.cap;


import java.util.regex.Pattern;


import java.util.regex.Matcher;

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

public class GenerateReceipt {

    public int verifyParty(Receipt r) {
        String sellerName = r.transactionParty.seller;
        String buyerName = r.transactionParty.buyer;

        boolean isValidSeller = validateName(sellerName);
        boolean isValidBuyer = validateName(buyerName);

        if (isValidSeller && isValidBuyer) {
            return 2; // Both names are valid
        } else if (isValidSeller || isValidBuyer) {
            return 1; // Only one name is valid
        } else {
            return 0; // Both names are invalid
        }
    }

    private boolean validateName(String name) {
        String regex = "^[a-zA-Z' -]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public String calcGST(Receipt r) {
        String[] products = r.productsQR.split("@");
        int GST_Rate = 12;
        int totalGST = 0;

        for (String product : products) {
            String[] parts = product.split(",");
            int rate = Integer.parseInt(parts[0]);
            int quantity = Integer.parseInt(parts[1]);
            totalGST += rate * quantity;
        }

        int gstValue = (totalGST * GST_Rate) / 100;
        return Integer.toString(gstValue);
    }

    public static void main(String[] args) {
        TransactionParty party = new TransactionParty("Daniel D'Cruz", "Giselle Dawn-Wright");
        Receipt receipt = new Receipt(party, "250,10@100,3@50,7");

        GenerateReceipt generateReceipt = new GenerateReceipt();

        // Verify party and print the result
        int verificationResult = generateReceipt.verifyParty(receipt);
        System.out.println("Verification Result: " + verificationResult);

        // Calculate and print GST
        String gstValue = generateReceipt.calcGST(receipt);
        System.out.println("GST Value: " + gstValue);
    }
}
