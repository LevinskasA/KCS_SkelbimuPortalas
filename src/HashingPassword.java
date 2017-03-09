import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Askew on 3/9/2017.
 */
@Deprecated
public class HashingPassword {

    public static String generateMD5(String input){
        String generatedHash = null;

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(input.getBytes());
            byte[] bytes = messageDigest.digest();
            // bytes[] has bytes in decimal format
            // converting to hexadecimal
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < bytes.length; i++){
                stringBuilder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            generatedHash = stringBuilder.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return generatedHash;

    }
}
