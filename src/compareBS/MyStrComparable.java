package compareBS;

import java.util.Comparator;

public class MyStrComparable  implements Comparator<String>{

   @Override
   public int compare(String o1, String o2) {
//       return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));  //Decrease order
//       return (Integer.parseInt(o1)>Integer.parseInt(o2) ? -1 : (o1==o2 ? 0 : 1)); //Increase order
	   
//     return (Integer.valueOf(o1)<Integer.valueOf(o2) ? -1 : (o1==o2 ? 0 : 1)); //Increase order
//	 update  
	   if (o1.compareTo(o2)>0 ){
		   return 1;
	   }else if (o1.compareTo(o2)==0){
		   return 1;
	   }else{
		   return -1;
	   }

   }
}