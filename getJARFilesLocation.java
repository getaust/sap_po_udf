//Import java.net.URL

public String getJARFilesLocation(String sClass, Container container) throws StreamTransformationException{
String str = "";
   try{
   Class c = Class.forName(sClass);
   URL loc = c.getProtectionDomain().getCodeSource().getLocation();
    str = loc.toString();
    }catch (Exception e){
     str = e.toString();
    }
return str;

//For example use sClass equal javax.resource.NotSupportedException
//Return: file:/usr/sap/POX/J00/j2ee/cluster/bin/ext/j2eeca/lib/connector.jar
