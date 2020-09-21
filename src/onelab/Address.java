package onelab;

public class Address {
    String city; //город
    String street; //улица
    int houseFlat; //дом

    public Address() {
    }

    public Address(String city, String street, int houseFlat) {
        this.city = city;
        this.street = street;
        this.houseFlat = houseFlat;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseFlat(int houseFlat) {
        this.houseFlat = houseFlat;
    }

    @Override
    public String toString() {
        return
                "Город: " + city + ", " +
                "Улица: " + street + ", " +
                "Квартира: " + houseFlat + ' ';
    }
}
