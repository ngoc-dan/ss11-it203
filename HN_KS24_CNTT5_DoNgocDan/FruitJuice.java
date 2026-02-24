package HN_KS24_CNTT5_DoNgocDan;

class FruitJuice extends Drink implements IMixable {
    private int discountPercent;

    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculatePrice() {
        return price - (price * discountPercent / 100);
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi");
    }
}
