package com.bcv.lessons.BoostBrain.lesson_19;

public class ReflectionChecker {
    public void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object object) {
  /*  Class clazz = object.getClass();
    com.sun.java.util.jar.pack.Package.Class.Field[] fields = clazz.getDeclaredFields();
    for(Field field : fields) {
	
    }*/
    }
}
