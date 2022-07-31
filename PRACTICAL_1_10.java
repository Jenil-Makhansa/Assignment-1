// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-Implement ceaser cipher
import java.util.Scanner;
public class PRACTICAL_1_10 {
        public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        //encrypt function uses the input string and shift backward each character of string [we entered as shift key] and return encrypted string.
        public static String encrypt(String plainText, int shiftKey) {
            plainText = plainText.toLowerCase();
            String cipherText = "";
            for (int i = 0; i < plainText.length(); i++) {
                int charPosition = ALPHABET.indexOf(plainText.charAt(i));
                int keyVal = (shiftKey + charPosition) % 26;
                char replaceVal = ALPHABET.charAt(keyVal);
                cipherText += replaceVal;
            }
            return cipherText;
        }
    //decrypt function uses the input string and shift previous each character of string [we entered as shift key] and return decrypted string.
        public static String decrypt(String cipherText, int shiftKey) {
            cipherText = cipherText.toLowerCase();
            String plainText = "";
            for (int i = 0; i < cipherText.length(); i++) {
                int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
                int keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal;
                }
                char replaceVal = ALPHABET.charAt(keyVal);
                plainText += replaceVal;
            }
            return plainText;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        System.out.println(encrypt(message, 3));
        System.out.println(decrypt(message, 3));
        System.out.println(decrypt(encrypt(message, 3), 3));
        sc.close();
    }
}

