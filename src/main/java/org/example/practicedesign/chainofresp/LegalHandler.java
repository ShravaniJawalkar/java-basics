package org.example.practicedesign.chainofresp;

public class LegalHandler extends Handler {


    @Override
    public void handleRequest(String request) {
        if (request.equals("Legal")) {
            System.out.println("LegalHandler handled the request");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("No handler available for the request: " + request);
            }
        }
    }


}
