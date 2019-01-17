public class Runner {
    /**
     * @author Wei Chen, Ishrat Soha
     * @version January 2019
     */
    public static void main(String[] args){

        //bubbleSort String
        long time2 = System.nanoTime();
        SortingMethods.bubbleSort(SortingUtil.randomStringArr(100, 5));
        time2=System.nanoTime() - time2;
        System.out.println("bubbleSort(String) Time Taken: " + time2 +"\n");


        //selectionSort
        long time3 = System.nanoTime();
        SortingMethods.selectionSort(SortingUtil.randDoubleArr(100,10000));
        time3=System.nanoTime() - time3;
        System.out.println("selectionSort(int) Time Taken: " + time3+"\n");


        //insertionSort
        long time4 = System.nanoTime();
        SortingMethods.insertionSort(SortingUtil.randIntArr(100));
        time4=System.nanoTime() - time4;
        System.out.println("insertionSort(int)Time Taken: " + time4+"\n");
    }
}
