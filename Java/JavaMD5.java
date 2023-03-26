import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

//Problem: https://www.hackerrank.com/challenges/java-md5
public class JavaMD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        String md5 = toMD5(text);
        System.out.println(md5);
    }

    private static String toMD5(String text) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest = messageDigest.digest(text.getBytes(StandardCharsets.UTF_8));
        return String.format("%032x", new BigInteger(1, digest));
    }
}
