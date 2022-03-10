                                                                package day04;

public class RelationalOperators {
    public static void main(String[] args) {
        //Karşılaştırma ve İlişkisel operatörler
        //==, !=, <, >, <=, >=

//        int x=5;
//        int y=5;
//
//        System.out.println(x>=y);

        //Kısa kenar ve uzun kenar uzunlukları verilen iki dikdörtgenin
        // alanlarını ve çevrelerini karşılaştıran bir Java porgramı yazınız

        //Birinci Dikdörtgen
        int kisaKenar1=8;
        int uzunKenar1=20;

        //İkinci Dikdörtgen
        int kisaKenar2=8;
        int uzunKenar2=16;


        //Alanları hesaplayalım
        int alan1=kisaKenar1*uzunKenar1;
        int alan2=kisaKenar2*uzunKenar2;

        //Çevreleri hesaplayalım
        int cevre1=2*(kisaKenar1+uzunKenar1);
        int cevre2=2*(kisaKenar2+uzunKenar2);


        //Alan ve Çevreleri ekrana yazdır
        System.out.println("Alan 1 = "+alan1);
        System.out.println("Alan 2 = "+alan2);
        System.out.println("Çevre 1 = "+cevre1);
        System.out.println("Çevre 2 = "+cevre2);

//        System.out.println(alan1>alan2);

        //Alanları karşılaştır
        if (alan1>alan2){
            System.out.println("Birinci dikdörtgenin alanı daha büyüktür.");
        }
        else if (alan1<alan2){
            System.out.println("İkinci dikdörtgenin alanı daha büyüktür.");
        }
        else{
            System.out.println("İki dikdörtgenin alanı eşittir.");
        }

        //Çevreleri karşılaştır
        if (cevre1>cevre2){
            System.out.println("Birinci dikdörtgenin çevresi daha büyüktür.");
        }else if (cevre1<cevre2) {
            System.out.println("İkinci dikdörtgenin çevresi daha büyüktür.");
        }else{
            System.out.println("İki dikdörtgenin çevresi eşittir.");

            }
        }


    }
