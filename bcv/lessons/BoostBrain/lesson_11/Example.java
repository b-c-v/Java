package com.bcv.lessons.BoostBrain.lesson_11;

public class Example {
    // метод который выбрасывает исключение. 2)дописываем throws Exception т.е. показываем что этот метод может выбросить исключение
    public void method1() throws ExampleException {
	//Бросаем вновь созданный объект исключения. Ключевое слов throw (бросить) объект.
	//throw new Exception();
	throw new ExampleException("Text");
    }
    public void method2() throws NewException{
	throw new NewException();
    }
}
