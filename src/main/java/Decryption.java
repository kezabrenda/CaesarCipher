public class Decryption {
    private String msg;
    private int key;

    public Decryption(String msg, int key) {
        this.msg = msg;
        this.key = key;
    }

    public String getMsg() {
        return this.msg;
    }
    public int getKey(){
        return this.key;
    }

    public static String decryptedMsg(String msg, int key) {
        String decryptMsg = "";
        for (int i = 0; i < msg.length(); i++) {
            if ((int) msg.charAt(i) == 32) {
                decryptMsg += (char)32;
            }
            else if ((int) msg.charAt(i) - key < 97 && (int) msg.charAt(i) > 90) {
                int temp = ((int) msg.charAt(i) - key) + 26;
                decryptMsg += (char)temp;
            }
            else if ((int) msg.charAt(i) - key < 65) {
                int temp = ((int) msg.charAt(i) - key) + 26;
                decryptMsg+= (char)temp;
            }
            else {
                decryptMsg += (char) ((int) msg.charAt(i) - key);
            }
        }
        return decryptMsg;
    }
}
