package ua.training.controller;

import ua.training.view.StringsContainer;
import ua.training.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

class UtilityController {
    private View view;

    UtilityController(View view) {
        this.view = view;
    }

    String concatenateString(String... message) {
        StringBuilder resultString = new StringBuilder();

        for (String str : message) {
            resultString.append(str);
        }
        return resultString.toString();
    }

    String getFirstLetter(String message) {
        return message.substring(0, 1);
    }

    String inputStringWithScannerByRegex(Scanner scanner, String message,
                                         String regex) {
        String inputString = scanner.next();

        view.printLine(message);
        while (!matchStringToRegex(inputString, regex)) {
            view.printLine(StringsContainer.WRONG_INPUT_MESSAGE);
            inputString = scanner.next();
        }
        return inputString;
    }

    private boolean matchStringToRegex(String message, String regex) {
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(message).matches();
    }

}
