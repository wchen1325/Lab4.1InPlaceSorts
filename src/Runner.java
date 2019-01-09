public class Runner {
    public static void main(String[] args){
        long time = System.nanoTime();
        BubbleSort.bubble(SortingUtil.randIntArr(100));
        time=System.nanoTime() - time;


        System.out.println("Time Taken: " + time);
    }
}
