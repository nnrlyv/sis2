package task1_0;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(4);
        String myText = "High mark maybe?";

        String encryptedText = cipher.encrypt(myText);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = cipher.decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);


    }
}
