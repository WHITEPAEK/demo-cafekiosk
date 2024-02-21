package sample.democafekiosk.spring.api.service.mail;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sample.democafekiosk.spring.client.mail.MailSendClient;
import sample.democafekiosk.spring.domain.history.mail.MailSendHistory;
import sample.democafekiosk.spring.domain.history.mail.MailSendHistoryRepository;

@RequiredArgsConstructor
@Service
public class MailService {

    private final MailSendClient mailSendClient;
    private final MailSendHistoryRepository mailSendHistoryRepository;

    public boolean sendMail(String fromEmail, String toEmail, String subject, String content) {
        boolean result = mailSendClient.sendMail(fromEmail, toEmail, subject, content);
        if (result) {
            mailSendHistoryRepository.save(MailSendHistory.builder()
                    .fromEmail(fromEmail)
                        .toEmail(toEmail)
                        .subject(subject)
                        .content(content)
                    .build());

            return true;
        }

        return false;
    }
}
