package life.hanxiao.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublishController {

    @GetMapping
    public String publish() {
        return "publish";
    }
}
