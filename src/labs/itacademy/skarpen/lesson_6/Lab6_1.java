package labs.itacademy.skarpen.lesson_6;

public class Lab6_1 {
    public static void main(String[] args) {

//Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.


        /*
        String s = "I learn Java";
        StringBuilder sBuilder = new StringBuilder(s);
        sBuilder.append(" and English, too");
        System.out.println(sBuilder);

        String str = "Test  string for split";
        String [] words = str.split(" ");
        for (String word: words) {
            System.out.print(word + " ");
        }


       String str1 = "Test     multi      space";
        System.out.println(str1.replaceAll(" +"," " ));


        Pattern p = Pattern.compile(" +- +");
        Matcher matcher = p.matcher("Test - string - test");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
        }

        String a  = "lalala - lala -  a ";
        matcher.reset(a);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
        }

        Pattern p = Pattern.compile("-?[0-9]+");
        Matcher m = p.matcher(first);
        while (m.find() == true) {
            System.out.println("Your string have numbers");
        }
*/

   /*     ArrayList<String> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean revers = true; // запомнить!

        do {
            System.out.println("Input the strings:");
            input.add(scanner.nextLine());
            System.out.print("Continue? (Y/N): ");
            if (!scanner.nextLine().equalsIgnoreCase("Y")) {
                revers = false;
            }

        }
        while (revers);
        {
            String max = input.get(0);
            String min = input.get(0);
            for (int i = 0; i < input.size(); i++) {
                if (min.length() > input.get(i).length()) {
                    min = input.get(i);
                } else if (max.length() < input.get(i).length()) {
                    max = input.get(i);
                }
            }
            System.out.println("The longest string is: \n" + max + " and " + "length " + max.length());
            System.out.println("The shortest string is: \n" + min + " and " + "length " + min.length());
        }
        System.out.println("The end.");
*/
    }
}



