/*Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.*/

package java_task_three;
import java.util.Scanner;
import java.util.ArrayList;


public class Task_three {
    static String first_value;
    static String sec_value;
    static String summ;
    static String end;
    static ArrayList<Integer> comb_first;
    static ArrayList<Integer> comb_sec;
    static ArrayList<Integer> comb_summ;
    static Integer sum_two;
    static boolean found;
    //Метод ввода данных
    public static void main(String[] args) {
    System.out.println("Необходимо ввести первое, второе слагаемые и сумму (пример - 2?5, 5?4)");
    Scanner in = new Scanner(System.in);
    System.out.println("Первое слагаемое: ");
    first_value = in.nextLine();
    System.out.println("Второе слагаемое: ");
    sec_value = in.nextLine();
    System.out.println("Введите вероятную сумму: ");
    summ = in.nextLine();
    in.close();
    first_value_combination(first_value);
    sec_value_combination(sec_value);
    summ_value_combination(summ);
    answer(end);
}

//Разложение строки первого слова на элементы, проверка и нахождение возможных комбинаций. 
static void first_value_combination(String first_value) {
    comb_first = new ArrayList<Integer>();//создание коллекции с комбинациями
    Integer z = 0;
    char[] chArray_first = first_value.toCharArray();//преобразование строки в массив символов char
    for(int i = 0; i<chArray_first.length; i++){ 
	if(chArray_first[i] == '?'){
        for(z = 0; z < 10; z++){
        char m = Character.forDigit(z, 10);//преобразование счетчика в тип char
		chArray_first[i] = m;//замена знака вопроса на символ счетчика
        int a = Integer.parseInt(String.valueOf(chArray_first));//преобразуем в тип int получившиеся числа
        comb_first.add(a);//заполняем коллекцию
       }	
    }   
}
}
static void sec_value_combination(String sec_value) {
    comb_sec = new ArrayList<Integer>();//создание коллекции с комбинациями
    Integer z = 0;
    char[] chArray_sec = sec_value.toCharArray();//преобразование строки в массив символов char
    for(int i = 0; i<chArray_sec.length; i++){ 
	if(chArray_sec[i] == '?'){
       for(z = 0; z < 10; z++){
        char m = Character.forDigit(z, 10);//преобразование счетчика в тип char
		chArray_sec[i] = m;//замена знака вопроса на символ счетчика
        int a = Integer.parseInt(String.valueOf(chArray_sec));//преобразуем в тип int получившиеся числа
        comb_sec.add(a);//заполняем коллекцию
       }	
    }   
}

}

static void summ_value_combination(String summ_value) {
    comb_summ = new ArrayList<Integer>();//создание коллекции с комбинациями
    Integer z = 0;
    char[] chArray_summ = summ.toCharArray();//преобразование строки в массив символов char
    for(int i = 0; i<chArray_summ.length; i++){ 
	if(chArray_summ[i] == '?'){
       for(z = 0; z < 10; z++){
        char m = Character.forDigit(z, 10);//преобразование счетчика в тип char
		chArray_summ[i] = m;//замена знака вопроса на символ счетчика
        int a = Integer.parseInt(String.valueOf(chArray_summ));//преобразуем в тип int получившиеся числа
        comb_summ.add(a);//заполняем коллекцию
    }   
}	
}
}
static void answer(String end){
int sum_two;
int val_one;
int val_two;
for (int i = 0; i < comb_first.size(); i++) {
    val_one = comb_first.get(i);
    for (int j = 0; j < comb_sec.size() - 1; j++) {
    val_two = comb_sec.get(j);
    sum_two = val_one + val_two;
    for(int x = 0; x < comb_summ.size() - 1; x++){
    if(sum_two == comb_summ.get(x)){
    System.out.println("Первое значение = " + val_one + " Второе значение = " + val_two + " = " + sum_two);
    }
}
}
}
}
}







