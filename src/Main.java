import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        dadosPessoas();

    }

    public static void dadosPessoas()  {
        Scanner sc = new Scanner(System.in);
        Cliente cliente;
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        int opcao = 0;
        int opcaoDocumento;
        String CPF;
        String CNPJ;
        String datanasc;
        String logradouro1;
        String estado1;
        String bairro1;
        String cidade1;
        String cep1;
        String testeCartao;
        boolean achou;
        int continuar;

        do {
            System.out.println("## Menu ##");
            System.out.println("Opção 1 - Cadastrar Cliente");
            System.out.println("Opção 2 - Menu Conta");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                //Cria um novo objeto
                cliente = new Cliente();
                Endereco endereco = new Endereco();
                Conta conta = new Conta();

                System.out.print("Digite o nome: ");
                cliente.setNome(sc.nextLine());

                do {
                    System.out.print("Qual o seu documento?" + "\n" + "1-> CPF " + "\n" + "2-> CNPJ" + "\n");
                    opcaoDocumento = Integer.parseInt(sc.nextLine());

                    if (opcaoDocumento == 1) {
                        do {
                            System.out.println("Digite o CPF: ");
                            CPF = sc.nextLine();
                            if (ValidaCPF.isCPF(CPF)) {
                            cliente.setCpf(CPF);
                            } else if (!ValidaCPF.isCPF(CPF)) {
                            System.err.println("CPF Invalido" + "\n");
                            }
                        } while (!ValidaCPF.isCPF(CPF)) ;
                    }
                    else if (opcaoDocumento == 2){
                        do {
                            System.out.println("Digite o CNPJ: ");
                            CNPJ = sc.nextLine();
                            if (ValidaCNPJ.isCNPJ(CNPJ)) {
                                cliente.setCnpj(CNPJ);
                            } else if (!ValidaCNPJ.isCNPJ(CNPJ)) {
                                System.err.println("CNPJ Invalido" + "\n");
                            }
                        } while (!ValidaCNPJ.isCNPJ(CNPJ)) ;
                    }
                    else if(opcaoDocumento != 1 && opcaoDocumento != 2){
                        System.err.println("Opção Invalida" + "\n");
                    }
                }while (opcaoDocumento != 1 && opcaoDocumento != 2);

                do {
                    System.out.print("Digite a data de nascimento (dd/MM/aaaa): ");
                    datanasc = sc.nextLine();
                    if (ValidaData.isData(datanasc)){
                        cliente.setData(datanasc);
                    } else if (!ValidaData.isData(datanasc))
                        System.err.println("Data Invalida" + "\n");

                }while (!ValidaData.isData(datanasc));

                do{
                    System.out.println("Vamos para os dados do endereço!" + "\n" + "Logradouro: ");
                    logradouro1 = sc.nextLine();
                    if (logradouro1.isBlank() || logradouro1.isEmpty()){
                        System.err.println("Logradouro não pode ser vazio!" + "\n");
                    }else {
                        endereco.setLogradouro(logradouro1);
                    }
                }while (logradouro1.isBlank() || logradouro1.isEmpty());


                System.out.println("Numero: ");
                endereco.setNumero(sc.nextLine());

                System.out.println("Complemento: ");
                endereco.setComplemento(sc.nextLine());

                do{
                    System.out.println("Bairro: ");
                    bairro1 = sc.nextLine();
                    if (bairro1.isBlank() || bairro1.isEmpty()){
                        System.err.println("Bairro não pode ser vazio!" + "\n");
                    }else {
                        endereco.setBairro(bairro1);
                    }
                }while (bairro1.isBlank() || bairro1.isEmpty());

                do{
                    System.out.println("Cidade: ");
                    cidade1 = sc.nextLine();
                    if (cidade1.isBlank() || cidade1.isEmpty()){
                        System.err.println("Cidade não pode ser vazia!" + "\n");
                    }else {
                        endereco.setCidade(cidade1);
                    }
                }while (cidade1.isBlank() || cidade1.isEmpty());

                do {
                    System.out.println("Estado (XX): ");
                    estado1 = sc.nextLine();
                    if (ValidaEstado.isEstado(estado1)){
                        endereco.setEstado(estado1);
                    }else if(!ValidaEstado.isEstado(estado1)){
                        System.err.println("Estado Invalido" + "\n");
                    }

                }while (!ValidaEstado.isEstado(estado1));

                do {
                    System.out.println("CEP (apenas números): ");
                    cep1 = sc.nextLine();
                    if (ValidaCep.isCep(cep1)){
                        endereco.setCep(cep1);
                    }else if(!ValidaCep.isCep(cep1)){
                        System.err.println("Cep Invalido" + "\n");
                    }

                }while (!ValidaCep.isCep(cep1));
                cliente.setEndereco(endereco);

                conta.setNumeroCartao();
                System.out.println("Número do Cartão gerado: " + conta.getNumeroCartao());
                System.out.println("Pressione Enter para continuar");
                sc.nextLine();
                cliente.setConta(conta);
                listaClientes.add(cliente);
                System.out.println("Cliente Cadastrado!");
                System.out.println(cliente);

            } else if (opcao == 2) {
                do {
                    System.out.println("Informe o Número do Cartão: ");
                    testeCartao = sc.nextLine();

                    achou = false;
                        for (int i = 0; i < listaClientes.size(); i++) {
                                if (listaClientes.get(i).getConta().getNumeroCartao().contains(testeCartao)) {
                                    listaClientes.get(i).getConta();
                                    System.out.println("Conta Encontrada");
                                    achou = true;
                                } else {
                                    System.out.println("Conta não encontrada!" + "\n");
                                    do {
                                        System.out.println("Deseja tentar novamente?" + "\n" + "(1) para continuar e (2) para voltar ao Menu Inicial");
                                        continuar = Integer.parseInt(sc.nextLine());
                                        if (continuar != 1 && continuar != 2){
                                        System.err.println("Opção inválida");
                                        }else;
                                    }while (continuar != 1 && continuar != 2);
                                }
                    }
                }while (!achou);

                System.out.println("Digite a Senha: ");
                break;
            }
        } while (opcao != 0);

        sc.close();
    }
}