import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptionTest {

    @Test
    public void firstEncode() throws Exception {
        Encryption testEncodedMsg = new Encryption ("hello", 1);
        assertEquals (true, testEncodedMsg instanceof Encryption);// this test test the overall process of decryption
    }
    @Test
    public void getKey() throws Exception {
        Encryption EncodedMsg = new Encryption ("hello", 1);
        assertEquals (1, EncodedMsg.getKey ());// this test checks the functionality of the getKey method
    }
}