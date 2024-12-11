package task1;

public class CaesarCipher implements Cipher {
    private int shift; //incapsulation

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    public String encrypt(String text) {
        return processText(text, shift);
    }

    public String decrypt(String text) {
        return processText(text, -shift);
    }

    private String processText(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append((char) ('A' + (c - 'A' + shift + 26) % 26));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ('a' + (c - 'a' + shift + 26) % 26));

            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
