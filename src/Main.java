public class Main {
    public static void main(String[] args) {
        Object obj = new Integer(10);

        try{
            String str = (String) obj;
            System.out.println(str);
        }catch(ClassCastException e){
            System.err.println("Um numero inteiro nao pode ser convertido para uma string");
        }
    }
}