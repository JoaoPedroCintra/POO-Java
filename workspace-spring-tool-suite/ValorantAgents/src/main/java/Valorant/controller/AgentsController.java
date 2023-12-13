// Valter Gomes e João Pedro Cintra 	4ºADS_M
package Valorant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Valorant.model.dto.AgentsDto;
import Valorant.service.AgentsService;

@RestController
@RequestMapping("/agents")
public class AgentsController{

		@Autowired
		AgentsService servico;

		@GetMapping
		public List<AgentsDto> getAgents() {
			return servico.getAgents();
		}
		
		@GetMapping("/{id}")
		public AgentsDto getAgent(@PathVariable Long id) {
			AgentsDto agent = servico.getAgent(id);
			return agent;
		}
		
		@PostMapping
		public AgentsDto addAgent(@RequestBody AgentsDto agentsDto) {
			return servico.addAgent(agentsDto);
		}
		
		@DeleteMapping("/{id}")
		public String removeAgent(@PathVariable Long id) {
			return servico.removeAgent(id);
		}
			
		@PutMapping()
		public AgentsDto updateAgent(@RequestBody AgentsDto agentsDto) {
			return servico.updateAgent(agentsDto);
		}
		
}
