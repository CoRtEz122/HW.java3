
public class Cat {

    String name;
    int age;
    int appetite;

    public Cat(String name, int age, int appetite) {

        this.name = name;
        this.age = age;
        this.appetite = appetite;
    }

    private void CatMeow() {

        System.out.println(name + " мяу");

    }

    @Override
    public String toString() {

        return name + " [" + age + "] " + "Аппетит: " + appetite;

    }

    public void eat(plate plate) {
        if (appetite > plate.food) {

            appetite = appetite - plate.food;
            plate.food = 0;

        } else {

            plate.food = plate.food - appetite;
            appetite = appetite - appetite;

        }
        this.CatMeow();

    }

}

