import java.util.Scanner;

public class StudentGradeTracker{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students:");
        int n = input.nextInt();

        String[] names = new String[n];
        double[] grades = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter grade: ");
            grades[i] = input.nextDouble();
        }
        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];

        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 0; i < n; i++){
            sum = sum + grades[i];

            if (grades[i] > highest){
                highest = grades[i];
                highestIndex = i;
            }
            if (grades[i] < lowest){
                lowest = grades[i];
                lowestIndex = i;
            }
        }
        double average = sum / n;

        System.out.println("\n----- Student Grade Report -----");

        for (int i = 0; i < n; i++){
            System.out.println(names[i] + " : " + grades[i]);
        }
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest + " (" + names[highestIndex] + ")");
        System.out.println("Lowest Grade: " + lowest + " (" + names[lowestIndex] + ")");

        input.close();
    }
}