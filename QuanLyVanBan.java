import java.util.Arrays;

public class QuanLyVanBan {
    VanBan vanBan = new VanBan();
   public void NhapVaoMotXauChuoi(String intputVanBan){
       vanBan.setNoiDung(intputVanBan);
       System.out.println(vanBan.getNoiDung());
   }
   public int DemKyTuHTrongXauChuoi(){
       int count = 0;
       for (int i = 1; i <= vanBan.getNoiDung().length(); i++) {
           if (vanBan.getNoiDung().charAt(i)=='h'||vanBan.getNoiDung().charAt(i)=='H'){
               count++;
           }
       }
       return count;
   }
    public int DemKyTuChuoi(){
       int count = 0;
       String[] noiDung = vanBan.getNoiDung().split(" ");
        System.out.println(Arrays.toString(noiDung));
        count = noiDung.length;
       return count;
    }
    public String XoaKyTuDauCuoi(){
       String noiChuoi="";
       String noiDung = vanBan.getNoiDung().trim();
       String[] noiDung1 = vanBan.getNoiDung().split(" ");
       System.out.println(Arrays.toString(noiDung1));
        for (int i = 0; i < noiDung1.length; i++) {
            System.out.println("Chuoi:"+noiDung1[i]+":Chuoi");
            if(noiDung1[i].equals("")&&noiDung1[i-1].equals("")){
                continue;
            }
            if(noiChuoi.length()!=0 && noiChuoi.charAt(noiChuoi.length()-1)==' ' && noiDung1[i].equals("")){
                continue;
            }
            noiChuoi+=noiDung1[i]+" ";
        }
       return noiChuoi;
    }
    public String replaceAll(){
       String noiDung = vanBan.getNoiDung();
       while (noiDung.contains("  ")){
             noiDung= noiDung.replaceAll("  ", " ");
       }
       return noiDung;
    }
    public String reLace(){
       String noiDung = vanBan.getNoiDung().replace(" ","");
       return noiDung;
    }
}

