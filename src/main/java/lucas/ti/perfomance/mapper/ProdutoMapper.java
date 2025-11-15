package lucas.ti.perfomance.mapper;

import lucas.ti.perfomance.dtos.ProdutoDto;
import lucas.ti.perfomance.entity.Produto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    Produto  map(ProdutoDto produtoDto);
}
