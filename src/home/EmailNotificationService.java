package home;

public class EmailNotificationService implements NotificationService {

    private String message;
    public EmailNotificationService(String msg){
        this.message=msg;
    }

    @Override
    public String getMessage() {
      
        MyUtils.log("EMAIL SENDING MESSAGE:", this.message);
        return this.message;
    }
}
