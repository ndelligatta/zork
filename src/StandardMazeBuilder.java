public class StandardMazeBuilder extends MazeBuilder {
    public StandardMazeBuilder() {
        currentMaze = null;
    }

    @Override
    public void BuildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void BuildRoom(int n) {
        if (!currentMaze.RoomNo(n)) {
            Room room = new Room(n);
            currentMaze.AddRoom(room);
            room.SetSide(North, WallCreator());
            room.SetSide(South, WallCreator());
            room.SetSide(East, WallCreator());
            room.SetSide(West, WallCreator());
        }
        public Wall WallCreator ()
        {
            return new Wall();
        }
    }

    @Override
    public void BuildDoor(int n1, int n2) {
        Room r1 = currentMaze.RoomNo(n1);
        Room r2 = currentMaze.RoomNo(n2);

        Door d = DoorCreator(r1, r2);
        r1.SetSide(CommonWall(r1, r2), d);
        r2.SetSide(CommonWall(r2, r1), d);
    }

    public Door DoorCreator(int x, int y) {
        this.x = x;
        this.y = y;
        return new Door(x, y);
    }

    @Override
    public Maze GetMaze() {
        return currentMaze;
    }

    private Maze currentMaze;
}