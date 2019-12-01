package ua.training.controller;

import ua.training.model.Notebook;
import ua.training.view.StringsContainer;
import ua.training.view.View;

class InputToNotebook {
    private View view;
    private UtilityController utilController;
    private Notebook note;

    InputToNotebook(View view) {
        this.view = view;
        utilController = new UtilityController(view);
        note = new Notebook();
    }

    Notebook inputForm() {
        inputFullName();
        setFullNameShortForm();
        inputNickname();
        inputComment();
        inputGroup();
        inputPhoneNumbers();
        inputEmail();
        inputSkype();
        inputAdress();
        setFullAddress();
        printMessageOfThanks();
        setTimestamp();
        printAllForm();
        return note;
    }

    private void inputFullName() {
        inputName();
        inputSurname();
        inputPatronymic();
    }

    private void inputName() {
        note.name = utilController.inputStringWithScannerByRegex(
                StringsContainer.NAME_PROMPT, RegexContainer.NAME_REGEX);
    }

    private void inputSurname() {
        note.surname = utilController.inputStringWithScannerByRegex(
                StringsContainer.SURNAME_PROMPT, RegexContainer.NAME_REGEX);
    }

    private void inputPatronymic() {
        note.patronymic = utilController.inputStringWithScannerByRegex(
                StringsContainer.PATRONYMIC_PROMPT, RegexContainer.NAME_REGEX);
    }

    private void setFullNameShortForm() {
        String firstLetterOfName = utilController.getFirstLetter(note.name);

        note.fullNameShortForm = utilController.concatenateString(note.surname,
                StringsContainer.SPACE_SIGN, firstLetterOfName,
                StringsContainer.DOT_SIGN);
    }

    private void inputNickname() {
        note.nickname = utilController.inputStringWithScannerByRegex(
                StringsContainer.NICKNAME_PROMPT,
                RegexContainer.NICKNAME_REGEX);
    }

    private void inputComment() {
        note.comment = utilController.inputStringWithScannerByRegex(
                StringsContainer.COMMENT_PROMPT, RegexContainer.COMMENT_REGEX);
    }

    private void inputGroup() {
        note.group = utilController.inputStringWithScannerByRegex(
                StringsContainer.GROUP_PROMPT,
                utilController.getRegexFromEnum(RegexContainer.groups.values()));
    }

    private void inputPhoneNumbers() {
        inputHomePhone();
        inputMobilePhone();
        inputOptionalMobilePhone();
    }

    private void inputHomePhone() {
        note.homePhone = utilController.inputStringWithScannerByRegex(
                StringsContainer.HOME_PRONE_PROMPT, RegexContainer.PHONE_REGEX);
    }

    private void inputMobilePhone() {
        note.mobilePhone = utilController.inputStringWithScannerByRegex(
                StringsContainer.MOBILE_PHONE_PROMPT,
                RegexContainer.PHONE_REGEX);
    }

    private void inputOptionalMobilePhone() {
        note.optionalMobilePhone = utilController.inputStringWithScannerByRegex(
                StringsContainer.OPTIONAL_PHONE_PROMPT,
                RegexContainer.OPTIONAL_PHONE_REGEX);
    }

    private void inputEmail() {
        note.email = utilController.inputStringWithScannerByRegex(
                StringsContainer.EMAIL_PROMPT, RegexContainer.EMAIL_REGEX);
    }

    private void inputSkype() {
        note.skype = utilController.inputStringWithScannerByRegex(
                StringsContainer.SKYPE_PROMPT, RegexContainer.SKYPE_REGEX);
    }

    private void inputAdress() {
        inputPostIndex();
        inputCity();
        inputStreet();
        inputHouseNumber();
        inputApartmentNumber();
    }

    private void inputPostIndex() {
        note.postIndex = utilController.inputStringWithScannerByRegex(
                StringsContainer.POST_INDEX_PROMPT,
                RegexContainer.POST_INDEX_REGEX);
    }

    private void inputCity() {
        note.city = utilController.inputStringWithScannerByRegex(
                StringsContainer.CITY_PROMPT, RegexContainer.NAME_REGEX);
    }

    private void inputStreet() {
        note.street = utilController.inputStringWithScannerByRegex(
                StringsContainer.STREET_PROMPT, RegexContainer.NAME_REGEX);
    }

    private void inputHouseNumber() {
        note.houseNumber = utilController.inputStringWithScannerByRegex(
                StringsContainer.HOUSE_NUMBER_PROMPT,
                RegexContainer.ADDRESS_NUMBER_REGEX);
    }

    private void inputApartmentNumber() {
        note.apartmentNumber = utilController.inputStringWithScannerByRegex(
                StringsContainer.APARTMENT_NUMBER_PROMPT,
                RegexContainer.ADDRESS_NUMBER_REGEX);
    }

    private void setFullAddress() {
        note.fullAddress = utilController.concatenateString(note.postIndex,
                StringsContainer.COMMA_SIGN, StringsContainer.SPACE_SIGN,
                note.city, StringsContainer.COMMA_SIGN,
                StringsContainer.SPACE_SIGN, note.street,
                StringsContainer.COMMA_SIGN, StringsContainer.SPACE_SIGN,
                note.houseNumber, StringsContainer.COMMA_SIGN,
                StringsContainer.SPACE_SIGN, note.apartmentNumber,
                StringsContainer.DOT_SIGN);
    }

    private void setTimestamp() {
        note.timestamp = utilController.getTimestampInString();
    }

    private void printMessageOfThanks() {
        view.printBundleLine(StringsContainer.MESSAGE_OF_THANKS);
    }

    private void printAllForm() {
        view.printLine(note.name);
        view.printLine(note.surname);
        view.printLine(note.patronymic);
        view.printLine(note.fullNameShortForm);
        view.printLine(note.nickname);
        view.printLine(note.comment);
        view.printLine(note.group);

        view.printLine(note.homePhone);
        view.printLine(note.mobilePhone);
        view.printLine(note.optionalMobilePhone);
        view.printLine(note.email);
        view.printLine(note.skype);

        view.printLine(note.postIndex);
        view.printLine(note.city);
        view.printLine(note.street);
        view.printLine(note.houseNumber);
        view.printLine(note.apartmentNumber);
        view.printLine(note.fullAddress);

        view.printLine(note.timestamp);
    }

}
