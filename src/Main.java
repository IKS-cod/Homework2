public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задание1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание4");
        var friend = 19;
        System.out.println(friend);
        friend = 19 + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание5");
        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);
        System.out.println(secondBoxer - firstBoxer);

        System.out.println("Задание7");
        System.out.println(secondBoxer - firstBoxer);
        System.out.println(secondBoxer % firstBoxer);

        System.out.println("Задание8");
        var workingHours = 640;
        var workingHoursOneEmployee = 8;
        var totalEmployees = workingHours / workingHoursOneEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + workingHours / totalEmployees * totalEmployees + " часов работы может быть поделено между сотрудниками");









    }
}