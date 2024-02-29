import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Matrix {
    public static int[][] Matrixreader(String fileName) { // this method puts the matrix values into the two-dimensional array
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            int row = 0;
            int col= 0;
            while (scanner.hasNextLine()) {
                row++;
                String line = scanner.nextLine();
                String[] tokens = line.split("\\s+");
                col = tokens.length;
            }
            scanner.close();
            int[][] matrix = new int[row][col];
            scanner = new Scanner(file);
            for (int i = 0; i < row; i++) {
                String line = scanner.nextLine();
                String[] tokens = line.split("\\s+");
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = Integer.parseInt(tokens[j]);
                }
            }
            scanner.close();
            return matrix;
        } catch (FileNotFoundException e) {
            return null;
        }
    }
    public static String Checkertype(int[][] array) {//returns the type of the matrix
        LinkedList ll = new LinkedList();
        boolean type1 = false;
        boolean type2 = false;
        int a =0;
        String result = "It is not one of these types";

        // Add the first row values to the linked list
        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array[k].length; j++) {
                a= array[k][j];
                ll.addLast(a);

            }
            // Check for type 1
            for(int i =0;i<ll.Size()-2;i++)
                if(ll.get(i)>0 && ll.get(i)+1==ll.get(i+1)&&ll.get(i+1)+1==ll.get(i+2))
                    type1=true;


            // Check for type 2
            for (int i = 0; i < array.length-1; i++) {
                if (ll.get(i) < 0 && ll.get(i+1) < 0)
                    type2 = true;
            }
            while (!ll.isEmpty()) { //clear all the values from the list//
                ll.remove();
                ll.size=0;
            }


        }

        // Determine the type of matrix
        if (type1 && type2) {
            result = "It is a type 3 matrix.";
        } else if (type1) {
            result = "It is a type 1 matrix.";
        } else if (type2) {
            result = "It is a type 2 matrix.";
        }

        return result;
    }
}

