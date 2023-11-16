public class MyThread extends Thread{
    private int[] arr;

    MyThread(String name, int[] arr){
        super(name);
        this.arr = arr;
    }
    @Override
    public void run(){
        int sum = 0;
        for(int i:arr){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
