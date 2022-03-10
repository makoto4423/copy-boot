package copy.boot.controller;

import copy.boot.bean.Fruit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ServiceLoader;

@RestController
@RequestMapping("/spi")
public class SpiController {

    @PostConstruct
    public void init(){
        ServiceLoader<Fruit> fruits = ServiceLoader.load(Fruit.class);
        for(Fruit f : fruits){
            f.eat();
        }
    }





}
