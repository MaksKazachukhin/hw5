public class Hero {
    private int health;
    private int damage;
    private String sup;


    public Hero(int health, int damage, String sup) {
        this.health = health;
        this.damage = damage;
        this.sup = sup;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.sup = "None";
    }
    public int getHealth() {
        return health;
    }


    public int getDamage() {
        return damage;
    }


    public String getSuperpower() {
        return sup;
    }
}

