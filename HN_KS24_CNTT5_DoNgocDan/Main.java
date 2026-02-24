package HN_KS24_CNTT5_DoNgocDan;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("1", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("2", "Nước cam", 40000, 10);
        drinks[2] = null;

        System.out.println("--- Hóa đơn đồ uống ---");
        for (Drink d : drinks) {
            if (d != null) {
                d.displayInfo();

                if (d instanceof IMixable) {
                    ((IMixable) d).mix();
                }
                System.out.println("Thành tiền: " + d.calculatePrice());
                System.out.println("-----------------------");
            }
        }
    }

}
