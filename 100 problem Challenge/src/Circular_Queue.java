//question 90:

import java.util.*;

class CircularQueue {
    int front, rear, size=5;
    int[] arr= new int[5];
    CircularQueue() {
        front=-1;
        rear=-1;
    }
    
    boolean isFull() {
        if(front==0 && rear==size-1) {
            return true;
        }
        if(front==rear+1) {
            return true;
        }
        return false;
    }
    
    boolean isQueueEmpty() {
        if(front==-1) {
            return true;
        }
        return false;
    }
    
    public void add(int x) {
        if(isFull()) {
            System.out.println("Overflow");
        }
        else {
            if(front==-1) front = 0;
            rear = (rear+1)%size;
            arr[rear]=x;
        }
    }
    
    public int remove() {
        int element;
        if(isQueueEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        else {
            element  = arr[front];
            if(front==rear) {
                front=-1;
                rear=-1;
            }
            else {
                front = (front+1)%size;
            }
            return element;
        }
    }
    
    public int getFront() {
        return front;
    }
    
    public int getRear() {
        return rear;
    }
    
    public int size() {
        return front+rear-1;
    }
    
    public void showQueue() {
        int i;
        if(isQueueEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            for(i= front; i!= rear; i=(i+1)%size) {
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[i]+"\n");
        }
    }
    
}

public class Circular_Queue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        CircularQueue q =new CircularQueue();
        while(t-->0) {
            int operation = sc.nextInt();
            switch(operation) {
            case 1:
                int num = sc.nextInt();
                q.add(num);
                if(count<5)count++;
                break;
            case 2:
                int element = q.remove();    
                if(count>0 && count<6) count--;
                break;
            case 3:
                if(q.front==-1 && q.rear==-1) {
                    System.out.println("Queue is empty");
                }
                else {
                    System.out.println("Front: "+q.getFront());
                    System.out.println("Rear: "+q.getRear());
                }
                
                break;
            case 4:
                System.out.println(count);
                break;
            case 5:
                q.showQueue();
                break;
            }
        }
    }
}