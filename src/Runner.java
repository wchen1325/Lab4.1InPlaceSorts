public class Runner {
    public static void main(String[] args){
        long time = System.nanoTime();
        SortingMethods.bubbleSort(SortingUtil.randIntArr(100));
        time=System.nanoTime() - time;


        System.out.println("Time Taken: " + time);



        long time2 = System.nanoTime();
        SortingMethods.bubbleSort(SortingUtil.randomStringArr(100, 5));
        time2=System.nanoTime() - time2;


        System.out.println("Time Taken: " + time2);
    }
}
