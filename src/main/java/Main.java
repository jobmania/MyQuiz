abstract class Bird{
    private int x,y,z;

    void fly(int x, int y, int z){
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        if(flyable(z)){
            this.z = z;
        }else
        {
             System.out.println("그 높이로는 못남");
        }
        printLocation();

    }

    abstract boolean flyable(int z);



    public void printLocation(){
        System.out.println("현재위치"+x+","+y+","+z+"입니다.");

    }
}
    class Pigeon extends Bird{

        @Override
        boolean flyable(int z) {

            return z<10000;
        }
    }
    class Peacock extends Bird{

        @Override
        boolean flyable(int z) {
            return false;
        }
    }


public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peecock = new Peacock();
        System.out.println("--비둙기---");
        pigeon.fly(1,1,3);
        System.out.println("---공작새----");
        peecock.fly(1,1,3);
        System.out.println("--비둘기0--");
        pigeon.fly(1,1,30000);

    }
}