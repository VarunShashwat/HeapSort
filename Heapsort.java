class Heapsort{
    public static void heapify(int arr[],int n,int i){
          int largest =i;
          int leftidx= 2*i+1;
          int rightidx= 2*i+2;
             if(leftidx < n && arr[leftidx] > arr[largest]){
              largest = leftidx;

                 }
      
         
              if(rightidx < n && arr[rightidx] > arr[largest] ){
               largest = rightidx;
              }
             // if uper case not encouter then swap 
               if(largest!=i){
                // swap
                 int temp = arr[largest];
                arr[largest]= arr[i];
                arr[i] = temp;
                  heapify(arr, n, largest);
               }
            }
            public static void heapsort(int arr[],int n){
                buildheap(arr,n);
              for(int i=n-1;i>=0;i--){
                int temp = arr[i];
                arr[i]= arr[0];
                arr[0]=  temp;
                heapify(arr, i, 0);
              }
             
            }
   
              public static void  buildheap(int []arr, int n){
                int startindx = n/2-1;
                 for(int i= startindx;i>=0;i--){
                   heapify(arr,n,i);
                  }

              }
              public static void displayheap(int arr[],int n){
               System.out.println("Sorted max heap is ");
                    for(int i=0;i<n;i++){
                       System.out.println( arr[i]+ "");
                    }
                     System.out.println("  ");
              }
            public static void main(String[] args) {
                int arr[]={1,3,5,4,6,13,10,9,8,15,17};
                int n= arr.length;
               heapsort(arr,n);
                displayheap(arr,n);
           }
}