package com.care.root;

import com.google.gson.Gson;
import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;

public class SlackScheduler {
	public static void main(String[] args) {
		sendSlackPost();
	}
	public static void sendSlackPost()  {
		try {
			Slack slack = Slack.getInstance();
			String token = "";
			MethodsClient methods = slack.methods(token);

			String str = "";
			str+="스케줄러로 특정시간에 메세지 보내기 테스트!!";
			ChatPostMessageRequest request = ChatPostMessageRequest.builder()
					.channel("") 
					.text(new Gson().toJson(str))
					.build();

			ChatPostMessageResponse response = methods.chatPostMessage(request);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}