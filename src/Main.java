public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(90);
        boss.setWeapon(new Weapon(WeaponType.COLD, "knife"));

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(350);
        skeleton.setDamage(40);
        skeleton.setWeapon(new Weapon(WeaponType.MAGIC,"faer"));

        System.out.println("Boss info: " + boss.printInfo());

        System.out.println("Skeleton info: " + skeleton.printInfo());
    }
}