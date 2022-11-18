public class Main {
    public static void main(String[] args) {
       var firstBoxer = 78.2;
       var secondBoxer = 82.7;
       var totalWeight = firstBoxer + secondBoxer;
       System.out.println("Общий вес боксёров " + totalWeight + "кг");

       var difference = secondBoxer - firstBoxer;
       System.out.println("Разница в весе боксёров " + difference + "кг");

       var remainderDifference = secondBoxer % firstBoxer;
       System.out.println("Разница в весе боксёров (остаток от деления) " + remainderDifference + "кг");
        

    }
}