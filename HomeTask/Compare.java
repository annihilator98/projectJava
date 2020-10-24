package projectJava.HomeTask;

public class Compare {

    public static void main(String[] args) {

        Kitty pussy = new Kitty();
        pussy.setName("pussy");
        pussy.setColor("white");
        pussy.setSex("female");
        pussy.setWeight(1);

        Kitty loppy = new Kitty();
        loppy.setName("loppy");
        loppy.setColor("white");
        loppy.setSex("male");
        loppy.setWeight(1);

        Kitty tonny = new Kitty();
        tonny.setName("tonny");
        tonny.setColor("white");
        tonny.setSex("female");
        tonny.setWeight(1);

        Kitty monny = new Kitty();
        monny.setName("monny");
        monny.setColor("white");
        monny.setSex("female");
        monny.setWeight(1);

        Kitty got = new Kitty();
        got.setName("got");
        got.setColor("black");
        got.setSex("female");
        got.setWeight(5);

        Kitty pott = new Kitty();
        pott.setName("pott");
        pott.setColor("black");
        pott.setSex("female");
        pott.setWeight(5);


        Cat murka = new Cat();
        murka.setWeight(3);
        murka.setName("Murka");
        murka.setColor("white");
        murka.addKitties(pussy);
        murka.addKitties(monny);

        Cat pusha = new Cat();
        pusha.setWeight(4);
        pusha.setName("Pusha");
        pusha.setColor("grey");
        pusha.addKitties(loppy);

        Cat lara = new Cat();
        lara.setWeight(2);
        lara.setName("Lara");
        lara.setColor("black");
        lara.addKitties(tonny);
        lara.addKitties(got);
        lara.addKitties(pott);

//        Cat catWinner = new Cat();
//        Cat catWinnerByColor = new Cat ();
//        Cat catWinnerBySex = new Cat ();


        Cattary cattary = new Cattary();
        cattary.addCat(murka);
        cattary.addCat(pusha);
        cattary.addCat(lara);


        System.out.println(" The cat which have the largest number of kitty");

        getWinner(cattary).displayCats();

        System.out.println(" The cat which have the largest number of white kitty");
        getWinnerByColor(cattary, "white").displayCats();

        System.out.println(" The cat which have the largest number of male kitty");
        getWinnerBySex(cattary, "male").displayCats();


//        cattary.printMaxKittensByColor("white");
//        cattary.printMaxKittensBySex("male");
//        cattary.printMaxKittens();

    }

    private static Cat getWinner(Cattary cattary) {
        Cat catWinner;
        catWinner = cattary.getCat(0);
        for (int i = 1; i < cattary.getCountCats(); i++) {
            if (cattary.getCat(i).getCountKitties() > catWinner.getCountKitties()) {
                catWinner = cattary.getCat(i);
            }
        }
        return catWinner;
    }


    public static Cat getWinnerByColor(Cattary cattary, String color) {
        Cat catWinnerByColor = cattary.getCat(0);
        for (int i = 1; i < cattary.getCountCats(); i++) {
            if (cattary.getCat(i).getNumberOfKittensByColor(color) > catWinnerByColor.getNumberOfKittensByColor(color)) {
                catWinnerByColor = cattary.getCat(i);
            }
        }
        return catWinnerByColor;
    }

    public static Cat getWinnerBySex(Cattary cattary, String sex) {
        Cat catWinnerBySex;
        catWinnerBySex = cattary.getCat(0);
        for (int i = 1; i < cattary.getCountCats(); i++) {
            if (cattary.getCat(i).getNumberOfKittensBySex(sex) > catWinnerBySex.getNumberOfKittensBySex(sex)) {
                catWinnerBySex = cattary.getCat(i);
            }
        }

        return catWinnerBySex;
    }

}
