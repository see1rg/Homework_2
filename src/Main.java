public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte onion = 1;
        short bread = 2;
        long carrot = 2773L;
        int speed = 132;
        float weight = 34.56f;
        double lenght = 23.584_4;
        char liter = 63;
        boolean isItSafe = speed < 60;
        //Задание 2
        float weightTaison = 78.2f;
        float weightAli = 82.7f;
        float weightOfAll = weightAli + weightTaison;
        float weightDifference = weightAli - weightTaison;
        System.out.println("Общий вес двух бойцов : " + weightOfAll + " кг");
        System.out.println("Разницу между весами бойцов : " + weightDifference + " кг");
        //Задание 3
        int weightBanana = 80;
        int weightMlMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        double weightOfAllProducts = weightBanana + weightMlMilk * 2 + weightIceCream * 2 + weightEgg * 4;
        int grPerKg = 1000;
        double weightToKg = weightOfAllProducts / grPerKg;
        System.out.println("Общий веса завтрака : " + weightOfAllProducts + " г");
        System.out.println( "Вес завтрака в киллограммах : " + weightToKg + " Кг");
        //Задание 4
        int loseOfWeight = 7 * grPerKg;
        int lose250 = loseOfWeight / 250;
        int lose500 = loseOfWeight / 500;
        int averageDay = (lose250 + lose500) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм то уйдет : " + lose250 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм то уйдет : " + lose500 + " дней");
        System.out.println("В среднем уйдет : " + averageDay + " день");
        //Задание №5
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        double salaryMashaUp = salaryMasha + (salaryMasha * 0.1);
        double salaryDenisUp = salaryDenis + (salaryDenis * 0.1);
        double salaryKristinaUp = salaryKristina + (salaryKristina * 0.1);
        System.out.println("Маша теперь получает : " + salaryMashaUp + " рублей. Годовой доход вырос на : " + (salaryMashaUp * 12 - salaryMasha * 12) + " рублей");
        System.out.println("Маша теперь получает : " + salaryDenisUp + " рублей. Годовой доход вырос на : " + (salaryDenisUp * 12 - salaryDenis * 12) + " рублей");
        System.out.println("Маша теперь получает : " + salaryKristinaUp + " рублей. Годовой доход вырос на : " + (salaryKristinaUp * 12 - salaryKristina * 12) + " рублей");
    }
}