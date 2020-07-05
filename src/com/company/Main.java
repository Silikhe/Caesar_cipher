package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] alphabets = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        for (int i =0; i < alphabets.length; i++){
          System.out.println("The values are" + alphabets[i]);
//        };

        //Enter desired key
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Key:");
        int number = scanner.nextInt();
//        System.out.println(number);

        //setting desired key
        int num = 0;
        num = number;
        System.out.println("Our desired key is:" + num);


//        words
                System.out.println("Enter words");
        // Reading data using readLine
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keyWords = reader.readLine();
        System.out.println("values:" + keyWords);

        String[] splitWords = keyWords.split("");


//        String output []= {};


        for (String splice: splitWords)
            System.out.println(splice.toUpperCase());
//        if (for (int i =0; i < alphabets.length; i++){
//            S
//        }
//            })


    };




    }}


//    public static void main(String[] args) throws IOException {
//	// write your code here
//            String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
//    "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
//
////          String[]  cleanerAlphas;
//            //finding the index of alphabets
//            for (int i =0; i < alphabet.length; i++){
//            }
//
////                 System.out.println(alphabet);
//        //Enter data using BufferReader
//        BufferedReader reader =
//                new BufferedReader(new InputStreamReader(System.in));
//
//        // Reading data using readLine
//        String word = reader.readLine();
//
//
//        //splting the words entered
//        String[] wordRefined = word.split("");
////        System.out.println(wordRefined);
//
//        //Desired number
//        BufferedReader number =
//                new BufferedReader(new InputStreamReader(System.in));
//        // Reading data using readLine
//        String key = number.readLine();
////        System.out.println("values:" + key);
////        System.out.println( int key;);
//
//
//     //looping through to find the index of entered value
//        for (int j=0; j< wordRefined.length; j++){
//            System.out.println(wordRefined[j]);
//            //push the letters into an array
//
//        }
//
//        //loop through the alphabet and find the in
//    }

//};
