import java.util.Random;

public class man1 {
    private final Random rnd = new Random();

    // конструктор класса (данная функция вызывается // при создании нового экземпляра класса
    public man1 (String _name) {
        // получаем имя человека из входного параметра // конструктора класса
        Name = _name;
        isLife = true;

        // Генерируем возраст от 15 до 50 лет
        Age = rnd.nextInt(15, 51);
        // и здоровье, от 10% до 100%
        Health = rnd.nextInt(10, 101);
        // МОжет быть int надо перед rnd. ???????????????????
    }

    // закрытые члены, которые нельзя изменить извне класса
    ///////////////////////////////////////////////////////////
    // строка, содержащая имя
    private String Name;
    // беззнаковое целое число, содержащая возраст
    private int Age;
    // беззнаковое целое число, отражающее уровень здоровья
    private int Health;
    // булево, означающее жив ли данный человек
    private boolean isLife;

    // заготовка функции "говорить"
    public void Talk () {
        // генерируем случайное число от 1 до 3
        int random_talk = rnd.nextInt(1, 4);

        // объявляем переменную, в которой мы будем хранить строку
        String tmp_str = "";

        switch (random_talk) {
            case 1: { // если 1 - называем своё имя
                tmp_str = "Привет, меня зовут " + Name + ", рад познакомиться";
                break;
            }

            case 2: { // если 2 - называем свой возраст
                tmp_str = "Мне " + Age + ". А тебе?";
                break;
            }

            case 3: { // если 3 - говорим о своём здоровье
                String Age_if = Integer.toString(Age + 10);
                if (Health > 50)
                    tmp_str = "Да, я здоров как БЫК!";
                else
                    tmp_str = "Со здоровьем у меня хреново, дожить бы до " + Age_if; // ????? как сделать число строкой
                // Завершаем оператор выбора
                break;
            }
        }

        System.out.println(tmp_str);
    }


    public void Go () {
        // если объект жив
        if (isLife) {
            // Если показатель здоровья более 40, считаем, что человек здоров
            if (Health > 40) {
                String outString = Name + " мирно прогуливается по городу";
                // Выводим в консоль
                System.out.println(outString);
            } else {
                String outString2 = Name + " болен и не может гулять по городу";
                // Выводим в консоль
                System.out.println(outString2);
            }
        } else {
            // Генерируем строгу текста
            String outString3 = Name + " не может идти, он умер";
            System.out.println(outString3);
        }
    }

    // функция, возвращающая показатель - жив ли данный человек.
    public boolean isALive() {
        // возращаем значение, к которому мы не можем обратиться напрямую из вне класса, так как оно имеет статус private
        return isLife;
    }

    public void Kill() {
        // Устанавливаем значение isLife (жив) в false
        isLife = false;
    }


}
