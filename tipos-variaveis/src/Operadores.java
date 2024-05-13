public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "maria " + "clara";
        String concatenacao;
        concatenacao = 1+1+"1"+1+1;
        // saida > 2111
        concatenacao = 1+"1"+1+1;
        // saida > 1111
        concatenacao = "1"+(1+1+1);
        // saida > 13

        int a, b;
        a = 5;
        b = 6;
       
        String resultado = a == b ? "eh igual" : "nao eh igual";
        System.out.println(resultado);
        
        String um, dois;
        um = "oi";
        dois = "oi";
        System.out.println(um.equals(dois));
    }
}
