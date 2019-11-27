package model;

import java.util.Date;

public class Subscriber {

    private String lastName;
    private String firstName;
    private String patronymic;
    private String formattedName;

    private String nickname;
    private String comment;

    private String phone;
    private String mobileOne;
    private String mobileTwo;
    private String skype;

    private String index;
    private String city;
    private String street;
    private String building;
    private String apartment;
    private String fullAddress;

    private Date created;
    private Date modified;

    private String[] allData;

    public Subscriber(int numberOfFields) {
        this.allData = new String[numberOfFields];
    }
}
