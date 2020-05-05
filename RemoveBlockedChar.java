package security;

import java.util.StringTokenizer;

public class RemoveBlockedChar {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*String str="{\"In\\put\":{\"SurveyId\":\"243<ScRipt>alert(1)</ScripT>\",\"description\":\"BAS\'||(select extractvalue(xmltype(\'<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<!DOCTYPE root dtapmlaxg4ywbmaq4e39rcj3ouumkaoygl79w.burpcollab'"+
			"||'orator.net\\/\">%vwqvk;]>'),'\\/l') from dual)||\'"+
			"||\'\",\"ClusterDesc\":<ScRiPt>alert(1)</ScRiPt>}}";*/
	
	//String str1=""{"Input":{"SurveyId":654,"ClusterName":"tty\"uuu","ClusterDesc":null}}

	String str = "{\"Project\":{\"ProjectId\":\"4642\",\"ProjectName\":\"XSS Test again Gajanan<audio src=1 onerror=promptprompt((1)>\",\"Status\":\"ACTIVE\",\"ProjectNumber\":\"0008\",\"ClientCode\":\"5145\"}}";
	System.out.println(RemoveBlockedChar.replaceAllString(str));
	String s ="5245710@100105@2438@-3#Integer";
	boolean s1=RemoveBlockedChar.isvalidType(s);
	
