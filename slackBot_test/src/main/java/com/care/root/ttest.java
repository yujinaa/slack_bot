package com.care.root;

import com.github.seratch.jslack.Slack;
public class ttest {
	private static String webHookUrl ="https://hooks.slack.com/services/";
	private static String token = "xoxb-";
	private static String slackChannel = "slack-bot-test1";

	public static void main(String[] args) {
		System.out.println("slack test");
		sendMessageSlack("�޼��� ������ �ȴ�");
	}
	public static void sendMessageSlack(String message) {
		try {
			StringBuilder builder = new StringBuilder();
			builder.append(message);

			com.github.seratch.jslack.api.webhook.Payload payload = com.github.seratch.jslack.api.webhook.Payload.builder().channel(slackChannel).text(builder.toString()).build();
			com.github.seratch.jslack.api.webhook.WebhookResponse response =  Slack.getInstance().send(webHookUrl, payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
