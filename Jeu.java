public class Jeu {
    public static void main(String[] args) {



        Character knight = new Knight();
        knight.setWeapon(new SwordBehavior());
        knight.fight();

        Character troll = new Troll();
        troll.setWeapon(new AxeBehavior());
        troll.fight(); // Chopping with an axe

        Character queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight(); // Cutting with a knife

        Character king = new King();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();

        System.out.println("King changes weapon...");
        king.setWeapon(new HammerBehavior());
        king.fight(); // Smashing with a hammer
    }
}
