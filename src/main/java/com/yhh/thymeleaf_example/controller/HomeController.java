package com.yhh.thymeleaf_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        // 단순 문자열을 모델에 넣어 보내기
        model.addAttribute("name", "YHH");

        // Map 을 모델에 넣어 보내기
        Map<String, Object> map = new HashMap<>();
        map.put("name", "YHH");
        map.put("age", 10);
        map.put("addr", "세종");

        model.addAttribute("map", map);

        // List<Map> 을 모델에 넣어 보내기
        List<Map<String, Object>> listMap = new ArrayList<>();

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "YHM");
        map2.put("age", 20);
        map2.put("addr", "화성");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "KSN");
        map3.put("age", 30);
        map3.put("addr", "공주");

        listMap.add(map);
        listMap.add(map2);
        listMap.add(map3);

        model.addAttribute("listMap", listMap);

        return "home";
    }

    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }
}
