// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4 - 3.5;
        cat = cat + 4 - 1.6;
        paper = paper + 4 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var generalBoxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух бойцов - " + generalBoxersWeight + "кг");
        var differenceBoxersWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница между весами бойцов - " + differenceBoxersWeight + "кг");

    }
    public static void task7() {
        System.out.println("Задача 7");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var differenceBoxersWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница между весами бойцов 2 и 1 - " + differenceBoxersWeight + "кг");
        var differenceBoxersWeightProcent = (boxer2Weight / boxer1Weight - 1) * 100;
        System.out.println("Разница между весами бойцов 2 и 1 в процентном соотношении " + differenceBoxersWeightProcent + "%");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var allTimes = 640;
        var oneWorkerTimes = 8;
        var theNumbersOfWorker = allTimes / oneWorkerTimes;
        System.out.println("Всего работников в компании - " + theNumbersOfWorker + " человек");
        var theNumbersOfWorkerMore = theNumbersOfWorker + 94;
        var allTimesMore = theNumbersOfWorkerMore * 8;
        System.out.println("Если в компании работает " + theNumbersOfWorkerMore + " человек, то всего " + allTimesMore + " часа работы может быть поделено между сотрудниками");
    }
}
