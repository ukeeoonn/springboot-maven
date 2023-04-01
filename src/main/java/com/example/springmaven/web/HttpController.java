package com.example.springmaven.web;


import org.springframework.web.bind.annotation.*;

//@Controller //File을 응답하는 컨트롤러 (클라이언트가 브라우저면 .html 파일을 사용하는것이 좋음)
@RestController //Data를 응답하는 컨트롤러 (클라이언트가 핸드폰이면 data)
public class HttpController {

    //http://localhost:8080/get
    //get 요청만 가능
    //나머지는 postman으로 확인
    @GetMapping("/get")
    public String get(){
        return  "get 요청됨";
    }

    @PostMapping("/post")
    public String post(){
        return  "post 요청됨";
    }

    @PutMapping("/put")
    public String put(){
        return  "put 요청됨";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return  "delete 요청됨";
    }
}
