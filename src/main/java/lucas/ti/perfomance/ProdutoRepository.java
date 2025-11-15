package lucas.ti.perfomance;

import lucas.ti.perfomance.dtos.ProdutoDto;
import lucas.ti.perfomance.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository   extends JpaRepository<Produto, Long> {
}
