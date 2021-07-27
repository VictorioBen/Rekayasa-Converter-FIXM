package dev.ale.fdx.config;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class DefaultNamespacePrefixMapper extends NamespacePrefixMapper{
	private Map<String, String> namespaceMap=new HashMap<String, String>();
	
	public DefaultNamespacePrefixMapper() {
//		namespaceMap.put("http://www.w3.org/2001/XMLSchema", "");
		namespaceMap.put("http://www.fixm.aero/base/4.1", "fb");
		namespaceMap.put("http://www.fixm.aero/flight/4.1", "fx");
		namespaceMap.put("http://www.fixm.aero/messaging/4.1", "mesg");
		namespaceMap.put("http://www.w3.org/1999/xlink", "xlink");
		namespaceMap.put("http://www.w3.org/2001/XMLSchema", "xsi");
	}
	
	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		return namespaceMap.getOrDefault(namespaceUri, suggestion);
	}
}
