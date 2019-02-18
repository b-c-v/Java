package com.bcv.lessons.BoostBrain.lesson_19;

/*
Reflection
1. Reflection - это механизм манипулирования объектами (объекты java т.е. созданные объекты класса) в обход стандартных механизмов в runtime.
2. С помощью Reflection можно получить полную информацию об устройстве класса объекта (можно получить имя класса, список данных членов класса, списком методов).
3. С помощью Reflection можно узнать информацию хранящуюся в объекте и изменить ее .
4. Reflection позволяет создать новый объект неизвестного на момент компиляции класса.
5. Основными опасностями Reflection являются низкая скорость и грубое нарушение инкапсуляции.
*/
public class ReflectionExample {

    public static void main(String[] args) {
	ReflectionChecker checker = new ReflectionChecker();
	Rabbit rabbit = new Rabbit();
	checker.showClassName(rabbit);
    }

}
