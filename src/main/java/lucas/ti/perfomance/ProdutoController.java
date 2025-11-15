package lucas.ti.perfomance;


import lucas.ti.perfomance.dtos.ProdutoDto;
import lucas.ti.perfomance.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody ProdutoDto dto) {
        Produto saved = produtoService.create(dto);
        return ResponseEntity.ok(saved);
    }
}
