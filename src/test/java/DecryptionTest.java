import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptionTest {

    //msg is short for message

    @Test
    public void firstDecode() throws Exception {
        Decryption testDecodeMsg=new Decryption ("hello", 1);
        assertEquals (true, testDecodeMsg instanceof Decryption); // this test test the overall process of decryption
    }
}