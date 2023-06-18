enum WeaponType {
    SWORD,
    AXE,
    BOW
}

// Class Weapon
class Weapon {
    private WeaponType type;
    private String name;

    public Weapon(WeaponType type, String name) {
        this.type = type;
        this.name = name;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Class GameEntity
class GameEntity {
    private String name;
    private int health;
    private int level;

    public GameEntity(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

// Class Boss
class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, int level, Weapon weapon) {
        super(name, health, level);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss: " + getName() + ", Level: " + getLevel() + ", Health: " + getHealth()
                + ", Weapon: " + weapon.getName() + ", Weapon Type: " + weapon.getType();
    }
}

// Class Skeleton
class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton(String name, int health, int level, Weapon weapon, int arrowCount) {
        super(name, health, level, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return "Skeleton: " + getName() + ", Level: " + getLevel() + ", Health: " + getHealth()
                + ", Weapon: " + getWeapon().getName() + ", Weapon Type: " + getWeapon().getType()
                + ", Arrow Count: " + arrowCount;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        Boss boss = new Boss("Evil Boss", 1000, 10, bossWeapon);
        System.out.println(boss.printInfo());

        Weapon skeletonWeapon1 = new Weapon(WeaponType.AXE, "Battle Axe");
        Skeleton skeleton1 = new Skeleton("Skeleton 1", 100, 5, skeletonWeapon1, 10);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Longbow");
        Skeleton skeleton2 = new Skeleton("Skeleton 2", 150, 8, skeletonWeapon2, 20);

       