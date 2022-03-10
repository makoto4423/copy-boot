package well.service;

import copy.boot.bean.Apple;
import copy.boot.bean.Fruit;

import java.util.List;
import java.util.Map;

public interface DubboService {

    List<String> hello();

    Fruit get(String val);

    Map<String,String> map(A a);


    class A {
        public String name;
        public String key;
    }
}
