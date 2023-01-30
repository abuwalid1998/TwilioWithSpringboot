package com.sendwhatsappmessage.whatsappmessage.Service;


import com.sendwhatsappmessage.whatsappmessage.model.WhatsMessage;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MessageService {



    public String SendWhatsAppMessage(WhatsMessage whatsMessage){

        Twilio.init(whatsMessage.getACCOUNT_SID(),whatsMessage.getAUTH_TOKEN());

        //+972599841241
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:"+whatsMessage.getPhoneNumber()),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        whatsMessage.getText())
                .create();
        return message.getSid();
    }

    public  String SendSms(@RequestBody WhatsMessage whatsMessagemessage){

        Twilio.init(whatsMessagemessage.getACCOUNT_SID(),whatsMessagemessage.getAUTH_TOKEN());
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(whatsMessagemessage.getPhoneNumber()),
                        "MG3bb4a0499987182260886274411db30c",
                        whatsMessagemessage.getText())
                .create();

        return message.getSid();

    }



}
