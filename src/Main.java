import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Adja meg a csirkék számát:");
        int chickens = scn.nextInt() * 2;
        System.out.println("Adja meg a sertések számát:");
        int pigs = scn.nextInt() * 4;
        int legs = chickens + pigs;
        System.out.println("Az állatoknak összesen " + legs + " lábuk van");
    }

}
