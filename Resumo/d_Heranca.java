package Resumo;

/**
 * Herança é um mecanismo que permite que uma classe (subclasse)
 * herde atributos e métodos de outra classe (superclasse). Isso promove a
 * reutilização de código e estabelece um relacionamento "é um" entre classes.
 * Com herança, uma subclasse
 * pode:
 * - Utilizar atributos e métodos da superclasse.
 * - Sobrescrever métodos da superclasse para fornecer uma implementação
 * específica.
 * - Adicionar novos atributos e métodos além dos herdados.
 */
public class d_Heranca {

    // Superclasse Veiculo
    // Representa atributos e comportamentos comuns a todos os veículos
    public static class Veiculo {
        private String marca;
        private String modelo;
        private int anoFab;
        private int anoMod;
        private int numOcupantes;

        // Construtor padrão da classe Veiculo
        public Veiculo() {
        }

        // Construtor alternativo da classe Veiculo
        public Veiculo(String marca, String modelo, int anoFab, int anoMod, int numOcupantes) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoFab = anoFab;
            this.anoMod = anoMod;
            this.numOcupantes = numOcupantes;
        }

        // Métodos get e set
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAnoFab() {
            return anoFab;
        }

        public void setAnoFab(int anoFab) {
            this.anoFab = anoFab;
        }

        public int getAnoMod() {
            return anoMod;
        }

        public void setAnoMod(int anoMod) {
            this.anoMod = anoMod;
        }

        public int getNumOcupantes() {
            return numOcupantes;
        }

        public void setNumOcupantes(int numOcupantes) {
            this.numOcupantes = numOcupantes;
        }

        // Métodos comuns a todos os veículos
        void ligar() {
            System.out.println("Veículo ligado");
        }

        void desligar() {
            System.out.println("Veículo desligado");
        }
    }

    // Subclasse Motocicleta
    // Herda atributos e métodos de Veiculo e adiciona comportamentos específicos
    public static class Motocicleta extends Veiculo {
        private int cilindradas;
        private boolean bau;

        // Construtor padrão da classe Motocicleta
        public Motocicleta() {
        }

        // Construtor alternativo da classe Motocicleta
        public Motocicleta(String marca, String modelo, int anoFab, int anoMod, int numOcupantes, int cilindradas,
                boolean bau) {
            super(marca, modelo, anoFab, anoMod, numOcupantes);
            this.cilindradas = cilindradas;
            this.bau = bau;
        }

        // Métodos get e set
        public int getCilindradas() {
            return cilindradas;
        }

        public void setCilindradas(int cilindradas) {
            this.cilindradas = cilindradas;
        }

        public boolean isBau() {
            return bau;
        }

        public void setBau(boolean bau) {
            this.bau = bau;
        }

        // Métodos específicos de Motocicleta
        void acelerar() {
            System.out.println("Motocicleta acelerando");
        }

        void frear() {
            System.out.println("Motocicleta freando");
        }
    }

    // Subclasse Caminhao
    // Herda atributos e métodos de Veiculo e sobrescreve o método ligar()
    public static class Caminhao extends Veiculo {
        private int capacidadeCarga;
        private boolean basculante;

        // Construtor padrão da classe Caminhao
        public Caminhao() {
        }

        // Construtor alternativo da classe Caminhao
        public Caminhao(String marca, String modelo, int anoFab, int anoMod, int numOcupantes, int capacidadeCarga,
                boolean basculante) {
            super(marca, modelo, anoFab, anoMod, numOcupantes);
            this.capacidadeCarga = capacidadeCarga;
            this.basculante = basculante;
        }

        // Métodos get e set
        public int getCapacidadeCarga() {
            return capacidadeCarga;
        }

        public void setCapacidadeCarga(int capacidadeCarga) {
            this.capacidadeCarga = capacidadeCarga;
        }

        public boolean isBasculante() {
            return basculante;
        }

        public void setBasculante(boolean basculante) {
            this.basculante = basculante;
        }

        // Sobrescreve o método ligar para Caminhao
        @Override
        void ligar() {
            System.out.println("Caminhão ligado");
        }

        // Métodos específicos de Caminhao
        void carregar() {
            System.out.println("Caminhão carregando");
        }

        void descarregar() {
            System.out.println("Caminhão descarregando");
        }
    }

    // Classe Veiculo com métodos acelerar e frear para encapsulamento
    public static class VeiculoEncapsulado {
        private int velocidade;

        public int acelerar() {
            velocidade++;
            return velocidade;
        }

        public int frear() {
            velocidade--;
            return velocidade;
        }

        // Método get para velocidade
        public int getVelocidade() {
            return velocidade;
        }
    }

    // Subclasse Terrestre herdando de VeiculoEncapsulado
    public static class Terrestre extends VeiculoEncapsulado {
        private boolean ligado;

        public boolean ligarDesligar() {
            ligado = !ligado;
            return ligado;
        }

        // Método get para ligado
        public boolean isLigado() {
            return ligado;
        }
    }

    // Subclasse Motocicleta herdando de Terrestre
    public static class MotocicletaEncapsulada extends Terrestre {
        private int capacidadeBau;

        // Construtor padrão da classe MotocicletaEncapsulada
        public MotocicletaEncapsulada() {
        }

        // Construtor alternativo da classe MotocicletaEncapsulada
        public MotocicletaEncapsulada(int capacidadeBau) {
            this.capacidadeBau = capacidadeBau;
        }

        // Métodos get e set
        public int getCapacidadeBau() {
            return capacidadeBau;
        }

        public void setCapacidadeBau(int capacidadeBau) {
            this.capacidadeBau = capacidadeBau;
        }

        public int carregarBau(int c) {
            while (c > 0 && capacidadeBau > 0) {
                capacidadeBau--;
                c--;
            }
            return capacidadeBau;
        }
    }

    // Classe principal para demonstrar herança, polimorfismo e encapsulamento
    public static class Principal {
        public static void main(String[] args) {
            // Herança básica
            Motocicleta moto = new Motocicleta("Yamaha", "YZF-R3", 2020, 2020, 2, 321, false);
            moto.ligar();
            moto.acelerar();
            moto.frear();
            moto.desligar();

            // Herança com sobrescrita de métodos e construtor padrão
            Caminhao caminhao = new Caminhao();
            caminhao.setMarca("Volvo");
            caminhao.setModelo("FH16");
            caminhao.setAnoFab(2021);
            caminhao.setAnoMod(2021);
            caminhao.setNumOcupantes(3);
            caminhao.setCapacidadeCarga(20000);
            caminhao.setBasculante(true);
            caminhao.ligar();
            caminhao.carregar();
            caminhao.descarregar();
            caminhao.desligar();

            // Herança com polimorfismo e type-casting
            Veiculo veiculo1 = new Motocicleta();
            veiculo1.setMarca("Honda");
            veiculo1.setModelo("CB500");
            veiculo1.setAnoFab(2019);
            veiculo1.setAnoMod(2019);
            veiculo1.setNumOcupantes(2);
            veiculo1.ligar();
            veiculo1.desligar();

            // Type-casting para acessar métodos específicos de Motocicleta
            Motocicleta moto2 = (Motocicleta) veiculo1;
            moto2.acelerar();
            moto2.frear();

            // Herança e encapsulamento com construtor padrão e métodos set e get
            MotocicletaEncapsulada motoEncapsulada = new MotocicletaEncapsulada();
            motoEncapsulada.setCapacidadeBau(10);
            motoEncapsulada.ligarDesligar();
            motoEncapsulada.acelerar();
            motoEncapsulada.carregarBau(10);
        }
    }
}
