package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {

Integer array[] = {2,5,3,6,7,4,8,};
Integer aux;

for (int i = 0; i < array.length; i++){
    for (int j = 0; j < (array.length-1); j++){
        if (array[j] > array[j+1]){
            aux = array[j+1];
            array[j+1] = array[j];
            array[j] = aux;
        }
    }
}
for (int i = 0; i< array.length; i++){
    System.out.println(array[i]);
}

    }
}
