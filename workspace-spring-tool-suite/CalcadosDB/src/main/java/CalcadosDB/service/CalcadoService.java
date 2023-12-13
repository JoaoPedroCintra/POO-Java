package CalcadosDB.service;

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

import CalcadosDB.model.dto.CalcadoDto;
import CalcadosDB.model.entity.Calcado;
import CalcadosDB.repository.CalcadoRepository;

@Service
public class CalcadoService {
	@Autowired()
	 CalcadoRepository injecao;
		
	@GetMapping 
	public List<CalcadoDto> getCalcados(){
		List<Calcado> calcado = injecao.findAll();
		return converteListaCalcadoToListaDtos(calcado);
	}
		
	@GetMapping("/{id}")
	public CalcadoDto getCalcado(@PathVariable Long id) {
		Optional<Calcado> optional = injecao.findById(id);
		if (optional.isPresent()) {
			return converteCalcadoToDto(optional.get());
		}
		return null;
	}
		
	@PostMapping
	public CalcadoDto addCalcado(@RequestBody CalcadoDto calcadoDto) {
		Calcado calcado = converteDtoToCalcado(calcadoDto);
		return converteCalcadoToDto(injecao.save(calcado));
	}
		
	@DeleteMapping("/{id}")
	public String removeCalcado(@PathVariable Long id) {
		if (injecao.existsById(id)) {
			injecao.deleteById(id);
			return "Remoção com sucesso";
		}
		return "Agente não existe";
	}
		
	@PutMapping()
	public CalcadoDto updateCalcado(@RequestBody CalcadoDto calcadoDto) {
		Calcado calcado = converteDtoToCalcado(calcadoDto);
		return converteCalcadoToDto(injecao.save(calcado));
	}
	public Calcado converteDtoToCalcado(CalcadoDto dto) {
		Calcado calcado = new Calcado();
		calcado.setCor(dto.getCor());;
		calcado.setId(dto.getId());
		calcado.setMarca(dto.getMarca());
		calcado.setMaterial(dto.getMaterial());
		calcado.setTamanho(dto.getTamanho());
		calcado.setTipo(dto.getTipo());
		return calcado;
	}
	public CalcadoDto converteCalcadoToDto(Calcado calcado) {
		CalcadoDto dto = new CalcadoDto();
		dto.setCor(calcado.getCor());;
		dto.setId(calcado.getId());
		dto.setMarca(calcado.getMarca());
		dto.setMaterial(calcado.getMaterial());
		dto.setTamanho(calcado.getTamanho());
		dto.setTipo(calcado.getTipo());
		return dto;
	}
	
	public List<CalcadoDto> converteListaCalcadoToListaDtos(List<Calcado> calcado){
		List<CalcadoDto> listaDto = new ArrayList<CalcadoDto>();
		for(int i=0;i<calcado.size();i++) {
			listaDto.add(converteCalcadoToDto(calcado.get(i)));
		}
		return listaDto;
	}
}
