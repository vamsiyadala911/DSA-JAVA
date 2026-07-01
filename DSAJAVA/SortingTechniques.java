public class SortingTechniques {
    // swapping up of the adjacent Elements
    // Time complexity : O(n^2)
    // space complexity : O(1)
    public void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void selectionSort(int arr[]){
        // selecting the minimum Element swap at correct index
        // Time complexcity :O(n^2)
        // Space complexcity : O(1)
        for(int i=0;i<arr.length-1;i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void insertionSort(int arr[]){
        // Inserting the Element from unsorted to sorted Array
        // Time complexcity:O(n^2)
        // Space Complexcity:O(1)
        for(int i=0;i<arr.length;i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void cyclicSort(int arr1[]){
        // When given number range from 1 to N ==> use cyclic sort
        // Time complexcity:O(n)
        // Space complexcity:O(1)
        int i=0;
        while(i<arr1.length){
            int correct=arr1[i]-1;
            if(arr1[i]!=correct){
                int temp=arr1[i];

                arr1[i]=arr1[correct];
                arr1[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]);
        }
    }
    public void mergeSort(int arr[]){

    }

    public static void main(String[] args) {
        //Program Starts from here
        int arr[]={2,4,5,1,6,7};
        int arr1[]={2,3,4,5,1};
        SortingTechniques s=new SortingTechniques();
       // s.bubbleSort(arr);
        System.out.println(" ");
       // s.selectionSort(arr);
        System.out.println(" ");
       // s.insertionSort(arr);
        s.cyclicSort(arr1);

    }
}
