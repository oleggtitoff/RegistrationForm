package ua.training.controller;

interface RegexContainer {
    String REGEX_NAME = "^[A-Za-zА-ЩЬЮЯҐЄІЇа-щьюяґєії]{1,20}$";
    String REGEX_NICKNAME = "^[A-Za-z_-]{8,20}$";
    String REGEX_COMMENT = "^[A-Za-zА-ЩЬЮЯҐЄІЇа-щьюяґєії0-9 ]{0,300}$";
    String REGEX_PHONE = "^[0-9]{10}$";
    String REGEX_OPTIONAL_PHONE = "^([0-9]{10})?$";
    String REGEX_EMAIL
            = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9_.-]{5,31}$";
    String REGEX_POST_INDEX = "^[0-9]{5}$";
    String REGEX_ADDRESS_NUMBER = "^[0-9]{1,4}[A-Za-zА-ЩЬЮЯҐЄІЇа-щьюяґєії]?$";

    enum groups {
        Group1,
        Group2,
        Group3
    }
}
