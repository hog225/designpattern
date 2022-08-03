package org.study.designpattern.mediator._03_java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // 애노테이션을 기반으로 해당 요청을 처리하는 Handler를 찾아주는 게 HandlerMapping
    // 이렇게 찾아놓은 Handler 를 어떻게 실행 할것 인가가 HandlerAdapter
    // Method 의 리턴값을 보고 어떤 객체에 매핑을 할것인가가 ViewResolver
    // DispatcherServlet 의 doService 에서 위 컴포넌트들을 이용해 로직을 수행한다.
    // HandlerMapping, HandlerAdapter, ViewResolver 컴포넌트 들은 서로 참조 하지 않는다.
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
