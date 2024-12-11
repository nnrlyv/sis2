package task1;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher= new CaesarCipher(4);
        String myText = "full mark?";

        String encryptedText= cipher.encrypt(myText); //polymorphism
        System.out.println("Result "+ encryptedText);

        String decryptedText=cipher.decrypt(encryptedText);
        System.out.println("Decrypted "+ decryptedText);
    }
}
