import java.util.Date;

public class User {
    private int id;
    private String name;
    private String email;
    private Date registrationDate;
    private boolean sendMail;

    User(int id, String name, String email, Date registrationDate, boolean sendMail) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registrationDate = registrationDate;
        this.sendMail = sendMail;
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    Date getRegistrationDate() {
        return registrationDate;
    }

    void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    boolean isSendMail() {
        return sendMail;
    }

    void setSendMail(boolean sendMail) {
        this.sendMail = sendMail;
    }
}