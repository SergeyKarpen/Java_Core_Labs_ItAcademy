package labs.itacademy.skarpen.generics;

public class Task_1_Generics {

    /**
     * Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
     * Реализовать метод, который возвращает любой элемент массива по индексу.
     * Надо разобраться!!!!
     */

    public static class MyClass {

        public static void main(String[] args) {

            String[] s = {"Hello", "World", "!"};
            sid("String", s);

            Integer[] intr = {1, 2, 3, 4, 5, 6, 7, 8};
            sid("Integer", intr);

            Double[] ad = {1.2, 1.5, 6.7};
            sid("Double", ad);
        }

        public static class AnyTapeArray<E> {
            private E[] arr;

            public E getArrIndex(int i) {
                return arr[i];
            }

            public void setArr(E[] arr) {
                this.arr = arr;
            }

            public int getLength() {
                return arr.length;
            }
        }

        public static <E> void sid(String s, E[] arr) {

            E[] a = arr;
            AnyTapeArray<E> sid = new AnyTapeArray<E>();
            sid.setArr(a);

            System.out.print(s + "  ");

            for (int i = 0; i < sid.getLength(); i++)
                System.out.print(sid.getArrIndex(i) + " ");

            System.out.println();
        }
    }
}