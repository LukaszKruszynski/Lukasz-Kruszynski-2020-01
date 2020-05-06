package com.kodilla.good.patterns.challenges.onlineshop;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public boolean process(final OrderDto orderDto, User user) {
        boolean isAvailable = orderService.order(orderDto,user);

        if(isAvailable) {
            informationService.sendMessage("Your order has arrived");
            orderRepository.saveOrder(orderDto);
            return true;
        } else {
            return false;
        }
    }
}
