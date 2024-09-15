public class Main {
    public static void main(String[] args) {

        Hero[] heroes = createHeroes();


        for (Hero hero : heroes) {
            System.out.println("INFO");
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println(); // Пустая строка для разделения информации о разных героях
        }
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(150, 20, "Ловкость");
        heroes[1] = new Hero(200, 40, "Сила");
        heroes[2] = new Hero(170, 18, "Интеллект");
        return heroes;
    }
}