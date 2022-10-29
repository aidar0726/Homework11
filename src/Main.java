public class Main {
    public static void main(String[] args) {

        System.out.println("//Задание 1");
        determinesLeapYear (2004);
        System.out.println("//Задание 2");
        indicatesNeedUpdates (1,2012);
        System.out.println("//Задание 3");
        System.out.println("Потребуется дней: " + returnNumberDeliveryDays(30));

    }

    public static void determinesLeapYear ( int year){
        if ((year % 4) == 0 && (year % 100 != 0 && year % 400 == 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
    }

    public static void indicatesNeedUpdates (int clientOS, int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке,также необходимо установить облегченную версию приложения");
        } else if (clientOS == 1 && clientDeviceYear <= 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке,также необходимо установить облегченную версию приложения");
        }
    }

    public static int returnNumberDeliveryDays (int distance) {

        if (distance <=  20) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else  {
            return 3;
        }
    }

}