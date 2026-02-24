package HN_KS24_CNTT5_DoNgocDan;

abstract class Drink {
    protected String id;
    protected String name;
    protected double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculatePrice();

    void displayInfo() {
        System.out.println("Mã: " + id + " | Tên: " + name + " | Giá gốc: " + price);
    }
}
