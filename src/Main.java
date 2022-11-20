public class Main {
    public static void main(String[] args) {
       var totalHours = 640;
       System.out.println("Общее количество рабочих часов " + totalHours);
       var shift = 8;
       var numberEmployees = totalHours / shift;
       System.out.println("Норматив смены получается " + shift);
       System.out.println("Всего работников в компании – " + numberEmployees + " человек");

       var totalEmployees = numberEmployees + 94;
       var rateShift = totalHours / totalEmployees;
       var workTime = totalEmployees * shift;
       System.out.println("Если в компании работает " + totalEmployees + " человека,то всего " + workTime + " часа работы может быть поделено между сотрудниками");


        

    }
}