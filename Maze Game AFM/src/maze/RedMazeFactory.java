package maze;

public class RedMazeFactory implements MazeFactory {
	@Override
	public Maze makeMaze() {
		return new Maze();
	}
	
	@Override
	public RedWall makeWall() {
		return new RedWall();
	}
	
	@Override
	public PinkRoom makeRoom(int roomNum) {
		return new PinkRoom(roomNum);
	}
	
	@Override
	public GreenDoor makeDoor(Room r1, Room r2) {
		return new GreenDoor(r1, r2);
	}
	
}