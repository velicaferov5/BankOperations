package CreditCard;

class CreditCard {
    public static String maskify(String creditCardNumber) {
        // Add code here
      switch(creditCardNumber.length()){
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5: return creditCardNumber;          
      }
      
      char[] cardChArray = creditCardNumber.toCharArray();
      for(int index1=1;index1<cardChArray.length-4;index1++)
      {
    	  if(Character.isDigit(cardChArray[index1])) {
    		  cardChArray[index1] = '#';
    	  }
      }
      
      String maskifedCardNumber = new String(cardChArray);      
      return maskifedCardNumber;
    }
}