package compareBS;

import java.util.Comparator;

public class MyStrComparable implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
//       return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));  //Decrease order
//       return (Integer.parseInt(o1)>Integer.parseInt(o2) ? -1 : (o1==o2 ? 0 : 1)); //Increase order

//     return (Integer.valueOf(o1)<Integer.valueOf(o2) ? -1 : (o1==o2 ? 0 : 1)); //Increase order
//	 update  
		int compareNum = o1.compareTo(o2);
		System.out.println("compareNum="+compareNum);
//	   if (o1.compareTo(o2)>0 ){ //original
		if (compareNum ==2|| compareNum<0) {
			//some of them do not match
			System.out.println("compareNum==========================================================" + compareNum);
			return 2;
		} else if (compareNum == 0) {
			//All match
			return 1;
		} else if (compareNum >= 2){
			//>=2 Lots do not match
			return -1;
		}else {
			//Some not match <0   
			return 2;
		}

	}
}