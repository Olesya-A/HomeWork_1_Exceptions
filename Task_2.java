/*
2.  Посмотрите на код, и подумайте сколько разных типов 
    исключений вы тут сможете получить? 

    public static int sum2d(String[][] arr){ 
    int sum = 0; 
    for (int i = 0; i < arr.length; i++) { 
        for (int j = 0; j < 5; j++) { 
            int val = Integer.parseInt(arr[i][j]); 
            sum += val; } 
        } return sum; 
    }

 * */
    

public class Task_2 {

    public static void main(String[] args) {

        // 1. NumberFormatException - For input string: "a"
    //String[][] Arr = new String[][]{{"1","2","3","4","5"}, {"1","2","a","4","5"}};
    //System.out.println(sum2d(Arr));
        
        //NumberFormatException - Cannot parse null string
    //String[][] Arr = new String[][]{{"1","2","3","4","5"}, {"1","2",null,"4","5"}};
    //System.out.println(sum2d(Arr));
   
        //2. ArrayIndexOutOfBoundsException - Index 3 out of bounds for length 3
    //String[][] Arr = new String[][]{{"1","2","3","4","5"}, {"1","2","3"}};
    //sum2d(Arr);

    }

    public static int sum2d(String[][] arr){
          int sum = 0; 
         for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < 5; j++) { 
             int val = Integer.parseInt(arr[i][j]); 
             sum += val;
          } 
         } 
     return sum; 
    }

}
