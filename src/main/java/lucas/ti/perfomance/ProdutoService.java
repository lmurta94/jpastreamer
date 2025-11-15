package lucas.ti.perfomance;

import lucas.ti.perfomance.dtos.ProdutoDto;
import lucas.ti.perfomance.entity.Produto;
import lucas.ti.perfomance.mapper.ProdutoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ProdutoMapper produtoMapper;

    public Produto create(ProdutoDto dto) {

       return produtoRepository.save(produtoMapper.map(dto));
    }
}
