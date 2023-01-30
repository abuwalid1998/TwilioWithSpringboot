package com.sendwhatsappmessage.whatsappmessage.Controller;


import com.sendwhatsappmessage.whatsappmessage.Service.MessageService;
import com.sendwhatsappmessage.whatsappmessage.model.WhatsMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class Controller {

    final
    MessageService messageService;





    public Controller(MessageService messageService) {
        this.messageService = messageService;
    }


    @GetMapping("/Whatsapp")
    public String SendMessage(@RequestBody WhatsMessage whatsMessage){

        System.out.println(whatsMessage.getText());
        System.out.println(whatsMessage.getPhoneNumber());

        return messageService.SendWhatsAppMessage(whatsMessage);
    }

    @GetMapping("/sms")
    public String SendMessagesms(@RequestBody WhatsMessage whatsMessage){

        System.out.println(whatsMessage.getText());
        System.out.println(whatsMessage.getPhoneNumber());

        return messageService.SendSms(whatsMessage);
    }



}
