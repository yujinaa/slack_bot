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
		//create a connection to a given URL using POST method
		URL url = new URL("https://slack.com/api/chat.postMessage");
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

		//Setting Headers
		httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		httpURLConnection.setRequestProperty("Authorization", "Bearer {slack Bot 토큰}");
		httpURLConnection.setRequestMethod("POST");

		//Adding Request Params
		Map<String, String> params = new HashMap<>();
		params.put("channel", "{채널ID}");
		params.put("text", "test text");
		httpURLConnection.setDoOutput(true);
		DataOutputStream out = new DataOutputStream(httpURLConnection.getOutputStream());
		out.writeBytes(ParameterStringBuilder.getParamsString(params));
		out.flush();
		out.close();

		//Configuring TimeOut
		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.setReadTimeout(5000);

		//Reading the Response
		BufferedReader in = new BufferedReader(
				new InputStreamReader(httpURLConnection.getInputStream())
				);
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();

		//Disconnect
		httpURLConnection.disconnect();

		//Print the content
		System.out.println("content = " + content);
	}
}