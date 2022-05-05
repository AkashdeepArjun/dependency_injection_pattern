package home;

import java.security.InvalidKeyException;

public class Client {

    public static void main(String[] args){


        String message ="popat";
        DependencyInjector injector=null;
        Consumer app =null;


        injector=new EmailNotificationServiceInjector(message);
        app=injector.getConsumer();
        app.recieveMessage();


        injector=new WhatsAppNotificationServiceInjector(message);
        app=injector.getConsumer();
        app.recieveMessage();


    }
    

  

    
    
}
