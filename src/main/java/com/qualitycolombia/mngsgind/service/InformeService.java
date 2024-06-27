package com.qualitycolombia.mngsgind.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qualitycolombia.mngsgind.entity.Informe;

@Service
public class InformeService {

	public List<Informe> obtenerInformesUsuario1() throws JsonProcessingException {

		List<Informe> resultado = new ArrayList<Informe>();
		Informe informePorVendedor = new Informe();
		Informe informePorZona = new Informe();
		Informe informePorCiudad = new Informe();

		List<JSONObject> listaPorVendedor = ventasPorVendedor();
		List<JSONObject> listaPorZona = ventasPorZona();
		List<JSONObject> listaPorCiudad = ventasPorCiudad();

		ObjectMapper mapper = new ObjectMapper();
		JsonNode nodePorVendedor = mapper.readTree(listaPorVendedor.toString());
		JsonNode nodePorZona = mapper.readTree(listaPorZona.toString());
		JsonNode nodePorCiudad = mapper.readTree(listaPorCiudad.toString());

		informePorVendedor.setTitulo("Ventas por vendedor");
		informePorVendedor.setDetalleInf(nodePorVendedor);
		
		informePorZona.setTitulo("Ventas por zona");
		informePorZona.setDetalleInf(nodePorZona);
		
		informePorCiudad.setTitulo("Ventas por ciudad");
		informePorCiudad.setDetalleInf(nodePorCiudad);
		
		resultado.add(informePorVendedor);
		resultado.add(informePorZona);
		resultado.add(informePorCiudad);

		return resultado;
	}
	
	public List<Informe> obtenerInformesUsuario2() throws JsonMappingException, JsonProcessingException {
		List<Informe> resultado = new ArrayList<Informe>();
		Informe informePorProducto = new Informe();
		Informe informePorMes = new Informe();
		
		List<JSONObject> listaPorProducto = ventasPorProducto();
		List<JSONObject> listaPorMes = ventasPorMes();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode nodePorProducto = mapper.readTree(listaPorProducto.toString());
		JsonNode nodePorMes = mapper.readTree(listaPorMes.toString());
		
		informePorProducto.setTitulo("Ventas por producto");
		informePorProducto.setDetalleInf(nodePorProducto);
		
		informePorMes.setTitulo("Ventas por mes");
		informePorMes.setDetalleInf(nodePorMes);
		
		resultado.add(informePorProducto);
		resultado.add(informePorMes);
		
		return resultado;
	}

	public List<JSONObject> ventasPorVendedor() {
		JSONObject obj1 = new JSONObject();
		obj1.put("vendedor", "Pedro");
		obj1.put("ventas", 3500000);

		JSONObject obj2 = new JSONObject();
		obj2.put("vendedor", "Pablo");
		obj2.put("ventas", 3700000);
		
		JSONObject obj3 = new JSONObject();
		obj3.put("vendedor", "Oscar");
		obj3.put("ventas", 4700000);

		List<JSONObject> lista = new ArrayList<JSONObject>();
		lista.add(obj1);
		lista.add(obj2);
		lista.add(obj3);
		
		return lista;		
	}
	
	public List<JSONObject> ventasPorZona() {
		JSONObject zona1 = new JSONObject();
		zona1.put("zona", "A1");
		zona1.put("ventas", 7200000);

		JSONObject zona2 = new JSONObject();
		zona2.put("zona", "B2");
		zona2.put("ventas", 4700000);
		

		List<JSONObject> lista = new ArrayList<JSONObject>();
		lista.add(zona1);
		lista.add(zona2);
		
		return lista;
	}
	
	public List<JSONObject> ventasPorCiudad() {
		JSONObject tulua = new JSONObject();
		tulua.put("ciudad", "Tuluá");
		tulua.put("ventas", 4700000);

		JSONObject cali = new JSONObject();
		cali.put("ciudad", "Cali");
		cali.put("ventas", 7200000);
		

		List<JSONObject> lista = new ArrayList<JSONObject>();
		lista.add(tulua);
		lista.add(cali);
		
		return lista;
	}
	
	public List<JSONObject> ventasPorProducto() {
		JSONObject televisor = new JSONObject();
		televisor.put("producto", "Televisor");
		televisor.put("ventas", 11500000);

		JSONObject nevera = new JSONObject();
		nevera.put("producto", "Nevera");
		nevera.put("ventas", 8700000);
		
		JSONObject estufa = new JSONObject();
		estufa.put("producto", "Estufa");
		estufa.put("ventas", 6400000);
		
		JSONObject airfryer = new JSONObject();
		airfryer.put("producto", "Airfryer");
		airfryer.put("ventas", 2600000);
		

		List<JSONObject> lista = new ArrayList<JSONObject>();
		lista.add(televisor);
		lista.add(nevera);
		lista.add(estufa);
		lista.add(airfryer);
		
		return lista;
	}
	
	public List<JSONObject> ventasPorMes() {
		JSONObject enero = new JSONObject();
		enero.put("producto", "Enero");
		enero.put("ventas", 5500000);

		JSONObject febrero = new JSONObject();
		febrero.put("producto", "Febrero");
		febrero.put("ventas", 3000000);
		
		JSONObject marzo = new JSONObject();
		marzo.put("producto", "Marzo");
		marzo.put("ventas", 8600000);
		
		JSONObject abril = new JSONObject();
		abril.put("producto", "Abril");
		abril.put("ventas", 6500000);
		
		JSONObject mayo = new JSONObject();
		mayo.put("producto", "Mayo");
		mayo.put("ventas", 9200000);

		List<JSONObject> lista = new ArrayList<JSONObject>();
		lista.add(enero);
		lista.add(febrero);
		lista.add(marzo);
		lista.add(abril);
		lista.add(mayo);
		
		return lista;
	}

}
