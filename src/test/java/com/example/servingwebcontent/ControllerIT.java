package com.example.servingwebcontent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerIT {

    @Autowired
    private TestRestTemplate template;

    //단위테스트 2번: 1번과 다른 점 mocking the HTTP request cycle
    //https://www.crocus.co.kr/1555 Mock 객체를 사용해 웹환경을 만드는 테스트같다.
    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
        //다른 가이드에서 가져온 코드기 때문에 에러가 날 수 밖에. 얼마든지 수정해서 통과 시킬 수 있음!
    }
}
