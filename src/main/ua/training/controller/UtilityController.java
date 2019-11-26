package ua.training.controller;

import ua.training.view.StringsContainer;
import ua.training.view.View;

import java.sql.Timestamp;
import java.util.Scanner;
import java.util.regex.Pattern;

class UtilityController {
    private View view;
    private Scanner scanner;

    UtilityController(View view) {
        this.view = view;
        scanner = new Scanner(System.in);
    }

    String getRegexFromEnum(RegexContainer.groups[] groups) {
        StringBuilder regex = new StringBuilder();

        regex.append(StringsContainer.CARET_SIGN);
        for (RegexContainer.groups group : RegexContainer.groups.values()) {
            regex.append(group);
            regex.append(StringsContainer.VERTICAL_BAR_SYMBOL);
        }
        regex.setLength(regex.length() - 1);
        regex.append(StringsContainer.DOLLAR_SIGN);
        return regex.toString();
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

    String inputStringWithScannerByRegex(String message, String regex) {
        String inputString;

        view.printLine(message);
        inputString = scanner.nextLine();
        while (!matchStringToRegex(inputString, regex)) {
            view.printLine(StringsContainer.WRONG_INPUT_MESSAGE);
            view.printLine(message);
            inputString = scanner.nextLine();
        }
        return inputString;
    }

    private boolean matchStringToRegex(String message, String regex) {
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(message).matches();
    }

    String getTimestampInString() {
        return new Timestamp(System.currentTimeMillis()).toString();
    }

}
