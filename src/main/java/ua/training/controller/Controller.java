package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.NicknameExistsException;
import ua.training.model.entity.Notebook;
import ua.training.view.StringsContainer;
import ua.training.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        InputToNotebook inputToNotebook = new InputToNotebook(view);
        Notebook note = inputToNotebook.inputForm();

        tryToSetNote(inputToNotebook, note);
        inputToNotebook.printMessageOfThanks();
        inputToNotebook.printAllForm();
    }

    private void tryToSetNote(InputToNotebook inputToNotebook, Notebook note) {
        while (true) {
            try {
                model.setNote(note);
                break;
            } catch (NicknameExistsException exception) {
                view.printBundleLine(StringsContainer.NICKNAME_EXISTS_MESSAGE);
                note = inputToNotebook.inputNewNickname(note);
            }
        }
    }

}
