package com.gucardev.springlearning.websocket.pure.server;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class WebSocketSessionRegistry {
    private final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();


    public void addSession(WebSocketSession session) {
        sessions.add(session);
    }

    public void removeSession(WebSocketSession session) {
        sessions.remove(session);
    }

    public List<WebSocketSession> getSessions() {
        return sessions;
    }
}
