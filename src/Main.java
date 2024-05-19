public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int personAge = 15 + ((int) (Math.random() * 10));
        System.out.printf("personAge: %s\n", personAge);
        if (personAge >= 18) {
            System.out.printf("Если возраст человека равен %s, то он совершеннолетний.\n", personAge);
        } else {
            System.out.printf("Если возраст человека равен %s, то он не достиг совершеннолетия, нужно немного подождать.\n", personAge);
        }
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        int weatherTemperature = ((int) (Math.random() * 10));
        System.out.printf("weatherTemperature: %s\n", weatherTemperature);
        if (weatherTemperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        int vehicleSpeed = 50 + ((int) (Math.random() * 20));
        System.out.printf("vehicleSpeed: %s\n", vehicleSpeed);
        if (vehicleSpeed > 60) {
            System.out.printf("Если скорость %s, то придется заплатить штраф.\n", vehicleSpeed);
        } else {
            System.out.printf("Если скорость %s, то можно ездить спокойно.\n", vehicleSpeed);
        }
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        int humanAge = (int) (Math.random() * 50);
        System.out.printf("humanAge: %s\n", humanAge);
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад.\n", humanAge);
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу.\n", humanAge);
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет.\n", humanAge);
        } else if (humanAge > 24) {
            System.out.printf("Если возраст человека равен %s, то ему пора ходить на работу.\n", humanAge);
        }
        System.out.println();

        // Task 5
        System.out.println("Task 5");
        int childrenAge = (int) (Math.random() * 20);
        System.out.printf("childrenAge: %s\n", childrenAge);

        if (childrenAge < 5) {
            System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе.\n", childrenAge);
        } else if (childrenAge >= 5 && childrenAge < 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении взрослого.\n", childrenAge);
        } else if (childrenAge >= 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе  без сопровождения взрослого.\n", childrenAge);
        }
        System.out.println();

        // Task 6
        System.out.println("Task 6");
        int wagonCapacity = 102;
        int wagonSittingPlacesCapacity = 60;
        int passengerAmount = (int) (Math.random() * 150);
        System.out.printf("passengerAmount: %s\n", passengerAmount);

        if (passengerAmount <= wagonSittingPlacesCapacity) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (passengerAmount < wagonCapacity){
            System.out.println("В вагоне есть свободные стоячие места.");
        } else {
            System.out.println("Вагон полон.");
        }
        System.out.println();

        // Task 7
        System.out.println("Task 7");
        int numberOne = (int) (Math.random() * 10);
        int numberTwo = (int) (Math.random() * 10);
        int numberThree = (int) (Math.random() * 10);
        System.out.printf("numberOne: %s\n", numberOne);
        System.out.printf("numberTwo: %s\n", numberTwo);
        System.out.printf("numberThree: %s\n", numberThree);

        int numberLargest = numberOne;
        if (numberTwo > numberLargest) {
            numberLargest = numberTwo;
        } else if (numberThree > numberLargest) {
            numberLargest = numberThree;
        }

        System.out.printf("Самое большое число %s.\n", numberLargest);
    }
}
