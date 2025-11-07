
public abstract class Character {
    protected WeaponBehavior weapon;
    //private String name;

    public void setWeapon(WeaponBehavior w) {

        this.weapon = w;

    }

    public void fight() {
    //System.out.println(this.getClass(getSimpleName()));
        if (weapon != null) {
            weapon.useWeapon();
        } else {
            System.out.println("No weapon selected!");
        }
    }
}
