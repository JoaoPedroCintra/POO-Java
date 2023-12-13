// Valter Gomes e João Pedro Cintra 	4ºADS_M
package Valorant.service;

import java.util.ArrayList;
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
	public List<AgentsDto> getAgents(){
		List<Agents> agents = injecao.findAll();
		return converteListaAgentsToListaDtos(agents);
	}
		
	@GetMapping("/{id}")
	public AgentsDto getAgent(@PathVariable Long id) {
		Optional<Agents> optional = injecao.findById(id);
		if (optional.isPresent()) {
			return converteAgentsToDto(optional.get());
		}
		return null;
	}
		
	@PostMapping
	public AgentsDto addAgent(@RequestBody AgentsDto agentsDto) {
		Agents agent = converteDtoToAgents(agentsDto);
		return converteAgentsToDto(injecao.save(agent));
	}
		
	@DeleteMapping("/{id}")
	public String removeAgent(@PathVariable Long id) {
		if (injecao.existsById(id)) {
			injecao.deleteById(id);
			return "Remoção com sucesso";
		}
		return "Agente não existe";
	}
		
	@PutMapping()
	public AgentsDto updateAgent(@RequestBody AgentsDto agentsDto) {
		Agents agent = converteDtoToAgents(agentsDto);
		return converteAgentsToDto(injecao.save(agent));
	}
	public Agents converteDtoToAgents(AgentsDto dto) {
		Agents agent = new Agents();
		agent.setName(dto.getName());
		agent.setId(dto.getId());
		agent.setCategory(dto.getCategory());
		agent.setQ(dto.getQ());
		agent.setE(dto.getE());
		agent.setC(dto.getC());
		agent.setX(dto.getX());
		return agent;
	}
	public AgentsDto converteAgentsToDto(Agents agent) {
		AgentsDto dto = new AgentsDto();
		dto.setName(agent.getName());
		dto.setId(agent.getId());
		dto.setCategory(agent.getCategory());
		dto.setQ(agent.getQ());
		dto.setE(agent.getE());
		dto.setC(agent.getC());
		dto.setX(agent.getX());
		return dto;
	}
	
	public List<AgentsDto> converteListaAgentsToListaDtos(List<Agents> agents){
		List<AgentsDto> listaDto = new ArrayList<AgentsDto>();
		for(int i=0;i<agents.size();i++) {
			listaDto.add(converteAgentsToDto(agents.get(i)));
		}
		return listaDto;
	}
	
}