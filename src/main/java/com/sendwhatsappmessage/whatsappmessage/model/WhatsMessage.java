package com.sendwhatsappmessage.whatsappmessage.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WhatsMessage {

    private String AUTH_TOKEN;
    private String ACCOUNT_SID;
    private  String phoneNumber;
    private String text;
}
