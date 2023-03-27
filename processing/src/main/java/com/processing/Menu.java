package com.processing;

import java.util.Scanner;

public class Menu {
    static Scanner read = new Scanner(System.in);
    OrgProcessing menu = new OrgProcessing();

    public void menu() {
        int choice = 1;
        while (choice != 0) {
            showCommands();
            choice = read.nextInt();
            switch (choice) {
                case 1 -> menu.addNewCompany();
                case 2 -> menu.showAllCompanies();
                case 3 -> menu.showBigCompanies();
                case 4 -> menu.showMidCompanies();
                case 5 -> menu.showSmallCompanies();
                case 6 -> menu.showCompaniesByRegion();
                case 7 -> menu.writeCompaniesToFile();
                case 8 -> menu.readCompaniesFromFile();
                case 9 -> menu.writeRegionsToFile();
                case 10 -> menu.readRegionsFromFile();
                case 11 -> menu.addNewRegion();
                case 12 -> menu.showAllRegions();
                case 0 -> {
                    System.out.println("Завершение работы программы...");
                }
                default -> System.out.println("Неверный ввод");
            }
        }
    }

    void showCommands() {
        System.out.println("Меню");
        System.out.println("1. Добавить новую компанию");
        System.out.println("2. Показать все компании");
        System.out.println("3. Показать большие компании");
        System.out.println("4. Показать средние компании");
        System.out.println("5. Показать малые компании");
        System.out.println("6. Показать компании по региону");
        System.out.println("7. Записать компании в файл");
        System.out.println("8. Считать компании из файла");
        System.out.println("9. Записать регионы в файл");
        System.out.println("10. Считать регионы из файла");
        System.out.println("11. Добавить новый регион");
        System.out.println("12. Показать все регионы");
        System.out.println("0. Завершить работу");
        System.out.println("Введите номер нужной команды меню: ");
    }

}
