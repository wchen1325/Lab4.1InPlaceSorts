
public class SortingMethods {
    public static void bubbleSort(int[] arr){
        int[] arrTemp= arr;
        int swaps = -1;
        while(swaps!= 0){
            swaps=0;
            for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i + 1]){
                    SortingUtil.swap(arr,i,i+1);
                    swaps++;
                }
            }
        }
        if(SortingUtil.isSorted(arr)&& SortingUtil.checkSum(arrTemp, arr)) {
            SortingUtil.printArray(arr);
        }
        else{
            System.out.println("error");
        }
    }

    public static void bubbleSort(String[] arr){
        String[] arrTemp= arr;
        int swaps = -1;
        while(swaps!= 0){
            swaps=0;
            for(int i =0;i<arr.length-1;i++){
                if(arr[i].compareTo(arr[i + 1]) > 0){
                    SortingUtil.swap(arr,i,i+1);
                    swaps++;
                }
            }
        }
        if(SortingUtil.isSorted(arr)/*&& SortingUtil.checkSum(arrTemp, arr)*/) {
            SortingUtil.printArray(arr);
        }
        else{
            System.out.println("error");
        }
    }

    public static void selectionSort(int[] arr){
        int minPos = 0;
        //i == currentPostion;
        for(int i = 0; i < arr.length - 1;i++){
            int minValue = arr[i];
            minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(minValue>arr[j]){
                    minValue=arr[j];
                    minPos=j;
                }
            }
            SortingUtil.swap(arr,i,minPos);
        }
    }



}
