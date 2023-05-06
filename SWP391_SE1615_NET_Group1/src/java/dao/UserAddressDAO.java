package dao;

import entity.UserAddress;

public interface UserAddressDAO {

    UserAddress getAll(String id) throws Exception;

    void edit(String image, String name, String email, String phone, String address, String id) throws Exception;
}
