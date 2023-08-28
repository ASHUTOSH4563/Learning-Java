package JavaProgram;

public class Nstacks {
    private int[] array;       // The underlying array
    private int[] tops;        // Array to track the top element of each stack
    private int[] next;        // Array to store the next available index for each stack
    private int[] prev;        // Array to store the previous index for each stack
    private int free;          // Index of the next available position in the array

    public Nstacks(int stackCount, int arraySize) {
        array = new int[arraySize];
        tops = new int[stackCount];
        next = new int[arraySize];
        prev = new int[arraySize];

        // Initialize stack tops and next indices
        for (int i = 0; i < stackCount; i++) {
            tops[i] = -1;
            int startOfStack = i * (arraySize / stackCount);
            int endOfStack = startOfStack + (arraySize / stackCount);
            for (int j = startOfStack; j < endOfStack - 1; j++) {
                next[j] = j + 1;
                prev[j + 1] = j;
            }
            next[endOfStack - 1] = -1;
        }
        free = 0;
    }

    public void push(int stackIndex, int value) {
        if (isFull())
            throw new IllegalStateException("Stack overflow");

        int insertIndex = free;
        free = next[insertIndex];

        if (tops[stackIndex] != -1)
            prev[tops[stackIndex]] = insertIndex;

        next[insertIndex] = tops[stackIndex];
        prev[insertIndex] = -1;
        tops[stackIndex] = insertIndex;

        array[insertIndex] = value;
    }

    public int pop(int stackIndex) {
        if (isEmpty(stackIndex))
            throw new IllegalStateException("Stack underflow");

        int popIndex = tops[stackIndex];
        tops[stackIndex] = next[popIndex];
        prev[tops[stackIndex]] = -1;
        next[popIndex] = free;
        prev[popIndex] = -1;
        free = popIndex;

        return array[popIndex];
    }

    public boolean isEmpty(int stackIndex) {
        return tops[stackIndex] == -1;
    }

    public boolean isFull() {
        return free == -1;
    }
}
