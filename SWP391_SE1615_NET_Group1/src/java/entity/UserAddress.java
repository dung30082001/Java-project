package entity;

public class UserAddress {

    private String image;
    
    private String email;
    
    private int ID;

    private int UserID;

    private String ShipName;

    private String ShipAddress;

    private int ShipCityID;

    private String PhoneNum;

    public int getID() {
        return ID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getShipName() {
        return ShipName;
    }

    public void setShipName(String ShipName) {
        this.ShipName = ShipName;
    }

    public String getShipAddress() {
        return ShipAddress;
    }

    public void setShipAddress(String ShipAddress) {
        this.ShipAddress = ShipAddress;
    }

    public int getShipCityID() {
        return ShipCityID;
    }

    public void setShipCityID(int ShipCityID) {
        this.ShipCityID = ShipCityID;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    @Override
    public String toString() {
        return "UserAddress{" + "image=" + image + ", email=" + email + ", ID=" + ID + ", UserID=" + UserID + ", ShipName=" + ShipName + ", ShipAddress=" + ShipAddress + ", ShipCityID=" + ShipCityID + ", PhoneNum=" + PhoneNum + '}';
    }

}
