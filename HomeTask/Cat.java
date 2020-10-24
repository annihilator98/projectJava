package projectJava.HomeTask;

public class Cat {
    private String name;
    private int weight;
    private String color;
    private Kitty[] kittiesArray = new Kitty[6];
    private int count = 0;

    public Kitty getKitty(int index) {
        return kittiesArray[index];
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight(int weight) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void addKitties(Kitty kitties) {
        kittiesArray[count] = kitties;
        ++count;
    }



    public int getCountKitties() {
        return count;
    }

    public void printKittens() {
        for (int i = 0; i < getCountKitties(); i++) {
            if (kittiesArray[i] != null) {
                kittiesArray[i].displayKitten();
            }
        }
    }

//    public void printArray(Cat[] arr) {
//        for (int i = 0; i < count; i++) {
//            arr[i].displayInfo();
//        }
//    }



    public int getNumberOfKittensByColor(String color) {
        int colorCount = 0;
        for (int i = 0; i < getCountKitties(); i++) {
            if (kittiesArray[i] != null) {
                if (kittiesArray[i].getColor().equals(color)) {
                    colorCount = colorCount + 1;
                }
            }
        }
        return colorCount;
    }

    public int getNumberOfKittensBySex(String sex) {
        int sexCount = 0;
        for (int i = 0; i < getCountKitties(); i++) {
            if (kittiesArray[i] != null) {
                if (kittiesArray[i].getSex().equals(sex)) {
                    sexCount = sexCount + 1;
                }
            }
        }
        return sexCount;
    }

    public void displayCats() {
        System.out.println(" name: " + name + " weight: " + weight + " color: " + color );
        for (int i = 0; i < getCountKitties(); i++) {
            if (kittiesArray[i] != null){
                kittiesArray[i].displayKitten();
            }
        }
    }



}