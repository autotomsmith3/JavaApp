package CA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Controller_Chrysler_CA {
static String dw;
static String dc;
static String scratchSave;
static String previousState;
static String Acode;
static String wsName;
static String tc; 
static String tcSpiraId;
static String pXMLURL;

public static void getoverview(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2) {
//1. getoverview	 		 
wsName="getoverview";
 LoadWebServiceChryslerCA getoverview = new LoadWebServiceChryslerCA();
 getoverview.SetFolderName(dwc);
 getoverview.dataDir=getoverview.GetFolderName();
 getoverview.SetFolderName(env1);
 getoverview.firstEnvName=getoverview.GetFolderName();
 getoverview.SetFolderName(env2);
 getoverview.secondEnvName=getoverview.GetFolderName();
tc="1_1";
tcSpiraId="TC104582";
pXMLURL="getoverview.xml?language=EN&modelYear=2016&divCode=RM&postalCode=M1N3W3&ipAddress=&daysToLive=&transactionId=";
System.out.println(tcSpiraId+" Please Wait...getoverview");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoverview.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoverview.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoverview.compare(wsName,true);

	tc="2";
	tcSpiraId="TC104583";
pXMLURL="getoverview.xml?language=FR&modelYear=2015&divCode=CD&postalCode=M1N3W3&ipAddress=&daysToLive=&transactionId=7";
System.out.println(tcSpiraId+" Please Wait...getoverview");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoverview.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoverview.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoverview.compare(wsName,true);		

	tc="3";
	tcSpiraId="TC104584";
pXMLURL="getoverview.xml?language=EN&modelYear=2015&divCode=RM&postalCode=&ipAddress=216.108.101.0&daysToLive=5&transactionId=";
System.out.println(tcSpiraId+" Please Wait...getoverview");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoverview.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoverview.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoverview.compare(wsName,true);		

	tc="4";
	tcSpiraId="TC104585";
pXMLURL="getoverview.xml?language=FR&modelYear=2016&divCode=RM&postalCode=&ipAddress=216.108.101.0&daysToLive=5&transactionId=";
System.out.println(tcSpiraId+" Please Wait...getoverview");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoverview.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoverview.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoverview.compare(wsName,true);		

	tc="5";
	tcSpiraId="TC104586";
pXMLURL="getoverview.xml?language=EN&modelYear=2016&divCode=FI&postalCode=L4T2G2&ipAddress=&daysToLive=&transactionId=";
System.out.println(tcSpiraId+" Please Wait...getoverview");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoverview.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoverview.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoverview.compare(wsName,true);		

	tc="6";
	tcSpiraId="TC104587";
pXMLURL="getoverview.xml?language=FR&modelYear=2016&divCode=FI&postalCode=L4T2G2&ipAddress=&daysToLive=-1&transactionId=";
System.out.println(tcSpiraId+" Please Wait...getoverview");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoverview.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoverview.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoverview.compare(wsName,true);		
}
public static void getstandardvocabcontent(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//2. getstandardvocabcontent	
	 wsName="getstandardvocabcontent";
	 LoadWebServiceChryslerCA getstandardvocabcontent = new LoadWebServiceChryslerCA();
	 getstandardvocabcontent.SetFolderName(dwc);
	 getstandardvocabcontent.dataDir=getstandardvocabcontent.GetFolderName();
	 getstandardvocabcontent.SetFolderName(env1);
	 getstandardvocabcontent.firstEnvName=getstandardvocabcontent.GetFolderName();
	 getstandardvocabcontent.SetFolderName(env2);
	 getstandardvocabcontent.secondEnvName=getstandardvocabcontent.GetFolderName();
	 tc="2_1";
	 tcSpiraId="TC104589";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC60FIC011D0&vocabCode=SS&language=EN";
	System.out.println(tcSpiraId+" Please Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);
	 tc="2";
	 tcSpiraId="TC104590";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC60JES051E0&vocabCode=WS&language=EN";
	System.out.println(tcSpiraId+" Please Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);	
	tc="3";
	tcSpiraId="TC104591";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC50CRC212B0&vocabCode=SP&language=EN";
	System.out.println(tcSpiraId+" Please Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);
	tc="4";
	tcSpiraId="TC104592";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC60CRC131A0&vocabCode=Q6&language=EN";
	System.out.println(tcSpiraId+" Pleas Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);
	tc="5";
	tcSpiraId="TC104593";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC60FIC011D0&vocabCode=SS&language=FR";
	System.out.println(tcSpiraId+" Pleas Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);
	 
	tc="6";
	tcSpiraId="TC104594";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC60JES051E0&vocabCode=WS&language=FR";
	System.out.println(tcSpiraId+" Pleas Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);	
	tc="7";
	tcSpiraId="TC104595";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC50CRC212B0&vocabCode=SP&language=FR";
	System.out.println(tcSpiraId+" Pleas Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);
	tc="8";
	tcSpiraId="TC104596";
	pXMLURL="getstandardvocabcontent.xml?acode=CAC60CRC131A0&vocabCode=Q6&language=FR";
	System.out.println(tcSpiraId+" Pleas Wait...getstandardvocabcontent");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getstandardvocabcontent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getstandardvocabcontent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getstandardvocabcontent.compare(wsName,true);

}


public static void getcommoncompetitors(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	3. getcommoncompetitors	 
		wsName="getcommoncompetitors";
		 LoadWebServiceChryslerCA getcommoncompetitors = new LoadWebServiceChryslerCA();
		 getcommoncompetitors.SetFolderName(dwc);
		 getcommoncompetitors.dataDir=getcommoncompetitors.GetFolderName();
		 getcommoncompetitors.SetFolderName(env1);
		 getcommoncompetitors.firstEnvName=getcommoncompetitors.GetFolderName();
		 getcommoncompetitors.SetFolderName(env2);
		 getcommoncompetitors.secondEnvName=getcommoncompetitors.GetFolderName();
		tc="3_1";
		tcSpiraId="TC104598";
		pXMLURL="getcommoncompetitors.xml?language=EN&modelYearId=15061&competitorSetId=9&baseAcode=CAC40RMT133D0";
		System.out.println(tcSpiraId+" Please Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);	
	
		tc="2";
		tcSpiraId="TC104599";
		pXMLURL="getcommoncompetitors.xml?language=EN&modelYearId=14531&competitorSetId=9&baseAcode=CAC40JES141A3";
		System.out.println(tcSpiraId+" Please Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);	
		tc="3";	
		tcSpiraId="TC104600";
		pXMLURL="getcommoncompetitors.xml?language=FR&modelYearId=15061&competitorSetId=9&baseAcode=CAC40RMT133D0";
		System.out.println(tcSpiraId+" Please Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);	
	
		tc="4";
		tcSpiraId="TC104601";
		pXMLURL="getcommoncompetitors.xml?language=FR&modelYearId=14531&competitorSetId=9&baseAcode=CAC40JES141A3";
		System.out.println(tcSpiraId+" Pleas Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);	
		
		tc="5";
		tcSpiraId="TC104602";
		pXMLURL="getcommoncompetitors.xml?language=EN&modelYearId=16098&competitorSetId=9&baseAcode=CAC50RMT133D0";
		System.out.println(tcSpiraId+" Please Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);	
	
		tc="6";
		tcSpiraId="TC104603";
		pXMLURL="getcommoncompetitors.xml?language=EN&modelYearId=15935&competitorSetId=9&baseAcode=CAC50JES141A3";
		System.out.println(tcSpiraId+" Please Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);	
		tc="7";
		tcSpiraId="TC133857";
		pXMLURL="getcommoncompetitors.xml?language=FR&modelYearId=16098&competitorSetId=9&baseAcode=CAC50RMT133D0";
		System.out.println(tcSpiraId+" Please Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);	
	
		tc="8";
		tcSpiraId="TC133858";
		pXMLURL="getcommoncompetitors.xml?language=FR&modelYearId=15935&competitorSetId=9&baseAcode=CAC50JES141A3";
		System.out.println(tcSpiraId+" Pleas Wait...getcommoncompetitors");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getcommoncompetitors.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getcommoncompetitors.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getcommoncompetitors.compare(wsName,true);		

}

public static void getchryslercolorizedmedia(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	4. getchryslercolorizedmedia	 
 	wsName="getchryslercolorizedmedia";
	LoadWebServiceChryslerCA getchryslercolorizedmedia = new LoadWebServiceChryslerCA();
	getchryslercolorizedmedia.SetFolderName(dwc);
	getchryslercolorizedmedia.dataDir=getchryslercolorizedmedia.GetFolderName();
	 getchryslercolorizedmedia.SetFolderName(env1);
	 getchryslercolorizedmedia.firstEnvName=getchryslercolorizedmedia.GetFolderName();
	 getchryslercolorizedmedia.SetFolderName(env2);
	 getchryslercolorizedmedia.secondEnvName=getchryslercolorizedmedia.GetFolderName();
	tc="4_1";
	tcSpiraId="TC104607";
	pXMLURL="getchryslercolorizedmedia.xml?language=EN&baseAcode=CAC50CRC212A0&type=E";
	System.out.println(tcSpiraId+" Please Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);		
	tc="2";
	tcSpiraId="TC104608";
	pXMLURL="getchryslercolorizedmedia.xml?language=EN&baseAcode=CAC50FIC011C0&type=I";
	System.out.println(tcSpiraId+" Please Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);	
	tc="3";
	tcSpiraId="TC104609";
	pXMLURL="getchryslercolorizedmedia.xml?language=EN&baseAcode=CAC60JES161B0&type=";
	System.out.println(tcSpiraId+" Please Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);	
	tc="4";
	tcSpiraId="TC104610";
	pXMLURL="getchryslercolorizedmedia.xml?language=FR&baseAcode=CAC50CRC212A0&type=E";
	System.out.println(tcSpiraId+" Pleas Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);		
	tc="5";
	tcSpiraId="TC104611";
	pXMLURL="getchryslercolorizedmedia.xml?language=FR&baseAcode=CAC50FIC011C0&type=I";
	System.out.println(tcSpiraId+" Pleas Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);	
	tc="6";
	tcSpiraId="TC104612";
	pXMLURL="getchryslercolorizedmedia.xml?language=FR&baseAcode=CAC40JES161B0&type=";
	System.out.println(tcSpiraId+" Pleas Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);	
	tc="7";
	tcSpiraId="TC104613";
	pXMLURL="getchryslercolorizedmedia.xml?language=EN&baseAcode=CAC20DOS011A0&type=F";
	System.out.println(tcSpiraId+" Pleas Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);	
	tc="8";
	tcSpiraId="TC104614";
	pXMLURL="getchryslercolorizedmedia.xml?language=FR&baseAcode=CAC20DOS011A0&type=S";
	System.out.println(tcSpiraId+" Pleas Wait...getchryslercolorizedmedia");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getchryslercolorizedmedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getchryslercolorizedmedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getchryslercolorizedmedia.compare(wsName,true);	

}
public static void getColorizedMedia(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){//	5. getColorizedMedia	
	//5. getColorizedMedia	 
			boolean comp;
			String hd="<ROW ";
			String tl="/>";
			wsName="getColorizedMedia";	
			 LoadWebServiceChryslerCA getColorizedMedia = new LoadWebServiceChryslerCA();
			 getColorizedMedia.SetFolderName(dc);
			 getColorizedMedia.dataDir=getColorizedMedia.GetFolderName();
			 getColorizedMedia.SetFolderName(env1);
			 getColorizedMedia.firstEnvName=getColorizedMedia.GetFolderName();
			 getColorizedMedia.SetFolderName(env2);
			 getColorizedMedia.secondEnvName=getColorizedMedia.GetFolderName();
			tc="5_1";
			tcSpiraId="TC104745";
			pXMLURL="getcolorizedmedia.xml?language=EN&modelYearId=16165&baseAcode=CAC50RMT111A0&type=&revisionDate=2016-01-01%201:01:01";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			tc="2";
			tcSpiraId="TC104746";
			pXMLURL="getcolorizedmedia.xml?language=EN&modelYearId=16853&baseAcode=CAC60DOS041B1&type=&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			
			tc="3";
			tcSpiraId="TC104747";
			pXMLURL="getcolorizedmedia.xml?language=EN&modelYearId=16997&baseAcode=CAC60JES161A1&type=I&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}					
			tc="4";
			tcSpiraId="TC104748";
			pXMLURL="getcolorizedmedia.xml?language=EN&modelYearId=&baseAcode=CAC50DOC301C2&type=E&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}					
			tc="5";
			tcSpiraId="TC104749";
			pXMLURL="getcolorizedmedia.xml?language=EN&modelYearId=&baseAcode=CAC60FIC011E1&type=&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}					
			tc="6";
			tcSpiraId="TC104750";
			pXMLURL="getcolorizedmedia.xml?language=FR&modelYearId=16165&baseAcode=CAC50RMT111A0&type=&revisionDate=2016-01-01%201:01:01";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			tc="7";
			tcSpiraId="TC104751";
			pXMLURL="getcolorizedmedia.xml?language=FR&modelYearId=16853&baseAcode=CAC60DOS041B1&type=&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}					
			tc="8";
			tcSpiraId="TC104752";
			pXMLURL="getcolorizedmedia.xml?language=FR&modelYearId=16997&baseAcode=CAC60JES161A1&type=I&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}					
			tc="9";
			tcSpiraId="TC104753";
			pXMLURL="getcolorizedmedia.xml?language=FR&modelYearId=&baseAcode=CAC50DOC301C0&type=E&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}					
			tc="10";
			tcSpiraId="TC104754";
			pXMLURL="getcolorizedmedia.xml?language=FR&modelYearId=&baseAcode=CAC60FIC011E1&type=&revisionDate=";
			System.out.println(tcSpiraId+" Please Wait...getColorizedMedia");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getColorizedMedia.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getColorizedMedia.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			comp=getColorizedMedia.compare(wsName,true);	
			if (!comp){
				try {
					getColorizedMedia.compareSorted(wsName, true, hd, tl);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}					
}
public static void getoptionfeaturebenefits(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	6. getoptionfeaturebenefits	 
wsName="getoptionfeaturebenefits"; 			
LoadWebServiceChryslerCA getoptionfeaturebenefits = new LoadWebServiceChryslerCA();
getoptionfeaturebenefits.SetFolderName(dwc);
getoptionfeaturebenefits.dataDir=getoptionfeaturebenefits.GetFolderName();
getoptionfeaturebenefits.SetFolderName(env1);
getoptionfeaturebenefits.firstEnvName=getoptionfeaturebenefits.GetFolderName();
getoptionfeaturebenefits.SetFolderName(env2);
getoptionfeaturebenefits.secondEnvName=getoptionfeaturebenefits.GetFolderName();
tc="6_1";	
tcSpiraId="TC104616";
pXMLURL="getoptionfeaturebenefits.xml?acode=CAC40CRC212A0&optionCode=AWS&dataFilterID=15&language=EN";
System.out.println(tcSpiraId+" Please Wait...getoptionfeaturebenefits");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoptionfeaturebenefits.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoptionfeaturebenefits.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoptionfeaturebenefits.compare(wsName,true);				
tc="2";
tcSpiraId="TC104617";
pXMLURL="getoptionfeaturebenefits.xml?acode=CAC50DOV171A2&optionCode=RBZ&dataFilterID=15&language=EN";
System.out.println(tcSpiraId+" Please Wait...getoptionfeaturebenefits");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoptionfeaturebenefits.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoptionfeaturebenefits.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoptionfeaturebenefits.compare(wsName,true);				
tc="3";	
tcSpiraId="TC104618";
pXMLURL="getoptionfeaturebenefits.xml?acode=CAC40CRC212A0&optionCode=AWS&dataFilterID=15&language=FR";
System.out.println(tcSpiraId+" Please Wait...getoptionfeaturebenefits");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoptionfeaturebenefits.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoptionfeaturebenefits.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoptionfeaturebenefits.compare(wsName,true);				
tc="4";
tcSpiraId="TC104619";
pXMLURL="getoptionfeaturebenefits.xml?acode=CAC50DOV171A2&optionCode=RBZ&dataFilterID=15&language=FR";
System.out.println(tcSpiraId+" Please Wait...getoptionfeaturebenefits");	
System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
getoptionfeaturebenefits.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
getoptionfeaturebenefits.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
getoptionfeaturebenefits.compare(wsName,true);				

}
public static void getMakes(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	7. getMakes	 
	wsName="getMakes";
	LoadWebServiceChryslerCA getMakes = new LoadWebServiceChryslerCA();
	getMakes.SetFolderName(dc);
	getMakes.dataDir=getMakes.GetFolderName();
	 getMakes.SetFolderName(env1);
	 getMakes.firstEnvName=getMakes.GetFolderName();
	 getMakes.SetFolderName(env2);
	 getMakes.secondEnvName=getMakes.GetFolderName();
	tc="7_1";	
tcSpiraId="TC135539";	
	pXMLURL="getmakes.xml?country=&language=EN&year=C40";
	System.out.println(tcSpiraId+" Please Wait...getMakes");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getMakes.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getMakes.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getMakes.compare(wsName,true);
	tc="2";	
tcSpiraId="TC135540";	
	pXMLURL="getmakes.xml?country=CA&language=EN&year=C50";
	System.out.println(tcSpiraId+" Please Wait...getMakes");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getMakes.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getMakes.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getMakes.compare(wsName,true);
	tc="3";		
	tcSpiraId="TC135541";
	pXMLURL="getmakes.xml?country=&language=EN&year=C60";
	System.out.println(tcSpiraId+" Please Wait...getMakes");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getMakes.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getMakes.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getMakes.compare(wsName,true);
	tc="4";
tcSpiraId="TC135542";	
	pXMLURL="getmakes.xml?country=&language=FR&year=C40";
	System.out.println(tcSpiraId+" Please Wait...getMakes");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getMakes.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getMakes.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getMakes.compare(wsName,true);
	tc="5";	
tcSpiraId="TC135543";	
	pXMLURL="getmakes.xml?country=&language=FR&year=C50";
	System.out.println(tcSpiraId+" Please Wait...getMakes");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getMakes.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getMakes.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getMakes.compare(wsName,true);
	tc="6";
tcSpiraId="TC135544";	
	pXMLURL="getmakes.xml?country=CA&language=FR&year=C60";
	System.out.println(tcSpiraId+" Please Wait...getMakes");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getMakes.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getMakes.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getMakes.compare(wsName,true);

}
public static void getmodels(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	8. getmodels	 
wsName="getmodels";
	LoadWebServiceChryslerCA getmodels = new LoadWebServiceChryslerCA();
	getmodels.SetFolderName(dwc);
	getmodels.dataDir=getmodels.GetFolderName();
	 getmodels.SetFolderName(env1);
	 getmodels.firstEnvName=getmodels.GetFolderName();
	 getmodels.SetFolderName(env2);
	 getmodels.secondEnvName=getmodels.GetFolderName();
	tc="8_1";
	tcSpiraId="TC104625";
	pXMLURL="getmodels.xml?country=CA&language=EN&make=DD&year=C40&colorDesc=&wantBaseTrim=";
	System.out.println(tcSpiraId+" Please Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					
	tc="2";	
	tcSpiraId="TC104626";
	pXMLURL="getmodels.xml?country=&language=EN&make=RM&year=C50&colorDesc=RED&wantBaseTrim=N";
	System.out.println(tcSpiraId+" Please Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					
	tc="3";
	tcSpiraId="TC104627";	
	pXMLURL="getmodels.xml?country=&language=EN&make=FI&year=C50&colorDesc=&wantBaseTrim=Y";
	System.out.println(tcSpiraId+" Please Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					
	tc="4";	
	tcSpiraId="TC104628";
	pXMLURL="getmodels.xml?country=CA&language=FR&make=DD&year=C40&colorDesc=&wantBaseTrim=";
	System.out.println(tcSpiraId+" Pleas Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					
	tc="5";	
	tcSpiraId="TC104629";
	pXMLURL="getmodels.xml?country=&language=FR&make=RM&year=C50&colorDesc=&wantBaseTrim=N";
	System.out.println(tcSpiraId+" Pleas Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					
	tc="6";
	tcSpiraId="TC104630";	
	pXMLURL="getmodels.xml?country=&language=FR&make=FI&year=C40&colorDesc=&wantBaseTrim=Y";
	System.out.println(tcSpiraId+" Pleas Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					
	tc="7";	
	tcSpiraId="TC104631";
	pXMLURL="getmodels.xml?country=&language=EN&make=CD&year=C50&colorDesc=&wantBaseTrim=Y";
	System.out.println(tcSpiraId+" Pleas Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					
	tc="8";
	tcSpiraId="TC104632";	
	pXMLURL="getmodels.xml?country=&language=FR&make=CD&year=C50&colorDesc=&wantBaseTrim=N";
	System.out.println(tcSpiraId+" Pleas Wait...getmodels");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getmodels.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getmodels.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getmodels.compare(wsName,true);					

}
public static void gettrims(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	9. gettrims	 
 wsName="gettrims";
		LoadWebServiceChryslerCA gettrims = new LoadWebServiceChryslerCA();
		gettrims.SetFolderName(dwc);
		gettrims.dataDir=gettrims.GetFolderName();
		 gettrims.SetFolderName(env1);
		 gettrims.firstEnvName=gettrims.GetFolderName();
		 gettrims.SetFolderName(env2);
		 gettrims.secondEnvName=gettrims.GetFolderName();
		tc="9_1";	
		tcSpiraId="TC104634";
		pXMLURL="gettrims.xml?language=EN&modelYearId=14534&colorDesc=&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...gettrims");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		gettrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		gettrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		gettrims.compare(wsName,true);						
		tc="2";
		tcSpiraId="TC104635";		
		pXMLURL="gettrims.xml?language=EN&modelYearId=1014778&colorDesc=Red&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...gettrims");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		gettrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		gettrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		gettrims.compare(wsName,true);							
		tc="3";
		tcSpiraId="TC104636";
		pXMLURL="gettrims.xml?language=FR&modelYearId=14817&colorDesc=&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...gettrims");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		gettrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		gettrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		gettrims.compare(wsName,true);						
		tc="4";	
		tcSpiraId="TC104637";
		pXMLURL="gettrims.xml?language=FR&modelYearId=15291&colorDesc=Red&daysToLive=-1";
		System.out.println(tcSpiraId+" Pleas Wait...gettrims");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		gettrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		gettrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		gettrims.compare(wsName,true);	
		tc="5";
		tcSpiraId="TC104638";
		pXMLURL="gettrims.xml?language=EN&modelYearId=15291&colorDesc=Red&daysToLive=100";
		System.out.println(tcSpiraId+" Pleas Wait...gettrims");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		gettrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		gettrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		gettrims.compare(wsName,true);	
		tc="6";
		tcSpiraId="TC104639";
		pXMLURL="gettrims.xml?language=FR&modelYearId=15291&colorDesc=Red&daysToLive=100";
		System.out.println(tcSpiraId+" Pleas Wait...gettrims");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		gettrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		gettrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		gettrims.compare(wsName,true);	

}
public static void getTrimsExtended(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	10. getTrimsExtended	
		wsName="getTrimsExtended";
		LoadWebServiceChryslerCA getTrimsExtended = new LoadWebServiceChryslerCA();
		getTrimsExtended.SetFolderName(dwc);
		getTrimsExtended.dataDir=getTrimsExtended.GetFolderName();
		 getTrimsExtended.SetFolderName(env1);
		 getTrimsExtended.firstEnvName=getTrimsExtended.GetFolderName();
		 getTrimsExtended.SetFolderName(env2);
		 getTrimsExtended.secondEnvName=getTrimsExtended.GetFolderName();
		tc="10_1";	
		tcSpiraId="TC104641";
		pXMLURL="gettrimsextended.xml?language=EN&modelYear=2015&divCode=RM&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...getTrimsExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getTrimsExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getTrimsExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getTrimsExtended.compare(wsName,true);						
		tc="2";
		tcSpiraId="TC104642";
		pXMLURL="gettrimsextended.xml?language=EN&modelYear=2014&divCode=DD&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getTrimsExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getTrimsExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getTrimsExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getTrimsExtended.compare(wsName,true);					
		tc="3";	
		tcSpiraId="TC104643";
		pXMLURL="gettrimsextended.xml?language=EN&modelYear=2015&divCode=FI&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...getTrimsExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getTrimsExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getTrimsExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getTrimsExtended.compare(wsName,true);					
				
		tc="4";
		tcSpiraId="TC104644";
		pXMLURL="gettrimsextended.xml?language=FR&modelYear=2015&divCode=CD&daysToLive=100";
		System.out.println(tcSpiraId+" Pleas Wait...getTrimsExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getTrimsExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getTrimsExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getTrimsExtended.compare(wsName,true);		

}
public static void getYears(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	11.	getYears
		wsName="getYears";
		LoadWebServiceChryslerCA getYears = new LoadWebServiceChryslerCA();
		getYears.SetFolderName(dc);
		getYears.dataDir=getYears.GetFolderName();
		 getYears.SetFolderName(env1);
		 getYears.firstEnvName=getYears.GetFolderName();
		 getYears.SetFolderName(env2);
		 getYears.secondEnvName=getYears.GetFolderName();
		tc="11_1";
		tcSpiraId="TC104779";
		
		pXMLURL="getyears.xml?country=&language=EN&make=CD";
		System.out.println(tcSpiraId+" Please Wait...getYears");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getYears.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getYears.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getYears.compare(wsName,true);		
		tc="2";
		tcSpiraId="TC104780";
		pXMLURL="getyears.xml?country=&language=EN&make=FI";
		System.out.println(tcSpiraId+" Please Wait...getYears");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getYears.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getYears.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getYears.compare(wsName,true);	
		tc="3";
		tcSpiraId="TC104781";
		pXMLURL="getyears.xml?country=&language=FR&make=CD";
		System.out.println(tcSpiraId+" Please Wait...getYears");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getYears.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getYears.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getYears.compare(wsName,true);		
		tc="4";
		tcSpiraId="TC104782";
		pXMLURL="getyears.xml?country=&language=FR&make=FI";
		System.out.println(tcSpiraId+" Please Wait...getYears");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getYears.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getYears.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getYears.compare(wsName,true);	

}
public static void getChryslerModelTrimsSelector(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	11A. getChryslerModelTrimsSelector 
		wsName="getChryslerModelTrimsSelector";
		LoadWebServiceChryslerCA getChryslerModelTrimsSelector = new LoadWebServiceChryslerCA();
		getChryslerModelTrimsSelector.SetFolderName(dwc);
		 getChryslerModelTrimsSelector.dataDir=getChryslerModelTrimsSelector.GetFolderName();
		 getChryslerModelTrimsSelector.SetFolderName(env1);
		 getChryslerModelTrimsSelector.firstEnvName=getChryslerModelTrimsSelector.GetFolderName();
		 getChryslerModelTrimsSelector.SetFolderName(env2);
		 getChryslerModelTrimsSelector.secondEnvName=getChryslerModelTrimsSelector.GetFolderName();
		tc="11A_1";	
		tcSpiraId="TC104646";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14521&language=EN&country=CA&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="2";
		tcSpiraId="TC104647";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=1014778&language=EN&country=CA&daysToLive=-1&transactionId=44";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="3";
		tcSpiraId="TC104648";		
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=3014778&language=FR&country=CA&daysToLive=-1&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="4";	
		tcSpiraId="TC104649";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14817&language=FR&country=CA&daysToLive=-1&transactionId=1";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="5";
		tcSpiraId="TC104650";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14817&language=&country=&daysToLive=0&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="6";
		tcSpiraId="TC104651";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14817&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="7";
		tcSpiraId="TC104652";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15072&language=&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="8";
		tcSpiraId="TC104653";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15037&language=&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="9";
		tcSpiraId="TC104654";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15073&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="10";
		tcSpiraId="TC104655";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14642&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="11";
		tcSpiraId="TC104656";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14962&language=&country=&daysToLive=-1&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="12";
		tcSpiraId="TC104657";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14962&language=FR&country=&daysToLive=-1&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="13";
		tcSpiraId="TC104658";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15072&language=&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="14";
		tcSpiraId="TC104659";		
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15072&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="15";
		tcSpiraId="TC104660";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=14981&language=&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="16";
		tcSpiraId="TC104661";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15463&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);		
//		CCP-6461, CAC50JES142A4, ModelYearId=	15935	Patriot 
	 	tc="17";
		tcSpiraId="TC123075";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15935&language=EN&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="18";
		tcSpiraId="TC123076";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15935&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
//		CCP-6461, CAC50JES011A3, ModelYearId=	15963
	 	tc="19";
		tcSpiraId="TC123077";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15963&language=EN&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="20";
		tcSpiraId="TC123078";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=15963&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
//		CCP-6461, CAC50JES161A2, ModelYearId=	15965, updated to 2016 ModelYear
	 	tc="21";
		tcSpiraId="TC104679";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=16740&language=EN&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
	 	tc="22";
		tcSpiraId="TC123074";
		pXMLURL="getchryslermodeltrimsselector.xml?modelYearId=16740&language=FR&country=&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getChryslerModelTrimsSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerModelTrimsSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerModelTrimsSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerModelTrimsSelector.compare(wsName,true);	
}
public static void getStandardRVEContent(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	12. getStandardRVEContent	 
		wsName="getStandardRVEContent";
		LoadWebServiceChryslerCA getStandardRVEContent = new LoadWebServiceChryslerCA();
		getStandardRVEContent.SetFolderName(dwc);
		getStandardRVEContent.dataDir=getStandardRVEContent.GetFolderName();
		 getStandardRVEContent.SetFolderName(env1);
		 getStandardRVEContent.firstEnvName=getStandardRVEContent.GetFolderName();
		 getStandardRVEContent.SetFolderName(env2);
		 getStandardRVEContent.secondEnvName=getStandardRVEContent.GetFolderName();
		tc="12_1";	
		tcSpiraId="TC104663";
		pXMLURL="getstandardrvecontent.xml?acode=CAC50CRC211C0&scriptId=SS&language=EN";
		System.out.println(tcSpiraId+" Please Wait...getStandardRVEContent");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getStandardRVEContent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getStandardRVEContent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getStandardRVEContent.compare(wsName,true);	
	 	tc="2";
		tcSpiraId="TC104664";
		pXMLURL="getstandardrvecontent.xml?acode=CAC40DOS041A1&scriptId=SS&language=EN";
		System.out.println(tcSpiraId+" Please Wait...getStandardRVEContent");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getStandardRVEContent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getStandardRVEContent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getStandardRVEContent.compare(wsName,true);			 
	 	tc="3";
		tcSpiraId="TC104665";
		pXMLURL="getstandardrvecontent.xml?acode=CAC50RMT132A0&scriptId=SS&language=EN";
		System.out.println(tcSpiraId+" Please Wait...getStandardRVEContent");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getStandardRVEContent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getStandardRVEContent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getStandardRVEContent.compare(wsName,true);			 
	 	tc="4";
		tcSpiraId="TC104666";
		pXMLURL="getstandardrvecontent.xml?acode=CAC40DOS041A1&scriptId=SS&language=FR";
		System.out.println(tcSpiraId+" Pleas Wait...getStandardRVEContent");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getStandardRVEContent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getStandardRVEContent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getStandardRVEContent.compare(wsName,true);			 
	 	tc="5";
		tcSpiraId="TC104667";
		pXMLURL="getstandardrvecontent.xml?acode=CAC50RMT132A0&scriptId=SS&language=FR";
		System.out.println(tcSpiraId+" Pleas Wait...getStandardRVEContent");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getStandardRVEContent.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getStandardRVEContent.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getStandardRVEContent.compare(wsName,true);			 

}
public static void getChryslerInteriorImages(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	13. getChryslerInteriorImages	
		wsName="getChryslerInteriorImages";
		LoadWebServiceChryslerCA getChryslerInteriorImages = new LoadWebServiceChryslerCA();
		getChryslerInteriorImages.SetFolderName(dwc);
		getChryslerInteriorImages.dataDir=getChryslerInteriorImages.GetFolderName();
		 getChryslerInteriorImages.SetFolderName(env1);
		 getChryslerInteriorImages.firstEnvName=getChryslerInteriorImages.GetFolderName();
		 getChryslerInteriorImages.SetFolderName(env2);
		 getChryslerInteriorImages.secondEnvName=getChryslerInteriorImages.GetFolderName();
		tc="13_1";
		tcSpiraId="TC104669";
		pXMLURL="getchryslerinteriorimages.xml?language=EN&modelYearId=12732&baseAcode=CAC20FIC011B0";
		System.out.println(tcSpiraId+" Please Wait...getChryslerInteriorImages");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerInteriorImages.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerInteriorImages.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerInteriorImages.compare(wsName,true);
		tc="2";
		tcSpiraId="TC104670";
		pXMLURL="getchryslerinteriorimages.xml?language=EN&modelYearId=16320&baseAcode=CAC50CRC142B0";
		System.out.println(tcSpiraId+" Please Wait...getChryslerInteriorImages");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerInteriorImages.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerInteriorImages.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerInteriorImages.compare(wsName,true);		
		tc="3";
		tcSpiraId="TC104671";
		pXMLURL="getchryslerinteriorimages.xml?language=FR&modelYearId=12732&baseAcode=CAC20FIC011B0";
		System.out.println(tcSpiraId+" Please Wait...getChryslerInteriorImages");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerInteriorImages.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerInteriorImages.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerInteriorImages.compare(wsName,true);
		tc="4";
		tcSpiraId="TC104672";
		pXMLURL="getchryslerinteriorimages.xml?language=FR&modelYearId=16320&baseAcode=CAC50CRC142B0";
		System.out.println(tcSpiraId+" Pleas Wait...getChryslerInteriorImages");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getChryslerInteriorImages.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getChryslerInteriorImages.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getChryslerInteriorImages.compare(wsName,true);

}
public static void compareRVECommand(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	14. compareRVECommand	 
		wsName="compareRVECommand";		 
		LoadWebServiceChryslerCA compareRVECommand = new LoadWebServiceChryslerCA();
		compareRVECommand.SetFolderName(dwc);
		compareRVECommand.dataDir=compareRVECommand.GetFolderName();
		 compareRVECommand.SetFolderName(env1);
		 compareRVECommand.firstEnvName=compareRVECommand.GetFolderName();
		 compareRVECommand.SetFolderName(env2);
		 compareRVECommand.secondEnvName=compareRVECommand.GetFolderName();
		tc="14_1";
		tcSpiraId="TC096469";
		pXMLURL="comparervecommand.xml?acodes=CAC50FIC011A0,CAC50FIC011C0&scriptId=FZ&language=EN&optionCodes=CEC&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);
		tc="2";
		tcSpiraId="TC096470";
		pXMLURL="comparervecommand.xml?acodes=CAC50ACC181A0,CAC50GMT205B0&scriptId=FZ&language=EN&optionCodes=STDTR&packageCodes=&postalCode=&ipAddress=&transactionId=1";
		System.out.println(tcSpiraId+" Please Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);			
		tc="3";
		tcSpiraId="TC096471";
		pXMLURL="comparervecommand.xml?acodes=CAB80ACC021A0,CAC50GMT205B0,CAC40FIC011A0,CAC40FIC011C0&scriptId=Bpcompare&language=EN&optionCodes=&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);
		tc="4";
		tcSpiraId="TC096472";
		pXMLURL="comparervecommand.xml?acodes=CAC50FIC011C0&scriptId=KF&language=EN&optionCodes=&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);
		tc="5";
		tcSpiraId="TC096473";
		pXMLURL="comparervecommand.xml?acodes=CAC50FIC011A0,CAC50FIC011C0&scriptId=FZ&language=FR&optionCodes=CEC&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);			
		tc="6";
		tcSpiraId="TC096474";
		pXMLURL="comparervecommand.xml?acodes=CAC50ACC181A0,CAC50GMT205B0&scriptId=FZ&language=FR&optionCodes=AKPN&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);			
		tc="7";
		tcSpiraId="TC096475";
		pXMLURL="comparervecommand.xml?acodes=CAC50ACC181A0,CAC50GMT205B0,CAC40FIC011A0,CAC40FIC011C0&scriptId=Bpcompare&language=FR&optionCodes=&packageCodes=&postalCode=N9V3R2&ipAddress=&transactionId=77";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);
		tc="8";
		tcSpiraId="TC096476";
		pXMLURL="comparervecommand.xml?acodes=CAC50FIC011C0&scriptId=KF&language=FR&optionCodes=&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);
		tc="9";
		tcSpiraId="TC096477";
		pXMLURL="comparervecommand.xml?acodes=CAC40DOC201C1,CAC40CRV081A0&scriptId=Bpcompare&language=FR&optionCodes=&packageCodes=&postalCode=N9V3R2&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);	
		tc="10";
		tcSpiraId="TC096478";
		pXMLURL="comparervecommand.xml?acodes=CAC40DOC201C1,CAC40CRV081A0&scriptId=Bpcompare&language=EN&optionCodes=&packageCodes=28J,29K&postalCode=N9V3R2&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);
		tc="11";
		tcSpiraId="TC096479";
		pXMLURL="comparervecommand.xml?acodes=CAC50FIC011A0,CAC50FIC011C0&scriptId=Bpcompare&language=EN&optionCodes=CEC&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);			
		tc="12";
		tcSpiraId="TC096480";
		pXMLURL="comparervecommand.xml?acodes=CAC50ACC181A0,CAC50GMT205B0&scriptId=Bpcompare&language=EN&optionCodes=AKPN&packageCodes=&postalCode=&ipAddress=216.108.101.0&transactionId=1";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);	
		tc="13";
		tcSpiraId="TC096481";
		pXMLURL="comparervecommand.xml?acodes=CAC50DOC311A0,CAC50DOC311B0&scriptId=Bpcompare&language=FR&optionCodes=WF3&packageCodes=&postalCode=&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);
		tc="14";
		tcSpiraId="TC096482";
		pXMLURL="comparervecommand.xml?acodes=CAC40DOC311A0,CAC50DOC301E0&scriptId=Bpcompare&language=FR&optionCodes=&packageCodes=&postalCode=M1N3W3&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);			
		tc="15";
		tcSpiraId="TC096483";
		pXMLURL="comparervecommand.xml?acodes=CAC40DOS042B0,CAC40JES161B0&scriptId=Bpcompare&language=&optionCodes=&packageCodes=&postalCode=&ipAddress=RRRRR&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);		
		tc="16";
		tcSpiraId="TC096484";
		pXMLURL="comparervecommand.xml?acodes=CAC50JES161A1,CAC50JES051B0,CAC50DOV171A2,CAC50DOS011E0&scriptId=Bpcompare&language=&optionCodes=&packageCodes=&postalCode=J6E8L3&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);	
		tc="17";
		tcSpiraId="TC115905";
		pXMLURL="comparervecommand.xml?acodes=CAC50FIC011A0,CAC50FIC011C0&scriptId=Bpcompare&language=EN&optionCodes=CEC&packageCodes=&postalCode=A0C1J0&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);	
		tc="18";
		tcSpiraId="TC115904";
		pXMLURL="comparervecommand.xml?acodes=CAC50FIC011A0,CAC50FIC011C0&scriptId=Bpcompare&language=FR&optionCodes=CEC&packageCodes=&postalCode=P2N2G1&ipAddress=&transactionId=";
		System.out.println(tcSpiraId+" Pleas Wait...compareRVECommand");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		compareRVECommand.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		compareRVECommand.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		compareRVECommand.compare(wsName,true);	
}
public static void getConfigVehicle(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//14A. getConfigVehicle	 both DW, DC
			wsName="getConfigVehicle";		 
			LoadWebServiceChryslerCA getConfigVehicle = new LoadWebServiceChryslerCA();
			getConfigVehicle.SetFolderName(dwc);
			 getConfigVehicle.dataDir=getConfigVehicle.GetFolderName();
			 getConfigVehicle.SetFolderName(env1);
			 getConfigVehicle.firstEnvName=getConfigVehicle.GetFolderName();
			 getConfigVehicle.SetFolderName(env2);
			 getConfigVehicle.secondEnvName=getConfigVehicle.GetFolderName();
			tc="14A_1";
			tcSpiraId="TC111826";
			pXMLURL="getconfigvehicle.xml?language=EN&acode=CAC40CRC211B0&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=27U&daysToLive=&postalCode=L4T2G2&ipAddress=&dealerCode=&transactionId=&view=";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);	
			tc="2";	
			tcSpiraId="TC111827";
			pXMLURL="getconfigvehicle.xml?language=EN&acode=CAC50FIC011C0&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=21J&daysToLive=&postalCode=N6H4P4&ipAddress=&dealerCode=C4515&transactionId=1&view=1";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);	
			tc="3";
			tcSpiraId="TC111828";
			pXMLURL="getconfigvehicle.xml?language=EN&acode=CAC50RMT116A2&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=0&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);
			tc="4";
			tcSpiraId="TC111829";
			pXMLURL="getconfigvehicle.xml?language=FR&acode=CAC50RMT116A2&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);
			tc="5";
			tcSpiraId="TC111830";
			pXMLURL="getconfigvehicle.xml?language=FR&acode=CAC30JES011B0&scratchSave=&paintsOnly=true&defaultColour=false&packageCode=24G&daysToLive=&postalCode=&ipAddress=216.108.101.0&dealerCode=&transactionId=&view=1";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);			
			tc="6";
			tcSpiraId="TC111831";
			pXMLURL="getconfigvehicle.xml?language=EN&acode=CAC40FIC011A0&scratchSave=&paintsOnly=false&defaultColour=true&packageCode=21A&daysToLive=&postalCode=M2M4L1&ipAddress=&dealerCode=&transactionId=&view=1";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);
			tc="7";
			tcSpiraId="TC111832";
			pXMLURL="getconfigvehicle.xml?language=EN&acode=CAC40RMT117B3&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);
			tc="8";
			tcSpiraId="TC111833";			
			pXMLURL="getconfigvehicle.xml?language=FR&acode=CAC40RMT117B3&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=26G&daysToLive=&postalCode=J2G8C8&ipAddress=&dealerCode=C5136&transactionId=&view=0";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);
			tc="9";	
			tcSpiraId="TC111834";
//			pXMLURL="getconfigvehicle.xml?language=&acode=CAC40RMT117B3&scratchSave=||22G,0,0,4,0,C,^Z6D,1,0,0,0,S,^ERB,0,0,4,0,C,^DFL,0,0,4,0,C,^DMC,1,0,0,0,S,`EZH`DFD^TTM,1,0,0,0,S,^V9,1,0,0,0,S,^RA2,1,0,0,0,S,^WFE,1,0,0,0,S,^APA,2,0,0,0,S,^26G,1,0,0,0,S,`EZH`DFD^28G,0,0,4,0,C,^ATK,0,0,2,0,C,^DFD,3,0,0,0,S,`EZH^DMH,0,0,1,0,C,^EXF,0,0,4,0,C,^EZH,3,0,0,0,S,`DFD^TUB,0,0,2,0,C,^WRF,0,0,2,0,C,^DMD,0,0,4,0,C,^TTN,0,0,2,0,C,^TTY,0,0,1,0,C,^TXN,0,0,1,0,C,^WFJ,0,0,2,0,C,^WHE,0,0,2,0,C,^AGF,0,0,1,0,C,^M9,0,0,1,0,C,^MJ,0,0,1,0,C,^MRA,0,0,1,0,C,^MRT,0,0,1,0,C,^RC3,0,0,1,0,C,^XB9,0,0,1,0,C,^RA3,0,0,1,0,C,^RA4,0,0,1,0,C,^PNTTBL01,1,0,0,0,S,`APA^XBN,0,1,0,0,G,^NER,0,1,0,0,G,^DH8,0,1,0,0,G,^NHN,0,1,0,0,G,^NMC,0,1,0,0,G,^NHD,0,1,0,0,G,^MW5,0,1,0,0,G,^NZD,0,1,0,0,G,^&paintsOnly=false&defaultColour=false&packageCode=28G&daysToLive=&postalCode=&ipAddress=&dealerCode=C5136&transactionId=&view=0";
			scratchSave  ="";
			previousState="";
			//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
			scratchSave=getConfigVehicle.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT117B3","false","false", "26G", "", "EN", "", "", "", "", "",""); //ok! 
			previousState=scratchSave;
			pXMLURL="getconfigvehicle.xml?language=&acode=CAC40RMT117B3&scratchSave="+scratchSave+"&paintsOnly=false&defaultColour=false&packageCode=28G&daysToLive=&postalCode=&ipAddress=&dealerCode=C5136&transactionId=&view=0";
			System.out.println(tcSpiraId+" Please Wait...getConfigVehicle");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getConfigVehicle.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getConfigVehicle.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getConfigVehicle.compare(wsName,true);	

}
public static void getConfigVehicleWithICC(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//14B. getConfigVehicleWithICC	  DC
	wsName="getConfigVehicleWithICC";		 
	LoadWebServiceChryslerCA getConfigVehicleWithICC = new LoadWebServiceChryslerCA();
	getConfigVehicleWithICC.SetFolderName(dc);
	getConfigVehicleWithICC.dataDir=getConfigVehicleWithICC.GetFolderName();
	 getConfigVehicleWithICC.SetFolderName(env1);
	 getConfigVehicleWithICC.firstEnvName=getConfigVehicleWithICC.GetFolderName();
	 getConfigVehicleWithICC.SetFolderName(env2);
	 getConfigVehicleWithICC.secondEnvName=getConfigVehicleWithICC.GetFolderName();
	tc="14B_1";	
	tcSpiraId="TC133294";
	pXMLURL="getconfigvehiclewithicc.xml?language=EN&acode=CAC50DOV171A2&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=";
	System.out.println(tcSpiraId+" Please Wait...getConfigVehicleWithICC");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getConfigVehicleWithICC.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getConfigVehicleWithICC.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getConfigVehicleWithICC.compare(wsName,true);	
	tc="2";	
	tcSpiraId="TC133295";
	pXMLURL="getconfigvehiclewithicc.xml?language=FR&acode=CAC50DOV171A2&scratchSave=&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=C1A8C4&ipAddress=&dealerCode=";
	System.out.println(tcSpiraId+" Please Wait...getConfigVehicleWithICC");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getConfigVehicleWithICC.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getConfigVehicleWithICC.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getConfigVehicleWithICC.compare(wsName,true);
	tc="3";
	tcSpiraId="TC133296";
	Acode="CAC30RMT116A2";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getConfigVehicleWithICC.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "26A", "-1", "EN", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
//	scratchSave=getConfigVehicleWithICC.getScratchFromgetSelectOption(prodPrefix, "EN", Acode, "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "");
	pXMLURL="getconfigvehiclewithicc.xml?language=&acode="+Acode+"&scratchSave="+scratchSave+"&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=C5136";
	System.out.println(tcSpiraId+" Please Wait...getConfigVehicleWithICC");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getConfigVehicleWithICC.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getConfigVehicleWithICC.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getConfigVehicleWithICC.compare(wsName,true);
	tc="4";	
	tcSpiraId="TC133297";
	Acode="CAC30RMT116A2";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getConfigVehicleWithICC.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "26A", "", "FR", "", "", "", "", "",""); //ok! 
	pXMLURL="getconfigvehiclewithicc.xml?language=FR&acode="+Acode+"&scratchSave="+scratchSave+"&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=&postalCode=&ipAddress=&dealerCode=C5136";
	System.out.println(tcSpiraId+" Please Wait...getConfigVehicleWithICC");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getConfigVehicleWithICC.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getConfigVehicleWithICC.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getConfigVehicleWithICC.compare(wsName,true);
	tc="5";	
	tcSpiraId="TC133298";
	pXMLURL="getconfigvehiclewithicc.xml?language=&acode=CAC40FIC021C1&scratchSave=&paintsOnly=true&defaultColour=false&packageCode=25X&daysToLive=&postalCode=&ipAddress=216.108.101.0&dealerCode=";
	System.out.println(tcSpiraId+" Please Wait...getConfigVehicleWithICC");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getConfigVehicleWithICC.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getConfigVehicleWithICC.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getConfigVehicleWithICC.compare(wsName,true);
	tc="6";	
	tcSpiraId="TC133299";
	Acode="CAC40DOC191B3";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getConfigVehicleWithICC.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "27J", "", "EN", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getConfigVehicleWithICC.getScratchFromgetSelectOption(prodPrefix, "EN", Acode, "PX8", "simple", "N", scratchSave, "", "N", "false", "false", "", "27J", "", "", "", "", "");
	pXMLURL="getconfigvehiclewithicc.xml?language=&acode="+Acode+"&scratchSave="+scratchSave+"&paintsOnly=false&defaultColour=true&packageCode=27J&daysToLive=&postalCode=&ipAddress=&dealerCode=";
	System.out.println(tcSpiraId+" Please Wait...getConfigVehicleWithICC");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getConfigVehicleWithICC.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getConfigVehicleWithICC.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getConfigVehicleWithICC.compare(wsName,true);
}
public static void getSelectOption(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//14C. getSelectOption	 DW, DC
	wsName="getSelectOption";		 
	LoadWebServiceChryslerCA getSelectOption = new LoadWebServiceChryslerCA();
	getSelectOption.SetFolderName(dwc);
	getSelectOption.dataDir=getSelectOption.GetFolderName();
	 getSelectOption.SetFolderName(env1);
	 getSelectOption.firstEnvName=getSelectOption.GetFolderName();
	 getSelectOption.SetFolderName(env2);
	 getSelectOption.secondEnvName=getSelectOption.GetFolderName();
	tc="14C_1";	
	tcSpiraId="TC111836";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40CRC211A0&code=MJF&lmethod=simple&difonly=Y&scratchSave=||24H,1,0,0,0,S,`ED3`DFF^ED3,3,0,0,0,S,`DFF^DFF,3,0,0,0,S,`ED3^TR3,1,0,0,0,S,^N7,1,0,0,0,S,^RES,1,0,0,0,S,^WFU,1,0,0,0,S,^APA,1,0,0,0,S,^29H,0,0,3,0,C,^DG2,0,0,3,0,C,^TZC,0,1,0,0,G,^WFX,0,0,1,0,C,^W7B,0,1,0,0,G,^&previousState=||24H,1,0,0,0,S,`ED3`DFF^ED3,3,0,0,0,S,`DFF^DFF,3,0,0,0,S,`ED3^TR3,1,0,0,0,S,^N7,1,0,0,0,S,^RES,1,0,0,0,S,^WFU,1,0,0,0,S,^APA,1,0,0,0,S,^29H,0,0,3,0,C,^DG2,0,0,3,0,C,^TZC,0,1,0,0,G,^WFX,0,0,1,0,C,^W7B,0,1,0,0,G,^&showDelta=Y&paintsOnly=false&defaultColour=false&packageCode=24H&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40CRC211A0","false","false", "24H", "", "EN", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40CRC211A0&code=MJF&lmethod=simple&difonly=Y&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=false&defaultColour=false&packageCode=24H&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);	
	tc="2";
	tcSpiraId="TC111837";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40DOC191A4&code=LMP&lmethod=simple&difonly=N&scratchSave=||26H,1,0,0,0,S,`ERB`DGJ^ERB,2,0,0,0,S,^DGJ,2,0,0,0,S,^TVJ,1,1,0,0,G,^RL,1,1,0,0,G,^RES,1,0,0,0,S,^WRL,1,1,0,0,G,^APA,1,0,0,0,S,^RD7,0,1,0,0,G,^DMM,0,1,0,0,G,^RC6,0,1,0,0,G,^BR5,0,1,0,0,G,^BGF,0,1,0,0,G,^LMG,0,1,0,0,G,^TZF,0,1,0,0,G,^LNJ,0,1,0,0,G,^JPM,0,1,0,0,G,^XAA,0,1,0,0,G,^SBP,0,1,0,0,G,^SDD,0,1,0,0,G,^AZC,0,1,0,0,G,^MXX,0,1,0,0,G,^M23,0,1,0,0,G,^RSC,0,1,0,0,G,^X9B,0,1,0,0,G,^X9A,0,1,0,0,G,^XG8,0,1,0,0,G,^XBQ,0,1,0,0,G,^GNC,0,1,0,0,G,^RSP,0,1,0,0,G,^RSL,0,1,0,0,G,^RSX,0,1,0,0,G,^GN5,0,1,0,0,G,^ATL,0,0,1,0,C,^RBZ,0,0,1,0,C,^RHB,0,0,1,0,C,^RHR,0,0,1,0,C,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=0&postalCode=&ipAddress=216.108.101.0&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40DOC191A4","false","false", "26H", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40DOC191A4&code=LMP&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=0&postalCode=&ipAddress=216.108.101.0&dealerCode=C4515&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="3";	
	tcSpiraId="TC111838";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40DOC191A4&code=LMP&lmethod=simple&difonly=N&scratchSave=||26H,1,0,0,0,S,`ERB`DGJ^ERB,2,0,0,0,S,^DGJ,2,0,0,0,S,^TVJ,1,1,0,0,G,^RL,1,1,0,0,G,^RES,1,0,0,0,S,^WRL,1,1,0,0,G,^APA,1,0,0,0,S,^RD7,0,1,0,0,G,^DMM,0,1,0,0,G,^RC6,0,1,0,0,G,^BR5,0,1,0,0,G,^BGF,0,1,0,0,G,^LMG,0,1,0,0,G,^TZF,0,1,0,0,G,^LNJ,0,1,0,0,G,^JPM,0,1,0,0,G,^XAA,0,1,0,0,G,^SBP,0,1,0,0,G,^SDD,0,1,0,0,G,^AZC,0,1,0,0,G,^MXX,0,1,0,0,G,^M23,0,1,0,0,G,^RSC,0,1,0,0,G,^X9B,0,1,0,0,G,^X9A,0,1,0,0,G,^XG8,0,1,0,0,G,^XBQ,0,1,0,0,G,^GNC,0,1,0,0,G,^RSP,0,1,0,0,G,^RSL,0,1,0,0,G,^RSX,0,1,0,0,G,^GN5,0,1,0,0,G,^ATL,0,0,1,0,C,^RBZ,0,0,1,0,C,^RHB,0,0,1,0,C,^RHR,0,0,1,0,C,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=0&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40DOC191A4","false","false", "26H", "", "FR", "", "", "", "", "","1"); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40DOC191A4&code=LMP&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=0&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);			
	tc="4";	
	tcSpiraId="TC111839";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40FIC011B0&code=AZ7&lmethod=simple&difonly=Y&scratchSave=||21D,0,0,2,0,C,^EAB,2,0,0,0,S,^DDF,0,0,2,0,C,^T1D,1,0,0,0,S,^Q6,1,0,0,0,S,^RAB,1,0,0,0,S,^WN2,1,0,0,0,S,^APA,1,0,0,0,S,^CZB,1,0,0,0,S,^22D,1,0,0,0,S,`EAB`DF1^DF1,2,0,0,0,S,^AL,0,0,2,0,C,^CEQ,0,0,2,0,C,^CXR,0,0,2,0,C,^WGC,0,0,1,0,C,^CZD,0,0,1,0,C,^X9_01,0,0,1,0,C,^DMF,0,1,0,0,G,^&previousState=||21D,0,0,2,0,C,^EAB,2,0,0,0,S,^DDF,0,0,2,0,C,^T1D,1,0,0,0,S,^Q6,1,0,0,0,S,^RAB,1,0,0,0,S,^WN2,1,0,0,0,S,^APA,1,0,0,0,S,^CZB,1,0,0,0,S,^22D,1,0,0,0,S,`EAB`DF1^DF1,2,0,0,0,S,^AL,0,0,2,0,C,^CEQ,0,0,2,0,C,^CXR,0,0,2,0,C,^WGC,0,0,1,0,C,^CZD,0,0,1,0,C,^X9_01,0,0,1,0,C,^DMF,0,1,0,0,G,^&showDelta=Y&paintsOnly=false&defaultColour=false&packageCode=22D&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40FIC011B0","false","false", "22D", "", "EN", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40FIC011B0&code=AZ7&lmethod=simple&difonly=Y&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=false&defaultColour=false&packageCode=22D&daysToLive=&postalCode=&ipAddress=&dealerCode=C4515&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);			
	tc="5";
	tcSpiraId="TC111840";	
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMH121A0&code=MML&lmethod=simple&difonly=N&scratchSave=||26A,10,0,0,0,S,`EZC`DFP`AR9^AR9,10,0,0,0,S,`EZC`26A`DFP^Z3G,1,1,0,0,G,`AR9`EZC`26A`DFP^EZC,10,0,0,0,S,`DFP`AR9`26A^DFP,10,0,0,0,S,`EZC`AR9`26A^DMF,1,1,0,0,G,`26A`EZC`DFP`AR9^TTV,1,1,0,0,G,`AR9`EZC`26A`DFP^TX,1,0,0,0,S,`26A`EZC`DFP`AR9^RA1,1,0,0,0,S,^WBN,1,1,0,0,G,`AR9`EZC`26A`DFP^APA,2,0,0,0,S,^22A,0,0,6,0,C,^22G,0,0,6,0,C,^26G,0,0,6,0,C,^27A,0,0,6,0,C,^27G,0,0,6,0,C,^29A,0,0,6,0,C,^29G,0,0,6,0,C,^2EA,0,0,6,0,C,^2EG,0,0,6,0,C,^ADA,0,0,7,0,C,^AGF,0,0,7,0,C,^AH2,0,0,6,0,C,^AHQ,0,0,6,0,C,^BAJ,0,0,6,0,C,^CKJ,0,0,6,0,C,^DEG,0,0,6,0,C,^DF2,0,0,6,0,C,^DF3,0,0,6,0,C,^DM8,0,0,6,0,C,^DME,0,0,6,0,C,^DMK,0,0,6,0,C,^DMR,0,0,6,0,C,^ESB,0,0,6,0,C,^ETK,0,0,6,0,C,^JJ3,0,0,6,0,C,^JJ4,0,0,6,0,C,^JJ5,0,0,6,0,C,^JJ9,0,0,6,0,C,^LBN,0,0,6,0,C,^LBV,0,0,6,0,C,^LSA,0,0,6,0,C,^M9,0,0,6,0,C,^MJ,0,0,6,0,C,^NFA,0,0,6,0,C,^RA3,0,0,7,0,C,^RA4,0,0,7,0,C,^RCK,0,0,7,0,C,^TPY,0,0,6,0,C,^TV2,0,0,6,0,C,^WD4,0,0,6,0,C,^WF7,0,0,6,0,C,^WFU,0,0,6,0,C,^XAP,0,0,6,0,C,^XBM,0,0,6,0,C,^XCL,0,0,6,0,C,^XF5,0,0,6,0,C,^XF6,0,0,6,0,C,^XF7,0,0,6,0,C,^XXJ,0,0,6,0,C,^Z3D,0,0,6,0,C,^Z3E,0,0,6,0,C,^Z3F,0,0,6,0,C,^Z3H,0,0,6,0,C,^Z3M,0,0,6,0,C,^CTL,0,1,0,0,G,^MEN,0,1,0,0,G,^DRQ,0,1,0,0,G,^DJN,0,1,0,0,G,^TZH,0,1,0,0,G,^BAB,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^NZD,0,1,0,0,G,^U1_01,0,0,1,0,C,^U1_03,0,0,1,0,C,^V9,0,0,1,0,C,^X8_02,0,0,1,0,C,^RA2,0,0,1,0,C,^RH1,0,0,1,0,C,^PNTTBL01,1,0,0,0,S,`APA`26A`EZC`DFP`AR9^PNTTBL02,0,0,1,0,C,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=216.108.101.0&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMH121A0","false","false", "", "", "EN", "", "216.108.101.0", "", "", "",""); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMH121A0&code=MML&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=216.108.101.0&dealerCode=&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="6";	
	tcSpiraId="TC111841";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMH121A0&code=MML&lmethod=simple&difonly=N&scratchSave=||26A,10,0,0,0,S,`EZC`DFP`AR9^AR9,10,0,0,0,S,`EZC`26A`DFP^Z3G,1,1,0,0,G,`AR9`EZC`26A`DFP^EZC,10,0,0,0,S,`DFP`AR9`26A^DFP,10,0,0,0,S,`EZC`AR9`26A^DMF,1,1,0,0,G,`26A`EZC`DFP`AR9^TTV,1,1,0,0,G,`AR9`EZC`26A`DFP^TX,1,0,0,0,S,`26A`EZC`DFP`AR9^RA1,1,0,0,0,S,^WBN,1,1,0,0,G,`AR9`EZC`26A`DFP^APA,2,0,0,0,S,^22A,0,0,6,0,C,^22G,0,0,6,0,C,^26G,0,0,6,0,C,^27A,0,0,6,0,C,^27G,0,0,6,0,C,^29A,0,0,6,0,C,^29G,0,0,6,0,C,^2EA,0,0,6,0,C,^2EG,0,0,6,0,C,^ADA,0,0,7,0,C,^AGF,0,0,7,0,C,^AH2,0,0,6,0,C,^AHQ,0,0,6,0,C,^BAJ,0,0,6,0,C,^CKJ,0,0,6,0,C,^DEG,0,0,6,0,C,^DF2,0,0,6,0,C,^DF3,0,0,6,0,C,^DM8,0,0,6,0,C,^DME,0,0,6,0,C,^DMK,0,0,6,0,C,^DMR,0,0,6,0,C,^ESB,0,0,6,0,C,^ETK,0,0,6,0,C,^JJ3,0,0,6,0,C,^JJ4,0,0,6,0,C,^JJ5,0,0,6,0,C,^JJ9,0,0,6,0,C,^LBN,0,0,6,0,C,^LBV,0,0,6,0,C,^LSA,0,0,6,0,C,^M9,0,0,6,0,C,^MJ,0,0,6,0,C,^NFA,0,0,6,0,C,^RA3,0,0,7,0,C,^RA4,0,0,7,0,C,^RCK,0,0,7,0,C,^TPY,0,0,6,0,C,^TV2,0,0,6,0,C,^WD4,0,0,6,0,C,^WF7,0,0,6,0,C,^WFU,0,0,6,0,C,^XAP,0,0,6,0,C,^XBM,0,0,6,0,C,^XCL,0,0,6,0,C,^XF5,0,0,6,0,C,^XF6,0,0,6,0,C,^XF7,0,0,6,0,C,^XXJ,0,0,6,0,C,^Z3D,0,0,6,0,C,^Z3E,0,0,6,0,C,^Z3F,0,0,6,0,C,^Z3H,0,0,6,0,C,^Z3M,0,0,6,0,C,^CTL,0,1,0,0,G,^MEN,0,1,0,0,G,^DRQ,0,1,0,0,G,^DJN,0,1,0,0,G,^TZH,0,1,0,0,G,^BAB,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^NZD,0,1,0,0,G,^U1_01,0,0,1,0,C,^U1_03,0,0,1,0,C,^V9,0,0,1,0,C,^X8_02,0,0,1,0,C,^RA2,0,0,1,0,C,^RH1,0,0,1,0,C,^PNTTBL01,1,0,0,0,S,`APA`26A`EZC`DFP`AR9^PNTTBL02,0,0,1,0,C,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMH121A0","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMH121A0&code=MML&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="7";	
	tcSpiraId="TC111842";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT116A2","false","false", "22A", "-1", "EN", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="8";
		tcSpiraId="TC111843";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT116A2","false","false", "22A", "-1", "FR", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC40RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "");
	pXMLURL="getselectoption.xml?language=FR&acode=CAC40RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="9";	
	tcSpiraId="TC111844";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT116A2","false","false", "22A", "-1", "EN", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "1");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="10";	
	tcSpiraId="TC111845";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT116A2","false","false", "22A", "-1", "FR", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC40RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "1");
	pXMLURL="getselectoption.xml?language=FR&acode=CAC40RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="11";	
	tcSpiraId="TC111846";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT116A2","false","false", "22A", "-1", "EN", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC50RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="12";	
	tcSpiraId="TC111847";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT116A2","false","false", "22A", "-1", "FR", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC50RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "");
	pXMLURL="getselectoption.xml?language=FR&acode=CAC50RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="13";	
		tcSpiraId="TC111848";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT116A2","false","false", "22A", "-1", "EN", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "1");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC50RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="14";	
	tcSpiraId="TC111849";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT116A2&code=MRT&lmethod=simple&difonly=N&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT116A2","false","false", "22A", "-1", "FR", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 10, String defaultColour, String PackageCode, String DaysToLive 6, String postalCode, String ipAddress 4, String dealerCode, String transactionId 2, String view)
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC50RMT116A2", "TTM", "simple", "N", scratchSave, "", "N", "false", "false", "", "22A", "", "", "", "", "1");
	pXMLURL="getselectoption.xml?language=FR&acode=CAC50RMT116A2&code=TTM&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=22A&daysToLive=-1&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="15";	
	tcSpiraId="TC111850";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40FIC011A0&code=M4K&lmethod=simple&difonly=N&scratchSave=||21A,1,0,0,0,S,`EAB`DDF^EAB,2,0,0,0,S,^DDF,2,0,0,0,S,^T1A,1,0,0,0,S,^AJ,2,0,0,0,S,^RAB,1,0,0,0,S,^WCL,1,0,0,0,S,^APA,3,0,0,0,S,^CXR,1,0,0,0,S,^22A,0,0,2,0,C,^AVV,0,0,2,0,C,^DF1,0,0,2,0,C,^GWL,0,0,1,0,C,^WJC,0,0,1,0,C,^W5C,0,1,0,0,G,^CEC,0,0,2,0,C,^CEF,0,0,1,0,C,^PBA_02,0,0,2,0,C,^PBP_02,0,0,2,0,C,^PFP_02,0,0,2,0,C,^PGA_02,0,0,2,0,C,^PLB_02,0,0,2,0,C,^PPS_02,0,0,2,0,C,^PTM_02,0,0,2,0,C,^PYF_02,0,0,2,0,C,^PR1_02,1,0,0,0,S,`APA^PAU_02,0,0,1,0,C,^PRA_01,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PW3_02,0,0,1,0,C,^PWH_02,0,0,1,0,C,^PX8_01,0,0,1,0,C,^WD_01,0,0,1,0,C,^X9_01,1,0,0,0,S,`APA`AJ^&previousState=&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=21A&daysToLive=&postalCode=M2M4L1&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC60FIC011A0","false","true", "21A", "", "EN", "", "", "", "", "","1"); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC60FIC011A0&code=HAA&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=21A&daysToLive=&postalCode=M2M4L1&ipAddress=&dealerCode=C4515&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="16";	
	tcSpiraId="TC111851";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40FIC011A0&code=M4K&lmethod=simple&difonly=N&scratchSave=||21A,1,0,0,0,S,`EAB`DDF^EAB,2,0,0,0,S,^DDF,2,0,0,0,S,^T1A,1,0,0,0,S,^AJ,2,0,0,0,S,^RAB,1,0,0,0,S,^WCL,1,0,0,0,S,^APA,3,0,0,0,S,^CXR,1,0,0,0,S,^22A,0,0,2,0,C,^AVV,0,0,2,0,C,^DF1,0,0,2,0,C,^GWL,0,0,1,0,C,^WJC,0,0,1,0,C,^W5C,0,1,0,0,G,^CEC,0,0,2,0,C,^CEF,0,0,1,0,C,^PBA_02,0,0,2,0,C,^PBP_02,0,0,2,0,C,^PFP_02,0,0,2,0,C,^PGA_02,0,0,2,0,C,^PLB_02,0,0,2,0,C,^PPS_02,0,0,2,0,C,^PTM_02,0,0,2,0,C,^PYF_02,0,0,2,0,C,^PR1_02,1,0,0,0,S,`APA^PAU_02,0,0,1,0,C,^PRA_01,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PW3_02,0,0,1,0,C,^PWH_02,0,0,1,0,C,^PX8_01,0,0,1,0,C,^WD_01,0,0,1,0,C,^X9_01,1,0,0,0,S,`APA`AJ^&previousState=&showDelta=N&paintsOnly=true&defaultColour=false&packageCode=21A&daysToLive=&postalCode=M2M4L1&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC60FIC011A0","false","true", "21A", "", "FR", "", "", "", "", "","1"); //ok! 
	pXMLURL="getselectoption.xml?language=FR&acode=CAC60FIC011A0&code=HAA&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=true&defaultColour=false&packageCode=21A&daysToLive=&postalCode=M2M4L1&ipAddress=&dealerCode=C4515&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="17";	
	tcSpiraId="TC111852";
////	pXMLURL="getselectoption.xml?language=EN&acode=CAC40FIC011A0&code=PRA_01&lmethod=simple&difonly=N&scratchSave=||21A,1,0,0,0,S,`EAB`DDF^EAB,2,0,0,0,S,^DDF,2,0,0,0,S,^T1A,1,0,0,0,S,^AJ,2,0,0,0,S,^RAB,1,0,0,0,S,^WCL,1,0,0,0,S,^APA,3,0,0,0,S,^CXR,1,0,0,0,S,^22A,0,0,2,0,C,^AVV,0,0,2,0,C,^DF1,0,0,2,0,C,^GWL,0,0,1,0,C,^WJC,0,0,1,0,C,^W5C,0,1,0,0,G,^CEC,0,0,2,0,C,^CEF,0,0,1,0,C,^PBA_02,0,0,2,0,C,^PBP_02,0,0,2,0,C,^PFP_02,0,0,2,0,C,^PGA_02,0,0,2,0,C,^PLB_02,0,0,2,0,C,^PPS_02,0,0,2,0,C,^PTM_02,0,0,2,0,C,^PYF_02,0,0,2,0,C,^PR1_02,1,0,0,0,S,`APA^PAU_02,0,0,1,0,C,^PRA_01,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PW3_02,0,0,1,0,C,^PWH_02,0,0,1,0,C,^PX8_01,0,0,1,0,C,^WD_01,0,0,1,0,C,^X9_01,1,0,0,0,S,`APA`AJ^&previousState=||21A,1,0,0,0,S,`EAB`DDF^EAB,2,0,0,0,S,^DDF,2,0,0,0,S,^T1A,1,0,0,0,S,^AJ,2,0,0,0,S,^RAB,1,0,0,0,S,^WCL,1,0,0,0,S,^APA,3,0,0,0,S,^CXR,1,0,0,0,S,^22A,0,0,2,0,C,^AVV,0,0,2,0,C,^DF1,0,0,2,0,C,^GWL,0,0,1,0,C,^WJC,0,0,1,0,C,^W5C,0,1,0,0,G,^CEC,0,0,2,0,C,^CEF,0,0,1,0,C,^PBA_02,0,0,2,0,C,^PBP_02,0,0,2,0,C,^PFP_02,0,0,2,0,C,^PGA_02,0,0,2,0,C,^PLB_02,0,0,2,0,C,^PPS_02,0,0,2,0,C,^PTM_02,0,0,2,0,C,^PYF_02,0,0,2,0,C,^PR1_02,1,0,0,0,S,`APA^PAU_02,0,0,1,0,C,^PRA_01,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PW3_02,0,0,1,0,C,^PWH_02,0,0,1,0,C,^PX8_01,0,0,1,0,C,^WD_01,0,0,1,0,C,^X9_01,1,0,0,0,S,`APA`AJ^&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=21A&daysToLive=&postalCode=M2M4L1&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode 4, String Scratch, String TransactionID 2, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40FIC011A0","false","true", "21A", "", "EN", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly, String defaultColour, String PackageCode, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
	previousState=scratchSave;
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40FIC011A0", "PRA", "simple", "N", scratchSave, "", "N", "false", "true", "21A", "", "", "", "", "", "");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40FIC011A0&code=PRA_01&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=21A&daysToLive=&postalCode=M2M4L1&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="18";	
	tcSpiraId="TC111853";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT11BE1&code=MRT&lmethod=simple&difonly=N&scratchSave=||26K,1,0,0,0,S,`EZH`DFD^Z1C,1,0,0,0,S,^EZH,2,0,0,0,S,^DFD,2,0,0,0,S,^DMC,1,0,0,0,S,^TTN,1,0,0,0,S,^XJ,2,0,0,0,S,^RA4,1,0,0,0,S,^WRH,1,0,0,0,S,^APD,4,0,0,0,S,^28K,0,0,3,0,C,^DMD,0,0,3,0,C,^EXF,0,0,3,0,C,^DMH,0,0,1,0,C,^TUB,0,0,1,0,C,^DJ,0,0,2,0,C,^XT_01,0,0,2,0,C,^XT_03,0,0,2,0,C,^APA,0,0,4,0,C,^PNTTBL01,3,0,0,0,S,`APD^PNTTBL02,0,0,3,0,C,^PUG_01,1,0,0,0,S,`PNTTBL01`APD^PFA_01,0,0,1,0,C,^PRP_02,0,0,1,0,C,^PW7_01,0,0,1,0,C,^PX8_01,0,0,1,0,C,^U1_01,1,0,0,0,S,`PNTTBL01`XJ`APD^&previousState=&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=26K&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT11BE1","false","true", "26K", "", "EN", "", "", "", "", "","1"); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT11BE1&code=MRT&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=26K&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="19";	
	tcSpiraId="TC111854";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT11BE1&code=APA&lmethod=simple&difonly=N&scratchSave=||26K,1,0,0,0,S,`EZH`DFD^Z1C,1,0,0,0,S,^EZH,2,0,0,0,S,^DFD,2,0,0,0,S,^DMC,1,0,0,0,S,^TTN,1,0,0,0,S,^XJ,2,0,0,0,S,^RA4,1,0,0,0,S,^WRH,1,0,0,0,S,^APD,4,0,0,0,S,^28K,0,0,3,0,C,^DMD,0,0,3,0,C,^EXF,0,0,3,0,C,^DMH,0,0,1,0,C,^TUB,0,0,1,0,C,^DJ,0,0,2,0,C,^XT_01,0,0,2,0,C,^XT_03,0,0,2,0,C,^APA,0,0,4,0,C,^PNTTBL01,3,0,0,0,S,`APD^PNTTBL02,0,0,3,0,C,^PUG_01,1,0,0,0,S,`PNTTBL01`APD^PFA_01,0,0,1,0,C,^PRP_02,0,0,1,0,C,^PW7_01,0,0,1,0,C,^PX8_01,0,0,1,0,C,^U1_01,1,0,0,0,S,`PNTTBL01`XJ`APD^&previousState=&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=26K&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT11BE1","false","true", "26K", "", "FR", "", "", "", "", "","1"); //ok! 
	pXMLURL="getselectoption.xml?language=FR&acode=CAC40RMT11BE1&code=APA&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=26K&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="20";	
	tcSpiraId="TC111855";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40DOC191B2&code=MM8&lmethod=simple&difonly=N&scratchSave=||28J,2,0,0,0,S,`EZH`DGJ^EZH,4,0,0,0,S,`DGJ^DGJ,4,0,0,0,S,`EZH^TVJ,1,1,0,0,G,`28J`EZH`DGJ^RL,2,1,0,0,G,^RES,1,0,0,0,S,^WPG,1,1,0,0,G,^APA,2,0,0,0,S,^27J,0,0,3,0,C,^DEC,0,0,3,0,C,^EZC,0,0,3,0,C,^RD7,0,1,0,0,G,^RC6,0,1,0,0,G,^TZF,0,1,0,0,G,^JPM,0,1,0,0,G,^XAA,0,1,0,0,G,^ATL,0,0,1,0,C,^RBZ,0,0,1,0,C,^RHB,0,0,1,0,C,^RHR,0,0,1,0,C,^PR3_02,1,0,0,0,S,^ALB,0,0,1,0,C,^ASC,0,0,1,0,C,^M2H,0,0,1,0,C,^M2J,0,0,1,0,C,^PAU_02,0,0,1,0,C,^PBX_02,0,0,1,0,C,^PHG_02,0,0,2,0,C,^PL4_02,0,0,2,0,C,^PRY_01,0,0,1,0,C,^PSC_02,0,0,1,0,C,^PW7_02,0,0,1,0,C,^PWD_02,0,0,1,0,C,^PX8_01,0,0,1,0,C,^PXT_02,0,0,1,0,C,^WRL,0,0,1,0,C,^DV_01,0,0,1,0,C,^DR_02,1,0,0,0,S,`APA`RL^&previousState=&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=28J&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40DOC191B2","false","true", "28J", "", "EN", "", "", "", "", "","1"); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40DOC191B2&code=MM8&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=true&packageCode=28J&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="21";  //updated and ok
	tcSpiraId="TC111856";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40DOC191B2","false","true", "28J", "", "FR", "", "", "", "", "","0"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language, String Acode, String Code, String LMethod, String DIFONLY, String Scratch, String previousScratch, String showDelta, String paintsOnly, String defaultColour, String PackageCode, String DaysToLive, String postalCode, String ipAddress, String dealerCode, String transactionId, String view)
	previousState=scratchSave;
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC40DOC191B2", "M2J", "simple", "Y", scratchSave, "", "Y", "true", "true", "28J", "", "", "", "", "", "");
	pXMLURL="getselectoption.xml?language=FR&acode=CAC40DOC191B2&code=PL4&lmethod=simple&difonly=Y&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=true&defaultColour=true&packageCode=28J&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="22";
	tcSpiraId="TC111857";	
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30CRC212A0&code=RB5&lmethod=simple&difonly=N&scratchSave=||24C,0,0,3,0,C,^ED3,4,0,0,0,S,`DG2^DFF,0,0,3,0,C,^TR3,1,0,0,0,S,^N7,1,0,0,0,S,^RES,1,0,0,0,S,^WFX,1,0,0,0,S,^APA,1,0,0,0,S,^29C,1,0,0,0,S,`ED3`DG2^DG2,2,0,0,0,S,`ED3^TZC,0,1,0,0,G,^DHD,0,1,0,0,G,^XBN,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=true&defaultColour=false&packageCode=29C&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40CRC212A0","false","true", "29C", "", "FR", "", "", "", "", "",""); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40CRC212A0&code=RB5&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=29C&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="23";	
	tcSpiraId="TC111858";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30CRC212A0&code=MW1&lmethod=simple&difonly=N&scratchSave=||24A,1,0,0,0,S,`ED6`DFH^Z1A,1,0,0,0,S,^ED6,3,0,0,0,S,`DFH^DFH,3,0,0,0,S,`ED6^DME,1,0,0,0,S,^SDA,1,0,0,0,S,^TRA,1,0,0,0,S,^A7,2,0,0,0,S,^RA2,1,0,0,0,S,^WAA,1,0,0,0,S,^APA,3,0,0,0,S,^26A,0,0,5,0,C,^DMC,0,0,5,0,C,^EHB,0,0,5,0,C,^Z1B,0,0,5,0,C,^PGX_02,1,0,0,0,S,`APA^PBU_01,0,0,1,0,C,^PFS_01,0,0,1,0,C,^PRP_02,0,0,1,0,C,^PSC_01,0,0,1,0,C,^PW7_01,0,0,1,0,C,^PXR_02,0,0,1,0,C,^X9_01,0,0,1,0,C,^A9_01,1,0,0,0,S,`APA`A7^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=24A&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40JES041A0","false","true", "24A", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40JES041A0&code=MW1&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=24A&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="24";
		tcSpiraId="TC111859";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT117B3&code=GFA&lmethod=simple&difonly=N&scratchSave=||22G,0,0,4,0,C,^Z6D,1,0,0,0,S,^ERB,0,0,4,0,C,^DFL,0,0,4,0,C,^DMC,1,0,0,0,S,`EZH`DFD^TTM,1,0,0,0,S,^V9,1,0,0,0,S,^RA2,1,0,0,0,S,^WFE,1,0,0,0,S,^APA,2,0,0,0,S,^26G,1,0,0,0,S,`EZH`DFD^28G,0,0,4,0,C,^ATK,0,0,2,0,C,^DFD,3,0,0,0,S,`EZH^DMH,0,0,1,0,C,^EXF,0,0,4,0,C,^EZH,3,0,0,0,S,`DFD^TUB,0,0,2,0,C,^WRF,0,0,2,0,C,^DMD,0,0,4,0,C,^TTN,0,0,2,0,C,^TTY,0,0,2,0,C,^TXN,0,0,1,0,C,^WFJ,0,0,2,0,C,^WHE,0,0,2,0,C,^AGF,0,0,1,0,C,^M9,0,0,1,0,C,^MJ,0,0,1,0,C,^RC3,0,0,1,0,C,^RA3,0,0,1,0,C,^RA4,0,0,1,0,C,^PNTTBL01,1,0,0,0,S,`APA^XBN,0,1,0,0,G,^NER,0,1,0,0,G,^DH8,0,1,0,0,G,^NHN,0,1,0,0,G,^NMC,0,1,0,0,G,^NHD,0,1,0,0,G,^MW5,0,1,0,0,G,^NZD,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=28G&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT117B3","false","true", "28G", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT117B3&code=GFA&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=28G&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="25";	
	tcSpiraId="TC111860";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT117B3&code=ATK&lmethod=simple&difonly=N&scratchSave=||22G,0,0,4,0,C,^Z6D,1,0,0,0,S,^ERB,0,0,4,0,C,^DFL,0,0,4,0,C,^DMC,1,0,0,0,S,`EZH`DFD^TTM,1,0,0,0,S,^V9,1,0,0,0,S,^RA2,1,0,0,0,S,^WFE,1,0,0,0,S,^APA,2,0,0,0,S,^26G,1,0,0,0,S,`EZH`DFD^28G,0,0,4,0,C,^ATK,0,0,2,0,C,^DFD,3,0,0,0,S,`EZH^DMH,0,0,1,0,C,^EXF,0,0,4,0,C,^EZH,3,0,0,0,S,`DFD^TUB,0,0,2,0,C,^WRF,0,0,2,0,C,^DMD,0,0,4,0,C,^TTN,0,0,2,0,C,^TTY,0,0,2,0,C,^TXN,0,0,1,0,C,^WFJ,0,0,2,0,C,^WHE,0,0,2,0,C,^AGF,0,0,1,0,C,^M9,0,0,1,0,C,^MJ,0,0,1,0,C,^RC3,0,0,1,0,C,^RA3,0,0,1,0,C,^RA4,0,0,1,0,C,^PNTTBL01,1,0,0,0,S,`APA^XBN,0,1,0,0,G,^NER,0,1,0,0,G,^DH8,0,1,0,0,G,^NHN,0,1,0,0,G,^NMC,0,1,0,0,G,^NHD,0,1,0,0,G,^MW5,0,1,0,0,G,^NZD,0,1,0,0,G,^&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26G&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC60RMT117B3","false","true", "26G", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC60RMT117B3&code=ATK&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=26G&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="26";	
	tcSpiraId="TC111861";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT117B3&code=WFJ&lmethod=simple&difonly=N&scratchSave=||22G,0,0,5,0,C,^Z6D,1,0,0,0,S,^ERB,0,0,5,0,C,^DFL,0,0,5,0,C,^DMC,1,0,0,0,S,`EZH`DFD^TTM,0,0,1,0,C,^V9,1,0,0,0,S,^RA2,1,0,0,0,S,^WFE,0,0,1,0,C,^APA,2,0,0,0,S,^26G,3,0,0,0,S,`EZH`DFD^28G,0,0,5,0,C,^ATK,1,0,0,0,S,`EZH`DFD^DFD,6,0,0,0,S,`EZH^DMH,0,0,1,0,C,^EXF,0,0,5,0,C,^EZH,6,0,0,0,S,`DFD^DMD,0,0,5,0,C,^TTN,0,1,0,0,G,`WHE`26G`EZH`DFD^TXN,0,0,1,0,C,^WHE,0,1,0,0,G,`26G`EZH`DFD^AGF,0,0,1,0,C,^M9,0,0,1,0,C,^MJ,0,0,1,0,C,^RC3,0,0,1,0,C,^RA3,0,0,1,0,C,^RA4,0,0,1,0,C,^PNTTBL01,1,0,0,0,S,`APA^XBN,0,1,0,0,G,^NER,0,2,0,0,G,^DH8,0,1,0,0,G,^NHN,0,1,0,0,G,^NMC,0,1,0,0,G,^NHD,0,1,0,0,G,^MW5,0,1,0,0,G,^NZD,0,1,0,0,G,^WF1,0,1,0,0,G,^WMJ,0,1,0,0,G,^TBS,0,1,0,0,G,^XJC,0,1,0,0,G,^MFH,0,1,0,0,G,^LNJ,0,1,0,0,G,^ADA,0,1,0,0,G,^JA6,0,1,0,0,G,^LBD,0,1,0,0,G,^GNZ,0,1,0,0,G,^LEU,0,1,0,0,G,^LEB,0,1,0,0,G,^LEC,0,1,0,0,G,^LBC,0,1,0,0,G,^SCV,0,1,0,0,G,^CV2,0,1,0,0,G,^XGD,0,1,0,0,G,^LER,0,1,0,0,G,^GUK,0,1,0,0,G,^LHE,0,1,0,0,G,^GN5,0,1,0,0,G,^RDZ,0,1,0,0,G,^GNC,0,1,0,0,G,^LDA,0,1,0,0,G,^&previousState=||22G,0,0,5,0,C,^Z6D,1,0,0,0,S,^ERB,0,0,5,0,C,^DFL,0,0,5,0,C,^DMC,1,0,0,0,S,`EZH`DFD^TTM,0,0,1,0,C,^V9,1,0,0,0,S,^RA2,1,0,0,0,S,^WFE,0,0,1,0,C,^APA,2,0,0,0,S,^26G,3,0,0,0,S,`EZH`DFD^28G,0,0,5,0,C,^ATK,1,0,0,0,S,`EZH`DFD^DFD,6,0,0,0,S,`EZH^DMH,0,0,1,0,C,^EXF,0,0,5,0,C,^EZH,6,0,0,0,S,`DFD^DMD,0,0,5,0,C,^TTN,0,1,0,0,G,`WHE`26G`EZH`DFD^TXN,0,0,1,0,C,^WHE,0,1,0,0,G,`26G`EZH`DFD^AGF,0,0,1,0,C,^M9,0,0,1,0,C,^MJ,0,0,1,0,C,^RC3,0,0,1,0,C,^RA3,0,0,1,0,C,^RA4,0,0,1,0,C,^PNTTBL01,1,0,0,0,S,`APA^XBN,0,1,0,0,G,^NER,0,2,0,0,G,^DH8,0,1,0,0,G,^NHN,0,1,0,0,G,^NMC,0,1,0,0,G,^NHD,0,1,0,0,G,^MW5,0,1,0,0,G,^NZD,0,1,0,0,G,^WF1,0,1,0,0,G,^WMJ,0,1,0,0,G,^TBS,0,1,0,0,G,^XJC,0,1,0,0,G,^MFH,0,1,0,0,G,^LNJ,0,1,0,0,G,^ADA,0,1,0,0,G,^JA6,0,1,0,0,G,^LBD,0,1,0,0,G,^GNZ,0,1,0,0,G,^LEU,0,1,0,0,G,^LEB,0,1,0,0,G,^LEC,0,1,0,0,G,^LBC,0,1,0,0,G,^SCV,0,1,0,0,G,^CV2,0,1,0,0,G,^XGD,0,1,0,0,G,^LER,0,1,0,0,G,^GUK,0,1,0,0,G,^LHE,0,1,0,0,G,^GN5,0,1,0,0,G,^RDZ,0,1,0,0,G,^GNC,0,1,0,0,G,^LDA,0,1,0,0,G,^&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=26G&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC60RMT117B3","false","true", "26G", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC60RMT117B3", "ATK", "simple", "N", scratchSave, "", "N", "false", "true", "26G", "", "", "", "", "", "1");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC60RMT117B3&code=WFJ&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=26G&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="27";	
	tcSpiraId="TC111862";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30JES011C0&code=APA&lmethod=simple&difonly=N&scratchSave=||23R,1,0,0,0,S,`ERB`DEH^Z1A,1,0,0,0,S,DMF,1,1,0,0,G,`DEH^ERB,2,0,0,0,S,^DEH,3,0,0,0,S,^SDD,1,0,0,0,S,^A7,1,0,0,0,S,^RES,1,0,0,0,S,^WFA,1,0,0,0,S,^TT7,1,0,0,0,S,^APA,2,0,0,0,S,^PNTTBL01,1,0,0,0,S,`APA^23J,0,0,4,0,C,^24J,0,0,5,0,C,^24R,0,0,2,0,C,^DGJ,0,0,2,0,C,^DME,0,0,2,0,C,^JY,0,0,4,0,C,^TXH,0,0,4,0,C,^WFE,0,0,4,0,C,^XBM,0,0,2,0,C,^AL,0,0,1,0,C,^X9_02,0,0,1,0,C,^XR_01,0,0,1,0,C,^RHB,0,0,1,0,C,^RHR,0,0,1,0,C,^PNTTBL02,0,0,1,0,C,&previousState=&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC60JES011C0","false","false", "", "", "FR", "", "", "", "", "","1"); //ok! 
	pXMLURL="getselectoption.xml?language=FR&acode=CAC60JES011C0&code=APA&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="28";	
	tcSpiraId="TC111863";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT111A2","false","true", "", "", "EN", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language, String Acode, String Code, String LMethod, String DIFONLY, String Scratch, String previousScratch, String showDelta, String paintsOnly, String defaultColour, String PackageCode, String DaysToLive, String postalCode, String ipAddress, String dealerCode, String transactionId, String view)
	previousState=scratchSave;
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40RMT111A2", "RA2", "simple", "N", scratchSave, "", "Y", "false", "true", "", "", "", "", "", "", "1");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40RMT111A2&code=RA1&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=true&defaultColour=true&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="29";	
	tcSpiraId="TC111864";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT111A2","false","true", "", "", "EN", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language, String Acode, String Code, String LMethod, String DIFONLY, String Scratch, String previousScratch, String showDelta, String paintsOnly, String defaultColour, String PackageCode, String DaysToLive, String postalCode, String ipAddress, String dealerCode, String transactionId, String view)
	previousState=scratchSave;
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50RMT111A2", "RA2", "simple", "N", scratchSave, "", "Y", "false", "true", "", "", "", "", "", "", "1");
	pXMLURL="getselectoption.xml?language=EN&acode=CAC50RMT111A2&code=RA1&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=true&defaultColour=true&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="30";	
	tcSpiraId="TC111865";
//	pXMLURL="getselectoption.xml?language=EN&acode=CAC30RMT111A2&code=RA1&lmethod=simple&difonly=N&scratchSave=||23A,1,0,0,0,S,%60EVE%60DG1^EVE,3,0,0,0,S,%60DG1^DG1,3,0,0,0,S,%60EVE^Z1H,1,0,0,0,S,^DMD,1,0,0,0,S,%60^TX,1,0,0,0,S,^RA1,0,0,2,0,C,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,3,0,C,^22B,0,0,3,0,C,^25A,0,0,4,0,C,^26A,0,0,4,0,C,^DFD,0,0,4,0,C,^DFG,0,0,3,0,C,^DMC,0,0,4,0,C,^ERB,0,0,3,0,C,^EZH,0,0,4,0,C,^GPG_,0,0,1,0,C,^XM9,0,0,1,0,C,^XME_,0,0,1,0,C,^Z1K,0,0,4,0,C,^XKN,0,1,0,0,G,^DMH,0,0,1,0,C,^AJY_,0,0,1,0,C,^V9,0,0,1,0,C,^RA2,2,0,0,0,S,^TXN,0,0,1,0,C,^PR4_01,1,0,0,0,S,^PAR_02,0,0,1,0,C,^PBU_01,0,0,1,0,C,^PDM_02,0,0,1,0,C,^PEP_02,0,0,1,0,C,^PFA_01,0,0,1,0,C,^PLB_01,0,0,1,0,C,^PRP_02,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PUG_01,0,0,1,0,C,^PW7_01,0,0,1,0,C,^PX8_01,0,0,1,0,C,^RSD,1,0,0,0,S,%60RA2^X9B,0,1,0,0,G,^GR4,0,1,0,0,G,^&previousState=||23A,1,0,0,0,S,%60EVE%60DG1^EVE,3,0,0,0,S,%60DG1^DG1,3,0,0,0,S,%60EVE^Z1H,1,0,0,0,S,^DMD,1,0,0,0,S,%60^TX,1,0,0,0,S,^RA1,0,0,2,0,C,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,3,0,C,^22B,0,0,3,0,C,^25A,0,0,4,0,C,^26A,0,0,4,0,C,^DFD,0,0,4,0,C,^DFG,0,0,3,0,C,^DMC,0,0,4,0,C,^ERB,0,0,3,0,C,^EZH,0,0,4,0,C,^GPG_,0,0,1,0,C,^XM9,0,0,1,0,C,^XME_,0,0,1,0,C,^Z1K,0,0,4,0,C,^XKN,0,1,0,0,G,^DMH,0,0,1,0,C,^AJY_,0,0,1,0,C,^V9,0,0,1,0,C,^RA2,2,0,0,0,S,^TXN,0,0,1,0,C,^PR4_01,1,0,0,0,S,^PAR_02,0,0,1,0,C,^PBU_01,0,0,1,0,C,^PDM_02,0,0,1,0,C,^PEP_02,0,0,1,0,C,^PFA_01,0,0,1,0,C,^PLB_01,0,0,1,0,C,^PRP_02,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PUG_01,0,0,1,0,C,^PW7_01,0,0,1,0,C,^PX8_01,0,0,1,0,C,^RSD,1,0,0,0,S,%60RA2^X9B,0,1,0,0,G,^GR4,0,1,0,0,G,^&showDelta=N&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	scratchSave  ="";
	previousState="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT111A2","false","true", "", "", "FR", "", "", "", "", "","1"); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
	previousState=scratchSave;
	scratchSave=getSelectOption.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC50RMT111A2", "RA2", "simple", "N", scratchSave, "", "Y", "false", "true", "", "", "", "", "", "", "1");

	pXMLURL="getselectoption.xml?language=FR&acode=CAC50RMT111A2&code=RA1&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=N&paintsOnly=true&defaultColour=true&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=1";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="31";	
	tcSpiraId="TC111866";
	scratchSave  ="";
	previousState="";
//	getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40CRC212A0","false","true", "", "", "EN", "", "", "", "", "","0"); //ok! 
	pXMLURL="getselectoption.xml?language=EN&acode=CAC40CRC212A0&code=AWS&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState=&showDelta=Y&paintsOnly=true&defaultColour=true&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="32";	
	tcSpiraId="TC111867";
	scratchSave  ="";
	previousState="";
//	getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC40CRC212A0","false","true", "", "", "FR", "", "", "", "", "","0"); //ok! 
	pXMLURL="getselectoption.xml?language=FR&acode=CAC40CRC212A0&code=AWS&lmethod=simple&difonly=N&scratchSave=&previousState=&showDelta=Y&paintsOnly=false&defaultColour=false&packageCode=&daysToLive=&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
// tc 33,34,35,36 are for CCP-6202, CCP-6287 	
	tc="33";	//CCP-6202 EN
	tcSpiraId="TC111868";
	scratchSave  ="";
	previousState="";
//	getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT125A0","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getselectoption.xml?language=EN&acode=CAC50RMT125A0&code=DMF&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=false&defaultColour=true&packageCode=26A&daysToLive=60&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	tc="34";	//CCP-6202 FR
	tcSpiraId="TC111869";
	scratchSave  ="";
	previousState="";
//	getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT125A0","false","false", "", "", "FR", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getselectoption.xml?language=FR&acode=CAC50RMT125A0&code=DMF&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=false&defaultColour=true&packageCode=26A&daysToLive=60&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);	
	tc="35";	//CCP-6287 	EN
	tcSpiraId="TC111870";
	scratchSave  ="";
	previousState="";
//	getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT117A2","false","false", "28B", "", "EN", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getselectoption.xml?language=EN&acode=CAC50RMT117A2&code=CKE&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=false&defaultColour=true&packageCode=28B&daysToLive=60&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);	
	tc="36";	//CCP-6287 	FR
	tcSpiraId="TC111871";
	scratchSave  ="";
	previousState="";
//	getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSelectOption.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT117A2","false","false", "28B", "", "FR", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getselectoption.xml?language=FR&acode=CAC50RMT117A2&code=CKE&lmethod=simple&difonly=N&scratchSave="+scratchSave+"&previousState="+previousState+"&showDelta=Y&paintsOnly=false&defaultColour=true&packageCode=28B&daysToLive=60&postalCode=&ipAddress=&dealerCode=&transactionId=&view=0";
	System.out.println(tcSpiraId+" Please Wait...getSelectOption");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectOption.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectOption.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectOption.compare(wsName,true);
	
}
public static void getSelectedOptions(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//14D. getSelectedOptions 	 DW, DC
		wsName="getSelectedOptions";		 
		LoadWebServiceChryslerCA getSelectedOptions  = new LoadWebServiceChryslerCA();
		getSelectedOptions.SetFolderName(dwc);
		getSelectedOptions.dataDir=getSelectedOptions.GetFolderName();
		 getSelectedOptions.SetFolderName(env1);
		 getSelectedOptions.firstEnvName=getSelectedOptions.GetFolderName();
		 getSelectedOptions.SetFolderName(env2);
		 getSelectedOptions.secondEnvName=getSelectedOptions.GetFolderName();
		tc="14D_1";	
		tcSpiraId="TC111873";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40FIC011B0","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40FIC011B0", "AZ7", "simple", "N", scratchSave, "", "Y", "false", "true", "", "", "", "", "", "", "1");
		pXMLURL="getselectedoptions.xml?language=EN&acode=CAC40FIC011B0&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="2";
			tcSpiraId="TC111874";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		//Step 10
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40FIC011E1","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		//Step 13
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40FIC011E1", "M2X", "simple", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");
		//Step 18
		previousState=scratchSave;
		//Step 18?
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40FIC011E1", "M2X", "simple", "N", scratchSave, previousState, "N", "false", "false", "", "", "", "", "", "", "");
		//Step 19
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40FIC011E1", "PR1", "simple", "N", scratchSave, previousState, "N", "false", "false", "", "", "", "", "", "", "");
		//Step 22
		pXMLURL="getselectedoptions.xml?language=EN&acode=CAC40FIC011E1&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);	
		tc="3";	
		tcSpiraId="TC111875";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		//Step 10
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40CRC142B0","true","true", "22R", "", "FR", "", "", "", "", "",""); //ok! 
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		//Step 14-18
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC40CRC142B0", "PWD", "complete", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");
		//Step 19-20
		pXMLURL="getselectedoptions.xml?language=FR&acode=CAC40CRC142B0&paintsOnly=true&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);	
		tc="4";	
		tcSpiraId="TC111876";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		//Step 10
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40DOC191A4","true","true", "", "", "FR", "", "", "", "", "",""); //ok! 
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		//Step 13-17
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC40DOC191A4", "LMP", "complete", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");
		//Step 19-20		
		pXMLURL="getselectedoptions.xml?language=FR&acode=CAC40DOC191A4&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=0";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="5";	
		tcSpiraId="TC111877";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		//Step 10
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40FIC011B0","false","false", "22D", "", "EN", "", "", "", "", "",""); //ok! 
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		//Step 13-17
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40FIC011B0", "AZ7", "complete", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");
		pXMLURL="getselectedoptions.xml?language=EN&acode=CAC40FIC011B0&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=Y&daysToLive=";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="6";	
		tcSpiraId="TC111878";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT116A2","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40RMT116A2", "TTM", "simple", "N", scratchSave, "", "Y", "false", "true", "", "", "", "", "", "", "1");
		pXMLURL="getselectedoptions.xml?language=EN&acode=CAC40RMT116A2&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="7";	
		tcSpiraId="TC111879";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT116A2","true","false", "22B", "-1", "EN", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC40RMT116A2", "TTM", "simple", "N", scratchSave, "", "Y", "false", "true", "", "-1", "", "", "", "", "1");
		pXMLURL="getselectedoptions.xml?language=EN&acode=CAC40RMT116A2&paintsOnly=true&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="8";	
		tcSpiraId="TC111880";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC40RMT116A2","true","false", "22B", "-1", "FR", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC40RMT116A2", "TTM", "simple", "N", scratchSave, "", "Y", "false", "true", "", "-1", "", "", "", "", "1");
		pXMLURL="getselectedoptions.xml?language=FR&acode=CAC40RMT116A2&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="9";	
		tcSpiraId="TC111881";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT116A2","true","false", "", "", "EN", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50RMT116A2", "TTM", "simple", "N", scratchSave, "", "Y", "false", "true", "", "", "", "", "", "", "1");
		pXMLURL="getselectedoptions.xml?language=EN&acode=CAC50RMT116A2&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="10";	
		tcSpiraId="TC111882";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT116A2","true","false", "22B", "-1", "FR", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC50RMT116A2", "TTM", "simple", "N", scratchSave, "", "Y", "false", "true", "", "-1", "", "", "", "", "1");
		pXMLURL="getselectedoptions.xml?language=FR&acode=CAC50RMT116A2&paintsOnly=true&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="11";	
		tcSpiraId="TC115151";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC50CRC142B0","true","true", "", "", "EN", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50CRC142B0", "PWD", "simple", "N", scratchSave, "", "N", "false", "true", "", "", "", "", "", "", "");
		pXMLURL="getselectedoptions.xml?language=EN&acode=CAC50CRC142B0&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);
		tc="12";	
		tcSpiraId="TC111883";
		scratchSave  ="";
		previousState="";
//		getScratchFromConfigVehicle(String prefix, String Acode 2, String PaintOnly, String DefaultColor 4, String PackageCode, String DaysToLive 6, String Language, String PostalCode 8, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
		scratchSave=getSelectedOptions.getScratchFromConfigVehicle(prodPrefix, "CAC50CRC142B0","true","true", "", "", "FR", "", "", "", "", "",""); //ok! 
		previousState=scratchSave;
//		getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
		scratchSave=getSelectedOptions.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC50CRC142B0", "PWD", "simple", "N", scratchSave, "", "N", "false", "true", "", "", "", "", "", "", "");
		pXMLURL="getselectedoptions.xml?language=FR&acode=CAC50CRC142B0&paintsOnly=false&scratchSave="+scratchSave+"&excludeoptions=N&daysToLive=-1";
		System.out.println(tcSpiraId+" Please Wait...getSelectedOptions ");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSelectedOptions .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSelectedOptions .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getSelectedOptions .compare(wsName,true);

}
public static void getSelectedOptionsWithICC(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//14E. getSelectedOptionsWithICC 	 DC
	wsName="getSelectedOptionsWithICC";		 
	LoadWebServiceChryslerCA getSelectedOptionsWithICC  = new LoadWebServiceChryslerCA();
	getSelectedOptionsWithICC.SetFolderName(dc);
	getSelectedOptionsWithICC.dataDir=getSelectedOptionsWithICC.GetFolderName();
	 getSelectedOptionsWithICC.SetFolderName(env1);
	 getSelectedOptionsWithICC.firstEnvName=getSelectedOptionsWithICC.GetFolderName();
	 getSelectedOptionsWithICC.SetFolderName(env2);
	 getSelectedOptionsWithICC.secondEnvName=getSelectedOptionsWithICC.GetFolderName();
	tc="14E_1";	
	tcSpiraId="TC098071";
	pXMLURL="getselectedoptionswithicc.xml?language=EN&acode=CAC50DOV171A2&paintsOnly=false&scratchSave=&excludeoptions=N&daysToLive=";
	System.out.println(tcSpiraId+" Please Wait...getSelectedOptionsWithICC ");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectedOptionsWithICC .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectedOptionsWithICC .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectedOptionsWithICC .compare(wsName,true);	
	tc="2";	
	tcSpiraId="TC098072";
	pXMLURL="getselectedoptionswithicc.xml?language=FR&acode=CAC50DOV171A2&paintsOnly=false&scratchSave=&excludeoptions=N&daysToLive=";
	System.out.println(tcSpiraId+" Please Wait...getSelectedOptionsWithICC ");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectedOptionsWithICC .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectedOptionsWithICC .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectedOptionsWithICC .compare(wsName,true);	
	tc="3";	
	tcSpiraId="TC098073";
	pXMLURL="getselectedoptionswithicc.xml?language=EN&acode=CAC50RMT116A2&paintsOnly=false&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^PEP_02,1,0,0,0,S,^PAR_02,0,0,1,0,C,^PBU_01,0,0,1,0,C,^PDM_02,0,0,1,0,C,^PFA_01,0,0,1,0,C,^PLB_01,0,0,1,0,C,^PR4_01,0,0,1,0,C,^PRP_02,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PUG_01,0,0,1,0,C,^PW7_01,0,0,1,0,C,^PX8_01,0,0,1,0,C,^&excludeoptions=N&daysToLive=";
	System.out.println(tcSpiraId+" Please Wait...getSelectedOptionsWithICC ");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectedOptionsWithICC .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectedOptionsWithICC .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectedOptionsWithICC .compare(wsName,true);		
	tc="4";	
	tcSpiraId="TC098074";
	pXMLURL="getselectedoptionswithicc.xml?language=FR&acode=CAC50RMT116A2&paintsOnly=false&scratchSave=||23A,0,0,3,0,C,^Z6F,1,0,0,0,S,^EVE,0,0,3,0,C,^DG1,0,0,3,0,C,^DMD,0,0,1,0,C,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^TTM,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^25A,0,0,3,0,C,^26A,1,0,0,0,S,`EZH`DFD`DMC^DFD,4,0,0,0,S,`EZH^DFG,0,0,4,0,C,^DMC,1,1,0,0,G,`DFD`EZH^ERB,0,0,4,0,C,^EZH,4,0,0,0,S,`DFD^Z6D,0,0,4,0,C,^DMH,0,0,1,0,C,^RA2,0,0,1,0,C,^TXN,0,0,1,0,C,^MDX,0,1,0,0,G,^BAD,0,1,0,0,G,^NHN,0,1,0,0,G,^MW5,0,1,0,0,G,^PEP_02,1,0,0,0,S,^PAR_02,0,0,1,0,C,^PBU_01,0,0,1,0,C,^PDM_02,0,0,1,0,C,^PFA_01,0,0,1,0,C,^PLB_01,0,0,1,0,C,^PR4_01,0,0,1,0,C,^PRP_02,0,0,1,0,C,^PS2_02,0,0,1,0,C,^PUG_01,0,0,1,0,C,^PW7_01,0,0,1,0,C,^PX8_01,0,0,1,0,C,^&excludeoptions=N&daysToLive=-1";
	System.out.println(tcSpiraId+" Please Wait...getSelectedOptionsWithICC ");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectedOptionsWithICC .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectedOptionsWithICC .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectedOptionsWithICC .compare(wsName,true);	
	tc="5";	
	tcSpiraId="TC098075";
	pXMLURL="getselectedoptionswithicc.xml?language=FR&acode=CAC40CRC131B0&paintsOnly=false&scratchSave=||22G,1,0,0,0,S,`ERB`DFL^ERB,3,0,0,0,S,`DFL^DFL,3,0,0,0,S,`ERB^TVJ,1,0,0,0,S,^DL,2,0,0,0,S,^RE2,0,0,1,0,C,^WRD,1,0,0,0,S,^APA,3,0,0,0,S,^29G,0,0,3,0,C,^DGJ,0,0,3,0,C,^EZH,0,0,3,0,C,^CDM,0,1,0,0,G,^RB5,1,0,0,0,S,^WP1,0,0,1,0,C,^PW7_01,1,0,0,0,S,`APA^PAU_02,0,0,1,0,C,^PBX_01,0,0,1,0,C,^PRP_01,0,0,2,0,C,^PSC_02,0,0,1,0,C,^PWD_02,0,0,1,0,C,^PX8_01,0,0,1,0,C,^PXT_02,0,0,1,0,C,^X9_01,0,0,1,0,C,^XB_01,1,0,0,0,S,`APA`DL^XR_01,0,0,1,0,C,^RFL,0,1,0,0,G,^RSU,0,1,0,0,G,^JLB,0,1,0,0,G,^RSX,0,1,0,0,G,^RSC,0,1,0,0,G,^&excludeoptions=N&daysToLive=";
	System.out.println(tcSpiraId+" Please Wait...getSelectedOptionsWithICC ");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSelectedOptionsWithICC .loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSelectedOptionsWithICC .loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSelectedOptionsWithICC .compare(wsName,true);	
	
}
public static void getSaveXml(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//14F. getSaveXml 	 DC - To load click Post, right click, View Source. Copy and paste into DATA on getRestore - using Post as well.
	wsName="getSaveXml";		 
	LoadWebServiceChryslerCA getSaveXml = new LoadWebServiceChryslerCA();
	getSaveXml.SetFolderName(dc);
	getSaveXml.dataDir=getSaveXml.GetFolderName();
	 getSaveXml.SetFolderName(env1);
	 getSaveXml.firstEnvName=getSaveXml.GetFolderName();
	 getSaveXml.SetFolderName(env2);
	 getSaveXml.secondEnvName=getSaveXml.GetFolderName();
	tc="14F_1";	
	tcSpiraId="TC098077";
	scratchSave  ="";
	previousState="";//
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSaveXml.getScratchFromConfigVehicle(prodPrefix, "CAC50DOS041B2","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getsavexml.xml?language=EN&acode=CAC50DOS041B2&scratchSave="+scratchSave+"&daysToLive=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...getSaveXml");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSaveXml.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSaveXml.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSaveXml.compare(wsName,true);	
	tc="2";	
	tcSpiraId="TC098078";
	scratchSave  ="";
	previousState="";//
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSaveXml.getScratchFromConfigVehicle(prodPrefix, "CAC50DOS041B2","false","false", "", "", "FR", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getsavexml.xml?language=FR&acode=CAC50DOS041B2&scratchSave="+scratchSave+"&daysToLive=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...getSaveXml");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSaveXml.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSaveXml.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSaveXml.compare(wsName,true);	
	tc="3";	
	tcSpiraId="TC098079";
	scratchSave  ="";
	previousState="";//
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSaveXml.getScratchFromConfigVehicle(prodPrefix, "CAC60RMT111B2","false","false", "", "-1", "EN", "", "", "", "", "",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getsavexml.xml?language=EN&acode=CAC60RMT111B2&scratchSave="+scratchSave+"&daysToLive=-1&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...getSaveXml");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSaveXml.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSaveXml.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSaveXml.compare(wsName,true);			
	tc="4";	
	tcSpiraId="TC098080";
	scratchSave  ="";
	previousState="";//
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getSaveXml.getScratchFromConfigVehicle(prodPrefix, "CAC60RMT111B2","false","false", "", "0", "FR", "", "", "", "", "1",""); //ok! 
	previousState=scratchSave;
	pXMLURL="getsavexml.xml?language=EN&acode=CAC60RMT111B2&scratchSave="+scratchSave+"&daysToLive=0&transactionId=1";
	System.out.println(tcSpiraId+" Please Wait...getSaveXml");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getSaveXml.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getSaveXml.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getSaveXml.compare(wsName,true);			

}
public static void getRestore(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2) throws Exception{
	//14G. getRestore	
	String acode,lanCode,showDelta,submitType,transactionId,scratchSaveString,getSaveXML;
	String urlParametersString;
	wsName="getRestore";
	LoadWebServiceChryslerCA getRestore = new LoadWebServiceChryslerCA();
	getRestore.SetFolderName(dwc);
	getRestore.dataDir=getRestore.GetFolderName();
	getRestore.SetFolderName(env1);
	getRestore.firstEnvName=getRestore.GetFolderName();
	getRestore.SetFolderName(env2);
	getRestore.secondEnvName=getRestore.GetFolderName();
	tc="14G_1";
	tcSpiraId="TC098082";
	//This API used to be done by QTP script
	
	acode="CAC50DOS041B2";
	lanCode="EN";
	showDelta="N";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";

	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
//	Passed above. Failed to match manual test below with scratchSave. Haven't figured out why???
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
//	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&submitType="+submitType+"&data="+getSaveXML;

	//	System.out.println(getRestore.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
	
	
	tc="2";
	tcSpiraId="TC098083";
	acode="CAC50DOS041B2";
	lanCode="FR";
	showDelta="N";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";
	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
	
	tc="3";
	tcSpiraId="TC098084";
	acode="CAC60RMT111B2";
	lanCode="EN";
	showDelta="Y";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";
	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
	
	tc="4";
	tcSpiraId="TC098085";
	acode="CAC60RMT111B2";
	lanCode="FR";
	showDelta="Y";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";
	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
}
public static void getInventoryDetailForDealer(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	15. getInventoryDetailForDealer	 
 wsName="getInventoryDetailForDealer";
		LoadWebServiceChryslerCA getInventoryDetailForDealer = new LoadWebServiceChryslerCA();
		getInventoryDetailForDealer.SetFolderName(dwc);
		 getInventoryDetailForDealer.dataDir=getInventoryDetailForDealer.GetFolderName();
		 getInventoryDetailForDealer.SetFolderName(env1);
		 getInventoryDetailForDealer.firstEnvName=getInventoryDetailForDealer.GetFolderName();
		 getInventoryDetailForDealer.SetFolderName(env2);
		 getInventoryDetailForDealer.secondEnvName=getInventoryDetailForDealer.GetFolderName();
		tc="15_1";	
		tcSpiraId="TC123427";
		pXMLURL="getinventorydetailfordealer.xml?vin=3C4PDDFG6FT533464&dealerCode=C8552&language=EN";
		System.out.println(tcSpiraId+" Please Wait...getInventoryDetailForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getInventoryDetailForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getInventoryDetailForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getInventoryDetailForDealer.compare(wsName,true);
		tc="2";
		tcSpiraId="TC123428";		
		pXMLURL="getinventorydetailfordealer.xml?vin=3C4PDDFG6FT533464&dealerCode=C8552&language=FR";
		System.out.println(tcSpiraId+" Please Wait...getInventoryDetailForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getInventoryDetailForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getInventoryDetailForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getInventoryDetailForDealer.compare(wsName,true);
		tc="3";
		tcSpiraId="TC123429";
		pXMLURL="getinventorydetailfordealer.xml?vin=1C6RR7GTXFS525772&dealerCode=C8552&language=EN";
		System.out.println(tcSpiraId+" Please Wait...getInventoryDetailForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getInventoryDetailForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getInventoryDetailForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getInventoryDetailForDealer.compare(wsName,true);
		tc="4";
		tcSpiraId="TC123430";
		pXMLURL="getinventorydetailfordealer.xml?vin=3C6TR5HT2EG319490&dealerCode=C8552&language=FR";
		System.out.println(tcSpiraId+" Pleas Wait...getInventoryDetailForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getInventoryDetailForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getInventoryDetailForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getInventoryDetailForDealer.compare(wsName,true);
}
public static void getSearchInventoryForDealer(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2) {
//	16. getSearchInventoryForDealer	 
	boolean comp;
	String hd="<ROW VIN=";
	String tl="/>";
 wsName="getSearchInventoryForDealer";
		LoadWebServiceChryslerCA getSearchInventoryForDealer = new LoadWebServiceChryslerCA();
		getSearchInventoryForDealer.SetFolderName(dwc);
		getSearchInventoryForDealer.dataDir=getSearchInventoryForDealer.GetFolderName();
		 getSearchInventoryForDealer.SetFolderName(env1);
		 getSearchInventoryForDealer.firstEnvName=getSearchInventoryForDealer.GetFolderName();
		 getSearchInventoryForDealer.SetFolderName(env2);
		 getSearchInventoryForDealer.secondEnvName=getSearchInventoryForDealer.GetFolderName();
		tc="16_1";	
		tcSpiraId="TC123432";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C5719&language=&typeId=&stockNum=&statusId=100&year=2014&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Please Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		tc="2";
		tcSpiraId="TC123433";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C8552&language=EN&typeId=&stockNum=AV10841&statusId=&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Please Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="3";
		tcSpiraId="TC123434";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C8552&language=FR&typeId=&stockNum=AV10842&statusId=&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Please Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="4";
		tcSpiraId="TC123435";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C5136&language=&typeId=100&stockNum=&statusId=&year=&make=Chrysler&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Pleas Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="5";
		tcSpiraId="TC123436";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C5136&language=&typeId=101&stockNum=&statusId=&year=&make=&model=Patriot&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Pleas Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="6";
		tcSpiraId="TC123437";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C5136&language=&typeId=&stockNum=&statusId=&year=&make=&model=&trim=SXT&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Pleas Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="7";
		tcSpiraId="TC123438";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C8552&language=&typeId=&stockNum=&statusId=&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=DV&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Pleas Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="8";
		tcSpiraId="TC123439";
		pXMLURL="getsearchinventoryfordealer.xml?dealerCode=C5136&language=&typeId=&stockNum=&statusId=&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=PAU&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&optionDetails=N";
		System.out.println(tcSpiraId+" Pleas Wait...getSearchInventoryForDealer");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealer.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealer.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
}
public static void getLocateDealer(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	17. getLocateDealer	 
//	&includeBranches=N BETWEEN &mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=
	wsName="getLocateDealer";
	LoadWebServiceChryslerCA getLocateDealer = new LoadWebServiceChryslerCA();
	getLocateDealer.SetFolderName(dwc);
	getLocateDealer.dataDir=getLocateDealer.GetFolderName();
	getLocateDealer.SetFolderName(env1);
	getLocateDealer.firstEnvName=getLocateDealer.GetFolderName();
	getLocateDealer.SetFolderName(env2);
	getLocateDealer.secondEnvName=getLocateDealer.GetFolderName();
	tc="17_1";	
	tcSpiraId="TC123441";
	pXMLURL="getlocatedealer.xml?postalCode=M1P3J2&ipAddress=&radius=100&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=Y&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Please Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);						
	tc="2";
	tcSpiraId="TC123442";
	pXMLURL="getlocatedealer.xml?postalCode=N6H4P4&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Please Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="3";
	tcSpiraId="TC123443";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=LONDON&province=ON&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Please Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="4";
	tcSpiraId="TC123444";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=GRIMSBY&province=ONTARIO&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="5";
	tcSpiraId="TC123445";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="6";
	tcSpiraId="TC123446";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=216.108.101.0&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=Y&commercialVehicleDealerOnly=Y&mediumDutyTruckDealerOnly=Y&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);						
	tc="7";
	tcSpiraId="TC123447";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=&province=&likes=star&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	//unable to load since the space btw post code. After removed space, it loads the xml
	tc="8";
	tcSpiraId="TC123448";
	pXMLURL="getlocatedealer.xml?postalCode=N7G3J4&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	//unable to load since the space btw post code. After removed space, it loads the xml
	tc="9";
	tcSpiraId="TC123449";
	pXMLURL="getlocatedealer.xml?postalCode=J9E2E7&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	//unable to load since the space btw post code. After removed space, it loads the xml
	tc="10";
	tcSpiraId="TC123450";
	pXMLURL="getlocatedealer.xml?postalCode=J7K2X6&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);			
	//unable to load since the space btw post code. After removed space, it loads the xml
	tc="11";
	tcSpiraId="TC123451";
	pXMLURL="getlocatedealer.xml?postalCode=L7G4T1&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);						
	tc="12";
	tcSpiraId="TC123452";
	pXMLURL="getlocatedealer.xml?postalCode=Z0Z0Z0&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="13";
	tcSpiraId="TC123453";
	pXMLURL="getlocatedealer.xml?postalCode=Z0Z0Z0&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="14";
	tcSpiraId="TC123454";
	pXMLURL="getlocatedealer.xml?postalCode=Z0Z0Z0&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	//unable to load since the space btw post code. After removed space, it loads the xml
	tc="15";
	tcSpiraId="TC123455";
	pXMLURL="getlocatedealer.xml?postalCode=N9A7H7&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	//Below are Including BranchDealer=Y 
	tc="16";	
	tcSpiraId="TC123456";
	pXMLURL="getlocatedealer.xml?postalCode=M1P3J2&ipAddress=&radius=100&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=Y&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Please Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);						
	tc="17";
	tcSpiraId="TC123457";
	pXMLURL="getlocatedealer.xml?postalCode=N6H4P4&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Please Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="18";
	tcSpiraId="TC123458";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=LONDON&province=ON&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Please Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="19";
	tcSpiraId="TC123459";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=GRIMSBY&province=ONTARIO&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="20";
	tcSpiraId="TC123460";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="21";
	tcSpiraId="TC123461";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=216.108.101.0&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=Y&commercialVehicleDealerOnly=Y&mediumDutyTruckDealerOnly=Y&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);						
	tc="22";
	tcSpiraId="TC123462";
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=&province=&likes=star&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="23";
	tcSpiraId="TC123463";
	pXMLURL="getlocatedealer.xml?postalCode=N7G3J4&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="24";
	tcSpiraId="TC123464";
	pXMLURL="getlocatedealer.xml?postalCode=J9E2E7&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="25";
	tcSpiraId="TC123465";
	pXMLURL="getlocatedealer.xml?postalCode=J7K2X6&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);			
	tc="26";
	tcSpiraId="TC123466";
	pXMLURL="getlocatedealer.xml?postalCode=L7G4T1&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);						
	tc="27";
	tcSpiraId="TC123467";
	pXMLURL="getlocatedealer.xml?postalCode=Z0Z0Z0&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="28";
	tcSpiraId="TC123468";
	pXMLURL="getlocatedealer.xml?postalCode=Z0Z0Z0&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="29";
	tcSpiraId="TC123469";
	pXMLURL="getlocatedealer.xml?postalCode=Z0Z0Z0&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="30";
	tcSpiraId="TC123470";
	pXMLURL="getlocatedealer.xml?postalCode=N9A7H7&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);
// For New EDIM Importer 5.1.0.9 marks all branch dealer with isChryslerFranciasis	
	tc="31";
	tcSpiraId="TC123471";
	pXMLURL="getlocatedealer.xml?postalCode=E3Z3C7&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="32";
	tcSpiraId="TC123472";
	pXMLURL="getlocatedealer.xml?postalCode=A2H6H6&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="33";
	tcSpiraId="TC123473";
	pXMLURL="getlocatedealer.xml?postalCode=R9A1L1&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="34";
	tcSpiraId="TC123474";
	pXMLURL="getlocatedealer.xml?postalCode=P0M1H0&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="35";
	tcSpiraId="TC123475";
	pXMLURL="getlocatedealer.xml?postalCode=R0L1Z0&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);			
	tc="36";
	tcSpiraId="TC123476";
	pXMLURL="getlocatedealer.xml?postalCode=V5X4V2&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);						
	tc="37";
	tcSpiraId="TC123477";
	pXMLURL="getlocatedealer.xml?postalCode=S0A1S0&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="38";
	tcSpiraId="TC123478";
	pXMLURL="getlocatedealer.xml?postalCode=G0R3N0&ipAddress=&radius=&city=&province=&likes=&vehBrands=CD&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="39";
	tcSpiraId="TC123479";
	pXMLURL="getlocatedealer.xml?postalCode=G8H1Z3&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="40";
	tcSpiraId="TC123480";
	pXMLURL="getlocatedealer.xml?postalCode=R7N1M8&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);
	tc="41";
	tcSpiraId="TC123481";
	pXMLURL="getlocatedealer.xml?postalCode=G8H1Z3&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=FR";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="42";
	tcSpiraId="TC123482";
	pXMLURL="getlocatedealer.xml?postalCode=R7N1M8&ipAddress=&radius=&city=&province=&likes=&vehBrands=AL&creditAppOnly=N&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=FR";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);
// CreditAppDlr
	tc="43";	
	tcSpiraId="TC135514"; 
	pXMLURL="getlocatedealer.xml?postalCode=M1P3J2&ipAddress=&radius=100&city=&province=&likes=&vehBrands=CD&creditAppOnly=Y&xpressLubeDealer=N&sprinterOnly=Y&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=N&transactionId=&language=";
	System.out.println(tcSpiraId+" Please Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);	
	tc="44";
	tcSpiraId="TC135515"; 
	pXMLURL="getlocatedealer.xml?postalCode=S0A1S0&ipAddress=&radius=&city=&province=&likes=&vehBrands=FI&creditAppOnly=Y&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);
	tc="45";
	tcSpiraId="TC135516"; 
	pXMLURL="getlocatedealer.xml?postalCode=&ipAddress=&radius=&city=&province=&likes=star&vehBrands=CD&creditAppOnly=Y&xpressLubeDealer=N&sprinterOnly=N&digitalDealerOnly=N&commercialVehicleDealerOnly=N&mediumDutyTruckDealerOnly=N&includeBranches=Y&transactionId=&language=";
	System.out.println(tcSpiraId+" Pleas Wait...getLocateDealer");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getLocateDealer.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getLocateDealer.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getLocateDealer.compare(wsName,true);
	}
public static void getLocateInventory(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	18. getLocateInventory	 
		wsName="getLocateInventory";
		LoadWebServiceChryslerCA getLocateInventory = new LoadWebServiceChryslerCA();
		getLocateInventory.SetFolderName(dwc);
		getLocateInventory.dataDir=getLocateInventory.GetFolderName();
		 getLocateInventory.SetFolderName(env1);
		 getLocateInventory.firstEnvName=getLocateInventory.GetFolderName();
		 getLocateInventory.SetFolderName(env2);
		 getLocateInventory.secondEnvName=getLocateInventory.GetFolderName();
		tc="18_1";	
		tcSpiraId="TC123484";
		pXMLURL="getlocateinventory.xml?postalCode=N6H4P4&ipAddress=&radius=&city=&province=&dealerNameLike=&acode=CAC50JES011A2&model=&trim=&typeId=101&status=&vehBrands=CD&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getLocateInventory");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocateInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocateInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocateInventory.compare(wsName,true);				
		tc="2";
		tcSpiraId="TC123485";
		pXMLURL="getlocateinventory.xml?postalCode=M4W1A1&ipAddress=&radius=&city=&province=&dealerNameLike=&acode=&model=&trim=&typeId=&status=&vehBrands=FI&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getLocateInventory");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocateInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocateInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocateInventory.compare(wsName,true);				
		tc="3";
		tcSpiraId="TC123486";
		pXMLURL="getlocateinventory.xml?postalCode=N6H4P4&ipAddress=&radius=&city=LONDON&province=ONTARIO&dealerNameLike=&acode=&model=&trim=&typeId=&status=&vehBrands=CD&transactionId=12";
		System.out.println(tcSpiraId+" Please Wait...getLocateInventory");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocateInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocateInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocateInventory.compare(wsName,true);		

}
public static void getDealershipInfoShort(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	19. getDealershipInfoShort	 
		wsName="getDealershipInfoShort";
		LoadWebServiceChryslerCA getDealershipInfoShort = new LoadWebServiceChryslerCA();
		getDealershipInfoShort.SetFolderName(dwc);
		getDealershipInfoShort.dataDir=getDealershipInfoShort.GetFolderName();
		 getDealershipInfoShort.SetFolderName(env1);
		 getDealershipInfoShort.firstEnvName=getDealershipInfoShort.GetFolderName();
		 getDealershipInfoShort.SetFolderName(env2);
		 getDealershipInfoShort.secondEnvName=getDealershipInfoShort.GetFolderName();
		tc="19_1";	
		tcSpiraId="TC123488";
		pXMLURL="getdealershipinfoshort.xml?dealerCode=C1028&vehBrands=CD&language=";
		System.out.println(tcSpiraId+" Please Wait...getDealershipInfoShort");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoShort.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoShort.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoShort.compare(wsName,true);	
		tc="2";
		tcSpiraId="TC123489";
		pXMLURL="getdealershipinfoshort.xml?dealerCode=C8552&vehBrands=FI&language=";
		System.out.println(tcSpiraId+" Please Wait...getDealershipInfoShort");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoShort.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoShort.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoShort.compare(wsName,true);	
		tc="3";
		tcSpiraId="TC123490";
		pXMLURL="getdealershipinfoshort.xml?dealerCode=C4658&vehBrands=CD&language=";
		System.out.println(tcSpiraId+" Please Wait...getDealershipInfoShort");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoShort.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoShort.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoShort.compare(wsName,true);	
		tc="4";
		tcSpiraId="TC123491";
		pXMLURL="getdealershipinfoshort.xml?dealerCode=C8051&vehBrands=FI&language=";
		System.out.println(tcSpiraId+" Pleas Wait...getDealershipInfoShort");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoShort.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoShort.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoShort.compare(wsName,true);	
		tc="5";
		tcSpiraId="TC123492";
		pXMLURL="getdealershipinfoshort.xml?dealerCode=C9024&vehBrands=CD&language=";
		System.out.println(tcSpiraId+" Pleas Wait...getDealershipInfoShort");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoShort.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoShort.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoShort.compare(wsName,true);	
		tc="6";
		tcSpiraId="TC123493";
		pXMLURL="getdealershipinfoshort.xml?dealerCode=C9024&vehBrands=CD&language=FR";
		System.out.println(tcSpiraId+" Pleas Wait...getDealershipInfoShort");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoShort.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoShort.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoShort.compare(wsName,true);	
}
public static void getDealershipInfoExtended(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	20. getDealershipInfoExtended	 
		wsName="getDealershipInfoExtended";
		LoadWebServiceChryslerCA getDealershipInfoExtended = new LoadWebServiceChryslerCA();
		getDealershipInfoExtended.SetFolderName(dwc);
		getDealershipInfoExtended.dataDir=getDealershipInfoExtended.GetFolderName();
		
		getDealershipInfoExtended.SetFolderName(env1);
		getDealershipInfoExtended.firstEnvName=getDealershipInfoExtended.GetFolderName();
		getDealershipInfoExtended.SetFolderName(env2);
		getDealershipInfoExtended.secondEnvName=getDealershipInfoExtended.GetFolderName();
		
		tc="20_1";	
		tcSpiraId="TC123495";
		pXMLURL="getdealershipinfoextended.xml?dealerCode=C5719&vehBrands=CD";
		System.out.println(tcSpiraId+" Please Wait...getDealershipInfoExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoExtended.compare(wsName,true);				
		tc="2";
		tcSpiraId="TC123496";
		pXMLURL="getdealershipinfoextended.xml?dealerCode=C3926&vehBrands=FI";
		System.out.println(tcSpiraId+" Please Wait...getDealershipInfoExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoExtended.compare(wsName,true);			
		tc="3";
		tcSpiraId="TC123497";
		pXMLURL="getdealershipinfoextended.xml?dealerCode=C8552&vehBrands=CD";
		System.out.println(tcSpiraId+" Please Wait...getDealershipInfoExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoExtended.compare(wsName,true);				
		tc="4";
		tcSpiraId="TC123498";
		pXMLURL="getdealershipinfoextended.xml?dealerCode=C8552&vehBrands=FI";
		System.out.println(tcSpiraId+" Pleas Wait...getDealershipInfoExtended");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getDealershipInfoExtended.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getDealershipInfoExtended.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getDealershipInfoExtended.compare(wsName,true);				
}
public static void getSearchInventoryForDealerExt(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//21. getSearchInventoryForDealerExt	
	 	boolean comp;
		String hd="<VEHICLE VIN=";
		String tl="</VEHICLE>";
		
		wsName="getSearchInventoryForDealerExt";
		LoadWebServiceChryslerCA getSearchInventoryForDealerExt = new LoadWebServiceChryslerCA();
		getSearchInventoryForDealerExt.SetFolderName(dwc);
		getSearchInventoryForDealerExt.dataDir=getSearchInventoryForDealerExt.GetFolderName();
		 getSearchInventoryForDealerExt.SetFolderName(env1);
		 getSearchInventoryForDealerExt.firstEnvName=getSearchInventoryForDealerExt.GetFolderName();
		 getSearchInventoryForDealerExt.SetFolderName(env2);
		 getSearchInventoryForDealerExt.secondEnvName=getSearchInventoryForDealerExt.GetFolderName();
		tc="21_1";
		tcSpiraId="TC123500";
		pXMLURL="getsearchinventoryfordealerext.xml?dealerCode=C5719&language=EN&typeId=100&stockNum=&statusId=KZX&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&vin=&optionDetails=N";
		System.out.println(tcSpiraId+" Please Wait...getSearchInventoryForDealerExt");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealerExt.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealerExt.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealerExt.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealerExt.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}	
		tc="2";
		tcSpiraId="TC123501";
		pXMLURL="getsearchinventoryfordealerext.xml?dealerCode=C5719&language=EN&typeId=100&stockNum=&statusId=D1&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&vin=&optionDetails=N";
		System.out.println(tcSpiraId+" Please Wait...getSearchInventoryForDealerExt");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealerExt.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealerExt.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealerExt.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealerExt.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="3";
		tcSpiraId="TC123502";
		pXMLURL="getsearchinventoryfordealerext.xml?dealerCode=C8552&language=EN&typeId=100&stockNum=&statusId=JS&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&vin=&optionDetails=N";
		System.out.println(tcSpiraId+" Please Wait...getSearchInventoryForDealerExt");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealerExt.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealerExt.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealerExt.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealerExt.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="4";
		tcSpiraId="TC123503";
		pXMLURL="getsearchinventoryfordealerext.xml?dealerCode=C5880&language=EN&typeId=&stockNum=&statusId=&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&vin=&optionDetails=N";
		System.out.println(tcSpiraId+" Pleas Wait...getSearchInventoryForDealerExt");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealerExt.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealerExt.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealerExt.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealerExt.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		tc="5";
		tcSpiraId="TC123504";
		pXMLURL="getsearchinventoryfordealerext.xml?dealerCode=C9835&language=EN&typeId=&stockNum=&statusId=&year=&make=&model=&trim=&intTrimDesc=&intTrimCode=&extClrCode=&modelCode=&von=&odometerHigh=&odometerLow=&fuelType=&msrpHigh=&msrpLow=&invoiceHigh=&invoiceLow=&dlrNetHigh=&dlrNetLow=&optCodes=&vin=&optionDetails=N";
		System.out.println(tcSpiraId+" Pleas Wait...getSearchInventoryForDealerExt");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getSearchInventoryForDealerExt.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getSearchInventoryForDealerExt.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		comp=getSearchInventoryForDealerExt.compare(wsName,true);	
		if (!comp){
			try {
				getSearchInventoryForDealerExt.compareSorted(wsName, true, hd, tl);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
}
public static void getInventoryVehicleDetails(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//22. getInventoryVehicleDetails	 
			wsName="getInventoryVehicleDetails";
			LoadWebServiceChryslerCA getInventoryVehicleDetails = new LoadWebServiceChryslerCA();
			getInventoryVehicleDetails.SetFolderName(dwc);
			getInventoryVehicleDetails.dataDir=getInventoryVehicleDetails.GetFolderName();
			 getInventoryVehicleDetails.SetFolderName(env1);
			 getInventoryVehicleDetails.firstEnvName=getInventoryVehicleDetails.GetFolderName();
			 getInventoryVehicleDetails.SetFolderName(env2);
			 getInventoryVehicleDetails.secondEnvName=getInventoryVehicleDetails.GetFolderName();
			tc="22_1";
			tcSpiraId="TC123506";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=A,B,C&types=A=acode;B=acode;C=acode&identifiers=A=CAC50CRC211A0;B=CAC50DOC201A0;C=CAC50FIC011E1&stateStrings=&optionCodes=C=EAF,DDE,PS2_01,APA,RC4,JPM,GWL,CZD,Q6,X9_02&packageCodes=C=25T&scriptId=VD&postalCode=M1P3S2&ipAddress=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);	
			tc="2";
			tcSpiraId="TC123507";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=v1,v2,a3&types=v1=vin;v2=acode;a3=vin&identifiers=v1=2C4RC1HG0FR700041;v2=CAC50DOV171A3;a3=1C6RR7LT1ES280882&stateStrings=&optionCodes=&packageCodes=v2=29G&scriptId=VD&postalCode=&ipAddress=&transactionId=";			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="3";
			tcSpiraId="TC123508";
			pXMLURL="getinventoryvehicledetails.xml?&language=FR&vehicles=v1,v2,a3&types=v1=vin;v2=acode;a3=vin&identifiers=v1=2C4RC1HG0FR700041;v2=CAC50DOV171A3;a3=1C6RR7LT1ES280882&stateStrings=&optionCodes=v2=29G,ERB,DG2,PAR_02,APA,JPR,AT4,AAY,AAJ,AAA,4CP,3YF,H7,X1_01&packageCodes=&scriptId=VD&postalCode=&ipAddress=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="4";
			tcSpiraId="TC123509";
			pXMLURL="getinventoryvehicledetails.xml?&language=EN&vehicles=v1,v2,a3,c,d,e,f&types=v1=vin;v2=acode;a3=vin;c=vin;d=vin;e=vin;f=vin&identifiers=v1=2C4RC1HG0FR700105;v2=CAC50DOV171A3;a3=1C6RR7LM5FS678560;c=1GCHK446X9E102442;d=3C3CFFFH1FT512930;e=1C4BJWCG5FL632517;f=1C4PJMCS5FW571294&stateStrings=&optionCodes=&packageCodes=&scriptId=VD&postalCode=&ipAddress=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="5";
			tcSpiraId="TC123510";
			pXMLURL="getinventoryvehicledetails.xml?&language=FR&vehicles=v1,v2,a3,c,d,e,f&types=v1=vin;v2=acode;a3=vin;c=vin;d=vin;e=vin;f=vin&identifiers=v1=2C4RC1HG0FR700105;v2=CAC50DOV171A3;a3=1C6RR7LM5FS678560;c=1GCHK446X9E102442;d=3C3CFFFH1FT512930;e=1C4BJWCG5FL632517;f=1C4PJMCS5FW571294&stateStrings=&optionCodes=&packageCodes=&scriptId=VD&postalCode=&ipAddress=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="6";
			tcSpiraId="TC123511";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=A&types=A=acode&identifiers=A=CAC50JES142A3&stateStrings=A=||23G,1,0,0,0,S,`ED3`DA4^Z1C,1,0,0,0,S,^ED3,2,0,0,0,S,^DA4,2,0,0,0,S,^STDAX,1,0,0,0,S,^TTU,0,1,0,0,G,^AL,0,1,0,0,G,^RES,1,0,0,0,S,^WFJ,0,1,0,0,G,^APA,1,0,0,0,S,^JKV,0,1,0,0,G,^HAA,0,1,0,0,G,^MNK,0,1,0,0,G,^MPN,0,1,0,0,G,^MW1,0,1,0,0,G,^GEG,0,1,0,0,G,^LNJ,0,1,0,0,G,^CMA,0,1,0,0,G,^MT4,0,1,0,0,G,^AX2,0,1,0,0,G,^LAC,0,1,0,0,G,^GXR,0,1,0,0,G,^SCC,0,1,0,0,G,^CDL,0,1,0,0,G,^JPS,0,1,0,0,G,^GWG,0,1,0,0,G,^GTL,0,1,0,0,G,^JPD,0,1,0,0,G,^CAX,0,1,0,0,G,^JPH,0,1,0,0,G,^RDZ,0,1,0,0,G,^DHD,0,1,0,0,G,^XBN,0,1,0,0,G,^RBZ,0,0,1,0,C,^REQ,0,0,1,0,C,^RHB,0,0,1,0,C,^&optionCodes=&packageCodes=&scriptId=VD&postalCode=&ipAddress=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="7";
			tcSpiraId="TC123512";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=v1&types=v1=vin&identifiers=v1=1C4NJRAB6FD395780&stateStrings=v1=||2GE,1,0,0,0,S,`ED3`DA4^Z1C,1,0,0,0,S,^ED3,2,0,0,0,S,^DA4,2,0,0,0,S,^STDAX,1,0,0,0,S,^TLB,1,0,0,0,S,^C7,0,1,0,0,G,^RES,1,0,0,0,S,^WDJ,1,0,0,0,S,^APA,1,0,0,0,S,^28E,0,0,5,0,C,^AWL,0,0,5,0,C,^DAW,0,0,5,0,C,^NONAX,0,0,5,0,C,^JKV,0,1,0,0,G,^HAA,0,1,0,0,G,^MNK,0,1,0,0,G,^MPN,0,1,0,0,G,^GEG,0,1,0,0,G,^CDH,0,1,0,0,G,^LNJ,0,1,0,0,G,^LAC,0,1,0,0,G,^GXR,0,1,0,0,G,^MT5,0,1,0,0,G,^GTL,0,1,0,0,G,^JPD,0,1,0,0,G,^CAX,0,1,0,0,G,^JPH,0,1,0,0,G,^DHD,0,1,0,0,G,^XBN,0,1,0,0,G,^ACF,0,0,2,0,C,^AL3,0,0,2,0,C,^TRX,0,0,2,0,C,^TTU,0,0,2,0,C,^WFW,0,0,2,0,C,^RBZ,0,0,1,0,C,^REQ,0,0,1,0,C,^";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);			
			tc="8";
			tcSpiraId="TC123513";
			pXMLURL="getinventoryvehicledetails.xml?&languageFR=&vehicles=v1,v2&types=v1=vin;v2=acode&identifiers=v1=1C4NJRAB2FD280111;v2=CAC50JES142A1&stateStrings=v2=||2GE,1,0,0,0,S,`ED3`DA4^Z1C,1,0,0,0,S,^ED3,2,0,0,0,S,^DA4,2,0,0,0,S,^STDAX,1,0,0,0,S,^TLB,1,0,0,0,S,^C7,0,1,0,0,G,^RES,1,0,0,0,S,^WDJ,1,0,0,0,S,^APA,1,0,0,0,S,^28E,0,0,5,0,C,^AWL,0,0,5,0,C,^DAW,0,0,5,0,C,^NONAX,0,0,5,0,C,^JKV,0,1,0,0,G,^HAA,0,1,0,0,G,^MNK,0,1,0,0,G,^MPN,0,1,0,0,G,^GEG,0,1,0,0,G,^CDH,0,1,0,0,G,^LNJ,0,1,0,0,G,^LAC,0,1,0,0,G,^GXR,0,1,0,0,G,^MT5,0,1,0,0,G,^GTL,0,1,0,0,G,^JPD,0,1,0,0,G,^CAX,0,1,0,0,G,^JPH,0,1,0,0,G,^DHD,0,1,0,0,G,^XBN,0,1,0,0,G,^ACF,0,0,2,0,C,^AL3,0,0,2,0,C,^TRX,0,0,2,0,C,^TTU,0,0,2,0,C,^WFW,0,0,2,0,C,^RBZ,0,0,1,0,C,^REQ,0,0,1,0,C,^&optionCodes=&packageCodes=&scriptId=VD&postalCode=&ipAddress=70.27.53.0&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="9";
			tcSpiraId="TC123514";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=a,b&types=a=vin;b=acode&identifiers=a=2C3CDZFJ1FH833207;b=CAC50DOC191C2&stateStrings=b=||24Y,1,0,0,0,S,`ESG`DFK^ESG,3,0,0,0,S,`DFK^DFK,3,0,0,0,S,`ESG^TVH,0,1,0,0,G,^SJ,0,1,0,0,G,^RA3,1,0,0,0,S,^WR2,1,0,0,0,S,^APA,1,0,0,0,S,^23Y,0,0,3,0,C,^DEC,0,0,3,0,C,^ESH,0,0,3,0,C,^MH4,0,1,0,0,G,^MJM,0,1,0,0,G,^XJD,0,1,0,0,G,^MFF,0,1,0,0,G,^MUM,0,1,0,0,G,^XHP,0,1,0,0,G,^MJJ,0,1,0,0,G,^JPM,0,1,0,0,G,^NHS,0,1,0,0,G,^JBC,0,1,0,0,G,^CDM,0,1,0,0,G,^SCJ,0,1,0,0,G,^MHN,0,1,0,0,G,^MH2,0,1,0,0,G,^TZA,0,1,0,0,G,^XAC,0,1,0,0,G,^SBP,0,1,0,0,G,^SUB,0,1,0,0,G,^MV4,0,1,0,0,G,^MXP,0,1,0,0,G,^CLR,0,1,0,0,G,^MH3,0,1,0,0,G,^AZS,0,1,0,0,G,^CAJ,0,1,0,0,G,^DR4,0,1,0,0,G,^DPM,0,1,0,0,G,^DHD,0,1,0,0,G,^CVB,0,1,0,0,G,^XBQ,0,1,0,0,G,^XBN,0,1,0,0,G,^RA4,0,0,1,0,C,^WRT,0,0,1,0,C,^&optionCodes=&packageCodes=&scriptId=VD&postalCode=&ipAddress=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="10";
			tcSpiraId="TC123515";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=a&types=a=acode&identifiers=a=CAC30JES051A2&stateStrings=&optionCodes=a=24X&packageCodes=a=24X&scriptId=VD&postalCode=&ipAddress=&transactionId=13";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
			tc="11";
			tcSpiraId="TC123516";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=b,A&types=b=acode;A=acode&identifiers=b=CAC50DOC191C1;A=CAC50FIC011E1&stateStrings=b=||24G,1,0,0,0,S,`ESG`DFK^ESG,3,0,0,0,S,`DFK^DFK,3,0,0,0,S,`ESG^TR9,1,0,0,0,S,^S7,1,0,0,0,S,^RA3,1,0,0,0,S,^WR2,1,0,0,0,S,^APA,1,0,0,0,S,^23G,0,0,3,0,C,^DEC,0,0,3,0,C,^ESH,0,0,3,0,C,^MV4,0,1,0,0,G,^DR4,0,1,0,0,G,^DPM,0,1,0,0,G,^DHD,0,1,0,0,G,^CVB,0,1,0,0,G,^XBQ,0,1,0,0,G,^XBN,0,1,0,0,G,^TVH,0,0,1,0,C,^AJD,0,0,1,0,C,^ARH,0,0,2,0,C,^ASA,0,0,1,0,C,^EC,0,0,1,0,C,^ED,0,0,1,0,C,^JL,0,0,1,0,C,^MM8,0,0,1,0,C,^XC_02,0,0,1,0,C,^RA4,0,0,1,0,C,^WP3,0,0,1,0,C,^WRT,0,0,1,0,C,^&optionCodes=&packageCodes=&scriptId=VD&postalCode=&ipAddress=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);		
//Test for CCP-6275
			tc="12"; //1C6RR6KT7FS620890,
			tcSpiraId="TC123517";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=v1&types=v1=vin&identifiers=v1=3C6RR6KT3GG209527&stateStrings=v1=||25A,1,0,0,0,S,`EZH`DG1^Z1C,1,0,0,0,S,^EZH,3,0,0,0,S,`DG1^DG1,3,0,0,0,S,`EZH^DMC,1,0,0,0,S,^TTM,1,0,0,0,S,^TX,1,0,0,0,S,^RA1,1,0,0,0,S,^WFP,1,0,0,0,S,^APA,1,0,0,0,S,^22A,0,0,4,0,C,^22B,0,0,4,0,C,^25B,0,0,1,0,C,^26B,0,0,3,0,C,^28B,0,0,4,0,C,^CS7,0,0,3,0,C,^DFD,0,0,4,0,C,^DFK,0,0,3,0,C,^DFL,0,0,4,0,C,^ERB,0,0,4,0,C,^EXF,0,0,4,0,C,^XM9,0,0,1,0,C,^Z1G,0,0,4,0,C,^Z1N,0,0,3,0,C,^DMD,0,0,1,0,C,^DMH,0,0,1,0,C,^TXN,0,0,1,0,C,^AGR,0,0,2,0,C,^AJY_,0,0,1,0,C,^CK9,0,0,1,0,C,^V9,0,0,1,0,C,^WFE,0,0,2,0,C,^XB9,0,0,1,0,C,^RA2,0,0,1,0,C,^RH1,0,0,1,0,C,^UA1,0,0,1,0,C,^";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);				
			tc="13"; //2C4RC1HG5FR700035
			tcSpiraId="TC123518";
			pXMLURL="getinventoryvehicledetails.xml?&language=&vehicles=v1&types=v1=vin&identifiers=v1=2C4RC1HG1FR739009&stateStrings=v1=||29M,1,0,0,0,S,`ERB`DG2^ERB,2,0,0,0,S,^DG2,2,0,0,0,S,^STDAX,1,0,0,0,S,^SDD,1,0,0,0,S,^TWB,1,0,0,0,S,^ZL,1,0,0,0,S,^RBZ,1,0,0,0,S,^WFZ,1,0,0,0,S,^APA,1,0,0,0,S,^RHB,0,0,1,0,C,^";
			System.out.println(tcSpiraId+" Please Wait...getInventoryVehicleDetails");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getInventoryVehicleDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getInventoryVehicleDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getInventoryVehicleDetails.compare(wsName,true);				
			
			
}
public static void searchNewInventory(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//23. searchNewInventory	
	wsName="searchNewInventory";
	
	LoadWebServiceChryslerCA searchNewInventory = new LoadWebServiceChryslerCA();
	searchNewInventory.SetFolderName(dwc);
	searchNewInventory.dataDir=searchNewInventory.GetFolderName();
	 searchNewInventory.SetFolderName(env1);
	 searchNewInventory.firstEnvName=searchNewInventory.GetFolderName();
	 searchNewInventory.SetFolderName(env2);
	 searchNewInventory.secondEnvName=searchNewInventory.GetFolderName();
	tc="23_1";
	tcSpiraId="TC33941";
	pXMLURL="searchnewinventory.xml?&language=&postalCode=&ipAddress=66.225.151.16&modelId=200&radius=10&dealerCode=&yearList=2016&trimGroup=&driveType=&packageCode=&colourHexCode=&maxResultSet=&transactionId=33";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);	
	
	tc="2";
	tcSpiraId="TC33942";
	pXMLURL="searchnewinventory.xml?&language=FR&postalCode=M2J1K1&ipAddress=&modelId=Dart&radius=10&dealerCode=&yearList=&trimGroup=&driveType=&packageCode=&colourHexCode=&maxResultSet=&transactionId=33";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);			
	
	tc="3";
	tcSpiraId="TC33943";
	pXMLURL="searchnewinventory.xml?&language=&postalCode=C1A8C4&ipAddress=&modelId=compass&radius=&dealerCode=C3232&yearList=&trimGroup=&driveType=&packageCode=&colourHexCode=&maxResultSet=5&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);			
	
	tc="4";
	tcSpiraId="TC33944";
	pXMLURL="searchnewinventory.xml?&language=&postalCode=L9C3B7&ipAddress=&modelId=1500&radius=20&dealerCode=&yearList=2016&trimGroup=Outdoorsman&driveType=4X4&packageCode=22T&colourHexCode=353638&maxResultSet=&transactionId=";
//	pXMLURL="searchnewinventory.xml?&language=&postalCode=L9C3B7&ipAddress=&modelId=1500&radius=20&dealerCode=&yearList=2014&trimGroup=Big%20Horn&driveType=4X4&packageCode=25X&colourHexCode=1F1F1F&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);
	
	tc="5";
	tcSpiraId="TC33945";
	pXMLURL="searchnewinventory.xml?&language=FR&postalCode=N3R7Y5&ipAddress=&modelId=Wrangler&radius=&dealerCode=C7755&yearList=&trimGroup=Outdoorsman&driveType=&packageCode=&colourHexCode=&maxResultSet=&transactionId=";
//	pXMLURL="searchnewinventory.xml?&language=&postalCode=L9C3B7&ipAddress=&modelId=1500&radius=20&dealerCode=&yearList=2014&trimGroup=Big%20Horn&driveType=4X4&packageCode=25X&colourHexCode=1F1F1F&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);
	
	tc="6";
	tcSpiraId="TC33946";
	pXMLURL="searchnewinventory.xml?&language=&postalCode=M2J1K1&ipAddress=&modelId=1500&radius=50&dealerCode=&yearList=2014&trimGroup=Outdoorsman&driveType=4X2&packageCode=22T&colourHexCode=070707&maxResultSet=200&transactionId=";
//	pXMLURL="searchnewinventory.xml?&language=&postalCode=L9C3B7&ipAddress=&modelId=1500&radius=20&dealerCode=&yearList=2014&trimGroup=Big%20Horn&driveType=4X4&packageCode=25X&colourHexCode=1F1F1F&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);
	
	tc="7";
	tcSpiraId="TC33947";
	pXMLURL="searchnewinventory.xml?&language=FR&postalCode=M2J1K1&ipAddress=&modelId=500C&radius=50&dealerCode=&yearList=2015&trimGroup=Cabrio&driveType=fwd&packageCode=22J&colourHexCode=070707&maxResultSet=200&transactionId=";
//	pXMLURL="searchnewinventory.xml?&language=&postalCode=L9C3B7&ipAddress=&modelId=1500&radius=20&dealerCode=&yearList=2014&trimGroup=Big%20Horn&driveType=4X4&packageCode=25X&colourHexCode=1F1F1F&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);
	tc="8";
	tcSpiraId="TC33948";
	pXMLURL="searchnewinventory.xml?&language=&postalCode=A0C%201J0&ipAddress=&modelId=1500&radius=50&dealerCode=&yearList=&trimGroup=Outdoorsman&driveType=4X2&packageCode=22T&colourHexCode=%23151f2b&maxResultSet=200&transactionId=";
//	pXMLURL="searchnewinventory.xml?&language=&postalCode=L9C3B7&ipAddress=&modelId=1500&radius=20&dealerCode=&yearList=2014&trimGroup=Big%20Horn&driveType=4X4&packageCode=25X&colourHexCode=1F1F1F&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);
	
	tc="9";
	tcSpiraId="TC33949";
	pXMLURL="searchnewinventory.xml?&language=FR&postalCode=A0C%201J0&ipAddress=&modelId=1500&radius=50&dealerCode=&yearList=&trimGroup=Outdoorsman&driveType=4X2&packageCode=22T&colourHexCode=%23151f2b&maxResultSet=200&transactionId=";
//	pXMLURL="searchnewinventory.xml?&language=&postalCode=L9C3B7&ipAddress=&modelId=1500&radius=20&dealerCode=&yearList=2014&trimGroup=Big%20Horn&driveType=4X4&packageCode=25X&colourHexCode=1F1F1F&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...searchNewInventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	searchNewInventory.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	searchNewInventory.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	searchNewInventory.compare(wsName,true);	
		
	
}
public static void getCSModellist(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//24. getCSModellist	
	wsName="getCSModellist";
	LoadWebServiceChryslerCA getCSModellist = new LoadWebServiceChryslerCA();
	getCSModellist.SetFolderName(dwc);
	getCSModellist.dataDir=getCSModellist.GetFolderName();
	 getCSModellist.SetFolderName(env1);
	 getCSModellist.firstEnvName=getCSModellist.GetFolderName();
	 getCSModellist.SetFolderName(env2);
	 getCSModellist.secondEnvName=getCSModellist.GetFolderName();
	tc="24_1";
	tcSpiraId="TC089194";
	pXMLURL="getcsmodellist.xml?language=EN&country=CA&fieldList=Dollars20001To30000&isFleet=Y&maxResults=";
	System.out.println(tcSpiraId+" Please Wait...getCSModellist");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getCSModellist.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getCSModellist.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getCSModellist.compare(wsName,true);			
	tc="2";
	tcSpiraId="TC089195";
	pXMLURL="getcsmodellist.xml?language=EN&country=CA&fieldList=Dollars30001To40000&isFleet=Y&maxResults=10";
	System.out.println(tcSpiraId+" Please Wait...getCSModellist");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getCSModellist.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getCSModellist.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getCSModellist.compare(wsName,true);	
	tc="3";
	tcSpiraId="TC089196";
	pXMLURL="getcsmodellist.xml?language=FR&country=CA&fieldList=Dollars20001To30000&isFleet=Y&maxResults=";
	System.out.println(tcSpiraId+" Please Wait...getCSModellist");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getCSModellist.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getCSModellist.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getCSModellist.compare(wsName,true);			
	tc="4";
	tcSpiraId="TC089197";
	pXMLURL="getcsmodellist.xml?language=FR&country=CA&fieldList=Dollars30001To40000&isFleet=Y&maxResults=10";
	System.out.println(tcSpiraId+" Please Wait...getCSModellist");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getCSModellist.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getCSModellist.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getCSModellist.compare(wsName,true);		

}
public static void getModelTrims(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//25. getModelTrims 	 DW 
			wsName="getModelTrims";		 
			LoadWebServiceChryslerCA getModelTrims = new LoadWebServiceChryslerCA();
			getModelTrims.SetFolderName(dwc);
			getModelTrims.dataDir=getModelTrims.GetFolderName();
			 getModelTrims.SetFolderName(env1);
			 getModelTrims.firstEnvName=getModelTrims.GetFolderName();
			 getModelTrims.SetFolderName(env2);
			 getModelTrims.secondEnvName=getModelTrims.GetFolderName();
			tc="25_1";	
			tcSpiraId="TC130771";
			pXMLURL="getmodeltrims.xml?language=&modelYearId=15291&colorDesc=Red&postalCode=&ipAddress=&radius=&daysToLive=&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);	
			tc="2";	
			tcSpiraId="TC130772";
			pXMLURL="getmodeltrims.xml?language=&modelYearId=14955&colorDesc=Red&postalCode=X0A0H0&ipAddress=&radius=&daysToLive=5&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);	
			tc="3";	
			tcSpiraId="TC130773";
			pXMLURL="getmodeltrims.xml?language=FR&modelYearId=14954&colorDesc=Red&postalCode=M1P3S2&ipAddress=&radius=10&daysToLive=&transactionId=11&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);	
			tc="4";	
			tcSpiraId="TC130774";
			pXMLURL="getmodeltrims.xml?language=en&modelYearId=14974&colorDesc=&postalCode=&ipAddress=216.108.101.0&radius=&daysToLive=&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);
			tc="5";	
			tcSpiraId="TC130775";
			pXMLURL="getmodeltrims.xml?language=&modelYearId=15864&colorDesc=Red&postalCode=&ipAddress=&radius=&daysToLive=&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);	
			tc="6";	
			tcSpiraId="TC130776";
			pXMLURL="getmodeltrims.xml?language=&modelYearId=16319&colorDesc=Red&postalCode=X0A0H0&ipAddress=&radius=&daysToLive=5&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);	
			tc="7";	
			tcSpiraId="TC130777";
			pXMLURL="getmodeltrims.xml?language=FR&modelYearId=15956&colorDesc=Red&postalCode=M1P3S2&ipAddress=&radius=10&daysToLive=&transactionId=11&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);	
			tc="8";	
			tcSpiraId="TC130778";
			pXMLURL="getmodeltrims.xml?language=en&modelYearId=15965&colorDesc=&postalCode=&ipAddress=216.108.101.0&radius=&daysToLive=&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);
			tc="9";	
			tcSpiraId="TC130779";
			pXMLURL="getmodeltrims.xml?language=fr&modelYearId=14972&colorDesc=&postalCode=M1N3W3&ipAddress=&radius=&daysToLive=&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);
			tc="10";	
			tcSpiraId="TC130780";
			pXMLURL="getmodeltrims.xml?language=EN&modelYearId=3014778&colorDesc=&postalCode=M1N3W3&ipAddress=&radius=&daysToLive=&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);
			tc="11";	//http://ln-qa-chca-was1:9090/asiautos/getmodeltrims.xml?language=&modelYearId=14042&colorDesc=Red&postalCode=&ipAddress=&radius=&daysToLive=&transactionId=&dealerCode=
			tcSpiraId="TC130781";
			pXMLURL="getmodeltrims.xml?language=EN&modelYearId=3014778&colorDesc=&postalCode=M1N3W3&ipAddress=&radius=&daysToLive=&transactionId=&dealerCode=CF246";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,false);

}
public static void getModelTrimsForLoop(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//25. getModelTrims 	 DW 
			wsName="getModelTrims";		 
			LoadWebServiceChryslerCA getModelTrims = new LoadWebServiceChryslerCA();
			getModelTrims.SetFolderName(dwc);
			getModelTrims.dataDir=getModelTrims.GetFolderName();
			 getModelTrims.SetFolderName(env1);
			 getModelTrims.firstEnvName=getModelTrims.GetFolderName();
			 getModelTrims.SetFolderName(env2);
			 getModelTrims.secondEnvName=getModelTrims.GetFolderName();
			 //String strI = Integer.toString(i);
			 int count=0;
			 String[] myidarray={
					 
					 "15949",
					 "16750",
					 "16800",
					 "16740",
					 "16865",
					 "14955",
					 "15946",
					 "16742",
					 "16797"

			 };
			 
			 for (String myid:myidarray ){
				 count++;
			tc=Integer.toString(count);	
			pXMLURL="getmodeltrims.xml?language=&modelYearId="+myid+"&colorDesc=Red&postalCode=X0A0H0&ipAddress=&radius=&daysToLive=5&transactionId=&dealerCode=";
			System.out.println(tcSpiraId+" Please Wait...getModelTrims");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getModelTrims.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getModelTrims.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getModelTrims.compare(wsName,true);	
			 }

}
public static void getCustomCategories(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
////26. getCustomCategories 	 DW 
		wsName="getCustomCategories";		 
		LoadWebServiceChryslerCA getCustomCategories = new LoadWebServiceChryslerCA();
		getCustomCategories.SetFolderName(dwc);
		getCustomCategories.dataDir=getCustomCategories.GetFolderName();
		 getCustomCategories.SetFolderName(env1);
		 getCustomCategories.firstEnvName=getCustomCategories.GetFolderName();
		 getCustomCategories.SetFolderName(env2);
		 getCustomCategories.secondEnvName=getCustomCategories.GetFolderName();
		tc="26_1";	
		tcSpiraId="TC130783";
		pXMLURL="getcustomcategories.xml?language=&modelYearId=16165&includeOptions=true&daysToLive=0&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);	
		tc="2";	
		tcSpiraId="TC130784";
		pXMLURL="getcustomcategories.xml?language=&modelYearId=16165&includeOptions=true&daysToLive=-1&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);	
		tc="3";	
		tcSpiraId="TC130785";
		pXMLURL="getcustomcategories.xml?language=&modelYearId=15935&includeOptions=false&daysToLive=&transactionId=17";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);	
		tc="4";	
		tcSpiraId="TC130786";
		pXMLURL="getcustomcategories.xml?language=&modelYearId=14118&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="5";	
		tcSpiraId="TC130787";
		pXMLURL="getcustomcategories.xml?language=&modelYearId=14118&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="6";	
		tcSpiraId="TC130788";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=14817&includeOptions=true&daysToLive=-1&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="7";	
		tcSpiraId="TC130789";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=14531&includeOptions=true&daysToLive=&transactionId=17";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="8";	
		tcSpiraId="TC130790";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=14118&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="9";	
		tcSpiraId="TC130791";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=14118&includeOptions=false&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
//		SKF
		tc="10";	
		tcSpiraId="TC130792";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=16212&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="11";	
		tcSpiraId="TC130793";
		pXMLURL="getcustomcategories.xml?language=EN&modelYearId=16212&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="12";	
		tcSpiraId="TC130794";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=15957&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="13";	
		tcSpiraId="TC130795";
		pXMLURL="getcustomcategories.xml?language=EN&modelYearId=15864&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="14";	
		tcSpiraId="TC130796";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=15133&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="15";	
		tcSpiraId="TC130797";
		pXMLURL="getcustomcategories.xml?language=EN&modelYearId=16279&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="16";	
		tcSpiraId="TC130798";
		pXMLURL="getcustomcategories.xml?language=EN&modelYearId=16303&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="17";	
		tcSpiraId="TC130799";
		pXMLURL="getcustomcategories.xml?language=EN&modelYearId=15864&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="18";
			tcSpiraId="TC130800";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=15957&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="19";
		tcSpiraId="TC130801";		
		pXMLURL="getcustomcategories.xml?language=EN&modelYearId=14817&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="20";	
		tcSpiraId="TC130802";
		pXMLURL="getcustomcategories.xml?language=EN&modelYearId=3014778&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="21";	
		tcSpiraId="TC130803";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=16086&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
		tc="22";	
		tcSpiraId="TC130804";
		pXMLURL="getcustomcategories.xml?language=FR&modelYearId=16303&includeOptions=true&daysToLive=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getCustomCategories");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getCustomCategories.compare(wsName,true);
}
public static void getOptionsForCustomCategories(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//27. getOptionsForCustomCategories 	 DW 
			wsName="getOptionsForCustomCategories";		 
			LoadWebServiceChryslerCA getOptionsForCustomCategories = new LoadWebServiceChryslerCA();
			getOptionsForCustomCategories.SetFolderName(dwc);
			getOptionsForCustomCategories.dataDir=getOptionsForCustomCategories.GetFolderName();
			 getOptionsForCustomCategories.SetFolderName(env1);
			 getOptionsForCustomCategories.firstEnvName=getOptionsForCustomCategories.GetFolderName();
			 getOptionsForCustomCategories.SetFolderName(env2);
			 getOptionsForCustomCategories.secondEnvName=getOptionsForCustomCategories.GetFolderName();
			tc="27_1";	
			tcSpiraId="TC130806";
			pXMLURL="getoptionsforcustomcategories.xml?language=&modelYearId=14817&customCategoryCode=ET01&daysToLive=0&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="2";	
			tcSpiraId="TC130807";
			pXMLURL="getoptionsforcustomcategories.xml?language=&modelYearId=3014778&customCategoryCode=FAF_EX01&daysToLive=-1&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);		
			tc="3";	
			tcSpiraId="TC130808";
			pXMLURL="getoptionsforcustomcategories.xml?language=&modelYearId=6014062&customCategoryCode=WC01&daysToLive=0&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="4";	
			tcSpiraId="TC130809";
			pXMLURL="getoptionsforcustomcategories.xml?language=&modelYearId=14955&customCategoryCode=KF26&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="5";	
			tcSpiraId="TC130810";
			pXMLURL="getoptionsforcustomcategories.xml?language=FR&modelYearId=14817&customCategoryCode=ET01&daysToLive=-1&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="6";	
			tcSpiraId="TC130811";
			pXMLURL="getoptionsforcustomcategories.xml?language=FR&modelYearId=3014778&customCategoryCode=ET01&daysToLive=-1&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="7";	
			tcSpiraId="TC130812";
			pXMLURL="getoptionsforcustomcategories.xml?language=FR&modelYearId=1014778&customCategoryCode=FAF_WH01&daysToLive=0&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="8";	
			tcSpiraId="TC130813";
			pXMLURL="getoptionsforcustomcategories.xml?language=FR&modelYearId=3014778&customCategoryCode=FAF_ET01&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
//			SKF
			tc="9";	
			tcSpiraId="TC130814";
			pXMLURL="getoptionsforcustomcategories.xml?language=EN&modelYearId=16212&customCategoryCode=KF46&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="10";	
			tcSpiraId="TC130815";
			pXMLURL="getoptionsforcustomcategories.xml?language=FR&modelYearId=15957&customCategoryCode=KF17&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="11";	
			tcSpiraId="TC130816";
			pXMLURL="getoptionsforcustomcategories.xml?language=EN&modelYearId=15864&customCategoryCode=KF115&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="12";	
			tcSpiraId="TC130817";
			pXMLURL="getoptionsforcustomcategories.xml?language=FR&modelYearId=15133&customCategoryCode=KF43&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="13";
				tcSpiraId="TC130818";
			pXMLURL="getoptionsforcustomcategories.xml?language=EN&modelYearId=16279&customCategoryCode=KF102&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="14";
			tcSpiraId="TC130819";
			pXMLURL="getoptionsforcustomcategories.xml?language=EN&modelYearId=16303&customCategoryCode=KF43&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="15";
			tcSpiraId="TC130820";			
			pXMLURL="getoptionsforcustomcategories.xml?language=EN&modelYearId=14531&customCategoryCode=KF998&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
			tc="16";
			tcSpiraId="TC130821";	
			pXMLURL="getoptionsforcustomcategories.xml?language=EN&modelYearId=3014778&customCategoryCode=KF997&daysToLive=&transactionId=";
			System.out.println(tcSpiraId+" Please Wait...getOptionsForCustomCategories");	
			System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
			getOptionsForCustomCategories.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
			getOptionsForCustomCategories.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
			getOptionsForCustomCategories.compare(wsName,true);	
}
public static void getLocation(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
////28. getLocation 	 DW 
		wsName="getLocation";		 
		LoadWebServiceChryslerCA getLocation = new LoadWebServiceChryslerCA();
		getLocation.SetFolderName(dwc);
		getLocation.dataDir=getLocation.GetFolderName();
		 getLocation.SetFolderName(env1);
		 getLocation.firstEnvName=getLocation.GetFolderName();
		 getLocation.SetFolderName(env2);
		 getLocation.secondEnvName=getLocation.GetFolderName();
		tc="28_1";	
		tcSpiraId="TC130823";
		pXMLURL="getlocation.xml?language=&postalCode=T5C1Y2&ipAddress=&latitude=&longitude=&city=&province=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getLocation");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocation.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocation.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocation.compare(wsName,true);	
		tc="2";	
		tcSpiraId="TC130824";
		pXMLURL="getlocation.xml?language=EN&postalCode=H1Z4E9&ipAddress=&latitude=&longitude=&city=&province=ON&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getLocation");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocation.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocation.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocation.compare(wsName,true);		
		tc="3";	
		tcSpiraId="TC130825";
		pXMLURL="getlocation.xml?language=FR&postalCode=E2S2B9&ipAddress=&latitude=&longitude=&city=&province=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getLocation");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocation.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocation.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocation.compare(wsName,true);
		tc="4";	
		tcSpiraId="TC130826";
		pXMLURL="getlocation.xml?language=EN&postalCode=&ipAddress=216.108.101.0&latitude=&longitude=&city=&province=&transactionId=25";
		System.out.println(tcSpiraId+" Please Wait...getLocation");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocation.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocation.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocation.compare(wsName,true);
		tc="5";	
		tcSpiraId="TC130827";
		pXMLURL="getlocation.xml?language=EN&postalCode=V3N4X8&ipAddress=&latitude=&longitude=&city=BC&province=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getLocation");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocation.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocation.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocation.compare(wsName,true);
		tc="6";	
		tcSpiraId="TC130828";
		pXMLURL="getlocation.xml?language=FR&postalCode=&ipAddress=&latitude=46.5692&longitude=-81.2408&city=&province=&transactionId=";
		System.out.println(tcSpiraId+" Please Wait...getLocation");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getLocation.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getLocation.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getLocation.compare(wsName,true);

}
public static void getModelSelector(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
////29. getModelSelector 	 DW 
		wsName="getModelSelector";		 
		LoadWebServiceChryslerCA getModelSelector = new LoadWebServiceChryslerCA();
		getModelSelector.SetFolderName(dwc);
		getModelSelector.dataDir=getModelSelector.GetFolderName();
		 getModelSelector.SetFolderName(env1);
		 getModelSelector.firstEnvName=getModelSelector.GetFolderName();
		 getModelSelector.SetFolderName(env2);
		 getModelSelector.secondEnvName=getModelSelector.GetFolderName();
		tc="29_1";	
		tcSpiraId="TC130830";
		pXMLURL="getmodelselector.xml?language=EN&divCodes=CD&postalCode=X1A3T3&ipAddress=&transactionId=85&dealerCode=C6967";
		System.out.println(tcSpiraId+" Please Wait...getModelSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelSelector.compare(wsName,true);	
		tc="2";	
		tcSpiraId="TC130831";
		pXMLURL="getmodelselector.xml?language=EN&divCodes=FI&postalCode=A1B3N7&ipAddress=&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelSelector.compare(wsName,true);
		tc="3";	
		tcSpiraId="TC130832";
		pXMLURL="getmodelselector.xml?language=EN&divCodes=RM&postalCode=&ipAddress=216.108.101.0&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelSelector.compare(wsName,true);
		tc="4";	
		tcSpiraId="TC130833";
		pXMLURL="getmodelselector.xml?language=FR&divCodes=CD&postalCode=X1A3T3&ipAddress=&transactionId=85&dealerCode=C6088";
		System.out.println(tcSpiraId+" Please Wait...getModelSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelSelector.compare(wsName,true);
		tc="5";	
		tcSpiraId="TC130834";
		pXMLURL="getmodelselector.xml?language=FR&divCodes=FI&postalCode=A1B3N7&ipAddress=&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelSelector.compare(wsName,true);
		tc="6";	
		tcSpiraId="TC130835";
		pXMLURL="getmodelselector.xml?language=FR&divCodes=RM&postalCode=&ipAddress=216.108.101.0&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelSelector.compare(wsName,true);
		tc="7";	
		tcSpiraId="TC130836";
		pXMLURL="getmodelselector.xml?language=FR&divCodes=RM&postalCode=&ipAddress=216.108.101.0&transactionId=&dealerCode=&CF209";
		System.out.println(tcSpiraId+" Please Wait...getModelSelector");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelSelector.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelSelector.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelSelector.compare(wsName,true);
}
public static void getModelDetails(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
////30. getModelDetails 	 DW 
		wsName="getModelDetails";		 
		LoadWebServiceChryslerCA getModelDetails = new LoadWebServiceChryslerCA();
		getModelDetails.SetFolderName(dwc);
		getModelDetails.dataDir=getModelDetails.GetFolderName();
		 getModelDetails.SetFolderName(env1);
		 getModelDetails.firstEnvName=getModelDetails.GetFolderName();
		 getModelDetails.SetFolderName(env2);
		 getModelDetails.secondEnvName=getModelDetails.GetFolderName();
		tc="30_1";	
		tcSpiraId="TC130838";
		pXMLURL="getmodeldetails.xml?language=&modelYearId=15291&postalCode=&ipAddress=&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);	
		tc="2";	
		tcSpiraId="TC130839";
		pXMLURL="getmodeldetails.xml?language=EN&modelYearId=14817&postalCode=S4R8H7&ipAddress=&transactionId=&dealerCode=C6967";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);
		tc="3";	
		tcSpiraId="TC130840";
		pXMLURL="getmodeldetails.xml?language=EN&modelYearId=1014778&postalCode=V6A2W8&ipAddress=&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);
		tc="4";	
		tcSpiraId="TC130841";
		pXMLURL="getmodeldetails.xml?language=en&modelYearId=15292&postalCode=&ipAddress=216.108.101.0&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);
		tc="5";	
		tcSpiraId="TC130842";
		pXMLURL="getmodeldetails.xml?language=FR&modelYearId=15291&postalCode=&ipAddress=&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);
		tc="6";	
		tcSpiraId="TC130843";
		pXMLURL="getmodeldetails.xml?language=FR&modelYearId=14817&postalCode=S4R8H7&ipAddress=&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);
		tc="7";	
		tcSpiraId="TC130844";
		pXMLURL="getmodeldetails.xml?language=fr&modelYearId=1014778&postalCode=V6A2W8&ipAddress=&transactionId=&dealerCode=C6088";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);
		tc="8";	
		tcSpiraId="TC130845";
		pXMLURL="getmodeldetails.xml?language=FR&modelYearId=15292&postalCode=&ipAddress=216.108.101.0&transactionId=&dealerCode=";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,true);
		tc="9";	
		tcSpiraId="TC130846";
		pXMLURL="getmodeldetails.xml?language=FR&modelYearId=15292&postalCode=&ipAddress=216.108.101.0&transactionId=&dealerCode=CF278";
		System.out.println(tcSpiraId+" Please Wait...getModelDetails");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		getModelDetails.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		getModelDetails.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		getModelDetails.compare(wsName,false);

}
public static void getOptionMarketingDescription(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	////31. getOptionMarketingDescription 	 DW 
	wsName="getOptionMarketingDescription";		 
	LoadWebServiceChryslerCA getOptionMarketingDescription = new LoadWebServiceChryslerCA();
	getOptionMarketingDescription.SetFolderName(dwc);
	getOptionMarketingDescription.dataDir=getOptionMarketingDescription.GetFolderName();
	 getOptionMarketingDescription.SetFolderName(env1);
	 getOptionMarketingDescription.firstEnvName=getOptionMarketingDescription.GetFolderName();
	 getOptionMarketingDescription.SetFolderName(env2);
	 getOptionMarketingDescription.secondEnvName=getOptionMarketingDescription.GetFolderName();
	tc="31_1";	
	tcSpiraId="TC130848";
	pXMLURL="getoptionmarketingdescription.xml?language=&acode=CAC50CRC141B0&optionCode=AY1&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
	tc="2";	
	tcSpiraId="TC130849";
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50CRC141B0&optionCode=AY1&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="3";	
	tcSpiraId="TC130850";
	scratchSave  ="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50CRC141B0","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50CRC141B0&optionCode=AY1&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="4";	
	tcSpiraId="TC130851";
	scratchSave  ="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50CRC141B0","false","false", "", "", "FR", "", "", "", "", "",""); //ok! 
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50CRC141B0&optionCode=AY1&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
	tc="5";	
	tcSpiraId="TC130852";
	pXMLURL="getoptionmarketingdescription.xml?language=&acode=CAC50RMT117D0&optionCode=RA4&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
	tc="6";	
	tcSpiraId="TC130853";
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50RMT117D0&optionCode=RA4&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="7";	
	tcSpiraId="TC130854";
	scratchSave  ="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT117D0","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50RMT117D0&optionCode=RA4&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="8";	
	tcSpiraId="TC130855";
	scratchSave  ="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50RMT117D0","false","false", "", "", "FR", "", "", "", "", "",""); //ok! 
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50RMT117D0&optionCode=RA4&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);			
	tc="9";	
	tcSpiraId="TC130856";
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC40CRV081B0&optionCode=IND&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,false);	
	tc="10";	
	tcSpiraId="TC130857";
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC40CRZ081B0&optionCode=APA&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,false);
	tc="11";	
	tcSpiraId="TC130858";
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50JES011C0&optionCode=RHB&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="12";	
	tcSpiraId="TC130859";
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50JES011C0&optionCode=RHB&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
	tc="13";	
	tcSpiraId="TC130860";
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50CRC141B0&optionCode=AY1&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="14";	
	tcSpiraId="TC130861";
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50CRC141B0&optionCode=AY1&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);		
	tc="15";	
	tcSpiraId="TC130862";
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50CRV081A0&optionCode=AHT&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="16";	
	tcSpiraId="TC130863";
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50CRV081A0&optionCode=AHT&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
	tc="17";	
	tcSpiraId="TC130864";
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50RMT117D0&optionCode=EXF&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="18";	
	tcSpiraId="TC130865";
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50RMT117D0&optionCode=EXF&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);		
	tc="19";	
	tcSpiraId="TC130866";
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50DOV171A5&optionCode=JPR&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="20";	
	tcSpiraId="TC130867";
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50DOV171A5&optionCode=JPR&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
	tc="21";	
	tcSpiraId="TC130868";
	scratchSave  ="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50JES151A2","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50JES151A2&optionCode=AL3&daysToLive=&transactionId=&stateString=||2GE,4,0,0,0,S,`ED3`DA4^Z1C,1,0,0,0,S,^ED3,5,0,0,0,S,^DA4,5,0,0,0,S,^STDAX,1,0,0,0,S,^TTU,1,0,0,0,S,^G7,0,1,0,0,G,^RES,1,0,0,0,S,^WFW,1,0,0,0,S,^APA,1,0,0,0,S,^28E,0,0,5,0,C,^AWL,0,0,5,0,C,^DAW,0,0,5,0,C,^JKV,0,1,0,0,G,^HAA,0,1,0,0,G,^MNK,0,1,0,0,G,^LEP,0,1,0,0,G,^MPN,0,1,0,0,G,^MFD,0,1,0,0,G,^GEG,0,1,0,0,G,^CDH,0,1,0,0,G,^LAC,0,1,0,0,G,^GXR,0,1,0,0,G,^MT5,0,1,0,0,G,^GTL,0,1,0,0,G,^JPD,0,1,0,0,G,^CAX,0,1,0,0,G,^XSA,0,1,0,0,G,^JPH,0,1,0,0,G,^DHD,0,1,0,0,G,^XBN,0,1,0,0,G,^TRX,0,0,1,0,C,^RBZ,0,0,1,0,C,^REQ,0,0,1,0,C,^XAC,0,0,1,0,C,^AL3,3,0,0,0,S,`2GE`AJB`ED3`DA4^CMA,0,1,0,0,G,^SCC,0,1,0,0,G,^RDZ,0,1,0,0,G,^XBM,0,1,0,0,G,`AL3`2GE`AJB`ED3`DA4^AJB,3,0,0,0,S,`2GE`AL3`ED3`DA4`^GNK,0,1,0,0,G,^LSA,0,1,0,0,G,^XGM,0,1,0,0,G,^XGD,0,1,0,0,G,^LAZ,0,1,0,0,G,^";
	//Here we do not use the scratchsave from getScratchFromConfigVehicle Just because do not know why they are different from test case in Spira? The TC's one has longer string.
	//pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50JES151A2&optionCode=AL3&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);
	tc="22";	
	tcSpiraId="TC130869";
	scratchSave  ="";
	//getScratchFromConfigVehicle(String prefix, String Acode, String PaintOnly, String DefaultColor, String PackageCode, String DaysToLive, String Language, String PostalCode, String IPAddress, String DealerCode, String Scratch, String TransactionID, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50JES151A2","false","false", "", "", "FR", "", "", "", "", "",""); //ok! 
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50JES151A2&optionCode=AL3&daysToLive=&transactionId=&stateString=||2GE,4,0,0,0,S,`ED3`DA4^Z1C,1,0,0,0,S,^ED3,5,0,0,0,S,^DA4,5,0,0,0,S,^STDAX,1,0,0,0,S,^TTU,1,0,0,0,S,^G7,0,1,0,0,G,^RES,1,0,0,0,S,^WFW,1,0,0,0,S,^APA,1,0,0,0,S,^28E,0,0,5,0,C,^AWL,0,0,5,0,C,^DAW,0,0,5,0,C,^JKV,0,1,0,0,G,^HAA,0,1,0,0,G,^MNK,0,1,0,0,G,^LEP,0,1,0,0,G,^MPN,0,1,0,0,G,^MFD,0,1,0,0,G,^GEG,0,1,0,0,G,^CDH,0,1,0,0,G,^LAC,0,1,0,0,G,^GXR,0,1,0,0,G,^MT5,0,1,0,0,G,^GTL,0,1,0,0,G,^JPD,0,1,0,0,G,^CAX,0,1,0,0,G,^XSA,0,1,0,0,G,^JPH,0,1,0,0,G,^DHD,0,1,0,0,G,^XBN,0,1,0,0,G,^TRX,0,0,1,0,C,^RBZ,0,0,1,0,C,^REQ,0,0,1,0,C,^XAC,0,0,1,0,C,^AL3,3,0,0,0,S,`2GE`AJB`ED3`DA4^CMA,0,1,0,0,G,^SCC,0,1,0,0,G,^RDZ,0,1,0,0,G,^XBM,0,1,0,0,G,`AL3`2GE`AJB`ED3`DA4^AJB,3,0,0,0,S,`2GE`AL3`ED3`DA4`^GNK,0,1,0,0,G,^LSA,0,1,0,0,G,^XGM,0,1,0,0,G,^XGD,0,1,0,0,G,^LAZ,0,1,0,0,G,^";
	//Here we do not use the scratchsave from getScratchFromConfigVehicle Just because do not know why they are different from test case in Spira? The TC's one has longer string.
	//pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50JES151A2&optionCode=AL3&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);		

