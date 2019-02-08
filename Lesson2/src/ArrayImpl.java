public class ArrayImpl implements Array{

    private int[] date;
    private int currentSize;

    protected ArrayImpl(int maxSize){
        this.date = new int[maxSize];
        this.currentSize = 0;
    }

    @Override
    public void add(int value) {
        date[currentSize++] = value; // присваиваем значение ячейке затем на 1 увеличиваем индекс

    }

    @Override
    public int get() {
        if (!isEmpti()){
            return date[currentSize - 1];
        }
        return 0;
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < currentSize){
            return date[index];
        }
        return 0;
    }

    @Override
    public int indexOff(int value) {
        for (int i = 0; i < currentSize; i++){
            if (date[i] == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(int value) {
        return indexOff(value) != -1;
    }

    @Override
    public boolean remove(int value) {// находит значение в масиве и удаляет найденную ячейку
        int index = indexOff(value);
        if (index == -1){
            return false;// если не находит то не удаляет
        }
        for (int i = index; i < currentSize -1; i++){
            date[i] = date[i + 1]; // значения справа от удаленнго сдвигаются на 1 ячейку влево
        }
        currentSize--; // размер матрицы уменьшается на 1
        return true;
    }

    @Override
    public boolean isEmpti() {
        return currentSize == 0;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public void display() {
        System.out.println("Display array");
        for (int i = 0; i < currentSize; i++){
            System.out.println(date[i]);
        }
        System.out.println("--------------");
    }

    @Override
    public void sortBubble() {
        for (int i = 0; i < currentSize - 1; i++){
            for (int j = 0; j < currentSize - 1 -i; j++){
                if (date[j] > date[j + 1]){
                    swap(j, j + 1);
                }
            }
        }
    }

    @Override
    public void sortSelect() {
        for (int i = 0; i < currentSize - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < currentSize; j++) {
                if (date[j] < date[minIndex]){
                    minIndex = j;
                }
            }
            swap(minIndex, i);
        }
    }

    @Override
    public void sortInsert() {
        for (int i = 1; i < currentSize; i++){
            int temp = date[i];
            int in = i;
            while (in > 0 && date[in - 1] >= temp){
                date[in] = date[in - 1];
                in--;
            }
            date[in] = temp;
        }

    }

    private void swap(int index1, int index2) {
        int temp = date[index1];
        date[index1] = date[index2];
        date[index2] = temp;
    }
}
