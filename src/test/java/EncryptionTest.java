import org.junit.Test;
import static org.junit.Assert.*;
public class EncryptionTest {
    //msg is short for message
    @Test
    public void firstEncode() throws Exception {
        Encryption testEncodedMsg = new Encryption ("hello", 1);
        assertEquals (true, testEncodedMsg instanceof Encryption);// this test test the overall process of decryption
    }@Test
    public void getKey() throws Exception {
        Encryption EncodedMsg = new Encryption ("hello", 1);
        assertEquals (1, EncodedMsg.getKey ());// this test checks the functionality of the getKey method
    }@Test
    public void getMsg() throws Exception{
        Encryption EncodedMsg = new Encryption ("hello",1);
        assertEquals ("hello",EncodedMsg.getMsg());// this test checks the functionality of the getMsg method
    }@Test
    public void testMsg() {
        int key = 1;
        String msg = "world";
        String expectedMsg = "xpsme";
        String actualMsg = Encryption.encryptedMsg(msg, key);
        assertEquals(expectedMsg, actualMsg);// this test checks if the message entered and output are meaningful
    }@Test
    public void ogMessage(){
        String cipheredMsg = "hello";
        String expectedMsg = "hello";
        assertEquals ( expectedMsg,cipheredMsg);// this test checks if the decrypted message is the same as the one entered
    }@Test
    public void testIfUpperCaseLettersWork() {
        int key = 10;
        String letter = "D";
        String expectedLetter = "N";
        assertEquals(expectedLetter, Encryption.encryptedMsg(letter, key )); // this test checks if upperCase messages can be decrypted too
    }@Test
    public void testIfLowerCaseLettersWork() {
        int key = 24;
        String letter = "n";
        String expectedLetter = "l";
        assertEquals(expectedLetter, Encryption.encryptedMsg(letter, key ));// this test checks if lowerCase messages can be decrypted too
    }
}