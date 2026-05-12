package ibm;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6};
//        arr[0]=1;
//        arr[1]=2;
        int n =arr.length -1;

        for(int i=n;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }

    }
}
