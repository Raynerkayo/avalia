package br.ufc.quixada.avalia.model;

import java.io.FileWriter;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {

	@SuppressWarnings("unused")
	private List<Estabelecimento> estabelcimentos;

	@SuppressWarnings("unchecked")
	public void criarJson(List<Estabelecimento> estabelcimentos) {
		
		this.estabelcimentos = estabelcimentos;

		JSONArray jArray = new JSONArray();
		JSONObject json;

		for (Estabelecimento e : estabelcimentos) {
			json = new JSONObject();
			json.put("id", e.getId());
			json.put("nome", e.getNome());
			json.put("lat", e.getCoordenadas().getLatitude());
			json.put("lon", e.getCoordenadas().getLongitude());
			json.put("media", e.getMediaGeral());
			
			jArray.add(json);
		}
		
		try {
			FileWriter file = new FileWriter("../../estabelecimentos.json");
			file.write(jArray.toJSONString());
			file.flush();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(jArray);
	}
}
