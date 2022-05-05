package home;

public class WhatsAppNotificationService implements NotificationService {

    private String message;

    public WhatsAppNotificationService(String message){
        this.message=message;
    }
    @Override
    public String getMessage() {
        MyUtils.log("WHATSAPP NOTIFICATION SENDING MESSAGE", this.message);
        return this.message;
    }
    
}
