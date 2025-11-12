// Exemple de pouvoirs magiques
public class FirePower extends MagicalPower {
    public FirePower(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void useWeapon() {
        super.useWeapon();
        System.out.println("... with Fire Power!");
    }
}