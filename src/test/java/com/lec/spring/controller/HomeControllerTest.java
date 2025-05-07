package com.lec.spring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

// 서버 동작 시, 랜덤 포트로 동작하도록 설정
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {
	
	// 테스트 시에서만 사용하는 Bean (자동 생성됨)
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	void hello() {
		
		ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class);
		
		// 예상결과값(매개변수1)과 실제결과값(매개변수2)가 같을 경우에만 테스트 성공 (테스트 시에만 사용 가능한 함수)
		assertEquals("<h1>AWS 배포 v1.1</h1>", response.getBody());
		
	}
	
}