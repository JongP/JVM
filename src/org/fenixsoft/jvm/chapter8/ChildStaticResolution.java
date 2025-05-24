package org.fenixsoft.jvm.chapter8;

public class ChildStaticResolution extends StaticResolution {

    public static void sayHello() {
        System.out.println("hello world child");
    }

    public static void main(String[] args) {
        ChildStaticResolution.sayHello();
        StaticResolution.sayHello();
        StaticResolution.sayBye();
    }

}
