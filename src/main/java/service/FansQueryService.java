package service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FansQueryService {
    @Resource
    private MailService mailService;

    public void fansQuery() throws Exception {
        String to = "81604280@qq.com";
        String subject = "欢迎";
        String content = "<html>\n" +
                "<body>\n" +
                "<h3 style='color:blue'>欢迎你，新用户</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail(to, subject, content);
    }
}