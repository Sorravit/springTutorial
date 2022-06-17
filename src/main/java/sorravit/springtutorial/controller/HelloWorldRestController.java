package sorravit.springtutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sorravit.springtutorial.service.GetMessageService;

@RestController
public class HelloWorldRestController {
    private final GetMessageService getMessageService;

    public HelloWorldRestController(GetMessageService getMessageService) {
        this.getMessageService = getMessageService;
    }

    @GetMapping("/")
    public String greeting() {
        return getMessageService.getMessage();
    }
}
