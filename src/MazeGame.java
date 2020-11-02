public class MazeGame {
    public final Maze CreateMaze() {
        Maze aMaze = MakeMaze();
        Room r1 = RoomCreator(1);
        Room r2 = RoomCreator(2);
        Door theDoor = MakeDoor(r1, r2);

        aMaze.AddRoom(r1);
        aMaze.AddRoom(r2);
        r1.SetSide(North, WallCreator());
        r1.SetSide(East, DoorCreator());
        r1.SetSide(South, WallCreator());
        r1.SetSide(West, WallCreator());
        r2.SetSide(North, WallCreator());
        r2.SetSide(East, WallCreator());
        r2.SetSide(South, WallCreator());
        r2.SetSide(West, DoorCreator());
        public Maze MazeCreator ()
        {
            return new Maze();
        }
        public Room RoomCreator ( int r)
        {
            this.r = r;
            return new Room(r);
        }

        public void setSide (String r, Wall w)
        {


        }


        public Door DoorCreator ( int x, int y)
        {
            this.x = x;
            this.y = y;
            return new Door(x, y);
        }

        public Wall WallCreator ()
        {
            return new Wall();
        }
        return aMaze;
    }

    public Maze MakeMaze() {
        return new Maze();
    }

    public Room MakeRoom(int n) {
        return new Room(n);
    }

    public Wall MakeWall() {
        return new Wall();
    }

    public Door MakeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}