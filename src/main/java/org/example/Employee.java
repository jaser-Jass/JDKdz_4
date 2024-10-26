package org.example;

public class Employee {
    private String employeeId; // Табельный номер
    private String phoneNumber; // Номер телефона
    private String name;        // Имя
    private int experience;     // Стаж

    public Employee(String employeeId, String phoneNumber, String name, int experience) {
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

}
