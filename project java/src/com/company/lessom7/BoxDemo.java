package com.company.lessom7;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        System.out.println("Объем: " + myBox1.getVolume());
        System.out.println("Объем: " + myBox2.getVolume());
    }
}

    public static Box {
        double width;
        double height;
        double depth;

        Box() {
            System.out.println("Конструирование объекта Вох");
            width = 10;
            height = 10;
            depth = 10;
        }

        /**
         * Подсчитать объем коробки
         *
         * @return объем
         */
        double getVolume() {
            return width * height * depth;
        }
    }
