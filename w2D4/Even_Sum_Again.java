package w2D4;

public class Even_Sum_Again {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            {
                int sum=0;
                for(int j=1;j<=i;j++)
                {
                    if(j%2==0){
                        sum=sum+j;
                    }

                }
                System.out.println(sum);
            }
        }
    }
}
