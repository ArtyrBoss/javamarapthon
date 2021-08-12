package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            //System.out.println("Введите город: ");
            String cityName = scanner.nextLine();

            if (cityName.equals("Стоп")) {
                break;
            }

            switch (cityName) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("У города " + cityName + " страна Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("У города " + cityName + " страна Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("У города " + cityName + " страна Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("У города " + cityName + " страна Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}