package org.example.homework.lesson14.task3;

/*
Task 3(*)
Битва гладиаторов.
Давайте напишем простую консольную игру.
При запуске программа просит пользователя ввести имя - это будет прозвище гладиатора.
Затем программа случайным образом выбирает имя соперника из заранее заданного списка и выводит на экран сообщение,
что сейчас будет битва между [соперник_1] vs [соперник_2]

Далее программа спрашивает готов ли пользователь и после нажатия клавиши enter начинается бой.

Управление

Нападение:
1 - нанести удар в голову
2 - нанести удар в корпус
3 - нанести удар по ногам

Защита:
1 - поставить верхний блок
2 - поставить средний блок
3 - поставить нижний блок

Как проходит битва:
Пользователь выбирает номер удара, а компьютер случайным образом ставит блок, затем компьютер наносит ответный случайный удар,
а пользователь выбирает каким способом его отразить.

Игрок, который пропустил 4 удара проигрывает.

Какие инструменты вам могут пригодиться:
Math.random() - поможет со случайным значением
Класс Scanner

Не пишите весь код в методе main(). Попробуйте выносить функционал в разные классы
 */
//зачем гладиатору быть абстрактным? 
public abstract class Gladiator {
    private static final int HEALTH = 4;
    private final String name;
    private int health;

    public Gladiator(String name) {
        this.name = name;
        this.health = HEALTH;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth() {
        health--;
    }

    public boolean isDead() {
        return health == 0;
    }

    public abstract BodyArea attack();

    public abstract BodyArea defend();

    protected BodyArea getBodyArea(int number) {
        if (number == 1) {
            return BodyArea.HEAD;
        }
        if (number == 2) {
            return BodyArea.BODY;
        }
        if (number == 3) {
            return BodyArea.LEGS;
        }
        return BodyArea.NONE;
    }

    @Override
    public String toString() {
        return "Gladiator{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
