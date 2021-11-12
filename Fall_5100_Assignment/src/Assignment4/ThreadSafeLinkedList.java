package Assignment4;
//Write a Java code to implement Thread safe LinkedList
//        Include below methods in your class LinkedList

//        public void addAtPosition(int index, int element){}

//        public void removeAtPosition(int index, int element){}

//        public int getFirst() {}
//
//        public int getLast() {}
//
//        public int size(){}


import java.util.LinkedList;

public class ThreadSafeLinkedList<T> {
    private LinkedList<T> list;
    private static Object obj;

    public ThreadSafeLinkedList(){
        list = new LinkedList<>();
        obj = new Object();
    }



    public void addAtPosition(int index, T element) {
        synchronized (obj){
            System.out.println("Index = " + index + "list.size = " + list.size());
            list.add(index,element);
        }
    }


    public void removeAtPosition(int index){
        synchronized (obj){
            if(list.size()<= index || index <0){
                return;
            }
            System.out.println("Tread name = " + Thread.currentThread().getName() + " List size" + list.size() + " Index = " + index);
            list.remove(index);
        }


    }
    public T getFirst() {
        synchronized (obj){
            return list.getFirst();
        }

    }

    public T getLast() {
        synchronized (obj){
            return list.getLast();
        }

    }

    public int size(){
        synchronized (obj){
            return list.size();
        }

    }

}
