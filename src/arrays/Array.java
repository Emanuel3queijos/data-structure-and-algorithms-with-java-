package arrays;

import java.util.Arrays;

public class Array {

    private String values[];
    private int size;


    public int size() {
        return this.size;
    }

    public Array(int capacidade) {
        this.values = new String[capacidade];
        this.size = 0;
    }



    //esse cara vai ser usado para adicionar
    public String addElementAtPos(String element, int pos){
        if (!(pos >= 0 && pos < this.size)) {
            throw new IllegalArgumentException("POS INV");
        }else{
            String tempArray[] = values;
            values = new String[tempArray.length+1];

            for (int i = 0; i< pos; i++){
                values[i] = tempArray[i];
            }
            values[pos] = element;

            for (int i = pos; i < values.length; i++){

                if (values[i] == null){
                    values[i] = tempArray[i-1];
                }

            }
            this.size++;
            return toString();
        }

    }


    public String searchElement(String element) {

        for(int i = 0; i<this.size; i++){
            if (element.equals(values[i])){

                return "Elemento Existe na posicao: " + i;

            }
        }
    return "elemento nao existe no array";

    }



    public String search(int pos) throws Exception {

        if (!(pos >= 0 && pos < this.size)) {
            throw new IllegalArgumentException("POS INV");
        } else {
            return values[pos];
        }

    }


    @Override
    public String toString() {

        // nao fazendo a concatenacao de strings, ainda consegui resolver o problema
        String tempArray[] = new String[this.size];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = values[i];
        }
        return "Array{" +
                "values=" + Arrays.toString(tempArray) +
                '}';
    }


    public void adiciona(String elemento) throws Exception {
// tem varias formas de se fazer esse cara, vou deixar essa
        if (this.size < this.values.length) {

            this.values[this.size] = elemento;
            this.size++;
            System.out.println("element " + elemento + " added");

        } else {
            throw new Exception("the array is full, cant add the element: " + elemento);
        }


    }


}

// classes de test

class TestAddItemAtPos{
    public static void main(String[] args) {
        Array array = new Array(10);
        try {
            array.adiciona("1");
            array.adiciona("2");
            array.adiciona("3");
            array.adiciona("4");
            array.adiciona("5");
            array.adiciona("6");
            array.adiciona("7");
            array.adiciona("8");
            array.adiciona("9");
            array.adiciona("10");

            System.out.println(array.addElementAtPos("mangus", 5));

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}

class TestVerificarItem{
    public static void main(String[] args) {
        Array array = new Array(10);
        try {
            array.adiciona("1");
            array.adiciona("2");
            array.adiciona("3");
            array.adiciona("4");
            array.adiciona("5");
            array.adiciona("6");
            array.adiciona("7");
            array.adiciona("8");
            array.adiciona("9");
            array.adiciona("10");

            System.out.println(array.searchElement("3"));

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}

class TestReturnBusca {
    public static void main(String[] args) {
        Array array = new Array(10);
        try {
            array.adiciona("1");
            array.adiciona("2");
            array.adiciona("3");
            array.adiciona("4");
            array.adiciona("5");
            array.adiciona("6");
            array.adiciona("7");
            array.adiciona("8");
            array.adiciona("9");
            array.adiciona("10");

            System.out.println(array.search(11));
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}


class TestReturnElements {

    public static void main(String[] args) {


        Array array = new Array(10);
        try {
            array.adiciona("mangus");
            array.adiciona("mangas");


        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        System.out.println(array.toString());

    }


}


class TestTamanho {

    public static void main(String[] args) {
        Array array = new Array(2);
        try {
            array.adiciona("mangus");
            array.adiciona("mangas");
            array.adiciona("mangas");
            array.adiciona("mangus");
            array.adiciona("mangas");
            array.adiciona("mangas");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        System.out.println(array.size());

    }

}

class TestAdiciona {

    public static void main(String[] args) throws Exception {
        Array array = new Array(2);

        array.adiciona("mangus");
        array.adiciona("mangas");
        // vai dar erro esse cara, aqui tinha que ter um try catch
        array.adiciona("manus");


    }

}

class TestCapacidade {

    public static void main(String[] args) {
        Array array = new Array(10);

//         System.out.println(array.getValores().length);

    }

}