public class Corrida {
    public static void main( String args[] ){
        Corrida corredor1 = new corredor1();
        Corrida corredor2 = new corredor2();

        corredor1.correr(); 
        corredor2.correr();
        
        protected CorrerStrategy correrStrategy;

        public void setCorrerStrategy(CorrerStrategy correrStrategy) {
            this.correrStrategy = correrStrategy;
        }
    }
}