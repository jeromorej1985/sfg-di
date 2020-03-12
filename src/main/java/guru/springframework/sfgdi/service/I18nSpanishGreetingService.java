package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}
