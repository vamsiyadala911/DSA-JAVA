public class SortingTechniques {
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

    public static void main(String[] args) {
        //Program Starts from here
        int arr[]={2,4,5,1,6,7};
        SortingTechniques s=new SortingTechniques();
        s.bubbleSort(arr);
        System.out.println(" ");
        s.selectionSort(arr);

    }
}
