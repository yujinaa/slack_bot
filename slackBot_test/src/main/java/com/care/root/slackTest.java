package com.care.root;
import java.awt.List;
import java.io.BufferedReader;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.slack.api.Slack;
import com.slack.api.methods.SlackApiException;
import com.slack.api.model.Attachment;
import com.slack.api.model.Attachments;
import com.slack.api.model.Field;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.request.chat.ChatPostMessageRequest.ChatPostMessageRequestBuilder;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;

public class slackTest {

	public void sendSlack() throws Exception  {
		String channelId = "C0536F20X7T";
		String text = ":wave: Hi from a bot written in Java!";

		Slack slack = Slack.getInstance();
		String token = System.getenv("토큰값");

		ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
				.channel(channelId)
				.text(text)
				);
		System.out.println("테스트");
	}
}