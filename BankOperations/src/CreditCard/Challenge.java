package CreditCard;

class Challenge {
	  public static String numberToOrdinal( Integer number ) {
		  
		    if(number == 0)
				  return "0";
			  switch(number % 100) {		  
		  	  case 11:
	          case 12:
			  case 13: return number + "th";
			  default: break;
			  }
			  
			  switch(number % 10) {		  
		  	  case 1: return number + "st";
			  case 2: return number + "nd";
			  case 3: return number + "rd";
			  default: return number + "th";
			  }
	  }
	  
	  public static void main(String[] args) {
		  System.out.print(11%100);
		  
	  }
	  
	}
