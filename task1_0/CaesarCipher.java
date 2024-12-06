package task1_0;

public class CaesarCipher {
    private int shift;

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