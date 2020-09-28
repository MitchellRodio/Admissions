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

          Scanner  location = new Scanner(System.in);  
        System.out.println("Enter your State: ");

        String stateLocation = awards.nextLine();
        
        if (stateLocation == "Florida") {
            System. exit(0)
        }
// STATE LOCATION ^

//         System.out.println("SAT: " + satScore "Class Rank: " + rankClass "Class award: " + awards );  <- TESTING
        
        if (scoreSAT >= 1200) && (classRank >= 85) && (classAwards >= 3) {
            System.out.println("You can be accepted!)
        } else {
            System.out.println("You cannot be accepted!)
        }
  

    }
}
