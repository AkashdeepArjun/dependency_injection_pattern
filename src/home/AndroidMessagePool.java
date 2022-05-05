package home;

public class AndroidMessagePool implements Consumer{

    private NotificationService notification_service;

    public AndroidMessagePool(NotificationService service){

        this.notification_service=service;
    }

    @Override
    public void recieveMessage() {
      
        String message_recieved=notification_service.getMessage();

        MyUtils.log("ANDROID MESSAGE HAVE RECIEVED MESSAGE", message_recieved);
        
    }
    
}
