abstract class Item {
    String name = "default item";
    float health = 10;

    public void increaseHealth() {
        health += 1;
    }

    public void decreaseHealth() {
        health -= 1;
    }

    public void getHealth() {
        System.out.println(health);
    }

    public void fight() {
        decreaseHealth();
    }
}

class Sword extends Item {

    public Sword() {
        name = "Sword";

    }

}

class Key extends Item {

    public Key() {
        name = "Garage Key";
    }
}

class Monster extends Item {

    public Monster() {
        name = "Gru";
    }