import pt.gov.cartaodecidadao.Callback;

class CardEventsCallback implements Callback {
   @Override
   public void getEvent(long lRet, long ulState, Object callbackData) {
      int cardState = (int) ulState & 0x0000FFFF;
      int eventCounter = ((int) ulState) >> 16;

      System.err.println("DEBUG: Card Event:" + " cardState: " + cardState + " Event Counter: " + eventCounter);
      if ((cardState & 0x0100) != 0) {
         System.out.println("Card inserted");
      } else {
         System.out.println("Card removed");
      }
   }
}