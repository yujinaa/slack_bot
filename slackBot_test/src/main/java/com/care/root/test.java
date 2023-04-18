package com.care.root;

import org.springframework.http.HttpMessage;

import com.slack.api.Slack;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;


public class test{
//	public static void main(String[] args) {
//		HttpMessage slackMessage = HttpMessage.builder()
//				.channel("the-channel-name")
//				.username("user1")
//				.text("just testing")
//				.icon_emoji(":twice:")
//				.build();
//		Slack.sendMessage(slackMessage);
//	}

	private static String channelId = "C0536F20X7T";
	private static String text = ":wave: Hi from a bot written in Java!";
	public void sendSlack() throws Exception  {

		Slack slack = Slack.getInstance();
		String token = System.getenv("xoxb-5076647365251-5062702719319-3q9O200Fz8ajtHAAUuOkG29M");

		ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
				.channel(channelId)
				.text(text)
				);
	}
}