public class Supermercado {
    public static void main(String[] args){
        
        // Produtos
        Produto p1 = new Produto("Arroz", 25.50f, 5);
        ProdutoImportado p2 = new ProdutoImportado("Perfume", 50, 10, 15);
        Perecivel leite = new Perecivel("Leite", 5, 10, "10/05/2026");

        Vendas venda = new Vendas();
        venda.processarItem(p1, 2);
        venda.processarItem(p2, 1);
        venda.processarItem(leite, 3);
    }
}
