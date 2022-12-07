import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+age+" лет, то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен "+age+" лет, то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int temp=-8;
        if (temp<=5) {
            System.out.println("На улице "+temp+" градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице "+temp+" градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int speed=30;
        if (speed<=60) {
            System.out.println("Если скорость "+speed+" км/ч, то можно ездить спокойно.");
        }
        else {
            System.out.println("Если скорость "+speed+" км/ч, то придется заплатить штраф.");
        }

        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int ageHuman = 28;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ",то ему нужно ходить в детский сад.");
        }
        else if (ageHuman >= 7 && ageHuman <= 18) {
            System.out.println("Если возраст человека равен " + ageHuman + ",то ему нужно ходить в школу.");
        }
        else if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ",то ему нужно ходить в университет.");
        }
        else  if (ageHuman<2) {
            System.out.println("Если возраст человека равен " + ageHuman + ",то он еще малыш и ходит на прогулки с мамой.");
        }
        else {
            System.out.println("Если возраст человека равен " + ageHuman + ",то пора идти работать.");
        }

        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int ageKid = 4;
        if (ageKid >= 5 && ageKid <= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет, то он может кататься на аттракционах только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (ageKid>14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет,то он может кататься на аттракционах без сопровождения взрослого.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + ageKid + " год(а),то ему нельзя кататься на аттракционах.");
        }

        System.out.println("Задача 6");
        // Пишем код для задачи 6
        int numberOfPeople=68;
        int capacityWagon=102;
        int plaseSit=60;
        int plaseStand=capacityWagon-plaseSit;
        if (numberOfPeople<=plaseSit && numberOfPeople<capacityWagon){
            System.out.println("Если в вагоне "+numberOfPeople+" человек(а), то в нем свободно "+(capacityWagon-numberOfPeople)+" мест(а), из них сидячих мест "+(plaseSit-numberOfPeople)+", стоячих мест "+plaseStand);
        }
        else if (numberOfPeople>plaseSit && numberOfPeople<capacityWagon) {
            System.out.println("Если в вагоне "+numberOfPeople+" человек(а), то в нем свободно "+(capacityWagon-numberOfPeople)+" мест(а), из них сидячих мест 0, стоячих мест "+(capacityWagon-numberOfPeople));
        }
        else if (numberOfPeople==capacityWagon){
            System.out.println("Если в вагоне "+numberOfPeople+" человек(а), то свободных мест нет.");
        }
        else {
            System.out.println("Если количество людей превышает вместимость вагона.");
        }
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        int one=666;
        int two=777;
        int three=555;
        if (one>two && one>three) {
            System.out.println("Наибольшее из чисел-это "+one);
        }
        else if (two>one && two>three){
            System.out.println("Наибольшее из чисел-это "+two);
        }
        else {
            System.out.println("Наибольшее из чисел-это "+three);
        }
    }
}