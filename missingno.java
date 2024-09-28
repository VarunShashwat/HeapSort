class missingno{
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3,5};
        int sum=0;
        for(int i=0;i<myArray.length;i++)
        {
           sum= sum+  myArray[i];
        }
     int original=  (myArray.length+1)*(myArray.length+2)/2;
     int m = original-sum;
     System.out.println(m);
    } 
       

}