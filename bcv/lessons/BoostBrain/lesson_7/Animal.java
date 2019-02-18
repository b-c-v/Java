package com.bcv.lessons.BoostBrain.lesson_7;

public class Animal {

    // т.к. класс собаки и кошки являются производными от класса животно создаем переменную имя, которая будет видна в классе кошка и собака
    private String name;

    // 2 внутри класса Animal делаем публичным метод, который устанавливает имя
    public void setName(String newName) {
	name = newName;
    }

    // 2 создаем метод, который возвращает имя
    public String getName() {
	return name;

    }

    // 3 создаем метод с голосом животного
  public String voice() {
	  return "Ku-ku";
   }
}
