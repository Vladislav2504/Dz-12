package Documents;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner1 = new Scanner(System.in);
        String n = scanner1.next();

        try(FileReader file = new FileReader(n)) {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println((scanner.nextLine().startsWith("docnum")) || (scanner.nextLine().startsWith("contract"))
                        && (scanner.nextLine().length() == 15));
                System.out.println();
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
