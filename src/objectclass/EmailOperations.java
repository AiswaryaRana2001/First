package objectclass;

class Header {
    String from;
    String to;

    public Header(String from, String to) {
        this.from = from;
        this.to = to;
    }
}

class Email {
    Header header;
    String body;
    String greetings;

    public Email(Header header, String body, String greetings) {
        this.header = header;
        this.body = body;
        this.greetings = greetings;
    }
}

public class EmailOperations {

    public int emailVerify(Email e) {
        String emailRegex = "^[A-Za-z_]+@[A-Za-z]+\\.[A-Za-z]+$";
        boolean isValidFrom = e.header.from.matches(emailRegex);
        boolean isValidTo = e.header.to.matches(emailRegex);

        if (isValidFrom && isValidTo) {
            return 2; // Both emails are valid
        } else if (isValidFrom || isValidTo) {
            return 1; // Only one email is valid
        } else {
            return 0; // Both emails are invalid
        }
    }

    public String bodyEncryption(Email e) {
        StringBuilder encryptedBody = new StringBuilder();

        for (char ch : e.body.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                encryptedBody.append((char) ((ch + 3 - 'A') % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                encryptedBody.append((char) ((ch + 3 - 'a') % 26 + 'a'));
            } else {
                encryptedBody.append(ch);
            }
        }

        return encryptedBody.toString();
    }

    public String greetingMessage(Email e) {
        String name = e.header.from.split("@")[0];
        return e.greetings + " " + name;
    }

    public static void main(String[] args) {
        Header header = new Header("amit@doselect", "1ami@dos.com");
        Email email = new Email(header, "Hi There Hows you", "Regards");

        EmailOperations operations = new EmailOperations();

        // Email verification
        int verificationResult = operations.emailVerify(email);
        System.out.println("Email Verification Result: " + verificationResult);

        // Body encryption
        String encryptedBody = operations.bodyEncryption(email);
        System.out.println("Encrypted Body: " + encryptedBody);

        // Greeting message
        String greetingMessage = operations.greetingMessage(email);
        System.out.println("Greeting Message: " + greetingMessage);
    }
}


