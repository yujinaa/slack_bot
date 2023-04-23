package com.care.root;
import java.io.IOException;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;

public class slackAPI {

	public static void main(String[] args){ //메인 메서드에서 호출위해 예외 처리
		try {
			messageToSlack();
		} catch (IOException | SlackApiException e) {
			e.printStackTrace();
		}
	}
	//	private static Slack slack = Slack.getInstance();
	//	private static String token = "";
	//	private static MethodsClient methods = slack.methods(token);
	//	
	public static void messageToSlack() throws IOException, SlackApiException {
		Slack slack = Slack.getInstance();
		String token = "";
		MethodsClient methods = slack.methods(token);

		// Build a request object
		ChatPostMessageRequest request = ChatPostMessageRequest.builder()
				.channel("#slack-bot-test1") // 채널명 or 채널 ID
				.text(":smile: HAHA.")
				.build();

		// Get a response as a Java object
		ChatPostMessageResponse response = methods.chatPostMessage(request);
	}
}
