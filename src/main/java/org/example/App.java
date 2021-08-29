package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        String message = "Do you {0} your {1} {2} {3}? That's hilarious!";
        String formattedString = MessageFormat.format(message, verb, adjective, noun, adverb);
        System.out.println(formattedString);
    }
}
