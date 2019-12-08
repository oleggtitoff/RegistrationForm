package ua.training.model;

import ua.training.model.entity.Notebook;

public class Model {
    private Notebook note;

    public void setNote(Notebook note) {
        checkNickname(note);
        this.note = note;
    }

    private void checkNickname(Notebook note) {
        for (SavedNicknames nicknames : SavedNicknames.values()) {
            if (nicknames.name().equals(note.nickname)) {
                // TODO: throw NicknameExistsException
            }
        }
    }

}
