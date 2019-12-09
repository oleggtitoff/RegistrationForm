package ua.training.controller;

public enum Groups {
    GROUP1("Group1"),
    GROUP2("Group2"),
    GROUP3("Group3");

    private final String groupName;

    Groups(String groupName) {
        this.groupName = groupName;
    }

    public String groupName() {
        return groupName;
    }
}
