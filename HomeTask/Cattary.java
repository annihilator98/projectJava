package projectJava.HomeTask;

public class Cattary {
    private Cat[] catArray = new Cat[3];
    private int count = 0;
    //private Cat tempCat = new Cat();


    public Cat getCat(int index) {
        return catArray[index];
    }

    public void addCat(Cat cat) {
        catArray[count] = cat;
        ++count;
    }

    public void displayInfo() {
        System.out.println("contains next cats");
        printCats(catArray);
    }

    private void printCats(Cat[] arr) {
        for (int i = 0; i < getCountCats(); i++) {
            if (catArray[i] != null) {
                catArray[i].displayCats();
            }
        }
    }

    public int getCountCats() {
        return count;
    }





//    public void printMaxKittensByColor(String color) {
//        tempCat = catArray[0];
//        for (int i = 1; i < catCount(); i++) {
//            if (catArray[i].getNumberOfKittensByColor(color) > tempCat.getNumberOfKittensByColor(color)) {
//                tempCat = catArray[i];
//            }
//        }
//        System.out.println("color");
//        tempCat.displayCats();
//    }
//
//
//    public void printMaxKittensBySex(String sex) {
//        tempCat = catArray[0];
//        for (int i = 1; i < catCount();  i++) {
//            if (catArray[i].getNumberOfKittensBySex(sex) > tempCat.getNumberOfKittensBySex(sex)) {
//                tempCat = catArray[i];
//            }
//        }
//        System.out.println("The most kittens of " + sex + " sex belong to cat");
//        tempCat.displayCats();
//    }
//
//    public void printMaxKittens() {
//        tempCat = catArray[0];
//        for (int i = 1; i < catCount(); i++) {
//            if (catArray[i].getNumberOfKittens() > tempCat.getNumberOfKittens()) {
//                tempCat = catArray[i];
//            }
//        }
//        System.out.println("The most kittens belong to cat ");
//        tempCat.displayCats();
//        System.out.println(" She is got " + tempCat.getNumberOfKittens() + "kittens");
//        }




    }
