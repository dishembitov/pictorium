package ru.dishembitov.pictorium.websocket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.dishembitov.pictorium.message.MessageType;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WsIncomingMessage {

    private WsMessageType type;
    private UUID chatId;
    private String content;
    private MessageType messageType;
    private String imageId;
}