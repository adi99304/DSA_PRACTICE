public class divideandconquer {
    static void mergesort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid= (si+ei)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);

    }
    static void merge(int[] arr ,int si ,int mid,int ei){
        int[] temp= new int[ei-si+1];
        int i= si;
        int j = mid+1;
        int k =0;
        while(i<= mid &&j<=ei){
            if(arr[i] < arr[j]){

                temp[k++]= arr[i];
                i++;
            }
            else{
                temp[k++]= arr[j];
                j++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]= arr[j++];
        }
        
        for(int e =0,s=si;e<temp.length;e++,    s++){
            arr[s]=temp[e]; 
        }
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
    }
}
