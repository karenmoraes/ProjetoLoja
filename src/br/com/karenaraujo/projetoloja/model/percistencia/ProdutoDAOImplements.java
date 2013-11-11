/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.model.percistencia;

import br.com.karenaraujo.projetoloja.model.CategoriaProduto;
import br.com.karenaraujo.projetoloja.model.Produto;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ezio_joao
 */
public class ProdutoDAOImplements implements ProdutoDAO {

    private static final String INSERIR = "insert into produto(nome, qntestoque, valor, data_fabricacao,"
            + "categoriaproduto_categoriapro)  values (?, ?, ?, ?, ?);";
    private static final String LIST = "Select * from categoriaproduto ,produto where "
            + "categoriaproduto.codigo = produto.codigo";
    private static final String REMOVER = "delete from produto where codigo = ?;";
    private static final String UPDATE = "update produto set nome = ?, set qntestoque = ?, set valor = ?, "
            + "set data_fabricacao = ?, set categoriaproduto_categoriapro = ? where codigo = ?;";
    private static final String LISTBYID = "select * from produto, categoriaproduto where produto.categoriaproduto_categoriapro = categoriaproduto.codigo and produto.codigo = ?;";
    private static final String LISTBYNOME = "select * from produto where nome like ?;";

    public int Salvar(Produto p) {
        if (p.getCodigo() == 0) {
            return inserir(p);
        } else {
            return update(p);
        }

    }

    public int inserir(Produto p) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERIR, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, p.getNome());
            pstm.setString(2, p.getQntEstoque());
            pstm.setDouble(3, p.getValor());
            pstm.setDate(4, new java.sql.Date(p.getDatafabricacao().getTime()));
            pstm.setInt(5, p.getCategoriaproduto().getCodigo());
            pstm.execute();

            try (ResultSet rs = pstm.getGeneratedKeys()) {
                if (rs.next()) {
                    retorno = rs.getInt(1);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e);
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (SQLException ex) {
            }
            return retorno;
        }
    }

    public boolean remover(int codigo) {
        boolean status = false;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVER);
            pstm.setInt(1, codigo);
            pstm.execute();
            status = true;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto" + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
            }
        }
        return status;
    }

    public List<Produto> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Produto> Produtos = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                CategoriaProduto categoria = new CategoriaProduto();
                p.setCodigo(rs.getInt("produto.codigo"));
                p.setNome(rs.getString("produto.nome"));
                p.setQntEstoque(rs.getString("qntestoque"));
                p.setValor(rs.getDouble("valor"));
                p.setDatafabricacao(rs.getDate("data_fabricacao"));
                categoria.setCodigo(rs.getInt("categoriaproduto.codigo"));
                categoria.setNome(rs.getString("categoriaproduto.nome"));
                p.setCategoriaproduto(categoria);
                Produtos.add(p);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os  produtos" + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão" + e.getMessage());
            }
        }
        return Produtos;
    }

    public Produto listById(int codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Produto p = new Produto();
        CategoriaProduto cp = new CategoriaProduto();


        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                p.setCodigo(rs.getInt("produto.codigo"));
                p.setNome(rs.getString("produto.nome"));
                p.setQntEstoque(rs.getString("qntestoque"));
                p.setValor(rs.getDouble("valor"));
                p.setDatafabricacao(rs.getDate("data_fabricacao"));
                cp.setCodigo(rs.getInt("categoriaproduto.codigo"));
                cp.setNome(rs.getString("categoriaproduto.nome"));
                p.setCategoriaproduto(cp);


            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os  produtos " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão " + e.getMessage());

            }
        }
        return p;
    }

    public int update(Produto p) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            pstm.setString(1, p.getNome());
            pstm.setString(2, p.getQntEstoque());
            pstm.setDouble(3, p.getValor());
            pstm.setDate(4, new java.sql.Date(p.getDatafabricacao().getTime()));
            pstm.setInt(5, p.getCategoriaproduto().getCodigo());            
            retorno = p.getCodigo();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar os dados do produto" + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro ao fecha a conexão" + e.getMessage());

            }
        }
        return retorno;

    }

    public List<Produto> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Produto> Produtos = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                 Produto p = new Produto();
                CategoriaProduto categoria = new CategoriaProduto();
                p.setCodigo(rs.getInt("produto.codigo"));
                p.setNome(rs.getString("produto.nome"));
                p.setQntEstoque(rs.getString("qntestoque"));
                p.setValor(rs.getDouble("valor"));
                p.setDatafabricacao(rs.getDate("data_fabricacao"));
                categoria.setCodigo(rs.getInt("categoriaproduto.codigo"));
                categoria.setNome(rs.getString("categoriaproduto.nome"));
                p.setCategoriaproduto(categoria);
                Produtos.add(p);
               

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar os  produtos " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão");
            }
        }
        return Produtos;

    }
}
