public class Jeu {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Character troll = new Troll();
        troll.setWeapon(new AxeBehavior());
        troll.fight();
        logger.info("Troll gets Axe");

        troll.setWeapon(new BowAndArrowBehavior());
        logger.warning("Troll cannot use Bow properly");
    }
}