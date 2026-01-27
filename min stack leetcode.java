 

class MinStack {

    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (val <= min) {
            stack.push(min);    
            min = val;         
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.peek() == min) {
            stack.pop();        
            min = stack.pop();  
        } else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
