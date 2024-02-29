import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName); //receiving the file from the computer
        int[][] matrix = Matrix.Matrixreader(fileName);
        if (matrix == null) {
            System.out.println("Matrix file not found!");
            return;
        }
        System.out.println(Matrix.Checkertype(matrix));



    }
}

