/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext;
import entity.UserAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author HP
 */
public class UserAddressDAOImpl extends DBContext {

    public UserAddress getAll(String id) { //Get user data in the database
        String sql = "select * from UserAddress UA full outer join Users U on UA.UserID = U.UserID where U.UserID = ?";
        Connection conn = null;
        PreparedStatement prepare = null;
        ResultSet rs = null;
        UserAddress UA = null;
        try {
            conn = getConnection();
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, id);
            rs = prepare.executeQuery();
            while (rs.next()) {
                UA = new UserAddress();
                UA.setImage(rs.getString(15));
                UA.setEmail(rs.getString(10));
                UA.setID(rs.getInt(7));
                UA.setPhoneNum(rs.getString(6));
                UA.setShipAddress(rs.getString(4));
                UA.setShipCityID(rs.getInt(5));
                UA.setShipName(rs.getString(3));
                UA.setUserID(rs.getInt(2));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return UA;
    }

    public void edit(String image, String name, String email, String phone, String address, String id) {
        String sql = "update Users set email = ?,image=? where UserID = ?";
        String query = "update UserAddress set ShipName = ?,ShipAddress=?,PhoneNum=? where UserID = ?";
        Connection conn = null;
        PreparedStatement prepare = null;
        PreparedStatement prepare1 = null;
        try {        
            conn = getConnection();
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, email);
            prepare.setString(2, image);
            prepare.setString(3, id);
            prepare.executeUpdate();
            prepare1 = conn.prepareStatement(query);
            prepare1.setString(1, name);
            prepare1.setString(2, address);
            prepare1.setString(3, phone);
            prepare1.setString(4, id);
            prepare1.executeUpdate();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
    public static void main(String[] args) {
        UserAddressDAOImpl dao = new UserAddressDAOImpl();
        dao.edit("user.png","Nguyen Dang Dung","beastwantlov3@gmail.com","0349175696","Hai Duong","17");
    }
}
