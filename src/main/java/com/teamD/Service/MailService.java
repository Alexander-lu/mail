package com.teamD.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class MailService {
    @Value("${spring.mail.username}")
    private String from;
    @Resource
    private JavaMailSender mailSender;

    public void sendHtmlMail(String to, String subject, String content,String path,String filename) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        File file = new File(path);
        helper.addAttachment(filename,file);
        mailSender.send(message);
    }
}
