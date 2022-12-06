package edu.wctc.maze.io;

import edu.wctc.maze.Maze;

public interface MazeConstructionStrategy {
    // Creates Room objects and links them together to form a maze.
// Returns the Room in which the player begins the game (the starting room).
    Maze createRooms();


}
