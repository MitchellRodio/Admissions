import java.util.Scanner;

public class Admissions {

    public static void main(String[] args) {
        
        Scanner scoreSAT = new Scanner(System.in);  
        System.out.println("Enter your SAT Score: ");

        String satScore = scoreSAT.nextLine();  
// Sat ^
        Scanner classRank = new Scanner(System.in);  
        System.out.println("Enter your SAT Score: ");

        String rankClass = classRank.nextLine();  
// Class rank ^ 
        Scanner awards = new Scanner(System.in);  
        System.out.println("Enter your SAT Score: ");

        String classAwards = awards.nextLine();  
        System.out.println("SAT: " + satScore "Class Rank: " + rankClass "Class award: " + awards );  
  

    }
}
