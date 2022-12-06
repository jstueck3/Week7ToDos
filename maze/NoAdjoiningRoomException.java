package edu.wctc.maze;

public class NoAdjoiningRoomException extends Exception {
    public NoAdjoiningRoomException() {
        super("There is no adjoining room in direction: " + direction);
    }
}
