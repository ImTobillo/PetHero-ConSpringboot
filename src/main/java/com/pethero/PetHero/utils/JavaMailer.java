package com.pethero.PetHero.utils;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Properties;

// cuando este terminada descomentar lo implementado en properties
@Service
public class JavaMailer {

    private JavaMailSenderImpl sender;

    public void sendEmail (String to, String subject, String text)
    {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        //message.setFrom("correo@gmail.com");

        sender.send(message);
    }
}
