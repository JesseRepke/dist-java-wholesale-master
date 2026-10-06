package edu.wctc.wholesale.repository;

import edu.wctc.wholesale.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}