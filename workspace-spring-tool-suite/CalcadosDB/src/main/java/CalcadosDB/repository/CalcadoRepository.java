package CalcadosDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CalcadosDB.model.entity.Calcado;


public interface CalcadoRepository extends JpaRepository<Calcado,Long> {

}
