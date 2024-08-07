package org.gucardev.purewebsocket.server_with_security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebSocketMessage<T> {
  private String route;
  private T payload;
}
