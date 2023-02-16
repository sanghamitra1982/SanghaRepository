package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	
	public static String replaceJsonData(String jsonbody, String VariableName, String VariableValue)
	
	{
		jsonbody=jsonbody.replaceAll(Pattern.quote("{{"+VariableName+"}}"), VariableValue);
		
		return jsonbody;
		
		
	}

}
