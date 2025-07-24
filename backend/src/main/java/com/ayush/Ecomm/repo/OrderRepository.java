package com.ayush.Ecomm.repo;

import com.ayush.Ecomm.model.Orders;
import com.ayush.Ecomm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository  extends JpaRepository<Orders, Long> {
    @Query("SELECT o from Orders o JOIN FETCH o.user")
    List<Orders> findAllOrdersWithUsers();

    List<Orders> findByUser(User user);

}
