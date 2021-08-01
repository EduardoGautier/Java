import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario objFuncionario1 = new Funcionario();
        byte op;
        
        System.out.println("“::::::::::::::::::::::Cadastro de funcionário:::::::::::::::::::::”");
        System.out.print("Nome: ");
        objFuncionario1.setNome(leia.nextLine());
        System.out.print("Chapa: ");
        objFuncionario1.setChapa(leia.nextInt());
        System.out.print("Cpf: ");
        objFuncionario1.setCpf(leia.nextLong());
        System.out.print("Rg: ");
        objFuncionario1.setRg(leia.nextLine());
        leia.nextLine();
        System.out.print("Endereço: ");
        objFuncionario1.setEndereco(leia.nextLine());
        System.out.print("Telefone: ");
        objFuncionario1.setFone(leia.nextLine());
            do{
                System.out.print("Escolha o sexo conforme abaixo: "+ "\n"
                    +"1 - Masculino"+"\n" 
                    +"2 - Feminino"+"\n"
                    + "Digite a opção: ");
                op = leia.nextByte();
            
                switch(op){
                    case 1:
                        objFuncionario1.setSexo("Masculino");
                        break;
                    case 2:
                        objFuncionario1.setSexo("Feminino");    
                        break;
                    default:
                        System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                }
            }while(op <1 || op >2);
            
        System.out.print("Email: ");
        objFuncionario1.setEmail(leia.nextLine());
        leia.nextLine();
        System.out.print("Cargo: ");
        objFuncionario1.setCargo(leia.nextLine());
        System.out.print("Quantidade de dependentes: ");
        objFuncionario1.setQuantidadeDeDependentes(leia.nextByte());
        System.out.print("Quantidade de filhos: ");
        objFuncionario1.setQuantidadeDeFilhos(leia.nextByte());
        System.out.print("Tempo de serviço ano: ");
        objFuncionario1.setTempoDeServicoAno(leia.nextByte());
        System.out.print("Valor hora: ");
        objFuncionario1.setValorHora(leia.nextDouble());
        System.out.print("Carga horária base: ");
        objFuncionario1.setCargaHorariaBase(leia.nextDouble());
        System.out.print("Quantidade de horas extras: ");
        objFuncionario1.setQuantidadeDeHorasExtras(leia.nextDouble());
            
            do{
                System.out.print("Escolha do Vale Transporte conforme abaixo:"+ "\n"
                    +"1 - Sim, ganha VT"+"\n" 
                    +"2 - Não, não ganha VT"+"\n"
                    + "Digite a opção: ");
                op = leia.nextByte();
            
                switch(op){
                    case 1:
                        System.out.print("Digite o valor das passagens: ");
                        objFuncionario1.setValorPagoEmPassagens(leia.nextDouble());
                        objFuncionario1.receberVt();
                        break;
                    case 2:
                        objFuncionario1.cancelarVt();
                        break;
                    default:
                        System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                }
            }while(op <1 || op >2);
        
            do{
                System.out.print("Escolha o grau de insalubridade conforme abaixo:"+ "\n"
                    +"1 - Máximo 40%"+"\n" 
                    +"2 - Médio 20%"+"\n"
                    +"3 - Mínimo 10%"+"\n"
                    + "Digite a opção: ");
                op = leia.nextByte();
            
                switch(op){
                    case 1:
                        objFuncionario1.setGrauInsalubridade(op);
                        break;
                    case 2:
                        objFuncionario1.setGrauInsalubridade(op);
                        break;
                    case 3:
                        objFuncionario1.setGrauInsalubridade(op);
                        break;
                    default:
                        System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                }
            }while(op <1 || op >3);
            Tela.limparTela();
            
            do{
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                + "::::::::::::::::::::::::::ESCOLHA UMA OPÇÃO::::::::::::::::::::::::::\n"
                + "::::: 1 - Mostrar nome e Salário Bruto                          :::::\n"
                + "::::: 2 - Mostrar nome e Valor de horas extras                  :::::\n"
                + "::::: 3 - Mostrar nome e Valor do VT                            :::::\n"
                + "::::: 4 - Mostrar nome e Valor do INSS                          :::::\n"
                + "::::: 5 - Mostrar nome e Valor da Insalubridade                 :::::\n"
                + "::::: 6 - Mostrar nome e Valor do Salário Família               :::::\n"
                + "::::: 7 - Mostrar nome e Valor do plano de carreira             :::::\n"
                + "::::: 8 - Mostrar nome e Valor total de plano de saúde          :::::\n"
                + "::::: 9 - Mostrar nome e Valor do Salário Líquido               :::::\n"
                + "::::: 10 - Mostrar todos os dados e cálculos de funcionário     :::::\n"
                + "::::: 11 - Cadastrar novo funcionário                           :::::\n"
                + "::::: 0 - Sair do sistema                                       :::::\n"
                + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.print("Digite aqui sua opção: ");
                op = leia.nextByte();
            
                switch (op) {
                    case 1:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularSalarioBruto());
                        break;
                    case 2:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularHoraExtra());
                        break;
                    case 3:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularVt());
                        break;
                    case 4:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularInss());
                        break;
                    case 5:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularInsalubridade());
                        break;
                    case 6: 
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularSalarioFamilia());
                        break;
                    case 7:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.planoDeCarreira());
                        break;
                    case 8:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularPlanoDeSaude());
                        break;
                    case 9:
                        Tela.limparTela();
                        System.out.println(objFuncionario1.getNome() + " " +objFuncionario1.calcularSalarioLiquido());
                        break;
                    case 10:
                        Tela.limparTela();
                        System.out.println(objFuncionario1);
                        break;
                    case 11:
                        Tela.limparTela();
                        Funcionario objFuncionario2 = new Funcionario();
                        System.out.println("“::::::::::::::::::::::Cadastro de funcionário:::::::::::::::::::::”");
                        System.out.print("Nome: ");
                        objFuncionario2.setNome(leia.nextLine());
                        leia.nextLine();
                        System.out.print("Chapa: ");
                        objFuncionario2.setChapa(leia.nextInt());
                        System.out.print("Cpf: ");
                        objFuncionario2.setCpf(leia.nextLong());
                        System.out.print("Rg: ");
                        objFuncionario2.setRg(leia.nextLine());
                        leia.nextLine();
                        System.out.print("Endereço: ");
                        objFuncionario2.setEndereco(leia.nextLine());
                        System.out.print("Telefone: ");
                        objFuncionario2.setFone(leia.nextLine());
                        do{
                            System.out.print("Escolha o sexo conforme abaixo: "+ "\n"
                                +"1 - Masculino"+"\n" 
                                +"2 - Feminino"+"\n"
                                + "Digite a opção: ");
                            op = leia.nextByte();

                            switch(op){
                                case 1:
                                    objFuncionario2.setSexo("Masculino");
                                    break;
                                case 2:
                                    objFuncionario2.setSexo("Feminino");    
                                    break;
                                default:
                                    System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                            }
                        }while(op <1 || op >2);

                        System.out.print("Email: ");
                        objFuncionario2.setEmail(leia.nextLine());
                        leia.nextLine();
                        System.out.print("Cargo: ");
                        objFuncionario2.setCargo(leia.nextLine());
                        System.out.print("Quantidade de dependentes: ");
                        objFuncionario2.setQuantidadeDeDependentes(leia.nextByte());
                        System.out.print("Quantidade de filhos: ");
                        objFuncionario2.setQuantidadeDeFilhos(leia.nextByte());
                        System.out.print("Tempo de serviço ano: ");
                        objFuncionario2.setTempoDeServicoAno(leia.nextByte());
                        System.out.print("Valor hora: ");
                        objFuncionario2.setValorHora(leia.nextDouble());
                        System.out.print("Carga horária base: ");
                        objFuncionario2.setCargaHorariaBase(leia.nextDouble());
                        System.out.print("Quantidade de horas extras: ");
                        objFuncionario2.setQuantidadeDeHorasExtras(leia.nextDouble());

                        do{
                            System.out.print("Escolha do Vale Transporte conforme abaixo:"+ "\n"
                                +"1 - Sim, ganha VT"+"\n" 
                                +"2 - Não, não ganha VT"+"\n"
                                + "Digite a opção: ");
                            op = leia.nextByte();

                            switch(op){
                                case 1:
                                    System.out.print("Digite o valor das passagens: ");
                                    objFuncionario2.setValorPagoEmPassagens(leia.nextDouble());
                                    objFuncionario2.receberVt();
                                    break;
                                case 2:
                                    objFuncionario2.cancelarVt();
                                    break;
                                default:
                                    System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                            }
                        }while(op <1 || op >2);

                        do{
                            System.out.print("Escolha o grau de insalubridade conforme abaixo:"+ "\n"
                                +"1 - Máximo 40%"+"\n" 
                                +"2 - Médio 20%"+"\n"
                                +"3 - Mínimo 10%"+"\n"
                                + "Digite a opção: ");
                            op = leia.nextByte();

                            switch(op){
                                case 1:
                                    objFuncionario2.setGrauInsalubridade(op);
                                    break;
                                case 2:
                                    objFuncionario2.setGrauInsalubridade(op);
                                    break;
                                case 3:
                                    objFuncionario2.setGrauInsalubridade(op);
                                    break;
                                default:
                                    System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                            }
                        }while(op <1 || op >3);
                        Tela.limparTela();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida\nDigite novamente");
                }              
            }while(op !=0 );        
    }
}
