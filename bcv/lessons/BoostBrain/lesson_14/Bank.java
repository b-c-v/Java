package com.bcv.lessons.BoostBrain.lesson_14;


import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

/*
//создаем имитацию банка
public class Bank {

    // определяем класс счета внутри класса банка
    //статический вложенный класс упростил представление программы т.е. мы не создавали отдельный класс, а сделали его внутри класса 
    static class Account {

	// заполняем поля: id человека, имя человека, кол-во денег на счету
	// статически вложенный класс позволил нам не создавать новый класс
	private String id;
	private String name;
	private int money;
    }
        //создаем публичный класс с функцией - создание Банка
    public static class Banker{
	public Bank createBank() {
	    //возвращает функция new Bank
	    return new Bank();
	}
    }
    //конструктор класса Банк объявим приватным т.е. не сможем его вызвать в другом классе через new, поэтому мы создаем класс Banker выше
    private Bank() {
	
    }

    // для того чтобы иметь возомжность по идентификатору id доставать счет заводим
    // поле: карта ключем будет строчная переменная т.е. id, а ключем будет счет
    // см. урок 12
    HashMap<String, Account> accounts = new HashMap<String, Account>();

   //создаем 3 метода 1-й который открывает счет с данными: id человека и Имя человека
    public void openAccount(String id, String name) {
	// создаем счет
	Account account = new Account();
	// устанавливаем идентификатор счету
	account.id = id;
	// устанавливаем имя
	account.name = name;
	// кладем счет в список счетов
	accounts.put(id, account);
    }

    // 2-й метод положить деньги: принимает на вход id человека и количество денег
    public void putMoney(String id, int amount) {
	// если мы хотим положить деньги на счет - из списка счетов достаем счет,
	// который соответствует данному id
	Account account = accounts.get(id);
	// проверим если такого счета нет в списке счетов - ничего не делаем
	if (account == null) {
	    return;
	    // если счет есть - мы увеличиваем количество денег на счете
	} else
	    account.money += amount;
    }

    // 3-й изъять деньги со счета человека идентично положить на счет
    public void getMoney(String id, int amount) {
	Account account = accounts.get(id);
	if (account == null) {
	    return;
	} else
	    account.money -= amount;
    }
}*/

/*
//ЧАСТЬ 2. Демонстрируем нестатические вложенные классы

public class Bank {
    // класс сделали не статическим, а публичным
    public class Account {

	private String id;
	private String name;
	private int money;

	// делаем возможность пользователю самостоятельно открывать счет. 1-я операция:
	// с помощью конструктора в который передаем id, имя и начальную сумму денег.
	public Account(String id, String name, int amount) {
	    // this - обозначает ссылку на самого себя
	    this.id = id;
	    this.name = name;
	    this.money = amount;
	}

	// 2-я операция: регистрация счета в банке c помощью функции open
	public void open() {
	    // ссылаемя на accounts которые определены в классе-оболочке в карте HashMap и
	    // кладем в них себя (this)
	    accounts.put(id, this);
	}

	// 3-я операция: закрытия счета с помощью метода close в котором удаляем ссылку на самого себя
	public void close() {
	    accounts.remove(id);
	}
    }

    public static class Banker {
	public Bank createBank() {
	    return new Bank();
	}
    }

    private Bank() {

    }

    HashMap<String, Account> accounts = new HashMap<String, Account>();

    // убрали у банка функцию открытия счета

    public void putMoney(String id, int amount) {
	Account account = accounts.get(id);
	if (account == null) {
	    return;
	} else
	    account.money += amount;
    }

    public void getMoney(String id, int amount) {
	Account account = accounts.get(id);
	if (account == null) {
	    return;
	} else
	    account.money -= amount;
    }
}
*/

//ЧАСТЬ 3. Работа с анонимными классами

public class Bank {
    public class Account {

	private String id;
	private String name;
	private int money;
	// добавляем аккаунту список
	private ArrayList<AccountOperation> operations = new ArrayList<AccountOperation>();

	public Account(String id, String name, int amount) {
	    this.id = id;
	    this.name = name;
	    this.money = amount;
	}

	public void open() {
	    accounts.put(id, this);
	}

	public void close() {
	    accounts.remove(id);
	}
    }

    public static class Banker {
	public Bank createBank() {
	    return new Bank();
	}
    }

    private Bank() {

    }

    HashMap<String, Account> accounts = new HashMap<String, Account>();

    public void putMoney(String id, int amount) {
/*	Account account = accounts.get(id);
	if (account == null) {
	    return;
	}
	// создаем новый анонимный класс, который является наследником интерфейса. В
	// котором определены 2 функции getDate & amount
	AccountOperation operation = new AccountOperation() {
	    public Date getDate() {
		return new Date();
	    }

	    public int amount() {
		return amount;
	    }
	};
	account.operations.add(operation);*/
    }

    public void getMoney(String id, int amount) {
	/*Account account = accounts.get(id);
	if (account == null) {
	    return;
	}
	AccountOperation operation = new AccountOperation() {
	    public Date getDate() {
		return new Date();
	    }

	    public int amount() {
		return -amount;
	    }
	};
	account.operations.add(operation);*/
    }
}