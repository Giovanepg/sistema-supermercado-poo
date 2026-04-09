class Vendas {
    
    public void processarItem(Produto p, int quantidade){
        if(quantidade <= 0){
            System.out.println("Erro: quantidade inválida.");
            return;
        }
        
        float total = quantidade * p.getPreco();
        
        System.out.println("... RECIBO ...");
        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço unitário: R$ " + p.getPreco());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + total);
        
        p.vender(quantidade);
    }
}
