package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
