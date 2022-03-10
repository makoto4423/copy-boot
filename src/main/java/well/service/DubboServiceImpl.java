package well.service;


import com.alibaba.fastjson.JSONObject;
import copy.boot.bean.Apple;
import copy.boot.bean.Fruit;
import copy.boot.bean.Lemon;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@org.apache.dubbo.config.annotation.DubboService(version = "${dubbo.service.version}")
public class DubboServiceImpl implements DubboService {
    @Override
    public List<String> hello() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        return list;
    }

    @Override
    public Fruit get(String val) {
        if ((val.length() & 1) == 0) {
            return new Apple();
        }
        return new Lemon();
    }

    @Override
    public Map<String, String> map(A a) {
        log.info(JSONObject.toJSONString(a));
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("c", "d");
        return map;
    }
}
