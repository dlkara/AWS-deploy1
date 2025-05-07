package com.lec.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  // Logger 자동 초기화
@RestController // controller + responsebody -> body 리턴 (cf. controller : view 리턴)
public class HomeController {

	@GetMapping("/aws/v1")
	public String hello(@RequestParam(defaultValue = "1") Integer num) {
		
		// 페이지 요청할 때마다 로그 출력 -> 보통 파일에 저장
		if (num == 1) log.info("💚 /aws/v1 호출. info 로그");
		else if (num == -1) log.error("💛 /aws/v1 호출. error 로그");
		else if (num == 0) log.warn("❤️ /aws/v1 호출. warn 로그");
		
		return "<h1>AWS 배포 v1.1</h1>";
		
	}

}
