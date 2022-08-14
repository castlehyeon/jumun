package com.example.servingwebcontent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//
class DemoApplicationTests {

	@Autowired
	private MockMvc mvc;
	//send HTTP requests into the DispatcherServlet


	//단위테스트 1번: getHello함수를 실행했을 때, 다음과 같은 문자열을 반환받을 수 있는가?
	//MOCKMVC를 통해 디스패치서블렛에게 http요청을 보낸다. https://velog.io/@jkijki12/Spring-MockMvc
	//톰캣 실행할 필요없이 간단하게 웹환경을 만들어주는 것 같다.
	//json 통신할 때 필요할 것 같은데.
	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Greetings from Spring Boot!")));
	}

	@Test
	void contextLoads() {
	}

}
