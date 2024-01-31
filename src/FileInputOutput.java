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

        FileInputStream myFile = null;
        try{
            myFile = new FileInputStream("src/moviesDataset.csv");
        } catch(FileNotFoundException e){
            System.out.println("Could not open file");
            System.exit(1);
        }

        Scanner fileReader = new Scanner(myFile);
        while (fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            System.out.println(data);
        }
        fileReader.close();

        FileInputStream myFile1 = null;
        try {
            myFile1 = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
            System.exit(1);
        }

        Scanner  fileReader1 = new Scanner(myFile1);
        while (fileReader1.hasNextLine()){
            String data = fileReader1.nextLine();
            String[] movie = data.split(",");
            System.out.println(movie[2]);
        }
        fileReader1.close();

    }

}