public class Main {
    public static void main(String[] args) {

//Проверка возраста на совершеннолетие:

        {int age = 17;
            if (age >= 18) {
                System.out.println("Вы совершеннолетний");
            }
            if (age < 18) {
                System.out.println("Вы несовершеннолетний");
            }
        }

//Определение температуры:

        int temperature = -5;

        if (temperature < 0){
            System.out.println("Холодно");
        }else if(temperature >=0 && temperature <= 30){
            System.out.println("Тепло");
        } else if(temperature > 30){
            System.out.println("Жарко");
        }

//Сравнение двух чисел:

        int a = 15;
        int b = 10;

        if (a > b){
            System.out.println("Первое число больше");
        } else if(a < b){
            System.out.println("Второе число больше");
        } else if(a == b){
            System.out.println("Числа равны");
        }

//Определение сезона по месяцу:

        int month = 4;

        if (month == 12 || month == 1 || month == 2){
            System.out.println("Зима");
        } else if(month == 3 || month == 4 || month == 5){
            System.out.println("Весна");
        } else if(month == 6 || month == 7 || month == 8){
            System.out.println("Лето");
        } else if(month == 9 || month == 10 || month == 11){
            System.out.println("Осень");
        }

//Проверка рабочего времени:

        int hour = 14;
        if (hour >=9 && hour <=18){
            System.out.println("Рабочее время");
        } else
            System.out.println("Вне рабочего времени");

//Проверка высокого и низкого балла:

        int score = 75;

        if (score >= 90){
            System.out.println("Высокий балл");
        } else if(score >=50 && score <=89){
            System.out.println("Средний балл");
        } else if(score < 50){
            System.out.println("Низкий балл");
        }

//Определение квадранта в системе координат:

        int x = -3;
        int y = 5;

        if (x > 0 & y > 0){
            System.out.println("Точка в I квадранте");
        } else if(x < 0 & y > 0){
            System.out.println("Точка во II квадранте");
        } else if(x < 0 & y < 0){
            System.out.println("Точка в III квадранте");
        } else if(x > 0 & y < 0) {
            System.out.println("Точка в IV квадранте");
        } else if(x == 0 || y == 0){
            System.out.println("Точка на оси координат");
        }

//Проверка скорости автомобиля:

        int speed = 120;

        if (speed > 100){
            System.out.println("Превышение скорости");
        } else if(speed >=60 && score <=100){
            System.out.println("Нормальная скорость");
        } else if(speed < 60){
            System.out.println("Слишком медленно");
        }

//Проверка билета и возраста для входа на мероприятие:

        int age = 22;
        boolean hasTicket = true;

        if (hasTicket == true && age >=18) {
            System.out.println("Добро пожаловать!");
        }
        if (hasTicket == false && age >=18) {
            System.out.println("Необходимо предъявить билет!");
        }
        if (hasTicket == true && age <18) {
            System.out.println("Вход только для совершеннолетних!");
        }

//Проверка уровня влажности:

        int humidity = 80;

        if (humidity > 70){
            System.out.println("Высокая влажность");
        } else if(humidity >=30 && humidity <=70){
            System.out.println("Средняя влажность");
        } else if(humidity < 30){
            System.out.println("Низкая влажность");
        }

    }
}