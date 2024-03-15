public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, 50, "produto A", 49.99f);
        Produto produto2 = new Produto(2, 26, "produto B", 12.49f);
        Produto produto3 = new Produto ();
        Produto produto4 = new Produto();

        produto3.comprar(20);
        produto3.descricao = "Produto C";
        produto3.preco = 10.59f;

        produto4.comprar(84);
        produto4.descricao = "Produto D";
        produto4.preco = 63.99f;

        produto1.mostrar();
        produto1.comprar(5);
        produto1.subir(2.0f);
        produto1.mostrar();

        produto2.mostrar();
        produto2.vender(15);
        produto2.descer(3.0f);
        produto2.mostrar();

        produto3.mostrar();
        produto3.comprar(5);
        produto3.subir(2.0f);
        produto3.mostrar();

        produto4.mostrar();
        produto4.vender(15);
        produto4.descer(3.0f);
        produto4.mostrar();
    }
}