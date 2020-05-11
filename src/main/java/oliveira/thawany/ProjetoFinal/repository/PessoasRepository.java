package oliveira.thawany.ProjetoFinal.repository;


import oliveira.thawany.ProjetoFinal.model.PessoasEntity;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoasRepository extends CrudRepositoryExtensionsKt <PessoasEntity, Long>{
    Optional<Object> findById(long id);

    PessoasEntity save(PessoasEntity pessoasEntity);
}