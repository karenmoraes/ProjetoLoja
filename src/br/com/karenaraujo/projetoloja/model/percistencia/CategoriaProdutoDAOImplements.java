/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.model.percistencia;

import br.com.karenaraujo.projetoloja.model.CategoriaProduto;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.CategoriaProdutoDAO;
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
public class CategoriaProdutoDAOImplements implements CategoriaProdutoDAO {

    private static final String INSERIR = "insert into categoriaproduto(nome, descricao) values (?, ?);";
    private static final String LIST = "Select * from categoriaproduto";
    private static final String REMOVER = "delete from categoriaproduto where codigo = ?;";
    private static final String UPDATE = "update categoriaproduto set nome = ?, set descricao = ? where codigo = ?;";
    private static final String LISTBYID = "select * from categoriaproduto where codigo = ?;";
    private static final String LISTBYNOME = "select * from categoriaproduto where nome like ?;";

    public int Salvar(CategoriaProduto cp) {
        if (cp.getCodigo() == 0) {
            return inserir(cp);
        } else {
            return update(cp);
        }

    }

    public int inserir(CategoriaProduto cp) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERIR, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, cp.getNome());
            pstm.setString(2, cp.getDescricao());
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

            JOptionPane.showMessageDialog(null, "Erro ao excluir categoria produto" + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
            }
        }
        return status;
    }

    public List<CategoriaProduto> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<CategoriaProduto> categoriaProdutos = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CategoriaProduto cp = new CategoriaProduto();
                cp.setCodigo(rs.getInt("codigo"));
                cp.setNome(rs.getString("nome"));
                cp.setDescricao(rs.getString("descricao"));
                categoriaProdutos.add(cp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as categorias de produtos" + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão" + e.getMessage());
            }
        }
        return categoriaProdutos;
    }

    public CategoriaProduto listById(int codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        CategoriaProduto cp = new CategoriaProduto();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cp.setCodigo(rs.getInt("codigo"));
                cp.setNome(rs.getString("nome"));
                cp.setDescricao(rs.getString("descricao"));


            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as categorias de produtos " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão " + e.getMessage());

            }
        }
        return cp;
    }

    public int update(CategoriaProduto cp) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, cp.getNome());
            pstm.setString(2, cp.getDescricao());
            retorno = cp.getCodigo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar os dados da categoria produto" + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro ao fecha a conexão" + e.getMessage());

            }
        }
        return retorno;

    }

    public List<CategoriaProduto> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<CategoriaProduto> categoriaProdutos = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                CategoriaProduto cp = new CategoriaProduto();
                cp.setCodigo(rs.getInt("codigo"));
                cp.setNome(rs.getString("nome"));
                cp.setDescricao(rs.getString("descricao"));

                categoriaProdutos.add(cp);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar as categoria de produtos " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão");
            }
        }
        return categoriaProdutos;

    }
}
