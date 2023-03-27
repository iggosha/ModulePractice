package com.organizations;

import java.io.Serializable;
import java.time.LocalDate;

// Список предприятий региона
// Список всех всех предприятий
// Список предприятий по крупным/малым
public class Company implements Serializable {
    private String name;
    private Region region;
    private int employeeAmount;
    private LocalDate dateOfRegistration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeAmount() {
        return employeeAmount;
    }
    public int getRegionCode() {
        return region.getCode();
    }

    public void setEmployeeAmount(int employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }


    public Company(String name, Region region, int employeeAmount, LocalDate dateOfRegistration) {
        this.name = name;
        this.region = region;
        this.employeeAmount = employeeAmount;
        this.dateOfRegistration = dateOfRegistration;
    }

    @Override
    public String toString() {
        return "Компания {" + "Название ='" + name + '\'' + ", Регион ='" + region + '\'' + ", Количество сотрудников="
                + employeeAmount + '\'' + ", Дата регистрации=" + dateOfRegistration + '}';
    }
}
