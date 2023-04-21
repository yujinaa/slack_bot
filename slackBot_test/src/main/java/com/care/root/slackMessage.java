package com.care.root;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;


public class slackMessage {
	public static void main(String[] args) throws IOException, SlackApiException {
		System.out.println("test");
		sendTextMessage();
	}	

		private static String token = "";
	//	private static String channel = "C0536F20X7T";

		public static void sendTextMessage() throws IOException, SlackApiException {
			Slack slack = Slack.getInstance();
//			String token = System.getenv("");

		ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
				.channel("") // Channel ID
				.text(":cat: Hi from a bot written in Java!"));
	}
}
