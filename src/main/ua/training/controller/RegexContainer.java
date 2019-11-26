package ua.training.controller;

interface RegexContainer {
    String NAME_REGEX = "^[A-Za-zА-ЩЬЮЯҐЄІЇа-щьюяґєії]{1,20}$";
    String NICKNAME_REGEX = "^[A-Za-z_-]{8,20}$";
    String COMMENT_REGEX = "^[A-Za-zА-ЩЬЮЯҐЄІЇа-щьюяґєії0-9 ]{0,300}$";
    String PHONE_REGEX = "^[0-9]{10}$";
    String OPTIONAL_PHONE_REGEX = "^([0-9]{10})?$";
    String EMAIL_REGEX
            = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    String SKYPE_REGEX = "^[a-zA-Z][a-zA-Z0-9_.-]{5,31}$";
    String POST_INDEX_REGEX = "^[0-9]{5}$";
    String ADDRESS_NUMBER_REGEX = "^[0-9]{1,4}[A-Za-zА-ЩЬЮЯҐЄІЇа-щьюяґєії]?$";

    enum groups {
        Group1,
        Group2,
        Group3
    }
}
