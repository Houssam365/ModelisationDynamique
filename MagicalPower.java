public abstract class MagicalPower implements WeaponBehavior {
    protected WeaponBehavior weapon;

    public MagicalPower(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void useWeapon() {
        weapon.useWeapon();
    }
}
