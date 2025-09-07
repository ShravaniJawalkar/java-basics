package org.example.practicedesign.chainofresp;

public abstract class Handler {
    protected Handler next;

    public void setNextHandler(Handler next) {
        this.next = next;
    }
    public abstract void handleRequest(String request);
}
