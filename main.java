{
    public static void main(String[] args) {
        int d=0;
        int s=0;
        while (d<3 & s<3){
            Scanner oyuncu1= new Scanner(System.in);
            System.out.println("qog'oz=1, qaychi=2, tosh=3 yoki kag'it = 1, makas = 2, tas=3 ");
            int oyuncubir=oyuncu1.nextInt();

            Scanner oyuncu2= new Scanner(System.in);
            int oyuncuiki=oyuncu2.nextInt();

            if ( oyuncubir == 1 & oyuncuiki == 2){
                d=d+1;
                System.out.println("ikinchi raqamli ishtirokchi ustun keldi");
            }
            if ( oyuncubir == 1 & oyuncuiki == 1){
                System.out.println("ikiniz ham bir shakil tanladingiz ");

            }
            
            //https://github.com/21040001/zom-zom-ziki-yoki-tos-kagit-makas/new/main
            
            // s oyuncu 1 d ise oyuncu iki
            if ( oyuncubir == 1 & oyuncuiki == 3){
                s=s+1;
                System.out.println("birinchi raqamli ishtirokchi ustun keldi");
            }
            if ( oyuncubir == 2 & oyuncuiki == 1){
                s=s+1;
                System.out.println("birinchi raqamli ishtirokchi ustun keldi");
            }
            if ( oyuncubir == 2 & oyuncuiki == 2){
                System.out.println("ikiniz ham bir shakil tanladingiz ");
            }
            if ( oyuncubir == 2 & oyuncuiki == 3){
                d=d+1;
                System.out.println("ikinchi raqamli ishtirokchi ustun keldi");
            }
            if ( oyuncubir == 3 & oyuncuiki == 1){
                d=d+1;
                System.out.println("ikinchi raqamli ishtirokchi ustun keldi");
            }
            if ( oyuncubir == 3 & oyuncuiki == 2){
                s=s+1;
                System.out.println("birinchi raqamli ishtirokchi ustun keldi");
            }
            if ( oyuncubir == 3 & oyuncuiki == 3){
                System.out.println("ikiniz ham bir shakil tanladingiz ");

            }}
        if (s==3){
            System.out.println("birinchi raqamli ishtirokchi oyinni qozondi");
        }
        if (d==3){
            System.out.println("ikkinchi raqamli ishtirokchi oyinni qozondi");
        }
    }
}
