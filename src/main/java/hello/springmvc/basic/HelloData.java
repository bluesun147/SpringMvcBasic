package hello.springmvc.basic;

import lombok.Data;

@Data // lombok. getter, setter 등등 자동으로 적용
public class HelloData {
    private String username;
    private int age;
}
