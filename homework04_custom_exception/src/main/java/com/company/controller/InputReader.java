package com.company.controller;

import com.company.view.View;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner;
    private View view;

    public InputReader(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String promptUntilValidInput(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}