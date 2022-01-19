package introducao.pilha;

public class Fluxo {

    public void pratica() {
        System.out.println("Início 'main'");
        metodo1();
        System.out.println("Fim 'main'");
    }

    private static void metodo1() {
        System.out.println("Início metodo1");
        metodo2();
        System.out.println("Fim metodo1");
    }

    private static void metodo2() {
        System.out.println("Início metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Fim metodo2");
    }
}