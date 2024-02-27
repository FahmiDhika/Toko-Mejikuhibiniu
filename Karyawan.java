package employee;
import java.util.ArrayList;

public class Karyawan implements User{
    
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        this.namaKaryawan.add("Admin Junaidi");
        this.alamat.add("kedung kandang");
        this.telepon.add("086374638282");
        this.jabatan.add(0);
        
        this.namaKaryawan.add("Admin Junaidi");
        this.alamat.add("kedung kandang");
        this.telepon.add("081237283647");
        this.jabatan.add(0);
        
        this.namaKaryawan.add("Admin Junaidi");
        this.alamat.add("kedung kandang");
        this.telepon.add("081236472893");
        this.jabatan.add(0);
    }
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    
    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }

    public void setNama(String namaKaryawan ){
        this.namaKaryawan.add(namaKaryawan);
    }
    
    public void setAlamat(String alamat ){
        this.namaKaryawan.add(alamat);
    }
    
    public void setTelepon(String telepon ){
        this.namaKaryawan.add(telepon);
    }

    public String getNama(int idKaryawan){
        return this.namaKaryawan.get(idKaryawan);
    }

    public String getAlamat(int idKaryawan){
        return this.alamat.get(idKaryawan);
    }

    public String getTelepon(int idKaryawan){
        return this.telepon.get(idKaryawan);
    }

    @Override
    public void setNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTelepon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTelepon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setKode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getKode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}