package com.ilCarroNewQa25;

public class User {
    private  String firstName;
    private String secondName;
    private  String email;
    private  String password;

    public User withfirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User withsecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
