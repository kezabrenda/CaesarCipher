import java.io.Console;

public class App {
    public static void main(String[] args) {
        System.out.println("1. Encryption \n 2. Decryption \n Choose between (1,2): ");
        Console console = System.console();

        int choice = Integer.parseInt(console.readLine());

        if (choice == 1) {
            System.out.println("Encryption");
            System.out.println("Message can be only lower or upper case alphabet \n Enter your message:");
            String msg = console.readLine();
            System.out.println("Enter key (0-25)");
            String stringKey = console.readLine();
            int key = Integer.parseInt(stringKey);
            Encryption result = new Encryption(msg, key);
            String textMsg = result.encryptedMsg(msg, key);
            System.out.println(textMsg);
        }
        else if (choice == 2) {
            System.out.println("Decryption");
            System.out.println("Message can be only lower or upper case alphabet \n Enter your message:");
            String msg = console.readLine();
            System.out.println("Enter key (0-25)");
            String stringKey = console.readLine();
            int key = Integer.parseInt(stringKey);
            Decryption result = new Decryption(msg, key);
            String textMsg = result.decryptedMsg(msg, key);
            System.out.println(textMsg);
        }
    }
}
