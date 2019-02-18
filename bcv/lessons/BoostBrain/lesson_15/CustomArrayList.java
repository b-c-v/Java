package com.bcv.lessons.BoostBrain.lesson_15;

public class CustomArrayList<T> {
    //создаем массив Object
    private Object[] data = new Object[0];
    //объявляем длину ArrayList
    private int length = 0;
    //метод добавляет элемент в ArrayList
    public void add(T element) {
	//если текущая длина списка равна длине массива
	if (length == data.length) {
	    //создаем массив длина которого в 2 раза больше плюс 1 элемент. 
	    Object[] newData = new Object[data.length * 2 + 1];
	    //копируем все элементы во вновь созданый массив
	    for (int i = 0; i < data.length; i++) {
		newData[i] = data[i];
	    }
	    //в массив для хранения данных копируется созданные выше массив
	    data = newData;
	}
	//в индекс соответствующей длины копируется элемент
	data[length] = element;
	//длина увеличивается на единицу
	length++;
    }
    //позволяет по индексу получить значение
    public T get(int index) {
	//если индекс больше длины массива или индекс меньше 0 - бросаем исключение
	if (index >= length || index < 0) {
	    throw new ArrayIndexOutOfBoundsException(index);
	}
	//иначе возвращаем элемент хранаящийся в нашем массиве
	return (T) data[index];
    }
    //получить длину
    public int getLength() {
	return length;
    }
    //очищаем список в методе clear
    public void clear() {
	data = new Object[0];
	length = 0;
    }
}
