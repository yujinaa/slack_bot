package com.care.root;

import org.springframework.http.HttpMessage;

//	public static void main(String[] args) {
//		HttpMessage slackMessage = HttpMessage.builder()
//				.channel("the-channel-name")
//				.username("user1")
//				.text("just testing")
//				.icon_emoji(":twice:")
//				.build();
//		slackTest.sendMessage(slackMessage);
//	}
//}

//import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
//Class that builds a string using a Map
public class ParameterStringBuilder
{
	public static void getParamsString(Map<String, String> params) throws Exception{
		StringBuilder result = new StringBuilder();
		for (Map.Entry<String, String> entry : params.entrySet());
	}
}