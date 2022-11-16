public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Полюзователю " + age + " лет. Поздравлем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Полюзователю " + age + " лет. Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет.");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        // Задание 3
        System.out.println("Задание 3");
        int vagon = 102;
        int vagonSit = 60;
        int vagonStand = vagon -vagonSit;

        int vagonSitTicket = 65;
        int vagonStandTicker = 80;
        if (vagonSitTicket < vagonSit) {
            System.out.println("Есть еще " + (vagonSit-vagonSitTicket) + " сидячих мест.");
        }
        if (vagonSitTicket >= vagonSit) {
            System.out.println("Сидячих мест нет!");
        }
        if (vagonStandTicker < vagonStand) {
            System.out.println("Есть еще " + (vagonStand-vagonStandTicker) + " стоячих мест.");
               }
        if (vagonStandTicker >= vagonStand) {
            System.out.println("Стоячих мест нет!");
        }

    }
}