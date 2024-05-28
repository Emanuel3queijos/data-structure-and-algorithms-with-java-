package queues;

import base.StaticDataStructure;

public class Queue<T> extends StaticDataStructure<T> {


    private T queue[];
    private int size;


    public Queue(int capacidade) {
        //chama um construtor vazio que inicializa a fila com 10 elementos
        super(capacidade);
        this.size = 0;
    }


    public Queue(){
        super();
    }

{}
    public void enqueue(T item)  throws Exception {

this.add(item);

    }

    public T dequeue(){
        if (!this.isEmpty()){
            this.remove(0);
            return this.dataStructure[0];
        }return null;
    }

    public T takeAlook(){


        if (!isEmpty()){
            return this.dataStructure[0];
        }
        return null;
    }



}


 class  Test {

     public static void main(String[] args) throws Exception {
         Queue<Integer> queue = new Queue<>();

         queue.enqueue(1);

         System.out.println(         queue.dequeue());
         System.out.println(         queue.dequeue());
         System.out.println(         queue.takeAlook());

     }

}