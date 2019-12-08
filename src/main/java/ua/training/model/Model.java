package ua.training.model;

import ua.training.model.entity.Notebook;

public class Model {
    private Notebook note;

    public void setNote(Notebook note) throws NicknameExistsException {
        checkNickname(note);
        this.note = note;
    }

    private void checkNickname(Notebook note) throws NicknameExistsException {
        for (SavedNicknames nicknames : SavedNicknames.values()) {
            if (nicknames.name().equals(note.nickname)) {
                throw new NicknameExistsException(note);
            }
        }
    }

}
