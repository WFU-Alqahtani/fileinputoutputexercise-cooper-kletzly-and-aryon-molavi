import java.io.*;
import java.util.Scanner;
public class FileInputOutput {

    public static void main(String[] args) {
//       1) Open the given file inside src called moviesDataSet.csv
//       2) Read each row in the dataset
//       3) Print each row to the screen
//       4) Print only the name of the movie
//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub
       /*
        String movies = "";

        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
            System.exit(1);
        }


        Scanner fileReader = new Scanner(myFile);
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            System.out.println(data);
            String[] movie = data.split(",");
            movies += movie[2] + "\n";
        }

        System.out.println(movies);
*/

        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
            System.exit(1);
        }

        PrintWriter fileWriter;
        FileOutputStream myFile1 = null;
        Scanner fileReader = new Scanner(myFile);

        try {
            myFile1 = new FileOutputStream("outputFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
            System.exit(1);
        }
        fileWriter = new PrintWriter(myFile1);
        int year;
        fileReader.nextLine();
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            String[] movie = data.split(",");
              try {
                  year = Integer.parseInt(movie[4]);
                  fileWriter.println(year);
              }
              catch (NumberFormatException e1){
                  fileWriter.println("n/a");
              }
        }
        fileWriter.close();
    }
}