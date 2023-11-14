public class Main {
    //Scrivere una funzione che accetti in input un numeratore e un denominatore
    //Controlli che il numeratore e il denominatore non siano null
    //Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
    public static void main(String[] args) {
        Double numeratore = Double.valueOf("345");
        Double denominatore = null;

        try{
            if(numeratore != null){
                System.out.println("Il tuo numeratore è: " + numeratore);
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("Il tuo numeratore é " + e.getMessage() + "!!!");
        }
        try{
            if(denominatore != null){
                System.out.println("Il tuo denominatore è: " + denominatore);
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("Il tuo denominatore é " + e.getMessage() + "!!!");
        }
    }
}