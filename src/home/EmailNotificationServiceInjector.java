package home;

public class EmailNotificationServiceInjector implements DependencyInjector{

    private String message;



public EmailNotificationServiceInjector(String message){
    this.message=message;
}


    @Override
    public Consumer getConsumer() {
        
        return new AndroidMessagePool(new EmailNotificationService(this.message));
    }
}