//	CCP-6408  CAC50FIC011A0 ACX - SHOW XB4
	tc="23";	
	tcSpiraId="TC130870";
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50FIC011A0&optionCode=ACX&daysToLive=&transactionId=&stateString=";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
	tc="24";
	tcSpiraId="TC130871";	
	scratchSave  ="";
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50FIC011A0","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50FIC011A0", "ACX", "simple", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");	
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50FIC011A0&optionCode=ACX&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
//	CCP-6408  CAC50FIC011A0	ACX - SHOW XB4
	tc="25";	
	tcSpiraId="TC130872";
	scratchSave  ="";
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50FIC021B0","false","false", "", "", "FR", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromgetSelectOption(prodPrefix, "FR", "CAC50FIC021B0", "ACX", "simple", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");	
	pXMLURL="getoptionmarketingdescription.xml?language=FR&acode=CAC50FIC021B0&optionCode=ACX&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
//	CCP-6408  CAC50FIC011A0 ACX, DF1 - SHOW XA9	
	tc="26";	
	tcSpiraId="TC130873";
	scratchSave  ="";
	scratchSave=getOptionMarketingDescription.getScratchFromConfigVehicle(prodPrefix, "CAC50FIC011A0","false","false", "", "", "EN", "", "", "", "", "",""); //ok! 
