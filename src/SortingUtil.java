public class SortingUtil {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i<arr.length;i++){
            arr[i] = (int)(Math.random() * 10001);
        }
        return arr;
    }

    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after){
        int bSum=0;
        int aSum=0;
        if (!(before.length==after.length)){
            return false;
        }
        for(int i =0; i <before.length -1; i++){
            bSum=bSum+before[i];
            aSum=aSum+after[i];
        }
        return(aSum==bSum);
    }

    public static void printArray(int[] arr){
        String str ="";
        for (int i = 0; i<arr.length;i++){
            str=str + String.valueOf(arr[i]) + ", ";
        }
        System.out.println(str);
    }

}
