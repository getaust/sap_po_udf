public String udf_getSystemProps(Container container) throws StreamTransformationException{

Properties props = System.getProperties();
Enumeration pNames = props.propertyNames();
String key = "";
container.getTrace().addDebugMessage("--- BEGIN OF THE SYSTEM PROPERTIES ---");
while (pNames.hasMoreElements()) {
       key = (String) pNames.nextElement();
       container.getTrace().addDebugMessage("key " + key + " = " + props.getProperty(key));
}
container.getTrace().addDebugMessage("--- END OF THE SYSTEM PROPERTIES ---");
//String sPOSys = (String) System.getProperty("SAPSYSTEMNAME");

return "";
