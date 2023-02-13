public class program{
    public static void main(String[] args){
        int flower[] = {1,1,0,0,0,0,1,0,0,1};
        int n = 0;
        for(int i=1; i< flower.length -1; i++){
            if(flower[i-1] == 0 && flower[i+1] ==0 && flower[i] ==0){
                n++;
                i++;

                System.out.println(n);
            }
        }
    }
}