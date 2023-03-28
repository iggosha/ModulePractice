package com.organizations;

import java.io.Serializable;
import java.time.LocalDate;

public class Company implements Serializable {
    private String name;
    private Region region;
    private int employeeAmount;
    private LocalDate dateOfRegistration;
    private static final long serialVersionUID = -3830263225727024679L;

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
    public String getRegionName() {return region.getName(); }

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
