import br.com.danielsilva.dao.IProdutoDAO;
import br.com.danielsilva.dao.ProdutoDAO;
import br.com.danielsilva.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;


    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();

    }

    @Test
    public void cadastrar(){
        Produto produto = new Produto();
        produto.setNome("RTX");
        produto.setCodigo("01");
        produto = produtoDAO.cadastrar(produto);

        Assert.assertNotNull(produto);



    }

}