package Documents;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите название или номер документа.");
        Scanner scanner1 = new Scanner(System.in);
        String n = scanner1.next();


        try (FileReader file = new FileReader(n)) {
            Scanner scanner = new Scanner(file);
            FileWriter writer1 = new FileWriter("Adopted.txt");
            FileWriter writer2 = new FileWriter("Error.txt");
            while (scanner.hasNextLine()) {
                String a = scanner.nextLine();
                if (((a.startsWith("docnum")) || (a.startsWith("contract")))
                        && (a.length() == 15)) {

                    writer1.write(a+"\n");
                    System.out.print(a);
                    System.out.println(" | Adopted");


                } else {

                    writer2.write(a+"\n");
                    System.out.print(a);
                    System.out.println(" | Error");
                }


            }
            writer1.close();
            writer2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
