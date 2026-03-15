package ru.dishembitov.pictorium.pin;

import java.util.UUID;

public interface PinInteractionProjection{
        UUID getId();
        Boolean getLiked();
        Boolean getSaved();
}