//	getScratchFromgetSelectOption(String prefix, String Language 2, String Acode, String Code 4, String LMethod, String DIFONLY 6, String Scratch, String previousScratch 8, String showDelta, String paintsOnly 9, String defaultColour, String PackageCode 7, String DaysToLive, String postalCode 5, String ipAddress, String dealerCode 3, String transactionId, String view)
	scratchSave=getOptionMarketingDescription.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50FIC011A0", "ACX", "simple", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");	
	scratchSave=getOptionMarketingDescription.getScratchFromgetSelectOption(prodPrefix, "EN", "CAC50FIC011A0", "DF1", "simple", "N", scratchSave, "", "N", "false", "false", "", "", "", "", "", "", "");	
	pXMLURL="getoptionmarketingdescription.xml?language=EN&acode=CAC50FIC011A0&optionCode=ACX&daysToLive=&transactionId=&stateString="+scratchSave+"";
	System.out.println(tcSpiraId+" Please Wait...getOptionMarketingDescription");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getOptionMarketingDescription.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getOptionMarketingDescription.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	getOptionMarketingDescription.compare(wsName,true);	
}
public static void getWindowStickerXML(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
	//33.	getWindowStickerXML (used to be 25) 
	//33. getCSModellist	getWindowStickerXML 
	boolean comp;
	String hd="<option price=";
	String tl="</option>";
	wsName="getWindowStickerXML";
	LoadWebServiceChryslerCA getWindowStickerXML = new LoadWebServiceChryslerCA();
	getWindowStickerXML.SetFolderName(dc);
	getWindowStickerXML.dataDir=getWindowStickerXML.GetFolderName();
	 getWindowStickerXML.SetFolderName(env1);
	 getWindowStickerXML.firstEnvName=getWindowStickerXML.GetFolderName();
	 getWindowStickerXML.SetFolderName(env2);
	 getWindowStickerXML.secondEnvName=getWindowStickerXML.GetFolderName();
	tc="33_1";
	tcSpiraId="TC113397";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=EN&scratchsave=&daysToLive=&vin=1C6RR6KT6FS621173";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="2";
	tcSpiraId="TC113398";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=EN&scratchsave=&daysToLive=&vin=1C6RR7KG3GS215409";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="3";
	tcSpiraId="TC113399";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=EN&scratchsave=&daysToLive=&vin=3C6RR7KT6FG578578";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}		
	tc="4";
	tcSpiraId="TC113400";
	scratchSave  ="";
	previousState="";
	Acode="CAC50CRC211A0";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C5136&language=EN&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="5";
	tcSpiraId="TC113401";
	scratchSave  ="";
	previousState="";
	Acode="CAC50RMT135D1";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C8552&language=EN&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="6";
	tcSpiraId="TC113402";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=&scratchsave=&daysToLive=&vin=1C6RR7VT6FS783886";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="7";
	tcSpiraId="TC113403";
	scratchSave  ="";
	previousState="";
	Acode="CAC40DOC301C0";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C5136&language=EN&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}			
	tc="8";
	tcSpiraId="TC113404";
	scratchSave  ="";
	previousState="";
	Acode="CAC40DOC301C0";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C5136&language=FR&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="9";
	tcSpiraId="TC113405";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=EN&scratchsave=&daysToLive=&vin=1C6RR7VT3GS196224";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}			
	tc="10";
	tcSpiraId="TC113406";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=FR&scratchsave=&daysToLive=&vin=1C3CCCAB5FN565026";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="11";
	tcSpiraId="TC113407";
	scratchSave  ="";
	previousState="";
	Acode="CAC40DOC301B0";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C9023&language=EN&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}		
	tc="12";
	tcSpiraId="TC113408";
	scratchSave  ="";
	previousState="";
	Acode="CAC40DOC301B0";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C9023&language=FR&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="13";
	tcSpiraId="TC113409";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=EN&scratchsave=&daysToLive=&vin=1C6RR7FTXFS703732";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="14";
	tcSpiraId="TC113410";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=FR&scratchsave=&daysToLive=&vin=1C4PJLCSXFW565808";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="15";
	tcSpiraId="TC113411";
	scratchSave  ="";
	previousState="";
	Acode="CAC40RMT135A0";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C9797&language=EN&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="16";
	tcSpiraId="TC113412";
	scratchSave  ="";
	previousState="";
	Acode="CAC40RMT135A0";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C9797&language=FR&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="17";
	tcSpiraId="TC113413";
	scratchSave  ="";
	previousState="";
	Acode="CAC50RMT116A2";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C5136&language=EN&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}		
	tc="18";
	tcSpiraId="TC113414";
	scratchSave  ="";
	previousState="";
	Acode="CAC50RMT116A2";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C5136&language=FR&scratchsave="+scratchSave+"&daysToLive=&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="19";
	tcSpiraId="TC113415";
	scratchSave  ="";
	previousState="";
	Acode="CAC50RMT116A2";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C9797&language=&scratchsave="+scratchSave+"&daysToLive=0&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}			
	tc="20";
	tcSpiraId="TC113416";
	scratchSave  ="";
	previousState="";
	Acode="CAC50RMT116A2";
	scratchSave=getWindowStickerXML.getScratchFromConfigVehicle(prodPrefix, Acode,"false","false", "", "", "EN", "", "", "", "", "","1"); //ok! 
	previousState=scratchSave;
	pXMLURL="getwindowstickerxml.xml?acode="+Acode+"&dealerCode=C9797&language=&scratchsave="+scratchSave+"&daysToLive=-1&vin=";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
	tc="21";
	tcSpiraId="TC113417";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=EN&scratchsave=&daysToLive=&vin=1C4RDJAG5FC851148";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}		
	tc="22";
	tcSpiraId="TC113418";
	pXMLURL="getwindowstickerxml.xml?acode=&dealerCode=&language=FR&scratchsave=&daysToLive=&vin=3C63R3EL7FG514995";
	System.out.println(tcSpiraId+" Please Wait...getWindowStickerXML");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getWindowStickerXML.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
	getWindowStickerXML.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
	comp=getWindowStickerXML.compare(wsName,true);	
	if (!comp){
		try {
			getWindowStickerXML.compareSorted(wsName, true, hd, tl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}	
}
public static void daaSearchNewInventory(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2) throws Exception{
	//34. daaSearchNewInventory	
	String urlParametersString;
	wsName="daaSearchNewInventory";
	LoadWebServiceChryslerCA daaSearchNewInventory = new LoadWebServiceChryslerCA();
	daaSearchNewInventory.SetFolderName(dwc);
	daaSearchNewInventory.dataDir=daaSearchNewInventory.GetFolderName();
	daaSearchNewInventory.SetFolderName(env1);
	daaSearchNewInventory.firstEnvName=daaSearchNewInventory.GetFolderName();
	daaSearchNewInventory.SetFolderName(env2);
	daaSearchNewInventory.secondEnvName=daaSearchNewInventory.GetFolderName();
	tc="34_1";
	tcSpiraId="TC134066 Chrysler";
	//This API used to be done by QTP script
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC211B0&acodes=CAC50CRC211A0&language=EN&postalCode=K2B6R1&ipAddress=&radius=&dealerCode=C5140&optionCodes=&packageCode=&maxResultSet=&transactionId=";//ordered with QTP sheet data
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="2";
	tcSpiraId="TC134067 Chrysler";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC211B0&acodes=CAC50CRC211A0&language=FR&postalCode=K2B6R1&ipAddress=&radius=&dealerCode=C5140&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="3";
	tcSpiraId="TC134068 RAM";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC60RMT128B0&acodes=CAC60RMT128C2&language=EN&postalCode=G8L5J3&ipAddress=23.233.229.92&radius=&dealerCode=C4648&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="4";
	tcSpiraId="TC134069 RAM";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC60RMT128B0&acodes=CAC60RMT128C2&language=FR&postalCode=G8L5J3&ipAddress=23.233.229.92&radius=&dealerCode=C4648&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="5";
	tcSpiraId="TC134070 RAM";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC60RMT128B0&acodes=CAC60RMT128C2&language=EN&postalCode=G8L5J3&ipAddress=&radius=&dealerCode=C4648&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="6";
	tcSpiraId="TC134071 RAM";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC60RMT128B0&acodes=CAC60RMT128C2&language=FR&postalCode=G8L5J3&ipAddress=&radius=&dealerCode=C4648&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="7";
	tcSpiraId="TC134072 RAM";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC60RMT128B0&acodes=CAC60RMT128C2&language=EN&postalCode=K2B6R1&ipAddress=23.233.229.92&radius=&dealerCode=C4648&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="8";
	tcSpiraId="TC134072 RAM";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC60RMT128B0&acodes=CAC60RMT128C2&language=FR&postalCode=K2B6R1&ipAddress=23.233.229.92&radius=&dealerCode=C4648&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="9";
	tcSpiraId="TC134074 Fiat";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=EN&postalCode=G0A1H0&ipAddress=173.178.183.115&radius=&dealerCode=C4658&optionCodes=PW3,RA3,D5&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="10";
	tcSpiraId="TC134075 Fiat";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=FR&postalCode=G0A1H0&ipAddress=173.178.183.115&radius=&dealerCode=C4658&optionCodes=PW3,RA3,D5&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="11";
	tcSpiraId="TC134076 Fiat";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=EN&postalCode=G0A1H0&ipAddress=&radius=&dealerCode=C4658&optionCodes=PW3,RA3,D5&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="12";
	tcSpiraId="TC134077 Fiat";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=FR&postalCode=G0A1H0&ipAddress=&radius=&dealerCode=C4658&optionCodes=PW3,RA3,D5&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="13";
	tcSpiraId="TC134078 Fiat";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=EN&postalCode=&ipAddress=173.178.183.115&radius=&dealerCode=C4658&optionCodes=PW3,RA3,D5&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="14";
	tcSpiraId="TC134079 Fiat";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=FR&postalCode=&ipAddress=173.178.183.115&radius=&dealerCode=C4658&optionCodes=PW3,RA3,D5&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="15";
	tcSpiraId="TC134080 Dodge";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOC191A0&language=EN&postalCode=T6H1A2&ipAddress=50.65.113.55&radius=&dealerCode=C8600&optionCodes=NEC&packageCode=27Q&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="16";
	tcSpiraId="TC134081 Dodge";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOC191A0&language=EN&postalCode=T6H1A2&ipAddress=50.65.113.55&radius=&dealerCode=C8600&optionCodes=NEC&packageCode=27Q&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="17";
	tcSpiraId="TC134082 Dodge";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOC191A0&language=EN&postalCode=T6H1A2&ipAddress=&radius=&dealerCode=C8600&optionCodes=NEC&packageCode=27Q&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="18";
	tcSpiraId="TC134083 Dodge";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOC191A0&language=EN&postalCode=T6H1A2&ipAddress=&radius=&dealerCode=C8600&optionCodes=NEC&packageCode=27Q&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="19";
	tcSpiraId="TC134084 Dodge";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOC191A0&language=EN&postalCode=&ipAddress=50.65.113.55&radius=&dealerCode=C8600&optionCodes=NEC&packageCode=27Q&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="20";
	tcSpiraId="TC134085 Dodge";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOC191A0&language=EN&postalCode=&ipAddress=50.65.113.55&radius=&dealerCode=C8600&optionCodes=NEC&packageCode=27Q&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="21";
	tcSpiraId="TC134086 Jeep";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES161A1&language=EN&postalCode=T2J4L3&ipAddress=23.17.148.0&radius=&dealerCode=C8080&optionCodes=MX3,AAJ,DGJ&packageCode=23S&maxResultSet=&transactionId=";	
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="22";
	tcSpiraId="TC134087 Jeep";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES161A1&language=FR&postalCode=T2J4L3&ipAddress=23.17.148.0&radius=&dealerCode=C8080&optionCodes=MX3,AAJ,DGJ&packageCode=23S&maxResultSet=&transactionId=";	
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="23";
	tcSpiraId="TC134088 Jeep";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES161A1&language=EN&postalCode=T2J4L3&ipAddress=&radius=&dealerCode=C8080&optionCodes=MX3,AAJ,DGJ&packageCode=23S&maxResultSet=&transactionId=";	
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="24";
	tcSpiraId="TC134089 Jeep";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES161A1&language=FR&postalCode=T2J4L3&ipAddress=&radius=&dealerCode=C8080&optionCodes=MX3,AAJ,DGJ&packageCode=23S&maxResultSet=&transactionId=";	
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="25";
	tcSpiraId="TC134090 Jeep";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES161A1&language=EN&postalCode=&ipAddress=23.17.148.0&radius=&dealerCode=C8080&optionCodes=MX3,AAJ,DGJ&packageCode=23S&maxResultSet=&transactionId=";	
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="26";
	tcSpiraId="TC134091 Jeep";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES161A1&language=FR&postalCode=&ipAddress=23.17.148.0&radius=&dealerCode=C8080&optionCodes=MX3,AAJ,DGJ&packageCode=23S&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="27";
	tcSpiraId="TC1340xx Chrysler";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC142A0&acodes=CAC50CRC142B0&language=EN&postalCode=T6H2K8&ipAddress=64.141.19.0&radius=&dealerCode=C8600&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="28";
	tcSpiraId="TC1340xx Chrysler";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC142A0&acodes=CAC50CRC142B0&language=FR&postalCode=T6H2K8&ipAddress=64.141.19.0&radius=&dealerCode=C8600&optionCodes=&packageCode=&maxResultSet=&transactionId=";	
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="29";
	tcSpiraId="TC1340xx Chrysler";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC142A0&acodes=CAC50CRC142B0&language=EN&postalCode=T6H2K8&ipAddress=&radius=&dealerCode=C8600&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="30";
	tcSpiraId="TC1340xx Chrysler";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC142A0&acodes=CAC50CRC142B0&language=FR&postalCode=T6H2K8&ipAddress=&radius=&dealerCode=C8600&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="31";
	tcSpiraId="TC1340xx Chrysler";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC142A0&acodes=CAC50CRC142B0&language=EN&postalCode=&ipAddress=64.141.19.0&radius=&dealerCode=C8600&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="32";
	tcSpiraId="TC1340xx Chrysler";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50CRC142A0&acodes=CAC50CRC142B0&language=FR&postalCode=&ipAddress=64.141.19.0&radius=&dealerCode=C8600&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="33";
	tcSpiraId="TC134098 Jeep_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES042C0&acodes=CAC50JES142A1&language=EN&postalCode=K0L1L0&ipAddress=24.139.6.128&radius=&dealerCode=C3250&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="34";
	tcSpiraId="TC134099 Jeep_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES042C0&acodes=CAC50JES142A1&language=FR&postalCode=K0L1L0&ipAddress=24.139.6.128&radius=&dealerCode=C3250&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="35";
	tcSpiraId="TC134100 Jeep_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES042C0&acodes=CAC50JES142A1&language=EN&postalCode=K0L1L0&ipAddress=&radius=&dealerCode=C3250&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="36";
	tcSpiraId="TC134101 Jeep_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES042C0&acodes=CAC50JES142A1&language=FR&postalCode=K0L1L0&ipAddress=24.139.6.128&radius=&dealerCode=C3250&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="37";
	tcSpiraId="TC134102 Jeep_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES042C0&acodes=CAC50JES142A1&language=EN&postalCode=&ipAddress=24.139.6.128&radius=&dealerCode=C3250&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="38";
	tcSpiraId="TC134103 Jeep_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50JES042C0&acodes=CAC50JES142A1&language=FR&postalCode=&ipAddress=24.139.6.128&radius=&dealerCode=C3250&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="39";
	tcSpiraId="TC134104 Fiat_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC011D1&acodes=CAC50FIC021B0&language=EN&postalCode=N6H1T8&ipAddress=64.231.165.0&radius=&dealerCode=C5536&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="40";
	tcSpiraId="TC134105 Fiat_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC011D1&acodes=CAC50FIC021B0&language=FR&postalCode=N6H1T8&ipAddress=64.231.165.0&radius=&dealerCode=C5536&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="41";
	tcSpiraId="TC134106 Fiat_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC011D1&acodes=CAC50FIC021B0&language=EN&postalCode=N6H1T8&ipAddress=&radius=&dealerCode=C5536&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="42";
	tcSpiraId="TC134107 Fiat_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC011D1&acodes=CAC50FIC021B0&language=FR&postalCode=N6H1T8&ipAddress=&radius=&dealerCode=C5536&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="43";
	tcSpiraId="TC134108 Fiat_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC011D1&acodes=CAC50FIC021B0&language=EN&postalCode=&ipAddress=64.231.165.0&radius=&dealerCode=C5536&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="44";
	tcSpiraId="TC134109 Fiat_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC011D1&acodes=CAC50FIC021B0&language=FR&postalCode=&ipAddress=64.231.165.0&radius=&dealerCode=C5536&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="45";
	tcSpiraId="TC134110 RAM_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMV061B1&acodes=CAC50RMV061A1&language=EN&postalCode=T5A1C3&ipAddress=207.164.192.126&radius=&dealerCode=C8150&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="46";
	tcSpiraId="TC134111 RAM_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMV061B1&acodes=CAC50RMV061A1&language=FR&postalCode=T5A1C3&ipAddress=207.164.192.126&radius=&dealerCode=C8150&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="47";
	tcSpiraId="TC134112 RAM_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMV061B1&acodes=CAC50RMV061A1&language=EN&postalCode=T5A1C3&ipAddress=&radius=&dealerCode=C8150&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="48";
	tcSpiraId="TC134113 RAM_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMV061B1&acodes=CAC50RMV061A1&language=FR&postalCode=T5A1C3&ipAddress=&radius=&dealerCode=C8150&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="49";
	tcSpiraId="TC134114 RAM_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMV061B1&acodes=CAC50RMV061A1&language=EN&postalCode=&ipAddress=207.164.192.126&radius=&dealerCode=C8150&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="50";
	tcSpiraId="TC134115 RAM_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMV061B1&acodes=CAC50RMV061A1&language=FR&postalCode=&ipAddress=207.164.192.126&radius=&dealerCode=C8150&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="51";
	tcSpiraId="TC134116 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A2&acodes=CAC50DOV171A5&acodes=CAC50DOV171A6&language=EN&postalCode=T5V1K8&ipAddress=&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=5&transactionId=12";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="52";
	tcSpiraId="TC134117 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A2&acodes=CAC50DOV171A5&acodes=CAC50DOV171A6&language=FR&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="53";
	tcSpiraId="TC134118 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=EN&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="54";
	tcSpiraId="TC134119 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=FR&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="55";
	tcSpiraId="TC134120 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=EN&postalCode=J6E8S9&ipAddress=173.178.183.115&radius=&dealerCode=C4567&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="56";
	tcSpiraId="TC134121 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=FR&postalCode=J6E8S9&ipAddress=173.178.183.115&radius=&dealerCode=C4567&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="57";
	tcSpiraId="TC134122 CCP-6426";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMT111A2&language=EN&postalCode=R7A7E3&ipAddress=&radius=100&dealerCode=&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="58";
	tcSpiraId="TC134122 CCP-6426";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50RMT111A2&language=FR&postalCode=R7A7E3&ipAddress=&radius=100&dealerCode=&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="59";
	tcSpiraId="TC134124 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=H9B1Z9&ipAddress=&radius=300&dealerCode=C4688&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="60";
	tcSpiraId="TC134125 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=FR&postalCode=V9L3R7&ipAddress=&radius=300&dealerCode=C4570&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="61";
	tcSpiraId="TC134126 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=H7T2H6&ipAddress=&radius=300&dealerCode=C4582&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="62";
	tcSpiraId="TC134127 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=FR&postalCode=G4R3G7&ipAddress=&radius=300&dealerCode=C4502&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="63";
	tcSpiraId="TC134128 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=G9B2M9&ipAddress=&radius=300&dealerCode=C4184&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="64";
	tcSpiraId="TC134129 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=G7A4G3&ipAddress=&radius=300&dealerCode=C3284&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="65";
	tcSpiraId="TC134130 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=K0L2V0&ipAddress=&radius=300&dealerCode=C3515&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="66";
	tcSpiraId="TC134131 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=EN&postalCode=H9B1Z9&ipAddress=&radius=300&dealerCode=C4688&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="67";
	tcSpiraId="TC134132 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50FIC041B0&language=EN&postalCode=L2R5L3&ipAddress=&radius=300&dealerCode=C3984&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	
}
public static void CalculateLeasePayment(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2){
//	32	CalculateLeasePayment
		wsName="CalculateLeasePayment";
		LoadWebServiceChryslerCA CalculateLeasePayment = new LoadWebServiceChryslerCA();
		CalculateLeasePayment.SetFolderName(dw);
		CalculateLeasePayment.dataDir=CalculateLeasePayment.GetFolderName();
		 CalculateLeasePayment.SetFolderName(env1);
		 CalculateLeasePayment.firstEnvName=CalculateLeasePayment.GetFolderName();
		 CalculateLeasePayment.SetFolderName(env2);
		 CalculateLeasePayment.secondEnvName=CalculateLeasePayment.GetFolderName();
		tc="32_1";
		tcSpiraId="TC134289";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=1.99&term=48&residual=41.0&downPayment=&otherResidualizedAmounts=&otherNonResidualizedAmounts=&frequency=0&mileageKMs=24000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);		
		tc="2";
		tcSpiraId="TC134301";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=1.99&term=48&residual=41.0&downPayment=&otherResidualizedAmounts=&otherNonResidualizedAmounts=&frequency=2&mileageKMs=24000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);	
		tc="3";
		tcSpiraId="TC134302";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=1.99&term=48&residual=41.0&downPayment=&otherResidualizedAmounts=&otherNonResidualizedAmounts=&frequency=3&mileageKMs=18000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);		
		tc="4";
		tcSpiraId="TC134303";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=1.99&term=48&residual=41.0&downPayment=&otherResidualizedAmounts=&otherNonResidualizedAmounts=&frequency=4&mileageKMs=18000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);	
		tc="5";
		tcSpiraId="TC134296";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=1.99&term=48&residual=41.0&downPayment=5000&otherResidualizedAmounts=&otherNonResidualizedAmounts=&frequency=1&mileageKMs=24000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);	
		tc="6";
		tcSpiraId="TC134297";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=1.99&term=48&residual=41.0&downPayment=&otherResidualizedAmounts=2000&otherNonResidualizedAmounts=&frequency=2&mileageKMs=24000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);	
		tc="7";
		tcSpiraId="TC134298";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=1.99&term=48&residual=41.0&downPayment=&otherResidualizedAmounts=&otherNonResidualizedAmounts=3000&frequency=3&mileageKMs=18000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);		
		tc="8";
		tcSpiraId="TC134299";
		pXMLURL="calculateleasepayment.xml?financeAmount=36000&interestRate=2.99&term=48&residual=41.0&downPayment=5000&otherResidualizedAmounts=&otherNonResidualizedAmounts=&frequency=2&mileageKMs=18000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);	
		tc="9";
		tcSpiraId="TC134295";
		pXMLURL="calculateleasepayment.xml?financeAmount=20000&interestRate=3.59&term=48&residual=31.0&downPayment=1000&otherResidualizedAmounts=500&otherNonResidualizedAmounts=-6000&frequency=1&mileageKMs=24000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);	
		tc="10";
		tcSpiraId="TC135425";
		pXMLURL="calculateleasepayment.xml?financeAmount=30000&interestRate=0&term=0&residual=0&downPayment=&otherResidualizedAmounts=&otherNonResidualizedAmounts=&frequency=&mileageKMs=24000";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,true);	
		tc="11";
		tcSpiraId="TC134xxx";
		pXMLURL="calculateleasepayment.xml?financeAmount=20000&interestRate=3.59&term=48&residual=31.0&downPayment=1000&otherResidualizedAmounts=500&otherNonResidualizedAmounts=-6000&frequency=1&mileageKMs=";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,false);	
		tc="12";
		tcSpiraId="TC134xxx";
		pXMLURL="calculateleasepayment.xml?financeAmount=20000&interestRate=3.59&term=48&residual=31.0&downPayment=1000&otherResidualizedAmounts=500&otherNonResidualizedAmounts=-6000&frequency=1&mileageKMs=2400";
		System.out.println(tcSpiraId+" Please Wait...CalculateLeasePayment");	
		System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
		CalculateLeasePayment.loadURLProd(tcSpiraId,tc,prodPrefix,pXMLURL);
		CalculateLeasePayment.loadURLQA(tcSpiraId,tc,qaOnePrefix,pXMLURL);
		CalculateLeasePayment.compare(wsName,false);	
}
protected static String getDWEnvURL(String envir1) {
	String Prefix;
	if (envir1.equalsIgnoreCase("prod")){
		Prefix = "http://ccdw.chryslercanada.ca/asiautos/"; //PROD - DW - PubliC
//		Prefix = "http://66.240.181.131/asiautos/"; //PROD 131
//		Prefix = "http://66.240.181.132/asiautos/"; //PROD 132		
//		Prefix = "http://66.240.181.133/asiautos/"; //PROD 133	
//		Prefix = "http://172.16.147.56:8080/asiautos/"; //John's local for testing p
//		Prefix = "http://ln-dv-chca-ci01/asiautos/";	//John's env for testing p
	}else if (envir1.equalsIgnoreCase("Prod-prod")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-prod/"; //PROD - DW - PubliC EID 9090
	}else if (envir1.equalsIgnoreCase("QA9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos/"; //PROD - DW - PubliC EID 9090
//		prodPrefix = "http://ln-qa-chca-was1:9090/asiautos-order/"; //PROD - DW - PubliC EID 9090
	}else if (envir1.equalsIgnoreCase("prod-prod9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos-prod/"; //PROD build and QA data - DW - PubliC
	}else if (envir1.equalsIgnoreCase("uat")){
		Prefix =  "http://69.10.228.103:80/asiautos/";     //UAT- DW - PubliC
	}else if (envir1.equalsIgnoreCase("qa")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos/";   //QA - DW - Public -Marked with Monentum
	}else if (envir1.equalsIgnoreCase("qa-pr")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-pr/";   //QA pr build and QA data - DW - Public -Marked with Monentum
	}else if (envir1.equalsIgnoreCase("preprod")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-preprod/";   //QA pr build and QA data - DW - Public -Marked with Monentum
	}else{
		Prefix = "";
		System.out.println(envir1+" is wrong!");	
		return Prefix;
	}
	return Prefix;
}
protected static String getDCEnvURL(String envir) {
	String Prefix;
	if (envir.equalsIgnoreCase("prod")){
		Prefix = "http://66.240.181.139:80/asiautos/"; //PROD - DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("Prod-prod")){
		Prefix = "http://ln-qa-chca-was2:80/asiautos-prod/"; //PROD build and QA data - DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("QA9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos/"; //PROD - Use DW - PubliC EID 9090 - Do not have DC 9090 URL here
	}else if (envir.equalsIgnoreCase("prod-prod9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos-prod/"; //PROD build and QA data - Use DW - PubliC - Do not have DC 9090 URL here
	}else if (envir.equalsIgnoreCase("uat")){
		Prefix = "http://66.240.181.143:80/asiautos/";	  //UAT- DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("qa")){
		Prefix = "http://ln-qa-chca-was2:80/asiautos/";   //QA - DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("qa-pr")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-pr/";   //QA pr build and QA data - DW - Public -Marked with Monentum
	}else if (envir.equalsIgnoreCase("preprod")){
		Prefix = "http://ln-qa-chca-was2:80/asiautos-preprod/";   //QA preprod build and QA data - DC - marked (QEP, CK,DIM) 
	}else{
		Prefix = "";
		System.out.println(envir+" is wrong!");	
		return Prefix;
	}
	return Prefix;
}
public static void RunInDWPubilc(String envir1,String envir2 ){
	String prodPrefix, qaOnePrefix;
	prodPrefix = getDWEnvURL(envir1);
	qaOnePrefix = getDWEnvURL(envir2);
//////***************DW**************************************************************************************************************
////1. getoverview	
//	getoverview(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////2. getstandardvocabcontent	      
//	getstandardvocabcontent(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////3. getcommoncompetitors	 	
//	getcommoncompetitors(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////4. getchryslercolorizedmedia
//	getchryslercolorizedmedia(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////6. getoptionfeaturebenefits	 	
//	getoptionfeaturebenefits(dw,prodPrefix, qaOnePrefix, envir1, envir2);				
////8. getmodels	 		
//	getmodels(dw,prodPrefix, qaOnePrefix, envir1, envir2);	
////9. gettrims	 
//	gettrims(dw,prodPrefix, qaOnePrefix, envir1, envir2);	
////10. getTrimsExtended	 
//	getTrimsExtended(dw,prodPrefix, qaOnePrefix, envir1, envir2);		
////11A. getChryslerModelTrimsSelector 
//	getChryslerModelTrimsSelector(dw,prodPrefix, qaOnePrefix, envir1, envir2);	
////12. getStandardRVEContent		
//	getStandardRVEContent(dw,prodPrefix, qaOnePrefix, envir1, envir2);	
////13. getChryslerInteriorImages	
//	getChryslerInteriorImages(dw,prodPrefix, qaOnePrefix, envir1, envir2);	
////14. compareRVECommand	 
//	compareRVECommand(dw,prodPrefix, qaOnePrefix, envir1, envir2);	
////14A. getConfigVehicle	 both DW, DC
//	getConfigVehicle(dw,prodPrefix, qaOnePrefix, envir1, envir2);	
////14C. getSelectOption	 DW, DC	
//	getSelectOption(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////14D. getSelectedOptions 	 DW, DC
//	getSelectedOptions(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////15. getInventoryDetailForDealer	 
//	getInventoryDetailForDealer(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////16. getSearchInventoryForDealer	
//	getSearchInventoryForDealer(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////17. getLocateDealer	 	
//	getLocateDealer(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////18. getLocateInventory	 
//	getLocateInventory(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////19. getDealershipInfoShort	
//	getDealershipInfoShort(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////20. getDealershipInfoExtended	
//	getDealershipInfoExtended(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////21. getSearchInventoryForDealerExt	 	
//	getSearchInventoryForDealerExt(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////22. getInventoryVehicleDetails	
//	getInventoryVehicleDetails(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////23. searchNewInventory	
//	searchNewInventory(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////24. getCSModellist
//	getCSModellist(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////25. getModelTrims 	 DW 
//	getModelTrims(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////	getModelTrimsForLoop(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////26. getCustomCategories 	 DW 
//	getCustomCategories(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////27. getOptionsForCustomCategories 	 DW 
//	getOptionsForCustomCategories(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////28. getLocation 	 DW 
//	getLocation(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////29. getModelSelector 	 DW 	
//	getModelSelector(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////30. getModelDetails 	 DW 
//	getModelDetails(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////31. getOptionMarketingDescription 	 DW 
//	getOptionMarketingDescription(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////32. CalculateLeasePayment 	 DW 
//		CalculateLeasePayment(dw,prodPrefix, qaOnePrefix, envir1, envir2);
////34. daaSearchNewInventory	 	 DW 
		try {
			daaSearchNewInventory(dw,prodPrefix, qaOnePrefix, envir1, envir2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
////******************************************DW***********************************************************************************
	System.out.println("Chrysler CA in DW STOP here!!!");		
	System.out.println("Done...");	
}

public static void RunInDC(String envir1,String envir2 ){
	String prodPrefix, qaOnePrefix;
	prodPrefix = getDCEnvURL(envir1);
	qaOnePrefix = getDCEnvURL(envir2);
//////***********************DC******************************************************************************************************
////2. getstandardvocabcontent	
//	getstandardvocabcontent(dc, prodPrefix, qaOnePrefix, envir1, envir2);	
////4. getchryslercolorizedmedia	 
//	getchryslercolorizedmedia(dc, prodPrefix, qaOnePrefix, envir1, envir2);
//////5. getColorizedMedia	 
//	getColorizedMedia(dc, prodPrefix, qaOnePrefix, envir1, envir2);
////7. getMakes	
//	getMakes(dc, prodPrefix, qaOnePrefix, envir1, envir2);
////8. getmodels		
//	getmodels(dc, prodPrefix, qaOnePrefix, envir1, envir2);	
////9. gettrims	
//	gettrims(dc, prodPrefix, qaOnePrefix, envir1, envir2);
////11.	getYears	
//	getYears(dc, prodPrefix, qaOnePrefix, envir1, envir2);
////14A. getConfigVehicle	 both DW, DC
//	getConfigVehicle(dc, prodPrefix, qaOnePrefix, envir1, envir2);
////14B. getConfigVehicleWithICC	  DC
//	getConfigVehicleWithICC(dc, prodPrefix, qaOnePrefix, envir1, envir2);	
////14C. getSelectOption	 DW, DC
//	getSelectOption(dc, prodPrefix, qaOnePrefix, envir1, envir2);			
////14D. getSelectedOptions 	 DW, DC
//	getSelectedOptions(dc, prodPrefix, qaOnePrefix, envir1, envir2);	
////14E. getSelectedOptionsWithICC 	 DC
//	getSelectedOptionsWithICC(dc, prodPrefix, qaOnePrefix, envir1, envir2);
////14F. getSaveXml 	 DC - To load click Post, right click, View Source. Copy and paste into DATA on getRestoreVehicle - using Post as well.
//	getSaveXml(dc, prodPrefix, qaOnePrefix, envir1, envir2);	
////14G. 	getRestoreVehicle		DC - 
// This one cannot be used. It fails to match manual test with scratchSave. Haven't figured out why??? Will investigate later.
	try {
		getRestore(dc, prodPrefix, qaOnePrefix, envir1, envir2);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
////33.	getWindowStickerXML (used to be 25) 	
//	getWindowStickerXML(dc, prodPrefix, qaOnePrefix, envir1, envir2);
//////*****************DC************************************************************************************************************	
	System.out.println("Chrysler CA in DC STOP here!!!");		
	System.out.println("Done...");	
}
	public static void main (String args[]) throws IOException  {
		//PROD,Prod-prod, Prod-Prod9090, UAT, QA, QA9090, QA-pr	
		System.out.println("Starting....\n");
		PrintStream original = System.out;
		String ConsoleLogfile="TestConsoleLog.txt";
		String firstEnv="";
		String secondEnv="";
	 	try {
		Properties testprop = new Properties();
//		testprop.load(new FileInputStream("data/test.properties"));
//		testprop.load(Controller_Chrysler_CA_Save_SystemOut.class.getClassLoader().getResourceAsStream("data/test.properties"));
		testprop.load(Controller_Chrysler_CA.class.getClassLoader().getResourceAsStream("data/test.properties"));
		
//        String test1 = testprop.getProperty("admin.firstPage");
//        System.out.println("admin.firstPage="+test1);
	 	} catch (IOException ex) {
	        ex.printStackTrace();
	    }
	 	try {
			readPropertiesFile readPropValues=new readPropertiesFile();
			firstEnv=readPropValues.getFirstEnv();
			secondEnv=readPropValues.getSecondEnv();
			dw=readPropValues.getDWfilePaht();
			dc=readPropValues.getDCfilePaht();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Comment below if you want console info show running status
//		System.setOut(new PrintStream(new FileOutputStream(dw+ConsoleLogfile)));
	
//		RunInDWPubilc(firstEnv,secondEnv); 
		
	 	try {
			readPropertiesFile readPropValues=new readPropertiesFile();
			firstEnv=readPropValues.getFirstEnv();
			secondEnv=readPropValues.getSecondEnv();
			dw=readPropValues.getDWfilePaht();
			dc=readPropValues.getDCfilePaht();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Comment below if you want console info show running status
		System.setOut(new PrintStream(new FileOutputStream(dc+ConsoleLogfile)));
		
		RunInDC(firstEnv,secondEnv); 
		
		System.setOut(original);
		System.out.println("The end!");	
}
		
	
}	