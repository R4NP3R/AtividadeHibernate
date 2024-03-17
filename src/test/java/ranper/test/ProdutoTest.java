package ranper.test;

import org.junit.Assert;
import org.junit.Test;
import ranper.dao.ProdutoDao;
import ranper.domain.Produto;

public class ProdutoTest {

    private ProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }


    @Test
    public void cadastrar() {

        Produto produto = new Produto();
        produto.setNome("Celular");
        produto.setValor(1340L);

        produtoDao.cadastrar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getNome());

    }
}
