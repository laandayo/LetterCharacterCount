/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author Bravo
 */
public class TextAnalyzer {
    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public Map<String,Integer> Wordcounts(){
        Map<String,Integer> wordcount = new HashMap();
        StringTokenizer token = new StringTokenizer(text);
        while(token.hasMoreTokens()){
            String word=token.nextToken();
            wordcount.put(word, wordcount.getOrDefault(word, 0)+1);
            
        }
        return wordcount;
    }
    public Map<Character, Integer> countCharacters() {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        return charCount;
    }
}
