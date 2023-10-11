package com.promineotech;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void validateFirstName() {
        if (this.firstName.isBlank())
            throw new RuntimeException("First Name Cannot be null or empty");
    }

    public void validateLastName() {
        if (this.lastName.isBlank())
            throw new RuntimeException("Last Name Cannot be null or empty");
    }

    /**
     * 12242345555
     */
    public void validatePhoneNumber() {
        if (this.phoneNumber.isBlank()){
            throw new RuntimeException("Phone Name Cannot be null or empty");
        }
        if (this.phoneNumber.length() != 11) {
            throw new RuntimeException("Phone Number Should be 11 Digits Long");
        }
        if (!this.phoneNumber.matches("\\d+")) {
            throw new RuntimeException("Phone Number Contain only digits");
        }
        if (!this.phoneNumber.startsWith("1")) {
            throw new RuntimeException("Phone Number Should Start with 1");
        }
    }

    /**
     * 1-714-555-6666
     * 1 (714) 555-6666
     * 12242345555
     */
    public void validatePhoneNumber2() {
    	if (this.phoneNumber.isBlank()){
            throw new RuntimeException("Phone Name Cannot be null or empty");
        }
        if (!this.phoneNumber.matches("^\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$")) {
            throw new RuntimeException("Phone Number Contain only digits");
        }
    }
}