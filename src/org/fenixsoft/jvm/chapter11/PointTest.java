package org.fenixsoft.jvm.chapter11;

public class PointTest {
    static int test(int x){
        int xx = x+2;
        Point p = new Point(xx, 42);
        return p.getY();
    }

    public static void main(String[] args) {
        for(int i =0;i<50000;i++){
            test(10);
        }
    }
}
