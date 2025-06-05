
public class Main {
    public static void main(String[] args) {

        //Task1,2

        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
            else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            }

        if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
           } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }

        //Task3

        short year = 2021;

      if (year % 4 == 0 && year > 1584) {
          System.out.println(year + " является високосным.");
      }
          else if (year % 400 == 0 && year > 1584) {
              System.out.println(year + " является високосным.");
          }
          else if (year % 100 != 0 && year > 1584) {
          System.out.println(year + " не является високосным.");
          }
          else {
          System.out.println("Год не попадает под правила");
      }

        //Task4

        byte deliveryDistance = 95;
          if (deliveryDistance <= 20) {
              System.out.println("Потребуется дней: 1");
          } else if (deliveryDistance > 20 && deliveryDistance < 60) {
              System.out.println("Потребуется дней: 2");
          } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
              System.out.println("Потребуется дней: 3");
           } else {
              System.out.println("Доставки нет.");
          }

        //Task5

        byte monthNumber = 12;
          switch (monthNumber) {
              case 1:
              case 2:
              case 3:
                  System.out.println("зима");
                  break;
              case 4:
              case 5:
              case 6:
                  System.out.println("весна");
                  break;
              case 7:
              case 8:
              case 9:
                  System.out.println("лето");
                  break;
              case 10:
              case 11:
              case 12:
                  System.out.println("осень");
                  break;
              default:
                  System.out.println("Такого месяца не существует.");

          }

    }
}