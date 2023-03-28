package com.processing;

import com.organizations.*;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class menuProcessing implements menyCompanyCommands, menuRegionCommands {
    static List<Company> companyList = new ArrayList<>();
    static Set<Region> regionList = new HashSet<>();
    static Scanner read = new Scanner(System.in);

    public void addNewCompany() {
        read.nextLine();
        System.out.println("Введите название компании: ");
        String name = read.nextLine();
        read.nextLine();
        System.out.println("Введите название и код региона: ");
        Region region = new Region(read.nextLine(), read.nextInt());
        regionList.add(region);
        read.nextLine();
        System.out.println("Введите количество сотрудников: ");
        int employeeAmount = read.nextInt();
        read.nextLine();
        System.out.println("Введите дату регистрации в формате дд мм гггг: ");
        int[] dmy = Arrays.stream(read.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        LocalDate dateOfRegistration = LocalDate.of(dmy[2], dmy[1], dmy[0]);
        companyList.add(new Company(name, region, employeeAmount, dateOfRegistration));
    }

    @Override
    public void addNewRegion() {
        read.nextLine();
        System.out.println("Введите название региона: ");
        String name = read.nextLine();
        System.out.println("Введите код региона: ");
        int code = read.nextInt();
        regionList.add(new Region(name, code));
    }

    @Override
    public void showAllCompanies() {
        for (Company company : companyList) {
            System.out.println(company);
        }
    }

    public void showAllRegions() {
        for (Region region : regionList) {
            System.out.println(region);
        }
    }

    @Override
    public void showBigCompanies() {
        for (Company company : companyList) {
            if (company.getEmployeeAmount() > 1000) {
                System.out.println(company);
            }
        }
    }

    @Override
    public void showMidCompanies() {
        for (Company company : companyList) {
            if (company.getEmployeeAmount() > 500 && company.getEmployeeAmount() < 1001) {
                System.out.println(company);
            }
        }
    }


    @Override
    public void showSmallCompanies() {
        for (Company company : companyList) {
            if (company.getEmployeeAmount() < 501) {
                System.out.println(company);
            }
        }
    }

    @Override
    public void showCompaniesByRegion() {
        System.out.println("Введите номер региона для фильтрации: ");
        int regNum = read.nextInt();
        for (Company company : companyList) {
            if (company.getRegionCode() == regNum) {
                System.out.println(company);
            }
        }
    }

    @Override
    public void readCompaniesFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ListOfCompanies.txt"))) {
            Object obj;
            while ((obj = inputStream.readObject()) != null) {
                Company cmpn = (Company) obj;
                companyList.add(cmpn);
                regionList.add(new Region(cmpn.getRegionName(), cmpn.getRegionCode()));
                System.out.println(cmpn);
            }
        } catch (EOFException ex){
            System.out.println("Компании считаны");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void writeCompaniesToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ListOfCompanies.txt"))) {
            for (Company company : companyList) {
                outputStream.writeObject(company);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void readRegionsFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ListOfRegions.txt"))) {
            Object obj;
            while ((obj = inputStream.readObject()) != null) {
                Region rgn = (Region) obj;
                regionList.add(rgn);
                System.out.println(rgn);
            }
        } catch (EOFException ex){
            System.out.println("Регионы считаны");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void writeRegionsToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ListOfRegions.txt"))) {
            for (Region region : regionList) {
                outputStream.writeObject(region);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
