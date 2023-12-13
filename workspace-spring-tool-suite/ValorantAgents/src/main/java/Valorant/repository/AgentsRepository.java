// Valter Gomes e João Pedro Cintra 	4ºADS_M
package Valorant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Valorant.model.entity.Agents;

public interface AgentsRepository extends JpaRepository<Agents,Long> {

}
