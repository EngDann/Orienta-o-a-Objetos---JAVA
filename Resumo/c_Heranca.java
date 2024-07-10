package Resumo;

// Classe principal para demonstrações de Herança e Polimorfismo
public class c_Heranca {

    // Superclasse Veiculo
    // Representa atributos e comportamentos comuns a todos os veículos
    public static class Veiculo {
        String marca;
        String modelo;
        int anoFab;
        int anoMod;
        int numOcupantes;

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
        int cilindradas;
        boolean bau;

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
        int capacidadeCarga;
        boolean basculante;

        @Override
        void ligar() {
            System.out.println("Caminhão ligado");
        }

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
    }

    // Subclasse Terrestre herdando de VeiculoEncapsulado
    public static class Terrestre extends VeiculoEncapsulado {
        private boolean ligado;

        public boolean ligarDesligar() {
            ligado = !ligado;
            return ligado;
        }
    }

    // Subclasse Motocicleta herdando de Terrestre
    public static class MotocicletaEncapsulada extends Terrestre {
        private int capacidadeBau;

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
            Motocicleta moto = new Motocicleta();
            moto.marca = "Yamaha";
            moto.modelo = "YZF-R3";
            moto.anoFab = 2020;
            moto.anoMod = 2020;
            moto.numOcupantes = 2;
            moto.cilindradas = 321;
            moto.bau = false;

            moto.ligar();
            moto.acelerar();
            moto.frear();
            moto.desligar();

            // Herança com sobrescrita de métodos
            Caminhao caminhao = new Caminhao();
            caminhao.marca = "Volvo";
            caminhao.modelo = "FH16";
            caminhao.anoFab = 2021;
            caminhao.anoMod = 2021;
            caminhao.numOcupantes = 3;
            caminhao.capacidadeCarga = 20000;
            caminhao.basculante = true;

            caminhao.ligar();
            caminhao.carregar();
            caminhao.descarregar();
            caminhao.desligar();

            // Herança com polimorfismo e type-casting
            Veiculo veiculo1 = new Motocicleta();
            veiculo1.marca = "Honda";
            veiculo1.modelo = "CB500";
            veiculo1.anoFab = 2019;
            veiculo1.anoMod = 2019;
            veiculo1.numOcupantes = 2;

            veiculo1.ligar();
            veiculo1.desligar();

            // Type-casting para acessar métodos específicos de Motocicleta
            Motocicleta moto2 = (Motocicleta) veiculo1;
            moto2.acelerar();
            moto2.frear();

            // Herança e encapsulamento
            MotocicletaEncapsulada motoEncapsulada = new MotocicletaEncapsulada();
            motoEncapsulada.ligarDesligar();
            motoEncapsulada.acelerar();
            motoEncapsulada.carregarBau(10);
        }
    }
}
