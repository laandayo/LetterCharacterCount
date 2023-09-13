
import java.util.Scanner;
import Model.TextAnalyzer;
import Model.TextController;
import Model.TextView;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bravo
 */
public class LetterCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        TextView view = new TextView(sc); 
        TextAnalyzer model = new TextAnalyzer(""); 
        TextController Menu =new TextController(model,view,sc);
        while(true){
            Menu.display();
            System.out.println("1.Word + Character Count");
            System.out.println("2.Exit");
            System.out.print("Enter your Choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    Menu.execute(choice);
                    break;
                case 2:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
