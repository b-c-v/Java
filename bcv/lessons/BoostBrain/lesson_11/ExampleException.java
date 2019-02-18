package com.bcv.lessons.BoostBrain.lesson_11;

// Создаем собственное исключение - создаем класс ExampleException и наследуем его от класса Exception
public class ExampleException extends Exception {
    //добавляем собственный текст
    private String myText;
//создаем текст в конструкторе
    public ExampleException(String myText) {
	this.myText = myText;
    }

    public String getMyText() {
	return myText;
    }

}
