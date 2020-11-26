import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptionTest {

    //msg is short for message

    @Test
    public void firstDecode() throws Exception {
        Decryption testDecodeMsg=new Decryption ("hello", 1);
        assertEquals (true, testDecodeMsg instanceof Decryption); // this test test the overall process of decryption
    }
    @Test
    public void getKey() throws Exception {
        Decryption DecodeMsg = new Decryption ("hello", 1);
        assertEquals (1, DecodeMsg.getKey ()); // this test checks the functionality of the getKey method
    }
    @Test
    public void getMsg() throws Exception{
        Decryption DecodeMsg = new Decryption ("hello",1);
        assertEquals ("hello",DecodeMsg.getMsg());// this test checks the functionality of the getMsg method
    }
}