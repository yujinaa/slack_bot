package com.care.root;

import java.io.IOException;
import com.slack.api.Slack;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;


public class slackMessage {
	public static void main(String[] args) throws IOException, SlackApiException {
		System.out.println("test");
		sendTextMessage();
	}	

	private static Slack slack = Slack.getInstance();
	private static String token = "토큰";

	public static void sendTextMessage() throws IOException, SlackApiException {
		//		Slack slack = Slack.getInstance();  슬랙 시작을 위한 코드 

		ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
				.channel("") // Channel ID
				.text(":wave: Hi from a bot written in Java!"));
	}
}
