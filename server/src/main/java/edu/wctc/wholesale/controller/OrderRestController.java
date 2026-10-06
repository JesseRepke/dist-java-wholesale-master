package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.dto.OrderDto;
import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
public class OrderRestController {

    private final OrderService orderService;

    public OrderRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders/")
    public List<OrderDto> getOrders() {

        List<OrderDto> orderDtos = new ArrayList<>();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MMM dd yyyy");

        for (Order order : orderService.getOrders()) {

            OrderDto dto = new OrderDto();

            dto.setCustomerName(order.getCustomer().getName());

            dto.setPurchaseDate(
                    order.getPurchaseDate().format(formatter)
            );

            dto.setPurchaseOrderNumber(
                    order.getPurchaseOrderNumber()
            );

            dto.setProductName(
                    order.getProduct().getName()
            );

            dto.setTerms(order.getTerms());

            if (order.getShippedDate() != null) {
                dto.setShippedDate(
                        order.getShippedDate().format(formatter)
                );
            }

            dto.setProductCost(
                    order.getProduct().getCost()
            );

            orderDtos.add(dto);
        }

        return orderDtos;
    }
}