public class DronePengirim extends Armada {
    private int batasKetinggianMaksimal;

    public DronePengirim(String noPlat, String merk, double kapasitasKG, int batasKetinggianMaksimal) {
        super(noPlat, merk, kapasitasKG);
        this.batasKetinggianMaksimal = batasKetinggianMaksimal;
    }

    @Override
    public double hitungBiayaOperasional() {
        return (this.kapasitasKG * 10000.0) + 50000.0;
    }

    @Override
    public void tampilkanInfoArmada() {
    System.out.println("[DRONE PENGIRIM]");
    super.tampilkanInfoArmada();
    System.out.println("Batas Ketinggian: " + batasKetinggianMaksimal + " Meter");
    System.out.println("Biaya/Hari: Rp " + String.format("%,.2f", hitungBiayaOperasional()).replace('.', ',').replace(',', '.'));
    }
}