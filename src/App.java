import pt.gov.cartaodecidadao.*;

public class App {

  static {
    try {
      System.loadLibrary("pteidlibj");
      // System.out.println("pteidlibj loaded");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public static void main(String[] args) {
    try {
      PTEID_ReaderSet.initSDK();

      PTEID_EIDCard card;
      PTEID_ReaderContext context;
      PTEID_ReaderSet readerSet;

      readerSet = PTEID_ReaderSet.instance();

      System.out.println(String.format("readerCount %s", readerSet.readerCount()));

      for (int i = 0; i < readerSet.readerCount(); i++) {
        context = readerSet.getReaderByNum(i);
        if (context.isCardPresent()) {
          card = context.getEIDCard();
          System.out.println(card.isActive());

          if (card.isActive()) {
            PTEID_EId eid = card.getID();
            Citizen citizen = new Citizen(eid);
            System.out.println(citizen);
          } else {
            System.err.println("no card found");
          }
        }
      }

      // A finalização do SDK (é obrigatória) deve ser efectuada através da invocação
      // do método PTEID_releaseSDK(), a invocação deste método garante que todos os
      // processos em segundo plano são terminados e que a memória alocada é
      // libertada.
      PTEID_ReaderSet.releaseSDK();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
