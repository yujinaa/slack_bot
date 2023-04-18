package com.care.root;

import com.slack.api.Slack;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;

public class slackMessage {
	
	
	public static void main(String[] args){
		System.out.println("test message");
//		sendSlack();
	}
	public static void sendSlack() throws Exception  {
		Slack slack = Slack.getInstance();
		String channelId = "";
		String token = System.getenv("");
		String text ="hihihi ¿À´Ã Àú³á ¹¹¸Ô¾î?";


		ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
				.channel(channelId)
				.text(text)
				);
	}

}
