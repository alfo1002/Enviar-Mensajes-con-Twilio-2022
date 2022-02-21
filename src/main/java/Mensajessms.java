import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;


public class Mensajessms {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "xxxxxxxxx";
    public static final String AUTH_TOKEN = "xxxxxxx";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+xxxxxxx"),
                new com.twilio.type.PhoneNumber("+xxxxxxxx"),
                "Este es un mensaje de Prueba desde JAVA2....")
            .create();

        System.out.println(message.getSid());
    }
}