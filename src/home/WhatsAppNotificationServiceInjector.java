package home;

public class WhatsAppNotificationServiceInjector implements DependencyInjector {

    private String message;

  public WhatsAppNotificationServiceInjector(String message){
      this.message=message;
  }

    @Override
    public Consumer getConsumer() {
      
        return new AndroidMessagePool(new WhatsAppNotificationService(this.message));
    }
    
}
