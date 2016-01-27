package br.ufc.quixada.avalia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mapa")
public class MapaController {

	@RequestMapping(value="/exibir")
	public String exibir() {
		return null;
	}
}
