package maze;

public interface MazeFactory {
	public Maze makeMaze();
	public Wall makeWall();
	public Door makeDoor(Room r1, Room r2);
	public Room makeRoom(int roomNum);
}
