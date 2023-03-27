package com.organizations;

import java.io.Serializable;

public class Region implements Serializable {
    private String name;
    private int code;

    public Region(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Регион{" +
                "Название='" + name + '\'' +
                ", Номер региона=" + code +
                '}';
    }

    public String getName() {
        return name;
    }


    public int getCode() {
        return code;
    }

    public String getRegion() {
        return name + ", " + code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
