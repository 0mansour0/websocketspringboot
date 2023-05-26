package com.example.solargy;

import jakarta.websocket.ContainerProvider;
import jakarta.websocket.Session;
import jakarta.websocket.WebSocketContainer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class WebSocketController {

    @PostMapping("/send-message")
    public void sendMessage() throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        WebSocketClientEndpoint endpoint = new WebSocketClientEndpoint();
        Session session = container.connectToServer(endpoint, new URI("ws://localhost:3333/ocpp/bootnotification"));
        endpoint.sendMessage("Hello, WebSocket server!",session);
    }

}

