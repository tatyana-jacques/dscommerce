package com.tatyanajacques.dscommerce.repositories;

import com.tatyanajacques.dscommerce.entities.Order;
import com.tatyanajacques.dscommerce.entities.OrderItem;
import com.tatyanajacques.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
