/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Map;
import java.util.Scanner;
import view.Menu;

/**
 *
 * @author Bravo
 */
public class TextController extends Menu<String> {
    private TextAnalyzer model;
    private TextView view;
    private Scanner scanner;

    public TextController(TextAnalyzer model, TextView view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:
                String inputText = view.getInput();
                model.setText(inputText);
                Map<String, Integer> wordResult = model.Wordcounts();
                Map<Character, Integer> charResult = model.countCharacters();
                view.displayWordResult(wordResult);
                view.displayCharResult(charResult);
                break;
            case 2:
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid!");
        }
    }

    
}
