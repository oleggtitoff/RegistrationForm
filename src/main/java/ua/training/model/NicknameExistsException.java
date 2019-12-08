package ua.training.model;

import ua.training.model.entity.Notebook;

public class NicknameExistsException extends Exception {
    private Notebook note;

    NicknameExistsException (Notebook note) {
        this.note = note;
    }

    public Notebook getNote() {
        return note;
    }

}
