import java.util.Scanner;
public class New
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in, "Cp866");
		// Первое задание, вывод косинуса под разными углами
		// Вычисление и вывод косинусов
		double cosShestDes = Math.sqrt(1)/2;
		System.out.println("Косинус угла 60 = " + cosShestDes);
		double cosSorokPyat=Math.sqrt(2)/2;
		System.out.println("Косинус угла 45 = " + cosSorokPyat);
		double cosSorok=Math.sqrt(1-Math.pow(0.643,2));
		System.out.println("Косинус угла 40 = " + cosSorok);
		System.out.print("\n-------------------------------\n");
		
		// Второе задание, вычисление площади и периметра треугольника
		// Ввод первого и второго катета
		System.out.print("Введите длину первого катета a: ");
		double catetFirst = in.nextDouble();
        	System.out.print("Введите длину второго катета b: ");
        	double catetSecond = in.nextDouble(); 
        	// Вычисление гипотенузы, периметра и площади
        	double square = 0.5 * catetFirst * catetSecond;
        	double gipotenuza = Math.sqrt(catetFirst * catetFirst + catetSecond * catetSecond);
        	double perimeter = catetFirst + catetSecond + gipotenuza;
        	// Вывод
        	System.out.println("Площадь треугольника: " + square);
        	System.out.println("Периметр треугольника: " + perimeter);
		System.out.print("\n-------------------------------\n");
		
		// Третье задание, определение количества цифр в чиле
		// Ввод числа
		System.out.print("Введите натуральное положительное число n: ");
		int natChislo = in.nextInt();
		// Преобразование и вычисление длинны
       	 	String slovo = Integer.toString(natChislo);
        	int count = slovo.length();
		// Вывод
        	System.out.println("Количество цифр в числе " + natChislo + " равно " + count); 
		System.out.print("\n-------------------------------\n");
		
		// Четвертое задание, сигнум
		// Ввод числа
		System.out.print("Введите некоторое вещественное число: ");
		double veshChislo = in.nextDouble(); 
		int signum = 0; 
		// Определение нового значения переменной в связи с условием
        	if (veshChislo > 0) 
		{
            	   signum = 1; 
        	} 
		else if (veshChislo < 0) 
		{
             	   signum = -1;
        	}
		// Вывод
       		System.out.println("Значение функции сигнум от числа " + veshChislo + " равно: " + signum); 
	}
}