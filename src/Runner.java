public class Runner {
    public static void main(String[] args){
        long time = System.nanoTime();
        SortingMethods.bubbleSort(SortingUtil.randIntArr(100));
        time=System.nanoTime() - time;


        System.out.println("Time Taken: " + time);

        String[] list1 = {"hi", "hello", "meow"};
        long time2 = System.nanoTime();
        SortingMethods.bubbleSort(list1);
        time2=System.nanoTime() - time2;


        System.out.println("Time Taken: " + time2);
    }
}
