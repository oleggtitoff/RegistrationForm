package ua.training.controller;

import ua.training.model.Model;
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

        model.setNote(inputToNotebook.inputForm());
    }

}
