public class Main {
    //Scrivere una funzione che accetti in input un numeratore e un denominatore
    //Controlli che il numeratore e il denominatore non siano null
    //Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
    public static void main(String[] args) {
        Double numeratore = Double.valueOf("345");
        Double denominatore = 0.0;
        try{
            System.out.println(func(numeratore, denominatore));
        }catch(ArithmeticException e){
            System.out.println("il denominatore è pari a 0");
        }catch(Exception e) {
            System.out.println("Uno dei valori è null ");
        }
        try{
            System.out.println(func(10.0, 12.2));
        }catch(Exception e){
            System.out.println("Il tuo denominatore é " + e.getMessage());
        }
    }
    public static Double func(Double num1, Double num2) throws Exception {
        if (num1 == null || num2 == null) {
            throw new Exception();
        } else if(num2 == 0){
            throw new ArithmeticException();
    }else{
            return num1/num2;
        }
    }
}