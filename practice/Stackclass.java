package practice;

public class Stackclass {
  public static void main(String args[]) {
    Stack obj = new Stack(5);
    obj.push(2);
    obj.push(3);
    obj.push(4);
    obj.show();

    System.out.println("After pop:");
    obj.pop();
    obj.show();
  }
}

class Stack {
  private int arr[];
  private int top;
  private int arrsize;

  Stack(int size) {
    arrsize = size;
    arr = new int[arrsize];
    top = -1;
  }

  public void push(int value) {
    if (top == arrsize - 1) {
      System.out.println("Stack is full");
    } else {
      top++;
      arr[top] = value;
    }
  }

  public void pop() {
    if (top == -1) {
      System.out.println("Stack is Empty");
    } else {
      top--;
    }
  }

  public void show() {
    if (top == -1) {
      System.out.println("Empty");
    } else {
      for (int i = top; i >= 0; i--) {
        System.out.println(arr[i]);
      }
    }

  }

}
