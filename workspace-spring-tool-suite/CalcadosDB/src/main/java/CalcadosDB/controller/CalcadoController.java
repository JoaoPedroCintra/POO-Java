package CalcadosDB.controller;

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

import CalcadosDB.model.dto.CalcadoDto;
import CalcadosDB.service.CalcadoService;


@RestController
@RequestMapping("/calcados")
public class CalcadoController{
	
	@Autowired
	CalcadoService servico;

	@GetMapping
	public List<CalcadoDto> getCalcados() {
		return servico.getCalcados();
	}
	
	@GetMapping("/{id}")
	public CalcadoDto getCalcado(@PathVariable Long id) {
		CalcadoDto calcado = servico.getCalcado(id);
		return calcado;
	}
	
	@PostMapping
	public CalcadoDto addCalcado(@RequestBody CalcadoDto calcadoDto) {
		return servico.addCalcado(calcadoDto);
	}
	
	@DeleteMapping("/{id}")
	public String removeCalcado(@PathVariable Long id) {
		return servico.removeCalcado(id);
	}
		
	@PutMapping()
	public CalcadoDto updateCalcado(@RequestBody CalcadoDto calcadoDto) {
		return servico.updateCalcado(calcadoDto);
	}
		
}
