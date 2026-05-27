public class primeno {
    public static void main(String[] args) {
        int n=100;
        for(int i =2;i<n;i++){
            int k =2;
            boolean isPrime= true;
            while(k<i){            
                if(i==k){
                    continue;
                }
                else if(i%k==0){
                    isPrime=false;
                   break; 
                }              
                k++;
            }
            if(isPrime){
                System.out.println(i+"prime");
            }           
        }
    }
}
