package Study;

/**
 * @Author
 * @Date
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int [] Sort = {1,20,33,6,10,61,7,8,9};
        for (int i = Sort.length-1;i>0;i--){
            for (int j = 0;j<i;j++){

                if(Sort[i]>Sort[i+1]){
                    int min =0;
                    min = Sort[i+1];
                    Sort[i+1] = Sort[i];
                    Sort[i] =min;
                }
            }
        }
        for (int k =0;k<Sort.length;k++){
            System.out.println(Sort[k]);
        }
    }
}
