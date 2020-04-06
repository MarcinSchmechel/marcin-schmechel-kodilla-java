package com.kodilla.good.patterns.challenges;

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

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isAvailable = orderService.order(orderRequest.getUser(), orderRequest.getProduct());

        if (isAvailable) {
            informationService.sendInformation(orderRequest.getUser());
            orderRepository.createProductOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getProduct(), false);
        }


    }
}