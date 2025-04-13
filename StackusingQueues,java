class MyStack {
    private int top;
    private int[] a;
    private static final int MAX_SIZE = 10;

    public MyStack() {
        this.top = -1;
        this.a = new int[MAX_SIZE];        
    }
    
    public void push(int x) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack overflow");
            return;
        }
        a[++top] = x;
    }
    
    public int pop() {
        if (empty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return a[top--];
    }

    public int top() {
        if (empty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    }
    
    public boolean empty() {
        return top == -1;
    }
}
