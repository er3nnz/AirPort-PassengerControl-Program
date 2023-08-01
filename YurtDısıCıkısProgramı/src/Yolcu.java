
import java.util.Scanner;

public class Yolcu implements yurtdısıKuralları{

    private boolean harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(boolean harc, boolean siyasiYasak, boolean vizeDurumu) {
        this.harc = harc;
        this.siyasiYasak = siyasiYasak;
        this.vizeDurumu = vizeDurumu;
    }
    
    
    public static void islemyazdir(){
        
        System.out.println("YurtDisi Cikis & Giris Kontrolleri Programina Hosgeldiniz....\n"
                + "*****************************\n"
                + "Yurtdisi Cikis Kurallari...\n" +
                  "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor...\n" +
                  "Harc bedelinizi tam olarak yatirmaniz gerekiyor...\n" +
                  "Gideceginiz ulkeye vizenizin bulunmasi gerekiyor...\n"
                + "*****************************\n");
    }
    
    public void islem(){
        
        Scanner scanner =new Scanner(System.in);
        String kontrol;
        islemyazdir();
        boolean a=false;
        
        while(!a){
            
             System.out.println("Harc Pulu Kontrol Ekranina Geldiniz...\n"
             + "Lutfen Evet Veya Hayir Giriniz.....\n"
             + "Harciniz Var Ve Odendi Mi?");
             kontrol=scanner.nextLine();
          
              if(kontrol.equals("Evet")){
                  this.harc=true;
                  harc();
                }
              else if(kontrol.equals("Hayir")){
                  this.harc=false;
                  harc();
            }
              else{
                  System.out.println("Yanlis Deger Girilmistir Lutfen Evet Veya Hayir Giriniz....."); 
              }

        System.out.println("Siyasi Yasak Kontrol Ekranina Hosgeldiniz...\n"
                           + "Lutfen Evet Veya Hayir Giriniz.....\n"
                           + "Siyasi Yasaginiz Var mi?");   
        
             kontrol=scanner.nextLine();   
             
             if(kontrol.equals("Evet")){
             this.siyasiYasak=true;     
              siyasiYasak();
            }    
             else if(kontrol.equals("Hayir")){
                  
              this.siyasiYasak=false;
                  siyasiYasak();
        }
             else{
                  System.out.println("Yanlis Deger Girilmistir Lutfen Evet Veya Hayir Giriniz.....");
              }

        System.out.println("Vize Kontrol Ekranina Hosgeldiniz....\n"
                      + "Lutfen Evet Veya Hayir Giriniz.....\n"
                      + "Vizeniz Var mi?");
        
              kontrol=scanner.nextLine();
              
              if(kontrol.equals("Evet")){
                  this.vizeDurumu=true;
                  vizeDurumu();
                }
              else if(kontrol.equals("Hayir")){
                  
                  this.vizeDurumu=false;
                  vizeDurumu(); 
              }
              else{
                  System.out.println("Yanlis Deger Girilmistir Lutfen Evet Veya Hayir Giriniz.....");
              }

         if(this.vizeDurumu=true && this.siyasiYasak!=true && this.harc==true){
             System.out.println("Bilgileriniz Gecerlidir....\n"
                     + "Hayirli Yolculuklar Dileriz...");
             break;
         }
         else{
             System.out.println("Bilgileriniz Gecerli Degildir....\n"
                     + "Lutfen Bilgielrinizi Tekrar Kontrol Ediniz... ");
             break;
            }
    }
    
    }
    
    public void harc() {
     if(harc){
         System.out.println("Yolcu Yurtdisi Harc Pulunu Odemistir....\n");
     }
     else {
          System.out.println("Yolcu Yurtdisi Harc Pulunu Odememistir....\n");
        }
    }

    public void siyasiYasak() {
        if(siyasiYasak){
            System.out.println("Yolcunun Siyasi Yasagi Vardir......\n");
        }
        else {
              System.out.println("Yolcunun Siyasi Yasagi Yoktur......\n");
        }
    }

    public void vizeDurumu() {
        if(vizeDurumu){
            System.out.println("Yolcunun Vizesi Vardir....\n");
        }
        else {
            System.out.println("Yolcunun Vizesi Yoktur....\n");
        }
    }
  
    
}
