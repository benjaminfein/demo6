package com.example.demo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

import static com.example.demo6.GameClass.game;
import static com.example.demo6.StringUtils.*;

@SpringBootApplication
public class Demo6Application {

    public static void main(String[] args) {
        String newString = "Hello! My name is Andrew, and today we start Java Learning!";
        String source = "Mandarin";
        String target = "darin";
        String reversibleString = "Hello";
        String supposedPalindrome = "qwertyytrewq";
        char symbol = 'a';
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Number of symbol <<" + symbol + ">> in string <<" + newString + ">> is: "
                + findSymbolOccurrence(newString, symbol) + '\n');
        System.out.println("Source: " + source + '\n' + "Target: " + target + '\n' + "Result: "
                + findWordPosition(target, source) + '\n');
        System.out.println(reversibleString + " -> " + stringReverse(reversibleString) + '\n');
        System.out.println(supposedPalindrome + " -> " + isPalindrome(supposedPalindrome) + '\n');

        game(words);

        SpringApplication.run(Demo6Application.class, args);
    }
}