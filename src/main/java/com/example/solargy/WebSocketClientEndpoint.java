package com.example.solargy;


import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.OnMessage;
import jakarta.websocket.Session;

import java.io.IOException;

@ClientEndpoint
public class WebSocketClientEndpoint {

    @OnMessage
    public void onMessage(String message, Session session) {
        // Handle incoming messages if needed
        System.out.println(message);
    }

    public void sendMessage(String message, Session session) throws IOException {
        session.getBasicRemote().sendText(message);
    }

}

