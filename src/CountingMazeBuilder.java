public class CountingMazeBuilder extends MazeBuilder {
    public CountingMazeBuilder() {
        rooms = doors = 0;
    }

    @Override
    public void BuildRoom(int UnnamedParameter) {
        rooms++;
    }

    @Override
    public void BuildDoor(int UnnamedParameter, int UnnamedParameter2) {
        doors++;
    }

    public final void GetCounts(tangible.RefObject<Integer> rooms, tangible.RefObject<Integer> doors) {
        rooms.argValue = rooms;
        doors.argValue = doors;
    }

    private int doors;
    private int rooms;
}