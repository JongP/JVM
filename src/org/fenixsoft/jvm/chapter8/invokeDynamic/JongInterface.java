package org.fenixsoft.jvm.chapter8.invokeDynamic;

public interface JongInterface {
    int jongMethod();

    default int jongDefaultMethod(){
        int a=0;
        return a;
    }
}
