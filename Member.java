package employee;
import java.util.ArrayList;

public class Member implements User{
    private ArrayList<String> kodeMember = new ArrayList<String>();
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
     
    public void member(){
        this.kodeMember.add("0");
        this.namaMember.add("\tJunaidi");
        this.alamat.add("\tIjen");
        this.telepon.add("\t081232425262");
        this.saldo.add(1000000);
        
        this.kodeMember.add("1");
        this.namaMember.add("\tAhmad");
        this.alamat.add("\tRajajowas");
        this.telepon.add("081272837463");
        this.saldo.add(750000);
        
        this.kodeMember.add("2");
        this.namaMember.add("\tJunaidi");
        this.alamat.add("\tIjen");
        this.telepon.add("\t081236478273");
        this.saldo.add(500000);
    }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    
    public int getJumlahMember(){
        return this.saldo.size();
    }

    public void setNama(String namaMember){
        this.namaMember.add(namaMember);
    }
    
    public void setKode(String kodeMember){
        this.kodeMember.add(kodeMember);
    }
    
    public void setAlamat(String alamat){
        this.telepon.add(alamat);
    }
    
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    public String getNama(int idMember){
        return this.namaMember.get(idMember);
    }
    
    public String getKode(int idMember){
        return this.kodeMember.get(idMember);
    }
    
    public String getAlamat(int idMember){
        return this.alamat.get(idMember);
    }
    
    public String getTelepon(int idMember){
        return this.telepon.get(idMember);
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