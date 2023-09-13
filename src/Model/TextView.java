/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class TextView {
    private Scanner sc;

    public TextView(Scanner scanner) {
        this.sc = scanner;
    }

    public String getInput() {
        System.out.print("Enter Your content: ");
        return sc.nextLine();
    }

    public void displayWordResult(Map<String, Integer> wordCount) {
        System.out.print("{");
        int count = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (count > 0) {
                System.out.print(", ");
            }
            System.out.print(entry.getKey() + "=" + entry.getValue());
            count++;
        }
        System.out.println("}");
    }

    public void displayCharResult(Map<Character, Integer> charCount) {
        System.out.print("{");
        int count = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (count > 0) {
                System.out.print(", ");
            }
            System.out.print(entry.getKey() + "=" + entry.getValue());
            count++;
        }
        System.out.println("}");
    }

}

