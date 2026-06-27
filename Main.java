public class Main {
    public static void main(String[] args) {
        double dog = 8.0;
            System.out.println("dog = " + dog);
        dog = dog + 4;
            System.out.println("dog = " + dog);
        dog = dog - 3.5;
            System.out.println("dog = " + dog);
        double cat = 3.6;
            System.out.println("cat = " + cat);
        cat = cat + 4;
            System.out.println("cat = " + cat);
        cat = cat - 1.6;
            System.out.println("cat = " + cat);
        var paper = 763789;
            System.out.println("paper = " + paper);
        paper = paper + 4;
            System.out.println("paper = " + paper);
        paper = paper - 7639;
            System.out.println("paper = " + paper);
        var friend = 19;
            System.out.println("friend = " + friend);
        friend = friend + 2;
            System.out.println("friend = " +friend);
        friend = friend / 7;
            System.out.println("friend = " +friend);
        var frog = 3.5;
        frog = frog * 10;
        frog = frog / 3.5;
        frog = frog + 4;
            System.out.println("frog " + frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
            System.out.println(totalWeight + " кг");
        var weightDiff = boxer2 - boxer1;
            System.out.println(weightDiff + " кг");
        var remainder = boxer2 % boxer1;
        System.out.println(remainder + " кг");
        var totalHours = 640;
        var hoursePerEmployee = 8;
        var employees = totalHours / hoursePerEmployee;
        System.out.println(employees + " человек");
       var newEmployees = employees + 94;
       var newTotalHours = newEmployees * hoursePerEmployee;
       System.out.println(newEmployees + " человек " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}
