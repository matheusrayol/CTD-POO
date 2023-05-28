package models;

public class Feliz implements Estado {

        private Tamagochi t;

        public Feliz(Tamagochi t) {
            this.t = t;
            System.out.println("Buxim xei");
        }

        @Override
        public void comer() {

        }

        @Override
        public void beber() {
            System.out.println("Beep beep beep beep beep!");
        }

        @Override
        public void carinho() {

        }
}