public class EnchantedMazeGame extends MazeGame {

    @Override
    public Room MakeRoom(int n) {
        return new EnchantedRoom(n, CastSpell());
    }

    @Override
    public Door MakeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}