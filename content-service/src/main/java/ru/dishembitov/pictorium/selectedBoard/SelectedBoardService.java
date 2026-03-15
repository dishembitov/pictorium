package ru.dishembitov.pictorium.selectedBoard;


import ru.dishembitov.pictorium.board.BoardResponse;

import java.util.UUID;

public interface SelectedBoardService {

    void selectBoard(UUID boardId);

    BoardResponse getSelectedBoard();

    void disableBoard();
}
