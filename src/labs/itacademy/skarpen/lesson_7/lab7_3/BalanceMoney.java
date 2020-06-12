package labs.itacademy.skarpen.lesson_7.lab7_3;

import java.util.Scanner;

public class BalanceMoney implements InterfaceCashMachine {

    public String balanceMoney(CashMachine cashMachine) {
        Scanner sc = new Scanner(System.in);
        System.out.println(cashMachine.allMoney() + " All money in ATM" + "\n" + "select denomination:" + "\n" + " 20 / 50 / 100 "); //номинал купюры
        int newGreenback = sc.nextInt();
        System.out.println("amount needed for removal: "); //Сколько купюр надо снять
        int howNewGreenback = sc.nextInt();
        if (newGreenback == Constants.GREENBACKTWENTY) {
            System.out.println(cashMachine.allMoney() - howNewGreenback * newGreenback);}
        else if (newGreenback == Constants.GREENBACKFIFTY) {
                System.out.println(cashMachine.allMoney() - howNewGreenback * newGreenback);}
        else if (newGreenback == Constants.GREENBACKHUNDRED) {
                    System.out.println(cashMachine.allMoney() - howNewGreenback * newGreenback);
                } else System.out.println("Probably you input incorrect number");

        return cashMachine.allMoney() + " Balance ATM";
    }
}
