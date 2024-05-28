package base;

import java.util.Arrays;

public class StaticDataStructure<T> {

    protected T[] dataStructure;
    protected int size;

    @SuppressWarnings("unchecked")
    public StaticDataStructure(int capacidade){
        this.dataStructure = (T[]) new Object[capacidade]; //solução do livro effective Java
        this.size = 0;
    }

    public StaticDataStructure(){
        this(10);
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    protected void add(T element) throws Exception {
// tem varias formas de se fazer esse cara, vou deixar essa
        if (size < dataStructure.length) {
            dataStructure[size] = element;
            size++;
            System.out.println("element " + element + " added");
        } else {
            throw new Exception("the array is full, cant add the element: " + element);
        }


    }


    private boolean validator(int pos){
        if (!(pos >= 0 && pos < this.size)) {
            throw new IllegalArgumentException("POS INV");

        }
        return true;
    }



    protected String addElementAtPos(T element, int pos) {
        if (validator(pos)) {

            for (int i = size; i >= pos; i--) {
                dataStructure[i + 1] = dataStructure[i];
            }
            dataStructure[pos] = element;


            this.size++;
            return toString();


        } else {
            return "operacao falhou";
        }
    }
    protected void remove(int posicao){
        if (!(posicao >= 0 && posicao < size)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = posicao; i< size -1; i++){
            dataStructure[i] = dataStructure[i+1];
        }
        size--;
    }

    @SuppressWarnings("unchecked")
    private void increseCapacity(){
        if (this.size == this.dataStructure.length){
            T[] elementosNovos = (T[]) new Object[this.dataStructure.length * 2];
            for (int i = 0; i<this.dataStructure.length; i++){
                elementosNovos[i] = this.dataStructure[i];
            }
            this.dataStructure = elementosNovos;
        }
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString() {

        // nao fazendo a concatenacao de strings, ainda consegui resolver o problema
        Object tempDataStructure[] = new Object[this.size];
        for (int i = 0; i < tempDataStructure.length; i++) {
            tempDataStructure[i] = dataStructure[i];
        }
        return "Array{" +
                "values=" + Arrays.toString(tempDataStructure) +
                '}';
    }

}
