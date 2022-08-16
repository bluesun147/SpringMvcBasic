package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // lombok 제공 어노테이션
@RestController // 반환한 스트링 그대로 반환됨. @Controller는 문자 리턴하면 뷰 이름으로 반환됨.(뷰 리졸버)
public class LogTestController {
    // private final Logger log = LoggerFactory.getLogger(getClass()); // Logger는 slf4j꺼. @Slf4j쓰면 이줄 안써도 됨.

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}