public class BombedMazeGame extends MazeGame {
    public final al Wall

    MakeWall() {
        return new BombedWall();
    }

    @Override
    public Room MakeRoom(int n) {
        return new RoomWithABomb(n);
    }
}