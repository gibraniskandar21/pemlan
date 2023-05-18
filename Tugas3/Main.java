import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------- WELCOME TO HERO WARS ----------------------");

        Hero hero1 = new Hero();
        System.out.print("Enter hero's name: ");
        hero1.setName(input.nextLine());
        System.out.print("Enter hero's HP: ");
        hero1.setHp(input.nextDouble());
        System.out.print("Enter hero's attack damage: ");
        hero1.setattack(input.nextDouble());
        System.out.print("Enter hero's defence: ");
        hero1.setDefense(input.nextDouble());

        System.out.println("");

        System.out.print("Enter hero's name: ");
        String name = input.next();
        System.out.print("Enter hero's HP: ");
        double hp = input.nextDouble();
        System.out.print("Enter hero's attack damage: ");
        double attack = input.nextDouble();
        System.out.print("Enter hero's defence: ");
        double defense = input.nextDouble();
        Hero hero2 = new Hero(name, hp, attack, defense);
        System.out.println("");

        int round = 1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("-----------------------------------");
            System.out.println("Round " + round + ":");
            hero1.attack(hero2);
            if (hero2.getHp() > 0) {
                hero2.attack(hero1);
            }
            round++;
        }

        if (hero1.getHp() > 0) {
            System.out.println("THE MATCH HAS ENDED!");
            System.out.println(hero2.getName() + " LOSE!");
            System.out.println("--------------------------");
            System.out.println(hero1.getName() + " WIN!");
        } else {
            System.out.println("THE MATCH HAS ENDED!");
            System.out.println(hero1.getName() + " LOSE!");
            System.out.println("--------------------------");
            System.out.println(hero2.getName() + " WIN!");
        }

        input.close();
    }
}