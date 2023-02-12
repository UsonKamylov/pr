public class Main {
    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//        String soz=scanner.nextLine();
//        Winter winter=Winter.valueOf(soz.toUpperCase());
//        switch (winter){
//            case DECEMBER -> System.out.println(Winter.DECEMBER);
//            case JANUARY -> System.out.println(Winter.JANUARY);
//            case FEBRUARY -> System.out.println(Winter.FEBRUARY);
//        }


        Planeta planeta1 = Planeta.EARTH;
        Planeta planeta2 = Planeta.JUPITER;
        Planeta planeta3 = Planeta.MARS;
        Planeta planeta4 = Planeta.MERCURY;
        Planeta planeta5 = Planeta.NEPTUNE;
        Planeta planeta6 = Planeta.PLUTO;
        Planeta planeta7 = Planeta.SATURN;
        Planeta planeta8 = Planeta.URANUS;
        Planeta planeta9 = Planeta.VENUS;

        Planeta[] planetas = new Planeta[]{planeta1, planeta2, planeta3, planeta4, planeta5, planeta6, planeta7, planeta8, planeta9};

        max(planetas);
        min(planetas);


    }

    static void min(Planeta[] planetas) {
        int b = planetas[0].dayOfAYear;
        for (int i = 0; i < planetas.length; i++) {
            b = Math.min(b, planetas[i].dayOfAYear);

        }
        System.out.println("min   " + b);

    }

    static void max(Planeta[] planetas) {
        int c = 0;
        for (int i = 0; i < planetas.length; i++) {
            c = Math.max(c, planetas[i].dayOfAYear);


        }
        System.out.println("max  " + c);

    }
}