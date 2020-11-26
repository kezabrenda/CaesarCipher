public class Encryption {
        private String msg;
        private int key;

        public Encryption(String msg, int key) {
            this.msg = msg;
            this.key = key;
        }

        public String getMsg() {
            return this.msg;
        }
        public int getKey(){
            return this.key;
        }

        public static String encryptedMsg(String msg, int key) {
            String encryptMsg = "";
            for (int i = 0; i < msg.length(); i++) {
                if ((int) msg.charAt(i) == 32) {
                    encryptMsg += (char) 32;
                } else if ((int) msg.charAt(i) + key > 122) {
                    int temp = (int) msg.charAt(i) + key - 122;
                    encryptMsg += (char) (96 + temp);
                } else if ((int) msg.charAt(i) + key > 90 && (int) msg.charAt(i) < 96) {
                    int temp = (int) msg.charAt(i) + key - 90;
                    encryptMsg += (char) (64 + temp);
                } else {
                    encryptMsg += (char) ((int) msg.charAt(i) + key);
                }
            }

            return encryptMsg;

        }
    }