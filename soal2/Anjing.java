package soal2;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(n, r); 
        this.warnaBulu = w;
        this.kemampuan = k;
    }
    
    public String getBulu() {
        return warnaBulu;
    }

    public void setBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
    
    public String[] getKemampuan() {
        return kemampuan;
    }

    public void setKemampuan(String[] kemampuan) {
        this.kemampuan = kemampuan;
    }


    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + warnaBulu);
        System.out.print("Memiliki kemampuan: ");
        for (String k : kemampuan) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
