package ru.dishembitov.pictorium.board;

import java.util.UUID;

public interface PinSaveInfoProjection {
    UUID getPinId();
    UUID getLastBoardId();
    String getLastBoardName();
    Long getBoardCount();
}