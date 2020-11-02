public class MazeBuilder {
    public void BuildMaze() {
    }

    public void BuildRoom(int room) {
    }

    public void BuildDoor(int roomFrom, int roomTo) {
    }
    public Maze CreateMaze(MazeBuilder builder) {
        builder.BuildMaze();
        builder.BuildRoom(1);
        builder.BuildRoom(2);

        builder.BuildDoor(1, 2);

        return builder.GetMaze();
    }

    public Maze CreateComplexMaze(MazeBuilder builder) {
        builder.BuildRoom(1);
        builder.BuildRoom(1001);

        return builder.GetMaze();
    }
    public Maze GetMaze() {
        return null;
    }
}