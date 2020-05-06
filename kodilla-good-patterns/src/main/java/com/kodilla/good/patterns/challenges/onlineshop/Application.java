package com.kodilla.good.patterns.challenges.onlineshop;

public class Application {
    public static void main(String[] args) {

        OrderDto orderDto = new OrderDto("Table",1);
        OrderProcessor orderProcessor = new OrderProcessor(new SmsInformationService(),new IkeaOrderService(),new DataBaseRepository());
        User user = new User("Henryk","Sztacheta","Heniu77","Henryk@gmail.com");
        orderProcessor.process(orderDto, user);
    }
}

