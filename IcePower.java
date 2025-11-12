public class IcePower extends MagicalPower {
    public IcePower(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void useWeapon() {
        super.useWeapon();
        System.out.println("... with Ice Power!");
    }
}