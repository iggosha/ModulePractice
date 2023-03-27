// 8. Информация о предприятиях.
package com.runner;

import java.util.Scanner;
import com.processing.*;
public class App {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
    }
}

