package org.fenixsoft.jvm.chapter8.invokeDynamic;

public class JongClass{
    public static void main(String[] args){
        JongInterface jongInterface = () -> 1;

        jongInterface.jongMethod();
    }
}
