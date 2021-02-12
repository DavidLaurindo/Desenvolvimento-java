package pacote.objeto;

public class Principal {
    public static void man(String[] args)
    {
        System.out.println("hello world");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
    }
}
