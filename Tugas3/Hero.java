public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

    public Hero() {
        this("", 0, 0, 0);
    }

    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setattack(double attack) {
        this.attack = attack;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }
    public String getName() {
        return name;
    }
    public double getHp() {
        return hp;
    }
    public double getattack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }

    public void attack(Hero enemy) {
        double damage = this.attack - enemy.getDefense();
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(this.getName() + " attacks " + enemy.getName() + " With attack damage " + this.getattack() +
        " and defense " + enemy.getDefense() + "\n" + "Generates " + damage);
        enemy.takeDamage(damage);
    }

    public void takeDamage(double damage) {
        this.hp -= damage;
        System.out.println(this.getName() + " receives " + damage + ", HP left: " + this.getHp());
        System.out.println("");
    }
}