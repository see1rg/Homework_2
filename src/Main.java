public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();}
        public static void task1() {
        byte onion = 1;
        short bread = 2;
        long carrot = 2773L;
        int speed = 132;
        float weight = 34.56f;
        double lenght = 23.584_4;
        char liter = 'c';
        boolean isItSafe = speed < 60;}
    public static void task2() {
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float weightOfAll = secondBoxer + firstBoxer;
        float weightDifference = Math.abs (secondBoxer - firstBoxer);
        System.out.println("Общий вес двух бойцов : " + weightOfAll + " кг");
        System.out.println("Разницу между весами бойцов : " + weightDifference + " кг");}
    public static void task3() {
        int bananaWeight = 80;
        int banana = 5;

        int milk = 200/100;
        int weightMilk = 105;

        int iceCream = 2;
        int weightIceCream = 100;

        int egg = 4;
        int weightEgg = 70;

        double total = (banana * bananaWeight) + (milk * weightMilk) + (weightIceCream * iceCream) + (weightEgg * egg);
        int grPerKg = 1000;
        double weightToKg = total /( grPerKg * 1.0 );
        System.out.println("Общий веса завтрака : " + total + " г");
        System.out.println( "Вес завтрака в киллограммах : " + weightToKg + " Кг");}
    public static void task4() {
        int grPerKg = 1000;
        int weight = 7;
        int weightInGrams = weight * grPerKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays = weightInGrams / minGramsPerDay;
        int maxDays = weightInGrams / maxGramsPerDay;

        double averageDay = (minDays + maxDays) / (2 * 1.0);
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм то уйдет : " + minDays+ " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм то уйдет : " + maxDays + " дней");
        System.out.println("В среднем уйдет : " + averageDay + " день");}
    public static void task5() {
        int percent = 10;
        double multiplier = percent /( 100 * 1.0) ;

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        double salaryMashaUp = (salaryMasha * multiplier) + salaryMasha;
        double salaryDenisUp = (salaryDenis * multiplier) + salaryDenis;
        double salaryKristinaUp = (salaryKristina * multiplier) + salaryDenis;

        double differenceMasha = (salaryMashaUp - salaryMasha) * 12;
        double differenceDenis = (salaryDenisUp - salaryDenis) * 12;
        double differenceKristina = (salaryKristinaUp - salaryKristina) * 12;

        System.out.println("Маша теперь получает : " + salaryMashaUp + " рублей. Годовой доход вырос на : " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает : " + salaryDenisUp + " рублей. Годовой доход вырос на : " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает : " + salaryKristinaUp + " рублей. Годовой доход вырос на : " + differenceKristina + " рублей");}
    }
