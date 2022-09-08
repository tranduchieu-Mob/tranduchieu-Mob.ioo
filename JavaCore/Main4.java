public class Main4 {
    public static void main(String[] args) {
        
      String[] text = new String [3];
      text[0] = "Toi la java coder";
      text[1] = "Toi dang hoc java co ban";
      text[2] = "toi se hoc lap trinh web";
      for ( int index = 0; index < text.length; index++){
          System.out.println(text[index]);
      }

      int[][] twoDimensionArray;
      twoDimensionArray = new int[3][4];
      
      for(int i = 0; i < 3; i++){
         for(int j = 0; j<4; j++){
            // System.out.println(twoDimensionArray[i][j]);
            twoDimensionArray[i][j] = 1;
         }
      }

      for(int i = 0; i < 3; i++){
         for(int j = 0; j<4; j++){
            System.out.println(twoDimensionArray[i][j]);
         }
      }
      
      int [][][] threDimensions = new int [2][3][4]; //2*3*4=24

      for (String t : text) {
         System.out.println("t is :" + t);
      }

      
      int methodVar = 10;
      for (int i = 0; i < 10;i++  ){
         int var = 3 ;
         System.out.println("total: " + (var + i));
         System.out.println("method var inside block : "+ methodVar);
      }
      System.out.println("method var out side block :"+methodVar);

    }
}