	//String s1=	ValidateData("123,43,33o","Integer");
	//String s2=	ValidateData("abc.csv.txt","");
	System.out.println(s1);
	}
	/**
	 * @param data
	 * replaceAllString function replace unwanted character from input string
	 * @return replaced string
	 */

	public static String replaceAllString(String data) {
				
		String replaceChar=null;
		String replacedChar=null;
		try {
			/*replaceChar="<";
			replacedChar="&lt;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			replaceChar=">";
			replacedChar="&gt;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}*/
			
			replaceChar="\\\\";
			replacedChar="";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
				
			}
			
			replaceChar="\\(";
			replacedChar="&#40;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
				
			}
			
			replaceChar="\\)";
			replacedChar="&#41;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="eval\\((.*)\\)";
			replacedChar="";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="((?i)<script>)";
			replacedChar="";		
		
			if(data.matches("(?i:.*<script>.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);	
				
			replaceChar="((?i)</script>)";
			replacedChar="";		
		
			if(data.matches("(?i:.*</script>.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
		/*	replaceChar="\"";
			replacedChar="&quot;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}*/
			replaceChar="'";
			replacedChar="&#39;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']";
			replacedChar="\"\"";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="((?i)<img)";
			//replacedChar="&#lt;img";
			replacedChar="";		
			if(data.matches("(?i:.*<img.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)alert[\\s]*\\()";
			replacedChar="";		
			while(data.matches("(?i:.*alert[\\s]*\\(.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			/*replaceChar="alert(";
			replacedChar="";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}*/
			
			replaceChar="<?";
			replacedChar="&#lt;?";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="((?i)<iframe)";
			//replacedChar="&#lt;iframe";		
			replacedChar="";	
			if(data.matches("(?i:.*<iframe.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<frame)";
			replacedChar="&#lt;frame";		
			if(data.matches("(?i:.*<frame.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="document(.*)\\.(.*)cookie";
			replacedChar="document&#46;&#99;cookie";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="setTimeout(\\s*)\\(";
			replacedChar="setTimeout$1&#40;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="setInterval(\\s*)\\(";
			replacedChar="setInterval$1&#40;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="execScript(\\s*)\\(";
			replacedChar="exexScript$1&#40;";		
			while(data.indexOf(replaceChar) >= 0) {
				data = data.replace(replaceChar, replacedChar);
			}
			
			replaceChar="((?i)javascript:)";
			replacedChar="javascript&#58;";		
			if(data.matches("(?i:.*javascript:.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)confirm[\\s]*\\()";
			replacedChar="";		
			while(data.matches("(?i:.*confirm[\\s]*\\(.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)prompt[\\s]*\\()";
			replacedChar="";		
			while(data.matches("(?i:.*prompt[\\s]*\\(.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)msgbox[\\s]*\\()";
			replacedChar="";		
			if(data.matches("(?i:.*msgbox[\\s]*\\(.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)livescript[\\s]*\\()";
			replacedChar="";		
			if(data.matches("(?i:.*livescript[\\s]*\\(.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)h(\\.)*a(\\.)*c(\\.)*k(\\.)*e(\\.)*r(\\.)*s(\\.)*org[\\s]*)";
			replacedChar="";		
			if(data.matches("(?i:.*h(\\.)*a(\\.)*c(\\.)*k(\\.)*e(\\.)*r(\\.)*s(\\.)*org[\\s]*.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)exploit.htc[\\s]*)";
			replacedChar="";		
			if(data.matches("(?i:.*exploit.htc[\\s]*.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)mocha:(.*)[code]*)";
			replacedChar="";		
			if(data.matches("(?i:.*mocha:(.*)[code]*.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<body)";
			replacedChar="&#lt;body";		
			if(data.matches("(?i:.*<body.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<input)";
			replacedChar="&#lt;input";		
			if(data.matches("(?i:.*<input.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<svg)";
			replacedChar="&#lt;svg";		
			if(data.matches("(?i:.*<svg.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<plaintext)";
			replacedChar="&#lt;plaintext";		
			if(data.matches("(?i:.*<plaintext.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<isindex)";
			replacedChar="&#lt;isindex";		
			if(data.matches("(?i:.*<isindex.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<style)";
			replacedChar="&#lt;style";		
			if(data.matches("(?i:.*<style.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<bgsound)";
			replacedChar="&#lt;bgsound";		
			if(data.matches("(?i:.*<bgsound.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<link)";
			replacedChar="&#lt;link";		
			if(data.matches("(?i:.*<link.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<meta)";
			replacedChar="&#lt;meta";		
			if(data.matches("(?i:.*<meta.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<xss)";
			replacedChar="&#lt;xss";		
			if(data.matches("(?i:.*<xss.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<table)";
			replacedChar="&#lt;table";		
			if(data.matches("(?i:.*<table.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<td)";
			replacedChar="&#lt;td";		
			if(data.matches("(?i:.*<td.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			/*replaceChar="((?i)<div)";
			replacedChar="&#lt;div";		
			if(data.matches("(?i:.*<div.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);*/
			
			replaceChar="((?i)<base)";
			replacedChar="&#lt;base";		
			if(data.matches("(?i:.*<base.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<object)";
			replacedChar="&#lt;object";		
			if(data.matches("(?i:.*<object.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<embed)";
			replacedChar="&#lt;embed";		
			if(data.matches("(?i:.*<embed.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<xml)";
			replacedChar="&#lt;xml";		
			if(data.matches("(?i:.*<xml.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<span)";
			replacedChar="&#lt;span";		
			if(data.matches("(?i:.*<span.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<a[\\s]*href)";
			replacedChar="&#lt;a[\\s]*href";		
			if(data.matches("(?i:.*<a[\\s]*href.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			replaceChar="((?i)<applet)";
			replacedChar="&#lt;applet";		
			if(data.matches("(?i:.*<applet.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
		/*	replaceChar="((?i)<?import)";
			replacedChar="&#lt;?import";		
			if(data.matches("(?i:.*<?import.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);*/
			
			/*replaceChar="((?i)<br)";
			replacedChar="&#lt;br";		
			if(data.matches("(?i:.*<br.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);*/
			
			replaceChar="((?i)<layer)";
			replacedChar="&#lt;layer";		
			if(data.matches("(?i:.*<layer.*)")) 				
				data = data.replaceAll(replaceChar, replacedChar);
			
			
		} catch (Exception e) {
		}
		return data;
	}
	public static boolean isvalidType( String InputString)
	{
	
		StringTokenizer typeArray = new StringTokenizer(InputString, "||");
		
		//String[] typeArray = InputString.split("||");
		String[] inputStringArray=null;
		String[] inputString=null;
		boolean validFlag=true;
		while (typeArray.hasMoreElements()){
			//123@@43@@3ooo##Integer$$abc.csv.txt##File
			inputStringArray=((String)typeArray.nextElement()).split("#");
			
			if(inputStringArray.length==2){
				
				if(inputStringArray[1].equals("Integer")){
					inputString=inputStringArray[0].split("@");
					for (String value : inputString){
						if(!validateIntegerType(value))
						{
							validFlag=false;
							break;
						}
					}
				}else if(inputStringArray[1].equals("File")){
					
					inputString=inputStringArray[0].split("@");
					for (String value : inputString){
						if(!validateFileType(value))
						{
							validFlag=false;
							break;
						}
					}
					
				}else
				{
					validFlag=false;
					break;
				}
				if(validFlag==false)
				break;
			}else
			{
				validFlag=false;
				break;
			}

		}
		return validFlag;
		
	}
	
	
	
private  static boolean validateIntegerType(String paramStr)
 {
		Boolean isValid = false;

		if (paramStr == null)
			isValid = false;
		if(paramStr.trim().equals(""))
			return true;
		
		try {
			Double.parseDouble(paramStr);
			isValid = true;
		} catch (Exception ex) {
			isValid = false;
		}

		return isValid;
	}
private  static boolean validateFileType(String paramStr)
{
		Boolean isValid = false;

		if (paramStr == null || paramStr.trim().equals(""))
			isValid = false;

		try {
			//System.out.println(paramStr.indexOf(".") + " last " + paramStr.lastIndexOf("."));
			if((paramStr.indexOf(".")==paramStr.lastIndexOf(".")) && paramStr.endsWith(".txt"))
				isValid = true;
			else
				isValid = false;
			
		} catch (Exception ex) {
			isValid = false;
		}

		return isValid;
	}
}

