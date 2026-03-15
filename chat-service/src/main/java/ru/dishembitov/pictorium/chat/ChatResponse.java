package ru.dishembitov.pictorium.chat;

import ru.dishembitov.pictorium.message.MessageType;

import java.time.Instant;
import java.util.UUID;

public record ChatResponse(
        UUID id,
        String recipientId,
        String lastMessage,
        Instant lastMessageTime,
        int unreadCount,
        Instant createdAt,
        Instant updatedAt,

        MessageType lastMessageType,
        String lastMessageImageId
) {}