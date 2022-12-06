package edu.wctc.maze;

import java.io.StringWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Maze {
    private static Room currentRoom;

    private Player player = new Player();

    /*
     * Maze receives its starting room from the construction strategy
     * in the Main class.
     */
    public Maze(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomName() {
        return currentRoom.getName().toUpperCase();
    }

    public String getCurrentRoomPossibleDirections() {
        return currentRoom.getPossibleDirections();
    }

    public int getScore() {
        return player.getScore();
    }

    public boolean isPlaying() {
        return player.isPlaying();
    }

    public void performAction(char action) {
        switch (action) {
            case 'u':
            case 'd':
            case 'w':
            case 'e':
            case 's':
            case 'n':
                try {
                    // TODO Module 6: Enqueue the message "You leave the " + currentRoom.getName()
                //declare a Queue
                Queue<String> str_queue = new LinkedList<>();
                //initialize the queue with values
                str_queue.add("one");
                str_queue.add("two");
                str_queue.add("three");
                str_queue.add("four");
                //print the Queue
                System.out.println("You leave the" + currentRoom.getName());


                        currentRoom = currentRoom.getAdjoiningRoom(action);
                } catch (NoAdjoiningRoomException e) {
                    Queue<String> NoAdjoiningRoomException = new LinkedList<>();
                    //initialize the queue with values
                    NoAdjoiningRoomException.add("one");
                    NoAdjoiningRoomException.add("two");
                    NoAdjoiningRoomException.add("three");
                    NoAdjoiningRoomException.add("four");
                    //print the Queue
                    System.out.println("Exception" + new NoAdjoiningRoomException());
                }
                break;
            case 'v':
                // TODO Module 6: Enqueue the player's inventory string
                Queue<String> PlayersInventory = new LinkedList<>();
                //initialize the queue with values
                PlayersInventory.add("one");
                PlayersInventory.add("two");
                PlayersInventory.add("three");
                PlayersInventory.add("four");
                //print the Queue
                System.out.println("Get Inventory" + new Player());

                break;
            case 'r': // 'r' recruit companion
                // TODO Module 7: Implement recruiting companions from rooms
                break;
            default:
                // 'x' exit
                // 'l' loot
                // 'i' interact
                try {
                    currentRoom.performAction(action, player);
                } catch (InvalidActionException e) {
                    // TODO Module 6: Enqueue the exception message
                    Queue<String> InvalidActionException = new LinkedList<>();
                    //initialize the queue with values
                    InvalidActionException.add("one");
                   InvalidActionException.add("two");
                    InvalidActionException.add("three");
                    InvalidActionException.add("four");
                    //print the Queue
                    System.out.println("You can't do that hear " + new InvalidActionException());


                }
                break;
        }
    }
}
