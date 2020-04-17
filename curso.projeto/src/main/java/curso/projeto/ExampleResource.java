package curso.projeto;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/categorias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @Inject
    private CategoriaRepository categoriaRepository;

    @GET
    public List<Categoria> findAll() {
        return categoriaRepository.listAll();
    }

    @POST
    @Transactional
    public Categoria salvarCategoria(@Valid Categoria categoria){
        categoriaRepository.persist(categoria);
        return categoria;
    }

}