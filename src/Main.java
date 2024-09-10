public class Main {
    public static void main(String[] args) {

        System.out.println("_____________ Задача №1 _____________");

        int simpleInt = 2147483646;
        byte simpleByte = 126;
        short simpleShort = 32766;
        long simpleLong = 1000000000L;
        float simpleFloat = 3.1415f;
        double simpleDouble = 2.7218281828;

        System.out.println("Значение переменной с типом Int равно : " + simpleInt);
        System.out.println("Значение переменной с типом Byte равно : " + simpleByte);
        System.out.println("Значение переменной с типом Short равно : " + simpleShort);
        System.out.println("Значение переменной с типом Long равно : " + simpleLong);
        System.out.println("Значение переменной с типом Float равно : " + simpleFloat);
        System.out.println("Значение переменной с типом Double равно : " + simpleDouble);
        System.out.println();

        System.out.println("_____________ Задача №2 _____________");

        float first = 27.12f;
        System.out.println("Переменной типа float присвоено значение, равное = " + first);

        long second = 987678965549L;
        System.out.println("Переменной типа long присвоено значение, равное = " + second);

        float third = 2.786f;
        System.out.println("Переменной типа float присвоено значение, равное = " + third);

        short fourth = 569;
        System.out.println("Переменной типа short присвоено значение, равное = " + fourth);

        short fifth = -159;
        System.out.println("Переменной типа short присвоено значение, равное = " + fifth);

        short sixth = 27897;
        System.out.println("Переменной типа short присвоено значение, равное = " + sixth);

        byte seventh = 67;
        System.out.println("Переменной типа byte присвоено значение, равное = " + seventh);

        System.out.println();

        System.out.println("_____________ Задача №3 _____________");

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;

        short amountOfPaper = 480;

        System.out.println("На каждого ученика  рассчитано " + (amountOfPaper / (studentsLP + studentsAS + studentsEA)) + " листов бумаги.");
        System.out.println();

        System.out.println("_____________ Задача №4 _____________");

        byte powerOfMachine = 8;
        byte timeOne = 20;
        short timeTwo = 24 * 60;
        short timeThree = 3 * 24 * 60;
        int timeFour = 31 * 3 * 24 * 60;
        System.out.println("За 20 минут, машина произвела " + (timeOne * powerOfMachine) + " бутылок.");
        System.out.println("За 1 сутки, в которых " + timeTwo + " минут ,машина произвела " + (timeTwo * powerOfMachine) + " бутылок.");
        System.out.println("За 3 суток, в которых " + timeThree + " минут ,машина произвела " + (timeThree * powerOfMachine) + " бутылок.");
        System.out.println("За 1 месяц (31 день), в котором " + timeFour + " минут ,машина произвела " + (timeFour * powerOfMachine) + " бутылок.");
        System.out.println();

        System.out.println("_____________ Задача №5 _____________");

        byte amountOfWhitePaintForOneClass = 2;
        byte amountOfBrownPaintForOneClass = 4;
        byte amountOfPaintCans = 120;

        System.out.println("В школе, где " + (amountOfPaintCans / (amountOfWhitePaintForOneClass + amountOfBrownPaintForOneClass)) + " классов, нужно " + ((amountOfPaintCans * amountOfWhitePaintForOneClass) / (amountOfWhitePaintForOneClass + amountOfBrownPaintForOneClass)) + " банок белой краски и " + ((amountOfPaintCans * amountOfBrownPaintForOneClass) / (amountOfWhitePaintForOneClass + amountOfBrownPaintForOneClass)) + " банок коричневой краски.");
        System.out.println();

        System.out.println("_____________ Задача №6 _____________");

        byte amountOfBananas = 5;
        byte amountOfMilk = 2;
        byte amountOfIceCream = 2;
        byte amountOfEggs = 4;

        byte massBanana = 80;
        byte massMilk = 105;
        byte massIceCream = 100;
        byte massEgg = 70;

        System.out.println("Вес спортзавтрака в граммах : " + (amountOfBananas * massBanana + (short) (amountOfMilk * massMilk) + amountOfIceCream * massIceCream + amountOfEggs * massEgg) + " граммов, или " + (amountOfBananas * massBanana + ((amountOfMilk * massMilk)) + amountOfIceCream * massIceCream + amountOfEggs * massEgg) / 1000f + " килограммов.");
        System.out.println();

        System.out.println("_____________ Задача №7 _____________");

        short goal = 7000;
        short dietOne = 250;
        short dietTwo = 500;

        System.out.println("При соблюдении диеты №1, при которой теряется 250 граммов, человек похудеет на " + goal + " килограммов за " + goal / dietOne + " дней.");
        System.out.println("При соблюдении диеты №2, при которой теряется 500 граммов, человек похудеет на " + goal + " килограммов за " + goal / dietTwo + " дней.");
        System.out.println("В среднем, похудение на " + goal + " килограммов займёт около " + ((goal / dietOne) + (goal / dietTwo)) / 2 + " день.");
        System.out.println();

        System.out.println("_____________ Задача №8 _____________");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        byte salaryIncrease = 10;

        System.out.println("Маша теперь получает " + (salaryMasha + (salaryMasha / salaryIncrease)) + " рублей. Годовой доход вырос на " + (12 * salaryMasha / salaryIncrease) + " рубля.");
        System.out.println("Денис теперь получает " + (salaryDenis + (salaryDenis / salaryIncrease)) + " рублей. Годовой доход вырос на " + (12 * salaryDenis / salaryIncrease) + " рублей.");
        System.out.println("Кристина теперь получает " + (salaryKristina + (salaryKristina / salaryIncrease)) + " рублей. Годовой доход вырос на " + (12 * salaryKristina / salaryIncrease) + " рублей.");
        System.out.println();
    }
}