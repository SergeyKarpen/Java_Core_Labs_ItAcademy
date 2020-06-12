package labs.itacademy.skarpen.hierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<TechniquesBig> techniquesBig = new ArrayList<TechniquesBig>();
        TechniquesBig techniquesBigFirst = new TechniquesBig("Refrigerator", 2019, 50.5);
        TechniquesBig techniquesBigSecond = new TechniquesBig("Washer", 2015, 25.0);
        TechniquesBig techniquesBigThird = new TechniquesBig("Stove", 2010, 32.2);

        techniquesBig.add(techniquesBigFirst);
        techniquesBig.add(techniquesBigSecond);
        techniquesBig.add(techniquesBigThird);

        List<TechniquesSmall> techniquesSmall = new ArrayList<>();
        TechniquesSmall techniquesSmallFirst = new TechniquesSmall("Toaster", 2018, 5.2);
        TechniquesSmall techniquesSmallSecond = new TechniquesSmall("Kettle", 2014, 1.5);
        TechniquesSmall techniquesSmallThird = new TechniquesSmall("Samovar", 2009, 10.2);

        techniquesSmall.add(techniquesSmallFirst);
        techniquesSmall.add(techniquesSmallSecond);
        techniquesSmall.add(techniquesSmallThird);

        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random() * Constants.AMOUNTELEMENTS);

        System.out.println("You must select a class:  Big techniques or automatically select a class of small equipment: B." + "\n" + "And we will turn it on!");
        if (scanner.nextLine().equalsIgnoreCase("B")) {
            System.out.println(a + " " + "Random number from the list of BIG equipment" + "\n" + techniquesBig.get(a).Info() + "\n" + techniquesBig.get(a).countDate() + "\n" + techniquesBig.get(a).NeedDelivery());

        } else {
            System.out.println(a + " " + "Random number from the list of SMALL equipment" + "\n" + techniquesSmall.get(a).Info() + "\n" + techniquesSmall.get(a).countDate() + "\n" + techniquesSmall.get(a).NeedDelivery());
        }
    }
}