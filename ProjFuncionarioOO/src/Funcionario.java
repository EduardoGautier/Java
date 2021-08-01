public class Funcionario {
    private String nome;
    private int chapa;
    private long cpf;
    private String rg;
    private String endereco;
    private String fone;
    private String sexo;
    private String email;
    private String cargo;
    private byte quantidadeDeDependentes;
    private byte quantidadeDeFilhos;
    private byte tempoDeServicoAno;
    private double valorHora;
    private double cargaHorariaBase;
    private double quantidadeDeHorasExtras;
    private boolean opcaoVT;
    private double valorPagoEmPassagens;
    private byte grauInsalubridade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public byte getQuantidadeDeDependentes() {
        return quantidadeDeDependentes;
    }

    public void setQuantidadeDeDependentes(byte quantidadeDeDependentes) {
        this.quantidadeDeDependentes = quantidadeDeDependentes;
    }

    public byte getQuantidadeDeFilhos() {
        return quantidadeDeFilhos;
    }

    public void setQuantidadeDeFilhos(byte quantidadeDeFilhos) {
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }

    public byte getTempoDeServicoAno() {
        return tempoDeServicoAno;
    }

    public void setTempoDeServicoAno(byte tempoDeServicoAno) {
        this.tempoDeServicoAno = tempoDeServicoAno;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHorariaBase() {
        return cargaHorariaBase;
    }

    public void setCargaHorariaBase(double cargaHorariaBase) {
        this.cargaHorariaBase = cargaHorariaBase;
    }

    public double getQuantidadeDeHorasExtras() {
        return quantidadeDeHorasExtras;
    }

    public void setQuantidadeDeHorasExtras(double quantidadeDeHorasExtras) {
        this.quantidadeDeHorasExtras = quantidadeDeHorasExtras;
    }

    public double getValorPagoEmPassagens() {
        return valorPagoEmPassagens;
    }

    public void setValorPagoEmPassagens(double valorPagoEmPassagens) {
        this.valorPagoEmPassagens = valorPagoEmPassagens;
    }

    public byte getGrauInsalubridade() {
        return grauInsalubridade;
    }

    public void setGrauInsalubridade(byte grauInsalubridade) {
        this.grauInsalubridade = grauInsalubridade;
    }
    
    public void receberVt(){
        this.opcaoVT = true;
        
    }
    
    public void cancelarVt(){
        this.opcaoVT = false;
    }
    
    public String mostrarLegendaVt(){
        if(this.opcaoVT){
            return "Sim, ganha VT";
        }
        return "Não, não ganha VT";
    }
    
    public double calcularSalarioBruto(){
        return this.valorHora*this.cargaHorariaBase;
    }
    
    public double calcularVt(){
        if(this.opcaoVT){
            if(this.calcularSalarioBruto()* 0.06 > this.valorPagoEmPassagens){
                return this.getValorPagoEmPassagens();
            }
            return this.calcularSalarioBruto() * 0.06;
        }
        return 0;
    }
    
    public double calcularHoraExtra() {
        if (this.quantidadeDeHorasExtras <= 2) {
            return (this.valorHora * this.quantidadeDeHorasExtras) * 1.5;
        }
        return (this.valorHora * this.quantidadeDeHorasExtras) * 2;
    }
    
    public double calcularInss(){
        if(this.calcularSalarioBruto() <= 1659.38){
            return this.calcularSalarioBruto() * 0.08;
        }else if(this.calcularSalarioBruto() <= 2765.66){
            return this.calcularSalarioBruto() * 0.09;
        }else if(this.calcularSalarioBruto() <= 5531.31){
            return this.calcularSalarioBruto() * 0.11; 
        }
        return 610.64;
    }
    
    public double calcularInsalubridade(){
        switch(this.grauInsalubridade){
            case 1:
                return 412.02;
            case 2:
                return 206.01;  
        }
        return 103.0;
    }
    
    public double calcularSalarioFamilia(){
        if(this.quantidadeDeFilhos == 0){
            return 0;
        }else if(this.quantidadeDeFilhos <2){
            return this.calcularSalarioBruto() * 0.02;
        }else if(this.quantidadeDeFilhos <4){
            return this.calcularSalarioBruto() * 0.04;
        }
        return this.calcularSalarioBruto() * 0.05;
        
    }
    
    public double calcularPlanoDeSaude(){
        return this.calcularSalarioBruto() * (0.005 + (0.01 * this.quantidadeDeDependentes));
    }
 
    public double planoDeCarreira() {
        return (this.tempoDeServicoAno / 3) * 0.05 * this.calcularSalarioBruto();
    }
    
    public double calcularSalarioLiquido(){
    return this.calcularSalarioBruto() + this.calcularInsalubridade() + this.calcularSalarioFamilia() + this.planoDeCarreira() + this.calcularHoraExtra() - this.calcularInss() - this.calcularVt() - this.calcularPlanoDeSaude();
    }
    
    @Override
    public String toString(){
        return "\n"
                + "Nome: " + this.getNome() + "\n"
                + "Chapa: " + this.getChapa() + "\n"
                + "CPF: " + this.getCpf() + "\n"
                + "RG: " + this.getRg() + "\n"
                + "Endereço: " + this.getEndereco() + "\n"
                + "Fone: " + this.getFone() + "\n"
                + "Sexo: " + this.getSexo() + "\n"
                + "E-Mail: " + this.getEmail() + "\n"
                + "Cargo: " + this.getCargo() + "\n"
                + "Quantidade de dependentes: " + this.getQuantidadeDeDependentes() + "\n"
                + "Quantidade de filhos: " + this.getQuantidadeDeFilhos() + "\n"
                + "Tempo de serviço: " + this.getTempoDeServicoAno() + "\n"
                + "Valor hora: " + this.getValorHora() + "\n"
                + "Carga horia base: " + this.getCargaHorariaBase() + "\n"
                + "Quantidade de horas extras: " + this.getQuantidadeDeHorasExtras() + "\n"
                + "Opção Vt: " + this.mostrarLegendaVt() + "\n"
                + "Valor pago de passagem: " + this.valorPagoEmPassagens + "\n"
                + "Grau de insalubridade: " + this.grauInsalubridade + "\n"
                + "Salario Bruto: " + this.calcularSalarioBruto() + "\n"
                + "Vale transporte: " + this.calcularVt() + "\n"
                + "Hora extra: " + this.calcularHoraExtra() + "\n"
                + "INSS: " + this.calcularInss() + "\n"
                + "Insalubridade: " + this.calcularInsalubridade() + "\n"
                + "Salario familia: " + this.calcularSalarioFamilia() + "\n"
                + "Plano de saude: " + this.calcularPlanoDeSaude() + "\n"
                + "Plano de carreira: " + this.planoDeCarreira() + "\n"
                + "Salario Liquido: " + this.calcularSalarioLiquido() + "\n";
    }
}
