public interface Array {

    void add(int value); // добавляет значение в массив

    int get(); // чтение, возвращает последнее добавленное значение

    int get(int index); // возвращает значение по индексу

    int indexOff(int value); // по значению определяет индекс или выдает -1 (если значения нет)

    boolean contains(int value); // определяет есть ли значение в массиве

    boolean remove(int value); // определяет есть ли значение в массиве и удаляет его

    boolean isEmpti(); // проверка на пустоту

    int getSize(); // размер массива

    void display(); // вывод на экран

    void sortBubble(); // пузырьковая сортировка

    void sortSelect(); // сортировка выборкой

    void sortInsert(); // сортировка вставкой

}
