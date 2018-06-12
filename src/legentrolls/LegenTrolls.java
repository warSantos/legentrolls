package legentrolls;

import interfaces.gui.InterfaceUI;

public class LegenTrolls {
        private InterfaceUI interfaceUI;
        public static void main(String[] args) {
                 // TODO code application logic here
                InterfaceUI.escreverSaida("Iniciando jogo...");
                Mapa game = new Mapa();
                InterfaceUI interfaceUI = new InterfaceUI(game);
                interfaceUI.iniciarUI();
                game.mensagemInicial();
        }
}
