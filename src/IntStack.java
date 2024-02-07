public class IntStack {
    /**
     * 4) Write and test a class IntStack that implements a stack of integers with methods similar to the ones in the Stack class,
     * but handling values of the type int rather than Object. Provide a no-args constructor that allocates an array of some default
     * capacity to hold the values and another constructor that allocates an array of a specified capacity. Use a "stack pointer"
     * to hold the index of the first empty slot. Reallocate the array, doubling its size, if the stack runs out of space.
     */
    int sp;
    int cap;
    int[] stack;
    public IntStack(){
        sp = 0;
        cap = 10;
        stack = new int[cap];
    }

    public IntStack(int capacity){
        cap = capacity;
        stack = new int[cap];
    }


    public void push(int i){
        if(sp < stack.length){
            stack[sp++] = i;
        }
        else{
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
            stack[sp++] = i;
        }
    }

    public void

}
