import java.util.Stack;


class MyQueue {

    Stack<Integer> mockQueue = new Stack<Integer>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        mockQueue.push(x);
    }

    
    public int pop() {

        int valueToBeRemoved = mockQueue.get(0);
        mockQueue.removeElementAt(0);
        return valueToBeRemoved;
    }

    public int peek() {
        return  mockQueue.get(0);

    }

    public boolean empty() {
        return mockQueue.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
