import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class SubscriptionManager {
    public ArrayList<User> getUsers() {
        return users;
    }

    private ArrayList<User> users = new ArrayList<User>();
    private Sender sender = new Sender("1c13c2d193ffeb6c25f1ffd4183eb660", "590734c8512351dd86a46483596476b1");
    private String sendFrom = "alisabereza@gmail.com";


    void sendMessage(String subject, String message) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).isSendMail()) {
                sender.send(subject, message, sendFrom, users.get(i).getEmail());
            }
        }
    }

    void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add new User, provide user ID: ");

        int id = scanner.nextInt();
        boolean idExists = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                System.out.println("User with this Id already exists in Subscription Manager");
                idExists = true;
            }
        }
        ;
        if (!idExists) {
            scanner.nextLine();
            System.out.println("Type user name: ");
            String name = scanner.nextLine();
            System.out.println("Type user email: ");
            String email = scanner.nextLine();
            Date registrationDate = Utils.enterDate();
            System.out.println("Send emails to user? (1-Y/2-N)");
            boolean sendMail = false;
            int choice = scanner.nextInt();
            if (choice == 1) {
                sendMail = true;
            }

            addUser(new User(id, name, email, registrationDate, sendMail));
            System.out.println("New user added");

        }
    }

    void addUser(User user) {
        users.add(user);
    }


}
