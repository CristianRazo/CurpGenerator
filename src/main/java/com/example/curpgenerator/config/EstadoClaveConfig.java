package com.example.curpgenerator.config;

import java.util.Map;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EstadoClaveConfig {
	@Bean
    public Map<String, String> estadoClaveMap() {
        Map<String, String> estadoClaveMap = new HashMap<>();
        
        estadoClaveMap.put("AGUASCALIENTES", "AS");
        estadoClaveMap.put("BAJA CALIFORNIA", "BC");
        estadoClaveMap.put("BAJA CALIFORNIA SUR", "BS");
        estadoClaveMap.put("CAMPECHE", "CC");
        estadoClaveMap.put("CHIAPAS", "CS");
        estadoClaveMap.put("CHIHUAHUA", "CH");
        estadoClaveMap.put("COAHUILA", "CL");
        estadoClaveMap.put("COLIMA", "CM");
        estadoClaveMap.put("CIUDAD DE MEXICO", "DF");
        estadoClaveMap.put("DURANGO", "DG");
        estadoClaveMap.put("GUANAJUATO", "GT");
        estadoClaveMap.put("GUERRERO", "GR");
        estadoClaveMap.put("HIDALGO", "HG");
        estadoClaveMap.put("JALISCO", "JC");
        estadoClaveMap.put("MEXICO", "MC");
        estadoClaveMap.put("MICHOACAN", "MN");
        estadoClaveMap.put("MORELOS", "MS");
        estadoClaveMap.put("NAYARIT", "NT");
        estadoClaveMap.put("NUEVO LEON", "NL");
        estadoClaveMap.put("OAXACA", "OC");
        estadoClaveMap.put("PUEBLA", "PL");
        estadoClaveMap.put("QUERETARO", "QT");
        estadoClaveMap.put("QUINTANA ROO", "QR");
        estadoClaveMap.put("SAN LUIS POTOSI", "SP");
        estadoClaveMap.put("SINALOA", "SL");
        estadoClaveMap.put("SONORA", "SR");
        estadoClaveMap.put("TABASCO", "TC");
        estadoClaveMap.put("TAMAULIPAS", "TS");
        estadoClaveMap.put("TLAXCALA", "TL");
        estadoClaveMap.put("VERACRUZ", "VZ");
        estadoClaveMap.put("YUCATAN", "YN");
        estadoClaveMap.put("ZACATECAS", "ZS");
        
        return estadoClaveMap;
    }
}
