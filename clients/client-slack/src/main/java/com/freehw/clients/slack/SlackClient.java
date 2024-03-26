package com.freehw.clients.slack;

import com.slack.api.Slack;
import com.slack.api.webhook.WebhookResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SlackClient {

    // TODO : 웹 훅 URL 환경에 맞게 세팅.
    final String webhookUrl = "YOUR_WEBHOOK_URL";

    public boolean send(String message){
        Slack slack = Slack.getInstance();
        String payload = "{\"text\":\""+message+"\"}";
        try {
            WebhookResponse response = slack.send(webhookUrl, payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

}
