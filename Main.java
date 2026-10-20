import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("XPRESS");
        System.out.println("==================================================");
        //System.out.println();
        System.out.println("=== REKAP BIAYA OPERASIONAL ARMADA ===");

        List<Armada> daftarArmada = new ArrayList<>();
        daftarArmada.add(new MotorExpress("L 5178 CA", "Yamaha Nmax", 60.0, true));
        daftarArmada.add(new MobilBox("B 9234 UXK", "Suzuki Carry", 800.0, 4));
        daftarArmada.add(new DronePengirim("DR-001", "DJI FlyCart", 30.0, 120));

        double totalOperasional = 0.0;

        for (Armada armada : daftarArmada) {
            armada.tampilkanInfoArmada();
            System.out.println("");
            totalOperasional += armada.hitungBiayaOperasional();
        }

        System.out.println("TOTAL OPERASIONAL ARMADA/HARI: Rp " + String.format("%,.2f", totalOperasional).replace('.', ',').replace(',', '.'));

        //System.out.println();
        System.out.println("==================================================");
        System.out.println();
        System.out.println(">>> DAFTAR GAJI & KAPABILITAS KURIR <<<");

        kurir[] daftarKurir = new kurir[2];
        daftarKurir[0] = new KurirTetap("K-001", "Halimawan", 100, 3300000.0, 4000.0);
        daftarKurir[1] = new KurirMitra("M-001", "Wawan", 85, 13000.0);
        
        for (kurir k: daftarKurir) {
            k.tampilkanProfil();
            System.out.println();
            System.out.println("[UJI HAK AKSES & DYNAMIC CASTING]");

            if (k instanceof AksesSistem) {
                ((AksesSistem) k).login(k.getNama(), "pasword123");
            } else {
                System.out.println("Info: Kurir " + k.getNama() + " TIDAK MEMILIKI akses login dashboard.");
            }

            if (k instanceof PresensiDigital) {
                ((PresensiDigital) k).rekamKehadiran();
            }

            System.out.println("------------------------");
        }
    }
}