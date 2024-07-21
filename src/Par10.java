public class Par10 {
    public static void main(String[] args) {
        int [] ab={10,20,30,40,50};
        for (int i = ab.length-1;i>=0;i--){
            System.out.println(ab[i]);
        }
        System.out.println("using for-each loops");
        for (int p :ab){
            System.out.println(p);
        }

        System.out.println("2-D Array ");
        int [][] ad;
        ad = new int [2][4];
        ad[0][0]=1;
        ad[0][1]=2;
        ad[0][2]=3;
        ad[0][3]=4;
        ad[1][0]=5;
        ad[1][1]=6;
        ad[1][2]=7;
        ad[1][3]=8;

        for (int i = 0;i< ad.length;i++){
            for (int j = 0;j<ad[i].length;j++){
                System.out.print(ad[i][j]+" ");
            }
        }
//        System.out.println("2D array");
//        int [][] as={{2,3,4,5},{6,7,8,9}};
//        for (int i = 0;i<2;i++){
//            for (int j = 0;j<4;j++){
//                System.out.print(as[i][j]+" ");
//            }
//        }
    }
}
