package com.care.root;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling//�� ������̼��� ����ϸ� xml������ ���� ���ص� �����ٷ� ���� ����

public class schedule {
	private static SlackScheduler sp; //������ ���� �޼��� ������ �ҷ���
	@Scheduled(cron="*/10 * * * * *") 
	public void testSc() {
		System.out.println("10�ʸ��� ����");
		sp.sendSlackPost();    //�ҷ��� ������ ������ ȣ��
	}
}
