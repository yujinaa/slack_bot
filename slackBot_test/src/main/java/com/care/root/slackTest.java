package com.care.root;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.slack.api.Slack;
import com.slack.api.methods.SlackApiException;
import com.slack.api.model.Attachment;
import com.slack.api.model.Attachments;
import com.slack.api.model.Field;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;
public class slackTest {

	public static void main(String[] args) {
		System.out.println("�޼��� ����");
		send("������ test �޼��� ������");

	}

//	private final static String webhookUrl = "https://hooks.slack.com/services/�����ּ�";
	private static String webhookUrl = "https://hooks.slack.com/services/�����ּ�";

	public static WebhookResponse send(String text) {
        try {
            WebhookResponse response = null;
            Slack slack = Slack.getInstance();
            Payload payload = Payload.builder().text(text).build();
            response = slack.send(webhookUrl, payload);
            return response;
        } catch (IOException e) {
        	throw new RuntimeException(e);
        }
    }
}