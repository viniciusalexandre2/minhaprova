import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        public class Jogador {
            private String nome;
            private int votos;

            public Jogador(String nome) {
                this.nome = nome;
                this.votos = 0;
            }

            public String getNome() {
                return nome;
            }

            public int getVotos() {
                return votos;
            }

            public void incrementaUmVoto() {
                this.votos++;
            }
        }

        public class CasaMaisVigiada {
            public static void main(String[] args) {
                ArrayList<Jogador> jogadores = cadastrarJogadores();

                receberVotos(jogadores);

                apurarEliminado(jogadores);
            }

            private static ArrayList<Jogador> cadastrarJogadores() {
                ArrayList<Jogador> jogadores = new ArrayList<>();
                String[] nomes = {"Alane Dias", "Beatriz Reis",
                        "Davi Brito", "Deniziane Ferreira",
                        "Fernanda Bande", "Giovanna Lima",
                        "Giovanna Pitel", "Isabelle Nogueira",
                        "Juninho", "Leidy Elin",
                        "Lucas Henrique", "Lucas Luigi",
                        "Lucas Pizane", "Marcus Vinicius",
                        "Matteus Amaral", "Maycon Cosmer",
                        "MC Bin Laden", "Michel Nogueira",
                        "Nizam", "Raquele Cardozo",
                        "Rodriguinho", "Thalyta Alves",
                        "Vanessa Lopes", "Vinicius Rodrigues",
                        "Wanessa Camargo", "Yasmin Brunet"};

                for (String nome : nomes) {
                    jogadores.add(new Jogador(nome));
                }

                return jogadores;
            }

            private static void receberVotos(ArrayList<Jogador> jogadores) {
                String votoEm;
                while (true) {
                    votoEm = JOptionPane.showInputDialog("Em quem você vota para sair da casa?");
                    if (votoEm.equalsIgnoreCase("sair")) {
                        break;
                    }
                    for (Jogador jogador : jogadores) {
                        if (jogador.getNome().equalsIgnoreCase(votoEm)) {
                            jogador.incrementaUmVoto();
                            break;
                        }
                    }
                }
            }

            private static void apurarEliminado(ArrayList<Jogador> jogadores) {
                Jogador eliminado = jogadores.get(0);
                for (Jogador jogador : jogadores) {
                    if (jogador.getVotos() > eliminado.getVotos(){

                    }
                }
            }
        }
    }