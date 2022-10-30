import java.util.Scanner;

public class ACMEProcessosSeletivos {
    private CatalogoDeProcessos catalogoDeProcessos;
    private Scanner in;

    public ACMEProcessosSeletivos() {
        catalogoDeProcessos = new CatalogoDeProcessos();
        in = new Scanner(System.in);
    }

    public void executa() {
        int escolha;
        do {
            menu();
            escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 1:
                    carregarDadosAbertos();
                    break;
                case 2:
                    classificarDadosPorNome();
                    break;
                case 3:
                    consultarTodosDados();
                    break;
                case 4:
                    consultarDadosNomeIncompleto();
                    break;
                case 5:
                    salvarDadosConsultaEmArquivo();
                    break;
                case 6:
                    break;
            }
        } while (escolha != 6);
    }


    private void menu() {
        System.out.println("=============================");
        System.out.println("Opcoes:");
        System.out.println("[1] Carregar dados abertos");
        System.out.println("[2] Classificar dados por nome");
        System.out.println("[3] Consultar todos os dados");
        System.out.println("[4] Consultar dados de um nome incompleto:");
        System.out.println("[5] Salvar os dados da consulta em arquivo");
        System.out.println("[6] Sair");
        System.out.println("=============================");
        System.out.println("Opcao desejada: ");
    }

    private void carregarDadosAbertos() {
    }

    private void classificarDadosPorNome() {
    }

    private void consultarTodosDados() {
    }

    private void consultarDadosNomeIncompleto() {
    }

    private void salvarDadosConsultaEmArquivo() {
    }
}
