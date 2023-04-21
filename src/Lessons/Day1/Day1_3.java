
/**
 * Практическое занятие
 *  5 модуль: строки в Джава.
 *  Создайте новый проект:
 *  Задайте в настройках проекта три числовых входных аргумента;
 *  Распечатайте их;
 *  Выполните преобразование аргументов в числа и сложите их.
 *  Распечатайте результат.
 */
package Lessons.Day1;
public class Day1_3 {

// Чтобы на вход подать аргументы необходимо выбрать правой кнопкой мыши
//   modify run configuration
    public static void main(String[] args) {
        int sum = 0;
        for (String s:args){
            System.out.println(s);
            sum = sum + Integer.parseInt(s);
        }
        System.out.println(sum);
    } 
}
