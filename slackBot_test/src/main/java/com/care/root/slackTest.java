package com.care.root;

import java.io.IOException;
import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;
public class slackTest {

	public static void main(String[] args) {
		System.out.println("�޼��� ����");
		send("������ test �޼��� ������");

	}
//	private final static String webhookUrl = "https://hooks.slack.com/services/�����ּ�";
	private static String webhookUrl = "https://hooks.slack.com/services/";
	public static WebhookResponse send(String text) {
        try {
            WebhookResponse response = null;
            Slack slack = Slack.getInstance();
            Payload payload = Payload.builder().text(text).build();
            response = slack.send(webhookUrl, payload);
            return response;
        } catch (IOException e) {
        	throw new RuntimeException(e);
        }
    }
}