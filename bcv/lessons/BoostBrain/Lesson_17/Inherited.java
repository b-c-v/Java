package com.bcv.lessons.BoostBrain.Lesson_17;

//делаем аннотацию можно писать all, unused, uncheked
@SuppressWarnings("unused")
public class Inherited extends Parent {
    //чтобы в процессе изменения кода не удалить нужные методы
    @Override
    public void method() {
	this.method1();

    }
    //объявляем метод устаревшим. Показывает, что его не стоит использовать
    @Deprecated
    public void method1() {
	
    }
}
