package com.processing;

import java.util.Scanner;

public class Menu {
    static Scanner read = new Scanner(System.in);
    menuProcessing menu = new menuProcessing();

    public void menu() {
        int choice = 2;
        while (choice != 0) {
            showCommands();
            choice = read.nextInt();
            switch (choice) {
                case 1 -> menu.addNewCompany();
                case 2 -> menu.addNewRegion();

                case 3 -> menu.showAllCompanies();
                case 4 -> menu.showBigCompanies();
                case 5 -> menu.showMidCompanies();
                case 6 -> menu.showSmallCompanies();
                case 7 -> menu.showAllRegions();
                case 8 -> menu.showCompaniesByRegion();

                case 9 -> menu.writeCompaniesToFile();
                case 10 -> menu.readCompaniesFromFile();
                case 11 -> menu.writeRegionsToFile();
                case 12 -> menu.readRegionsFromFile();

                case 0 -> System.out.println("Завершение работы программы...");

                default -> System.out.println("Неверный ввод");
            }
        }
    }

    void showCommands() {
        System.out.println("\n  Меню программы");
        System.out.println("Добавить");
        System.out.println("    1. Добавить новую компанию");
        System.out.println("    2. Добавить новый регион");

        System.out.println("Показать");
        System.out.println("    3. Показать все компании");
        System.out.println("    4. Показать большие компании");
        System.out.println("    5. Показать средние компании");
        System.out.println("    6. Показать малые компании");
        System.out.println("    7. Показать все регионы");
        System.out.println("    8. Показать компании с фильтром по региону");

        System.out.println("Работа с файлами");
        System.out.println("    9. Записать компании в файл");
        System.out.println("    10. Считать компании из файла");
        System.out.println("    11. Записать регионы в файл");
        System.out.println("    12. Считать регионы из файла");

        System.out.println("Работа с программой");
        System.out.println("    0. Завершить работу");
        System.out.println("Введите номер нужной команды меню: ");
    }

}
