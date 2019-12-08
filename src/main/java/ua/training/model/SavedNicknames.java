package ua.training.model;

public enum SavedNicknames {
    USER1("user123"),
    USER2("nick543"),
    USER3("cool_name"),
    USER4("sarah_connor");

    private final String nickname;

    SavedNicknames(String nickname) {
        this.nickname = nickname;
    }

    public String nickname() {
        return nickname;
    }

}
