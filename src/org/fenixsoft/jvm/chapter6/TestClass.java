package org.fenixsoft.jvm.chapter6;

public class TestClass {
    private int m;

    public int inc(){
        return m+1;
    }

    public int inc_with_try_catch(){
        int x;
        try{
            x=1;
            return x;
        } catch(Exception ex){
            x=2;
            return x;
        } finally{
            x=3;
        }
    }
}
