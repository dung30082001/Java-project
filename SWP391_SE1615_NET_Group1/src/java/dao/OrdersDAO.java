/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Orders;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface OrdersDAO {
    int createReturnId(Orders order) throws Exception;
    int getTotalOrder(String id) throws Exception;
    List<Orders> pagingOrders(String id,int index) throws Exception;
}
