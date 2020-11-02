public class GlobalMembers {
    public static Maze maze;
    public static MazeGame game = new MazeGame();
    public static StandardMazeBuilder builder = new StandardMazeBuilder();
    game.CreateMaze(builder);
    Maze maze = builder.GetMaze();
    public static int rooms;
    public static int doors;
    public static MazeGame game = new MazeGame();
    public static CountingMazeBuilder builder = new CountingMazeBuilder();
	game.CreateMaze(builder);
	builder.GetCounts(rooms,doors);
}