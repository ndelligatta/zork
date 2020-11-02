import java.util.HashMap;

public class Room {
    private String roomName;
    private String descr;
    private Items item;
    private ArrayList<Items> listOfItems;
    private HashMap<String, String> listOfMonster = new HashMap<String, String>();
    private HashMap<String, Room> roomExit;

    public Room() {
        roomName = "Normal";
        descr = "Normal";

        listOfItems = new ArrayList<Items>();

        roomExit = new HashMap<String, Room>();
    }

    public Room(String descr) {
        this.descr = descr;
        roomExit = new HashMap<String, Room>()
    }

    public void setRoomExit(char direction, Room room) throws Exception {
        String direction = "";
        switch (direction) {
            case
                ;
                break;

            case
                ;
                break;

            case
                ;
                break;

            case
                ;
                break;

        }
    }
}