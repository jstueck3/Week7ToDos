package edu.wctc.maze.roomimpl;

public class StringPrintQueue {
    private static PrintQueue instance;
    private StringBuilder stringBuilder;

    public StringPrintQueue(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public static PrintQueue getInstance() {
        if (instance == null) {
            synchronized (PrintQueue.class) {
                if (instance == null) {

                }
            }
        }
        return instance;
    }
    private void PrintQueue() {
        stringBuilder = new StringBuilder();
    }
    public void enqueue(String str) {
        synchronized (stringBuilder) {
            stringBuilder.append(str + "\n");
        }
    }
    public String flush() {
        synchronized (stringBuilder) {
            String flushedStr = stringBuilder.toString();
            stringBuilder.delete(0, stringBuilder.length());
            return flushedStr;
        }
    }
}



