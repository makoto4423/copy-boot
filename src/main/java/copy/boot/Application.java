package copy.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class Application {

    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).run(args);
    }

}
