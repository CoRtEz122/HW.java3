public class HomeWork7 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Задание
     * 
     * Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть
     * несколько типов объектов (классов):
     * 1. Здание (имеет текущий уровень здоровья)
     * 2. Герой (имеет текущий уровень здоровья и текущий уровень магической
     * энергии)
     * 3. Нейтральный персонаж (имеет текущий уровень здоровья)
     * Примеры того, как это может выглядеть:
     * https://d3upx5peno0o6w.cloudfront.net/guides1png_1620826387.png
     * https://xgm.guru/files/100/242011/HP-Bar.png
     *
     * Также у вас есть класс Render с методом showIndicator, который срабатывает
     * при наведении мышки на объект
     * и работает следующим образом:
     * 1. Если объект обладает уровнем здоровья, то отображается индикатор с текущим
     * уровнем здоровья.
     * 2. Если объект обладает уровнем магический энергии, то отображается индикатор
     * с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей это запись информации в
     * консоль.
     * * То есть вы пишете код, который выводит на консоль информацию.
     *
     *
     * Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической
     * энергии.
     * В классе Render проверять только на эти интерфейсы и выводить нужную
     * информацию.
     * Необходимо продумать, какие методы должны быть в интерфейсе.
     *
     * ЧТО ДЕЛАТЬ НЕ НУЖНО:
     * Нельзя завязываться на конкретные классы. Предполагается, что таких классов
     * очень много и они постоянно добавляются.
     *
     * * Необязательные задания, которые не относятся к теме, но при сильном желании
     * можно реализовать.
     * * Со звездочкой: реализовать в консоли отображение индикатора.
     * Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить
     * вот такую ленточку: [xxxx ]
     * ** С двумя звездочками: раскрасить вывод. Чем меньше здоровья, тем "краснее"
     * цвет индикатора. Для полного здоровья - цвет зеленый.
     */

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(10);

        Hero Hero = new Hero(100, 100);
        Hero.setCurrentHealthPoint(50);
        Hero.setCurrentManaPoint(40);

        render.showIndicator(Hero); // В консоли должно быть примерно так: Текущий уровень здоровья: 50,
                                        // максимальный уровень здоровья: 100

        // System.out.println(ANSI_RED + "This text has a red background but
        // defaulttext!" + ANSI_RESET);
        // System.out.println(ANSI_GREEN + "This text has a green background but
        // defaulttext!" + ANSI_RESET);

    }

    static class Render {

        /**
         * Если объект обладает уровнем здоровья, то отображается индикатор с текущим
         * уровнем здоровья.
         * Если объект обладает уровнем магический энергии, то отображается индикатор с
         * текущим уровнем энергии.
         * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
         */
        public void showIndicator(Object object) {
            // Не должно быть упоминания конкретных классов!!!

            if (object instanceof HasHealth) {

                int MaxHealth = ((HasHealth) object).GetMaxHealthValue();
                int CurrentHealth = ((HasHealth) object).GetCurrentHealthValue();

              System.out.println("максимальный уровень здоровья: "+ MaxHealth+ " Текущий уровень Здоровья: "+ CurrentHealth);

            }

            if (object instanceof HasMana) {

                int MaxMana = ((HasMana) object).GetMaxManaValue();
                int CurrentMana = ((HasMana) object).GetCurrentManaValue();

                System.out.println("максимальный уровень маны: "+ MaxMana+ " Текущий уровень Маны: "+ CurrentMana);
                System.out.println();

            }
        }

    }

    interface HasHealth {

        int GetMaxHealthValue();

        int GetCurrentHealthValue();

    }

    interface HasMana {

        int GetMaxManaValue();

        int GetCurrentManaValue();

    }

    static class Building implements HasHealth {

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        public Building(int maxHealthPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;

        }

        @Override
        public int GetMaxHealthValue() {

            return maxHealthPoint;
        }

        @Override
        public int GetCurrentHealthValue() {

            return currentHealthPoint;
        }

    }

    static class Hero implements HasHealth, HasMana {

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        private int maxManaPoint; // максимально количество магический энергии
        private int currentManaPoint; // текущее количество магический энергии

        public Hero(int maxHealthPoint, int maxManaPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.maxManaPoint = maxManaPoint;

            this.currentHealthPoint = maxHealthPoint;
            this.currentManaPoint = maxManaPoint;
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }

        public void setCurrentManaPoint(int currentManaPoint) {
            this.currentManaPoint = currentManaPoint;
        }

        @Override
        public int GetMaxHealthValue() {

            return maxHealthPoint;
        }

        @Override
        public int GetCurrentHealthValue() {

            return currentHealthPoint;
        }

        @Override
        public int GetMaxManaValue() {

            return maxManaPoint;
        }

        @Override
        public int GetCurrentManaValue() {

            return currentManaPoint;
        }

    }

    static class Neutral implements HasHealth {

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        public Neutral(int maxHealthPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }

        @Override
        public int GetMaxHealthValue() {

            return maxHealthPoint;
        }

        @Override
        public int GetCurrentHealthValue() {

            return currentHealthPoint;
        }

    }

}