public class demo {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,13,16};

        System.out.println( searchDQ(arr,4,0,10));

    }
    static int searchDQ(int array [],int number,int low,int high){

        if(low>high)return -1;
        else {
            int m = (high+low)/2;
            if(array[m]==number) return m;
            else if(array[m]>number) return searchDQ(array,number,low,m-1);
            else return searchDQ(array,number,m+1,high);
        }
    }
}
