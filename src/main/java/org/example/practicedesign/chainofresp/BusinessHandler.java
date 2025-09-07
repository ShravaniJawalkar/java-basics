package org.example.practicedesign.chainofresp;

public class BusinessHandler extends Handler {
       @Override
    public void handleRequest(String request) {
        if(request.equals("Business")){
            System.out.println("BusinessHandler is handling the request: " + request);
        }else {
            if(next!=null){
                next.handleRequest(request);
            }

        }
    }
}
