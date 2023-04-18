package com.care.root;

import com.github.seratch.jslack.Slack;
public class ttest {
	private static String webHookUrl ="https://hooks.slack.com/services/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";
	private static String token = "xoxb-5076647365251-5062702719319-3q9O200Fz8ajtHAAUuOkG29M";
	private static String slackChannel = "slack-bot-test1";

	public static void main(String[] args) {
		System.out.println("test message");
		sendMessageSlack("메세지 보내기 된다");
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
