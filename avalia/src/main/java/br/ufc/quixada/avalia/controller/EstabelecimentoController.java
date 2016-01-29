package br.ufc.quixada.avalia.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufc.quixada.avalia.model.Avaliacao;
import br.ufc.quixada.avalia.model.Coordenada;
import br.ufc.quixada.avalia.model.Estabelecimento;
import br.ufc.quixada.avalia.model.JsonWrite;
import br.ufc.quixada.avalia.service.EstabelecimentoService;

@Controller
@RequestMapping("estabelecimento")
public class EstabelecimentoController {

	@Inject
	private EstabelecimentoService estabelecimentoService;

	private static final String PATH_LISTAR_MAPA = "estabelecimento/listarMapa";
	private static final String PATH_RANK = "estabelecimento/rank";

	@RequestMapping(value = "/listarMapa", method = RequestMethod.GET)
	public String listarMapa() {

		List<Estabelecimento> estabelecimentos = estabelecimentoService.getAll();
		JsonWrite json = new JsonWrite();
		json.criarJson(estabelecimentos);

		return PATH_LISTAR_MAPA;
	}

	@RequestMapping(value = "/rank")
	public String rank(Model model) {

		System.out.println("Aqui porra!!");
		List<Estabelecimento> estabelecimentos = estabelecimentoService.getAll();

		model.addAttribute("estabelecimentos", estabelecimentos);

		return PATH_RANK;
	}
}
