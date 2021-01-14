import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hashSHA256 {

    public String returnHash(String input){
        String returnValue;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(input.getBytes());
            byte[] hashed = md.digest();
            StringBuilder sb = new StringBuilder();
                for(int i = 0; i<hashed.length; i++){
                    sb.append(Integer.toString((hashed[i] & 0xff) + 0x100, 16).substring(1));

                }
                returnValue = sb.toString();
                return returnValue;
        }
        catch (NoSuchAlgorithmException e){

            System.out.println("Error");
        }

        return  null;
    }

    public boolean hashMatch(String preHashInput, String postHashInput){

        if (returnHash(preHashInput) == postHashInput){
            return true;
        }

        return false;
    }

}
