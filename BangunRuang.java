public class BangunRuang {
    private int panjang, lebar, tinggi;

    public BangunRuang() {

    }

    public void setPanjang(int i) {
        panjang = i;
    }

    public void setLebar(int n) {
        lebar = n;
    }

    public void setTinggi(int o) {
        tinggi = o;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        BangunRuang Balok = new BangunRuang();

        Balok.setPanjang(30);
        Balok.setLebar(10);
        Balok.setTinggi(7);

        int volume = Balok.hitungVolume();
        System.out.println("Volume Balok: " + volume);
    }
}

class VehicleTester {
    public static void main(String[] args) {

        BangunRuang Balok = new BangunRuang();

        Balok.setPanjang(Integer.parseInt("5"));
        Balok.setLebar(Integer.parseInt("3"));
        Balok.setTinggi(Integer.parseInt("4"));

        int volume = Balok.hitungVolume();
        System.out.println("Volume Balok: " + volume);
    }
}

