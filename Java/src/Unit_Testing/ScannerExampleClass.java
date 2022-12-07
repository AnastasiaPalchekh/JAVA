package Unit_Testing;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
    public class ScannerExampleClass {

        public static void readFile() throws FileNotFoundException{
            File file = new File("C:\\Users\\anast\\Java mode1\\Java\\src\\Unit_Testing/Data.txt");
            Scanner scanner = new Scanner(file);

            StringBuilder sb = new StringBuilder();
            while(scanner.hasNextLine()){
                sb.append(scanner.nextLine());
            }
            System.out.println(sb);
        }

         public static void readFromConsole(){
            Scanner scanner = new Scanner(System.in);
            int variable = scanner.nextInt();
            System.out.println(variable);
        }

        public static void main(String[] args) throws FileNotFoundException{
            ScannerExampleClass.readFile();
            ScannerExampleClass.readFromConsole();
        }

    }



        /* public static void main(String[] args) throws IOException {
            FileWriter file = new FileWriter("C:\\Users\\anast\\Java mode1\\Java\\src\\Unit_Testing/Data.txt");
            file.write("2");
            file.write("\n");
            file.write("3");
            file.close();

            FileReader data = new FileReader("C:\\Users\\anast\\Java mode1\\Java\\src\\Unit_Testing/Data.txt");
            Scanner scanner = new Scanner(data);
            data.close();

            System.out.println(scanner);

        }
    }

*/