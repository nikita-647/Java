package learn.exceptionHandling;

class StackOverFlow extends Exception {
  public String toString() {
    return "Stack is Full";
  }
}

class StackUnderFlow extends Exception {
  public String toString() {
    return "Stack is Empty";
  }
}

class Stack {
  private int size;
  private int pointer = -1;
  private int A[];

  public Stack(int size) {
    this.size = size;
    A = new int[size];
  }

  public void push(int x) throws StackOverFlow {
    if (pointer == size - 1)
      throw new StackOverFlow();
    pointer++;
    A[pointer] = x;
  }

  public int pop() throws StackUnderFlow {
    int x = -1;
    if (pointer == -1)
      throw new StackUnderFlow();

    x = A[pointer];
    pointer--;
    return x;
  }
}

public class StudentCh {
  public static void main(String[] args) {
    Stack st = new Stack(5);
    try {
      st.push(10);
      st.push(20);
      st.push(30);
      st.push(40);
      st.push(50);
    } catch (StackOverFlow s) {
      System.out.println(s);
    }

    try {
      st.pop();
      st.pop();
      st.pop();
      st.pop();
      st.pop();

    } catch (StackUnderFlow s) {
      System.out.println(s);
    }
  }
}
