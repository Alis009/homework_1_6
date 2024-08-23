public class Weapon {
    private WeaponType weaponType;
    private String weaponname;

    public Weapon(WeaponType weaponType, String weaponname) {
        this.weaponType = weaponType;
        this.weaponname = weaponname;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public String getWeaponname() {
        return weaponname;
    }
}
