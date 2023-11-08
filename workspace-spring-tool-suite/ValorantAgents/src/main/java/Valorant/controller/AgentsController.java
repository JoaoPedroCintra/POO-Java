package Valorant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Valorant.model.entity.Agents;
import Valorant.service.AgentsService;

@RestController
@RequestMapping("/agents")
public class AgentsController{

		@Autowired
		AgentsService servico;

		@GetMapping
		public List<Agents> getAgents() {
			return servico.getAgents();
		}
		
		@GetMapping("/{id}")
		public Optional<Agents> getAgent(@PathVariable Long id) {
		Optional<Agents> agent =  servico.getAgents(id);
			return agent;
		}
		
		@PostMapping
		public Agents addAgent(@RequestBody Agents agents) {
			return servico.addAgent(agents);
		}
		
		@DeleteMapping("/{id}")
		public String removeAgents(@PathVariable Long id) {
			servico.removeAgents(id);
			return "Remoção com sucesso";
		}
			
		@PutMapping()
		public Agents updateAgents(@RequestBody Agents agents) {
			return servico.updateAgents(agents);
		}
		
}
