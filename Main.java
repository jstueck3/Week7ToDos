package edu.wctc.maze;


import edu.wctc.maze.io.*;
import edu.wctc.maze.roomimpl.BasicRoom;
import edu.wctc.maze.roomimpl.DarkRoom;
import edu.wctc.maze.roomimpl.SimpleRoom;

import java.time.Duration;

public class Main {
    // Create Room objects and link them together to
    // form a maze
    private static Room createRooms() {
        Room startingRoom = new BasicRoom();

        Room anotherRoom = new DarkRoom();
        startingRoom.setNorth(anotherRoom);
        anotherRoom.setSouth(startingRoom);

        Room thirdRoom = new SimpleRoom();
        anotherRoom.setDown(thirdRoom);
        thirdRoom.setUp(anotherRoom);

        Room finalRoom = new BasicRoom();
        anotherRoom.setEast(finalRoom);
        finalRoom.setWest(anotherRoom);

        // Return the starting room
        return startingRoom;
    }

    public static void main(String[] args) {
        InputService in = new ConsoleInputService();

        OutputService out = new edu.wctc.maze.io.ConsoleOutputService();

        // TODO Module 7: Create a companion factory and pass it to the construction strategy

        package edu.wctc.maze;

        public interface ConfigFileFactory {
            edu.wctc.maze.io.MazeConstructionStrategy getReader();

            edu.wctc.maze.io.MazeConstructionStrategy getWriter();

//    Companion getSurlyCompanion();
//
//    Companion getFriendlyCompanion();
        }

package edu.wctc.maze;

        public interface Reader {
            void readConfigFile();
        }

package edu.wctc.maze;

        public interface Writer {
            void writeConfigFile();
        }

        // TODO Module 5: Create a construction strategy to replace the static
        //  createRooms method in main. Use it below.

        Maze maze = new Maze(createRooms());
        abstract class Maze implements MazeConstructionStrategy {
            public abstract String getNewMazeOne();

            @Override
            public edu.wctc.maze.Maze createRooms() {
                return null;
            }

            public abstract Duration getPlayingTime();
        }

        while (maze.isPlaying()) {
            out.print(maze.getCurrentRoomName());

            out.print(maze.getCurrentRoomDescription());

            out.print(maze.getCurrentRoomPossibleDirections());

            char command = in.getInput();
            maze.performAction(command);

            // TODO Module 6: Flush the print queue to the output service

            String flush;
            {
                Object PrintQueue = null;
                synchronized (PrintQueue) {
                    String flushedStr = PrintQueue.toString();
                    edu.wctc.maze.roomimpl.PrintQueue.toString(0,
                            PrintQueue.toString());
                }

                out.print("GAME OVER");
                out.print("Score: " + maze.getScore());
            }

            enum PrintQueue {
                INSTANCE;
                int value;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }


        }
    }
}