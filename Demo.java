package employee;

public class Demo {
    public static void main(String[] args) {
        Barang bar = new Barang();
        Transaksi tran = new Transaksi();
        Laporan lap = new Laporan();
        Member mem = new Member();
        Karyawan kar = new Karyawan();
        
        lap.laporan(bar);
        mem.member();
        lap.laporan(mem);
        tran.prosesTransaksi(mem, tran, bar);
        lap.laporan(tran, bar);
        tran.setTransaksi(bar, 0, 0, 0);
    }
}
