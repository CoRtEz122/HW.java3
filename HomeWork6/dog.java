public class dog {

    String name;
    int age;
    int appetite;

    public dog(String name, int age, int appetite) {

        this.name = name;
        this.age = age;
        this.appetite = appetite;
    }

    private void dogbork() {

        System.out.println(name + " гав");

    }

    @Override
    public String toString() {

        return name + " [" + age + "] " + "Аппетит: " + appetite;

    }

    public void eat(plate plate) {
        if (appetite > plate.food) {

            appetite = appetite - plate.food;
            plate.food = 0;
            
        }else{

           plate.food = plate.food - appetite;
           appetite = appetite-appetite;

        }
        this.dogbork();
    }
}

