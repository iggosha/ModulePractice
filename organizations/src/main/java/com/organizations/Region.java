package com.organizations;

import java.io.Serializable;
import java.util.Objects;

public class Region implements Serializable {
    private String name;
    private int code;
    private static final long serialVersionUID = 8627957698211478577L;

    public Region(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Region region = (Region) obj;
        return getCode() == region.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
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
