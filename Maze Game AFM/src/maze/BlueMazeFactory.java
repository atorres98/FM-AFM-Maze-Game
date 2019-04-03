package maze;

public class BlueMazeFactory implements MazeFactory {
	@Override
	public Maze makeMaze() {
		return new Maze();
	}
	
	@Override
	public BlueWall makeWall() {
		return new BlueWall();
	}
	
	@Override
	public LightBlueRoom makeRoom(int roomNum) {
		return new LightBlueRoom(roomNum);
	}
	
	@Override
	public BrownDoor makeDoor(Room r1, Room r2) {
		return new BrownDoor(r1, r2);
	}
	
}