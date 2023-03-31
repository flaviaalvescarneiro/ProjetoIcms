package PatterFactory;


public class IcmsFactory {
public CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {
if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
return new IcmsMG();
} else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
return new IcmsSP();
}else if (nomeEstado.equalsIgnoreCase("ICMS_RJ")){
return new IcmsRJ();
}else if(nomeEstado.equalsIgnoreCase("ICMS_ES")){
return new IcmsES();
}else{
return null;
}
}
}