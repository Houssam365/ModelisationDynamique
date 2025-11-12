public class Jeu {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // King avec épée + pouvoir de feu
        Character king = new King();
        king.setWeapon(new FirePower(new SwordBehavior()));
        king.fight();
        logger.info("King uses Sword with Fire Power");

        // Troll avec hache + pouvoir de glace
        Character troll = new Troll();
        troll.setWeapon(new IcePower(new AxeBehavior()));
        troll.fight();
        logger.info("Troll uses Axe with Ice Power");
    }
}