package labs.itacademy.skarpen.homeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_3 {


    public static void main(String[] args) throws IOException {
        File file = new File( "/Users/Admin/IdeaProjects/M-JC1-25-19/src/skarpen/homeWork/write.txt" );
        File output = new File( "/Users/Admin/IdeaProjects/M-JC1-25-19/src/skarpen/homeWork/output.txt");

        FileWriter writer = new FileWriter( file );
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add( (int) (Math.random() * 20) );
        }
        for (Integer integer : list) {
            final String s = Integer.toString( integer );
            writer.write( s );
            writer.write( System.lineSeparator() );
            System.out.print( s + " " );

        }
        writer.close();
        System.out.println( "\n" );

        FileReader fileReader = new FileReader( file );
        Scanner scanner = new Scanner( fileReader );
        FileWriter fileWriter = new FileWriter( output );

        while (scanner.hasNextLine()) {
            int d = Integer.parseInt( scanner.nextLine() );
            if (d % 2 != 0) {
                fileWriter.write( d + " " );
            }
        }
        fileWriter.close();
        fileReader.close();
        
    }
}



