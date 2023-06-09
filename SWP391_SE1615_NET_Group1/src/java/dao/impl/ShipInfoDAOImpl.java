package dao.impl;

import dao.DBContext;
import dao.ShipInfoDAO;
import entity.ShipInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShipInfoDAOImpl extends DBContext implements ShipInfoDAO{

    public int createReturnId(ShipInfo shipping) throws Exception{
        Connection conn = null;
            PreparedStatement prepare = null;
            ResultSet rs = null;
        try {
            String sql = "INSERT INTO [dbo].[ShipInfo]\n"
                    + "           ([Order_ID]\n"
                    + "           ,[CustomerName]\n"
                    + "           ,[ShippingAddress]\n"
                    + "           ,[ShipCityID]\n"
                    + "           ,[PhoneNum]\n"
                    + "           ,[Note])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            conn = getConnection();
                prepare = conn.prepareStatement(sql);

            prepare = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepare.setInt(1, shipping.getOrder_ID());
            prepare.setString(2, shipping.getCustomerName());
            prepare.setString(3, shipping.getShippingAddress());
            prepare.setInt(4, shipping.getShipCityID());
            prepare.setString(5, shipping.getPhoneNum());
            prepare.setString(6, shipping.getNote());
            prepare.executeUpdate();

             rs = prepare.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception ex) {
            throw ex;
        }
        finally {
            closeRS(rs);
            closePrepareStatement(prepare);
            closeConnection(conn);
        }
        return 0;
    }

}
