package stack;

import base.StaticDataStructure;
public class Stack<T> extends StaticDataStructure<T> {

    public Stack(){
        super();
    }
    public Stack(int capacity){
        super(capacity);
    }

    public void push(T element) throws Exception {
        super.add(element);
    }

    public T pop(){

        if (this.isEmpty()){
            return null;
        }

        return this.dataStructure[--size];
    }

    public T top (){
        if (isEmpty()){
            return null;
        }
        return this.dataStructure[size -1 ];
    }
public boolean isFull(){

        if (size == this.dataStructure.length){
            return true;
        }
        return false;
}


}
