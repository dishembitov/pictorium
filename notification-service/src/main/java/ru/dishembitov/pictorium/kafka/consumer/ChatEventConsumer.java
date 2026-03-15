package ru.dishembitov.pictorium.kafka.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.dishembitov.pictorium.kafka.event.ChatEvent;
import ru.dishembitov.pictorium.notification.NotificationService;

@Component
@RequiredArgsConstructor
@Slf4j
public class ChatEventConsumer {

    private final NotificationService notificationService;

    @KafkaListener(
            topics = "${kafka.topics.chat-events:chat-events}",
            groupId = "notification-service",
            properties = {"spring.json.value.default.type=event.kafka.ru.dishembitov.pictorium.ChatEvent"}
    )
    public void consume(ChatEvent event) {
        log.info("Received chat event: type={}, chatId={}, sender={}, recipient={}",
                event.getType(), event.getChatId(), event.getActorId(), event.getRecipientId());

        try {
            if ("NEW_MESSAGE".equals(event.getType())) {
                notificationService.createAndSendNotification(event);
            }
        } catch (Exception e) {
            log.error("Error processing chat event", e);
        }
    }
}