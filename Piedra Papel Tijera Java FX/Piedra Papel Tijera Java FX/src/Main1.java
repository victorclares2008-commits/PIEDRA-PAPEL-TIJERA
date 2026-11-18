import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        private void jugar(String opcionJugador) {
            int num = random.nextInt(3); // opción aleatoria de la CPU
            String cpu;

            if (num == 0) {
                cpu = "Piedra";
            } else if (num == 1) {
                cpu = "Papel";
            } else {
                cpu = "Tijera";
            }
            String resultado;
            if (opcionJugador.equals(cpu)) {
                resultado = "Empate";
            } else if (opcionJugador.equals("Piedra") && cpu.equals("Tijera")) {
                resultado = "Ganaste";
            } else if (opcionJugador.equals("Papel") && cpu.equals("Piedra")) {
                resultado = "Ganaste";
            } else if (opcionJugador.equals("Tijera") && cpu.equals("Papel")) {
                resultado = "Ganaste";
            } else {
                resultado = "Perdiste";
            }
            lblResultado.setText("Tú: " + opcionJugador + " | CPU: " + cpu + " → " + resultado);
        }
        public static void main(String[] args) {
            launch();
        }
    }
}
}