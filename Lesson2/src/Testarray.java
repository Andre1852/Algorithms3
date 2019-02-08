import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Testarray {
    public static void main(String[] args) {
        testArrayImpl(4);
        testTimeSort(10000);

    }
    private static void testArrayImpl(int maxSize){
        Array array = new ArrayImpl(maxSize);
        System.out.println("Size = " + array.getSize());
        System.out.println("isEmpti " + array.isEmpti());
        for (int i = 0; i < maxSize; i++){
            Random r = new Random();
            array.add(r.nextInt(10));
        }
        //array.add(x);

        array.display();

        System.out.println("contains " + array.contains(3));// наличие а массиве заданного значения

        System.out.println("array[2] = " + array.get(2));// знечение элемента по индексу
        System.out.println("get last = " + array.get()); // значение последнего элемента

        System.out.println("Size = " + array.getSize()); // размер массива
        System.out.println("isEmpti " + array.isEmpti()); //проверка на пустоту

        System.out.println("Remove [3] " + array.remove(3));// удаление ячейки со значением
        System.out.println("Remove [30] " + array.remove(30));

        System.out.println("Size = " + array.getSize()); // размер массива после удаления
        System.out.println("contains " + array.contains(3));// наличие а массиве заданного значения

        array.display();

       // array.sortBubble(); // пузырьковая сортировка

       // array.sortSelect(); // сортировка выборкой

        array.sortInsert(); // сортировка вставкой

        array.display();
    }

    private static void testTimeSort(int maxSize){
        Array arr1 = new ArrayImpl(maxSize);
        Array arr2 = new ArrayImpl(maxSize);
        Array arr3 = new ArrayImpl(maxSize);
        for (int i = 0; i < maxSize; i++) {
            Random r = new Random();
            int n = r.nextInt(10000);
            arr1.add(n);
            arr2.add(n);
            arr3.add(n);
        }
        System.out.println("arr1[5] = " + arr1.get(5));
        System.out.println("arr2[5] = " + arr2.get(5));
        System.out.println("arr3[5] = " + arr3.get(5));

        long start1 = System.nanoTime();
        arr1.sortBubble();
        long finish1 = System.nanoTime();
        System.out.println("sortBubble " + TimeUnit.NANOSECONDS.toMillis(finish1 - start1) + " ms");

        long start2 = System.nanoTime();
        arr2.sortSelect();
        long finish2 = System.nanoTime();
        System.out.println("sortSelect " + TimeUnit.NANOSECONDS.toMillis(finish2 - start2) + " ms");

        long start3 = System.nanoTime();
        arr3.sortInsert();
        long finish3 = System.nanoTime();
        System.out.println("sortInsert " + TimeUnit.NANOSECONDS.toMillis(finish3 - start3) + " ms");
    }
}

