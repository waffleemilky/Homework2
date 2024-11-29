public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var weightOfFirstBoxer = 78.2;
        var weightOfSecondBoxer = 82.7;
        var totalWeight = weightOfSecondBoxer + weightOfFirstBoxer;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг.");

        var differenceWeight = weightOfSecondBoxer - weightOfFirstBoxer;
        System.out.println("Разница между массами бойцов " + differenceWeight + " кг.");

        var remainsWeight = weightOfSecondBoxer % weightOfFirstBoxer;
        System.out.println("Остаток между двумя весами " + remainsWeight + " кг.");

        var totalHours = 640;
        var hours = 8;
        var employees = totalHours / hours;
        System.out.println("Всего работников в компании - " + employees + " человек.");

        employees = employees + 94;
        var hoursWork = totalHours / employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + hoursWork + " часов работы может быть поделено между сотрудниками.");
    }
}