public class Main {
    public static void main(String[] args) {
        System.out.println();

        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();


    }

    public static void task1(){
        System.out.println("Задача #1");

        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){
        System.out.println("Задача #2");

        int clientOS = 1;
        int year = 2014;

        if (clientOS == 0 && year > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year > 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3(){
        System.out.println("Задача #3");

        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Этот год высокосный");
        } else{
            System.out.println("Этот год не высокосный");
        }
    }

    public static void task4(){
        System.out.println("Задача #4");
        int deliveryDistance = 99;
        int day = 1;

        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            day += 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            day +=2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5(){
        System.out.println("Задача #5");

        int monthNumber = 6;
        String season;


        switch (monthNumber){
            case 1:
                season = " зиме";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 2:
                season = " зиме";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 3:
                season = " весне";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 4:
                season = " весне";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 5:
                season = " весне";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 6:
                season = " лету";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 7:
                season = " лету";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 8:
                season = " лету";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 9:
                season = " осени";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 10:
                season = " осени";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 11:
                season = " осени";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            case 12:
                season = " зиме";
                System.out.println(monthNumber +"-й месяц пренадлежит к" + season);
                break;
            default:
                System.out.println("В году всего 12 месяцев");

        }
    }
}