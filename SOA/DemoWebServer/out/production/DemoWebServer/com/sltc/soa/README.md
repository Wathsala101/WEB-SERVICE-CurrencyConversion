Run this to build the client stub
change the jdk path to your machine appropriately

"C:\Program Files\Java\jdk1.8.0_201\bin\wsimport.exe" -keep -d ..\DemoWebServiceClient\Stub -p com.sltc.soa.client.stub http://localhost:8888/DemoWebService?wsdl