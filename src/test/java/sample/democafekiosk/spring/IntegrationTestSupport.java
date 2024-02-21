package sample.democafekiosk.spring;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import sample.democafekiosk.spring.client.mail.MailSendClient;

@ActiveProfiles("test")
@SpringBootTest
public abstract class IntegrationTestSupport {

    @MockBean
    protected MailSendClient mailSendClient; // MockBean을 사용하는 상위 클래스를 생성해서 테스트 환경을 2개로 분리한다.

}
