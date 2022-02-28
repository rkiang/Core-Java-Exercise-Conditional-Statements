import java.util.Scanner;

public class IfElseIfGradeStatement {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter grade");
        int Grade = Integer.parseInt(x.nextLine());
        if (Grade >= 90 && Grade < 100) {
            System.out.println("A");
        } else if (Grade >= 80 && Grade <= 89) {
            System.out.println("B");
        } else if (Grade >= 70 && Grade <= 79){
            System.out.println("C");
        } else if (Grade >= 60 && Grade <= 69) {
            System.out.println("D");
        } else if (Grade < 60){
            System.out.println("F");
        } else {
            System.out.println("Out of range");
        }
    }
}
