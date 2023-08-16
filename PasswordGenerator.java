import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 12; 
        System.out.println(generateRandomPassword(length));
    }

    public static String generateRandomPassword(int length) {
        final String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charset.length());
            password.append(charset.charAt(randomIndex));
        }

        return password.toString();
    }
}