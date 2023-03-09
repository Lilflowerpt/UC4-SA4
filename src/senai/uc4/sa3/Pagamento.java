package senai.uc4.sa3;
import java.util.Scanner;
public class Pagamento {

    private int tipoPagamento;

    public Pagamento() {}

    public void selecionarTipoPagamento(int pag){
        this.setTipoPagamento(pag);
        switch(pag){
            case 1:
            System.out.println("Selecionado: Dinheiro. ");
            break;

            case 2: 
            System.out.println("Selecionado: Cheque. ");
            break;

            case 3:
            System.out.println("Selecionado: Cartão de débito. ");
            break;

            case 4:
            System.out.println("Selecionado: Cartão de crédito. ");
            break;

            case 5:
            System.out.println("Selecionado: Pix. ");
            break;

            default : System.out.println("Nenhum meio de pagamento selecionado!");
            
        }

    }
      
    public void realizarPagamento(Pagamento pagamento){
        System.out.println("Pagamento realizado com a opção " + pagamento.getTipoPagamento());
    }

    // Getters and Setters

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

}
