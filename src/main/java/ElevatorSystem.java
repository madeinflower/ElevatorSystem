//Task:
//Задача: вызов лифта
//В доме два лифта.
//Реализовать алгоритм отправки наиближайшего на вызывающий этаж.
//Алгоритм будет применяться в домах разной этажности.
//Пример:
//в доме 19 этажей
//работают лифт А и лифт В
//лифт А находиться на 0 этаже
//лифт В находиться на 8 этаже
//на вход: 1
//отправляем лифт А

import java.util.Scanner;

public class ElevatorSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalFloors = 19;

        int elevatorA = 0;
        int elevatorB = 8;

        System.out.println("Введите этаж вызова: ");
        int callFloor = scanner.nextInt();

        String chosenElevator = getClosestElevator(elevatorA, elevatorB, callFloor);

        System.out.println("Отправляем лифт: " + chosenElevator);
    }

    public static String getClosestElevator(int elevatorA, int elevatorB, int callFloor) {

        int distanceA = Math.abs(elevatorA - callFloor);
        int distanceB = Math.abs(elevatorB - callFloor);

        if (distanceA < distanceB) {
            return "A";
        } else if (distanceB < distanceA) {
            return "B";
        } else {
            return "A";
        }
    }
}
