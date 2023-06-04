import java.util.Scanner;

public class stars {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle: ");
        int width = input.nextInt();
        
        System.out.print("Enter the height of the rectangle: ");
        int height = input.nextInt();
        
        // Print the rectangle using stars
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        input.close();
    }
}
