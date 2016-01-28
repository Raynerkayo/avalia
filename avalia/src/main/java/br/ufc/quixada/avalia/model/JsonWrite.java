package br.ufc.quixada.avalia.model;

import java.io.FileWriter;
import java.util.List;

import org.json.simple.JSONObject;

public class JsonWrite {

	@SuppressWarnings("unused")
	private List<Estabelecimento> estabelcimentos;

	public void criarJson(List<Estabelecimento> estabelcimentos) {
		this.estabelcimentos = estabelcimentos;
		
		JSONObject json = new JSONObject();
		
		FileWriter fw = null;
		
		for(Estabelecimento e : estabelcimentos) {
			json.put("id", e.getId());
			json.put("nome", e.getNome());
			json.put("lat", e.getCoordenadas().getLatitude());
			json.put("lon", e.getCoordenadas().getLongitude());
			//json.put("media", e.getMediaGeral());
		}
		
		try {
			fw = new FileWriter("estabelecimentos.json");
			fw.write(json.toJSONString());
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(json);
	}
}
