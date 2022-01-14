public String commandLinux(String var1, Container container) throws StreamTransformationException{

try{
	Process p = Runtime.getRuntime().exec(var1);
	OutputStream os = p.getOutputStream();
	InputStream in = p.getInputStream();
	DataInputStream dis = new DataInputStream(in);
	String disr = dis.readLine();
	container.getTrace().addDebugMessage("----------------------------------------");

	while (disr != null) {
		container.getTrace().addDebugMessage(disr);
		disr = dis.readLine();
	}
	container.getTrace().addDebugMessage("----------------------------------------");
	container.getTrace().addDebugMessage(System.getProperty("os.name"));
	container.getTrace().addDebugMessage("----------------------------------------");
	os.close();
	in.close();
	dis.close();
}catch(Exception e){
	container.getTrace().addDebugMessage("ERROR:" + e.toString());
}

return "";
}
