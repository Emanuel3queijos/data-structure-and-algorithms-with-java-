package arrays;

import java.util.Arrays;

public class Array {

    private Object array[];
    private int size;


    public int size() {
        return this.size;
    }

    public Array(int capacidade) {
        this.array = new Object[capacidade];
        this.size = 0;
    }

    //chat gpt array copy: va
    //Copy code
    //private void aumentaCapacidade() {
    //    if (this.tamanho == this.elementos.length) {
    //        String[] elementosNovos = new String[this.elementos.length * 2];
    //        System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
    //        this.elementos = elementosNovos;
    //    }
    //}

    private void aumentaCapacidade() {
        if (this.size == this.array.length) {
            Object[] elementosNovos = new String[this.array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                elementosNovos[i] = this.array[i];
            }
            this.array = elementosNovos;
        }
    }


    //esse cara eu teria que colocar a capacidade manualmente
//    private void increaseCapacity(int cap){
//        if(this.array.length == this.size){
//            String temArray[] = this.array;
//            this.array = new String[cap];
//            for (int i =0; i<this.array.length; i++){
//                    this.array[i] = temArray[i];
//
//            }
//        }
//
//    }

    private boolean validator(int pos){
        if (!(pos >= 0 && pos < this.size)) {
            throw new IllegalArgumentException("POS INV");

        }
        return true;
    }



    public String removeElementAtPos(int pos){
        if (validator(pos)){
            Object elementoRemoved = array[pos];
            for (int i = pos; i< this.size- 1; i++){
                array[i] = array[i+1];
            }
            size--;
            return "element: "+ elementoRemoved +" removed with success;";
        }
        else {
            return "error to remove element";
        }
    }
    // it works, at least
//    public String removeElementAtPos(int pos) {
//        if (validator(pos)) {
//
//            String tempVar = array[this.size];
//            String tempVar2 = "";
//            for (int i = this.size; i>pos ;i--){
//                tempVar2 = array[i-1];
//                array[i-1] = tempVar;
//                tempVar = tempVar2;
//            }
//            this.size--;
//            return toString();
//
//
//        } else {
//            return "operacao falhou";
//        }
//
//    }

    //esse cara vai ser usado para adicionar os elementos movendo os elementos para a proxima pos
    public String addElementAtPos(String element, int pos) {
        if (validator(pos)) {

            for (int i = this.size; i >= pos; i--) {
                this.array[i + 1] = this.array[i];
            }
            this.array[pos] = element;


            this.size++;
            return toString();


        } else {
            return "operacao falhou";
        }
    }
    //in this bad boy here i create a new array, this array i will save all the values temporary, then i add add data to my principal array util the position, the i add the element at the prefree position and add the rest of data on my principal array
//            String tempArray[] = values;
//            values = new String[tempArray.length+1];
//
//            for (int i = 0; i< pos; i++){
//                values[i] = tempArray[i];
//            }
//            values[pos] = element;
//
//            for (int i = pos; i < values.length; i++){
//
//                if (values[i] == null){
//                    values[i] = tempArray[i-1];
//                }
//


    public String searchElement(String element) {

        for (int i = 0; i < this.size; i++) {
            if (element.equals(array[i])) {

                return "Elemento Existe na posicao: " + i;

            }
        }
        return "elemento nao existe no array";

    }


    public Object search(int pos) throws Exception {

        if (!(pos >= 0 && pos < this.size)) {
            throw new IllegalArgumentException("POS INV");
        } else {
            return array[pos];
        }

    }


    @Override
    public String toString() {

        // nao fazendo a concatenacao de strings, ainda consegui resolver o problema
        Object tempArray[] = new Object[this.size];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i];
        }
        return "Array{" +
                "values=" + Arrays.toString(tempArray) +
                '}';
    }


    public void adiciona(Object elemento) throws Exception {
// tem varias formas de se fazer esse cara, vou deixar essa
        if (this.size < this.array.length) {

            this.array[this.size] = elemento;
            this.size++;
            System.out.println("element " + elemento + " added");

        } else {
            throw new Exception("the array is full, cant add the element: " + elemento);
        }


    }


}

// classes de test vao funcionar, so precis
//class  TestRemoverElementsAts{
//    public static void main(String[] args) {
//        Array array = new Array(10);
//        try {
//            array.adiciona("1");
//            array.adiciona("2");
//            array.adiciona("3");
//            array.adiciona("4");
//            array.adiciona("5");
//            array.adiciona("6");
//            array.adiciona("7");
//
//            System.out.println(array.removeElementAtPos(0));
//
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
//
//        }
//    }
//}
//
//class TestAddItemAtPos {
//    public static void main(String[] args) {
//        Array array = new Array(10);
//        try {
//            array.adiciona("1");
//            array.adiciona("2");
//            array.adiciona("3");
//            array.adiciona("4");
//            array.adiciona("5");
//            array.adiciona("6");
//            array.adiciona("7");
//
//            System.out.println(array.addElementAtPos("mangus", 5));
//
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
//
//        }
//    }
//}
//
//class TestVerificarItem {
//    public static void main(String[] args) {
//        Array array = new Array(10);
//        try {
//            array.adiciona("1");
//            array.adiciona("2");
//            array.adiciona("3");
//            array.adiciona("4");
//            array.adiciona("5");
//            array.adiciona("6");
//            array.adiciona("7");
//            array.adiciona("8");
//            array.adiciona("9");
//            array.adiciona("10");
//
//            System.out.println(array.searchElement("3"));
//
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
//
//        }
//
//    }
//}
//
//class TestReturnBusca {
//    public static void main(String[] args) {
//        Array array = new Array(10);
//        try {
//            array.adiciona("1");
//            array.adiciona("2");
//            array.adiciona("3");
//            array.adiciona("4");
//            array.adiciona("5");
//            array.adiciona("6");
//            array.adiciona("7");
//            array.adiciona("8");
//            array.adiciona("9");
//            array.adiciona("10");
//
//            System.out.println(array.search(11));
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
//
//        }
//
//    }
//}
//
//
//class TestReturnElements {
//
//
//
//class TestTamanho {
//
//    public static void main(String[] args) {
//        Array array = new Array(2);
//        try {
//            array.adiciona("mangus");
//            array.adiciona("mangas");
//            array.adiciona("mangas");
//            array.adiciona("mangus");
//            array.adiciona("mangas");
//            array.adiciona("mangas");
//
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
//
//        }
//
//        System.out.println(array.size());
//
//    }
//
//}


//
//class TestCapacidade {
//
//    public static void main(String[] args) {
//        Array array = new Array(10);
//
////         System.out.println(array.getValores().length);
//
//    }
//
//}

class TestAdicio{

    public static void main(String[] args) throws Exception {
        Array array = new Array(2);

      array.adiciona("mangus");
        Integer num = 1;
        array.adiciona(1);
System.out.println(        array.toString());//        // vai dar erro esse cara, aqui tinha que ter um try catch
//        array.adiciona("manus");


    }

}
