package com.care.root;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling//이 어노테이션을 사용하면 xml설정을 굳이 안해도 스케줄러 실행 가능

public class schedule {
	private static SlackScheduler sp; //슬랙에 보낼 메세지 파일을 불러옴
	@Scheduled(cron="*/10 * * * * *") 
	public void testSc() {
		System.out.println("10초마다 실행");
		sp.sendSlackPost();    //불러온 파일의 내용을 호출
	}
}
