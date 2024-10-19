public class Array {
    private int[] array;

    // Прописываем конструктор, через который будет передан массив
    public Array(int[] A) {
        this.array = A;
    }

    // Прописываем функцию вывода массива
    public int[] getArray() {
        return array;
    }

    // Прописываем функцию изменения массива
    public void setArray(int[] array) {
        this.array = array;
    }

    // Прописываем функцию определения суммы отрицательных значений между минимальным и максимальным
    public int sumNegativeNumBetweenMaxMin() {
        int indexMax = 0;
        int indexMin = 0;
        int maxNum = -999999;
        int minNum = 999999;
        int sumNum = 0;
        int a;
        int b;

        // Определяем минимальное и максимальное значения и их индекс
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxNum) {
                maxNum = array[i];
                indexMax = i;
            }
            if (array[i] <= minNum) {
                minNum = array[i];
                indexMin = i;
            }
        }

        // Определяем какое значения (максимальное или минимальное) находится ближе к началу массива
        if (indexMax > indexMin) {
            a = indexMin;
            b = indexMax;
        } else if (indexMax < indexMin) {
            a = indexMax;
            b = indexMin;
        } else {
            return  sumNum;
        }

        // Находим сумму отрицательных значений между минимальным и максимальным
        for (int i = a + 1; i < b; i++) {
            if (array[i] < 0) {
                sumNum += array[i];
            }
        }

        return sumNum;
    }


}
