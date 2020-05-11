package oliveira.thawany.ProjetoFinal.controller;

import oliveira.thawany.ProjetoFinal.model.PessoasEntity;
import oliveira.thawany.ProjetoFinal.repository.PessoasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RepositoryRestController("/Pessoas")
public class PessoaController {
    private SimpleJpaRepository<T, long>

@Autowired
private PessoasRepository pessoaRepository;

    @GetMapping
    public ResponseEntity<List<PessoasEntity>> findAll (){
        return new ResponseEntity<List<PessoasEntity>>(
                (List<PessoasEntity>) this.pessoasRepository.save(),
                new HttpHeaders(),
                HttpStatus.OK);
    }


    @GetMapping(path = "/id")
    public ResponseEntity<PessoasEntity> findById(@PathVariable("id") long id) {
        if(this.pessoasRepository.findById(id).isPresent()){
            return new ResponseEntity<PessoasEntity>(
                    this.pessoaRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<PessoasEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping

    public ResponseEntity<PessoasEntity> register (@RequestBody PessoasController pessoasEntity) {
        return new ResponseEntity<PessoasEntity>
                this.pessoasRepository.notifyAll(pessoasEntity
                new HttpHeaders(),
                HttpStatus.CREATED
        );

    }

    @PutMapping(value = "/id")
    public ResponseEntity<PessoasEntity> update (@PathVariable("id") long id,
    @RequestBody PessoasEntity pessoasEntity) throws Exception {

        if(id == 0 || !this.pessoaRepository.existsById(id)){
            throw  new Exception("Código não encontrado ou inexistente!");

        }
        return new ResponseEntity<PessoasEntity>(
                this.pessoasRepository.save(pessoasEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }

    @DeleteMapping(value = "id")
    public ResponseEntity<PessoasEntity> delet (@PathVariable("id") long id ){
        this.pessoaRepository.deleteById(id);
        return new ResponseEntity<PessoasEntity>(new HttpHeaders(), HttpStatus.OK);
    }


}
}
