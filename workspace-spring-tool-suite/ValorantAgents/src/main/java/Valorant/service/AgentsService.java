package Valorant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Valorant.model.dto.AgentsDto;
import Valorant.model.entity.Agents;
import Valorant.repository.AgentsRepository;

@Service
public class AgentsService {

	@Autowired
	AgentsRepository injecao;
		
	@GetMapping 
	public List<Agents> getAgents(){
		return injecao.findAll();
	}
		
	@GetMapping("/{id}")
	public Optional<Agents> getAgents(@PathVariable Long id) {
		return injecao.findById(id);
	}
		
	@PostMapping
	public AgentsDto addAgent(@RequestBody AgentsDto agentDto) {
		Agents agent = converteDtoToAgents(agentDto);
		return converteAgentsToDto(injecao.save(agent));
	}
		
	@DeleteMapping("/{id}")
	public String removeAgents(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção com sucesso";
	}
		
	@PutMapping()
	public AgentsDto updateAgents(@RequestBody AgentsDto agentDto) {
		Agents agent = converteDtoToAgents(agentDto);
		return converteAgentsToDto(injecao.save(agent));
	}
	
	public Agents converteDtoToAgents(AgentsDto dto) {
		Agents objAgent = new Agents();
		objAgent.setId(dto.getId());
		objAgent.setName(dto.getName());
		objAgent.setCategory(dto.getCategory());
		objAgent.setSkills(dto.getSkills());
		return objAgent;
	}
	
	public AgentsDto converteAgentsToDto(Agents agent) {
		AgentsDto objDto = new AgentsDto();
		objDto.setId(agent.getId());
		objDto.setName(agent.getName());
		objDto.setCategory(agent.getCategory());
		objDto.setSkills(agent.getSkills());
		return objDto;
	}
}