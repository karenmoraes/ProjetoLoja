/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.model.percistencia;

import br.com.karenaraujo.projetoloja.model.Funcionario;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.FuncionarioDAO;
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
public class FuncionarioDAOImplements implements FuncionarioDAO {

    private static final String INSERIR = "insert into Funcionario(nome, cpf, rg, login, senha, telefone,"
            + " sexo, salario, cargo, data_nascimento, endereco_codigo)values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String LIST = "Select * from Funcionario";
    private static final String REMOVER = "delete from funcionario where codigo = ?;";
    private static final String UPDATE = "update Funcionario set nome = ?, set cpf = ?, set rg = ?,"
            + " set login = ?, set senha = ?, set telefone = ?, set sexo = ?, set salario = ?, set cargo = ?, set data_nascimento "
            + "where id = ?;";
    private static final String LISTBYID = "select * from Funcionario where codigo = ?;";
    private static final String LISTBYNOME = "select * from Funcionario where nome like ?;";
    private static final String LOGIN = "select * from funcionario where login = ? and senha = ?;";

    public int Salvar(Funcionario f) {
        if (f.getCodigo() == 0) {
            return inserir(f);
        } else {
            return update(f);
        }

    }

    public int inserir(Funcionario f) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERIR, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, f.getNome());
            pstm.setString(2, f.getCpf());
            pstm.setString(3, f.getRg());
            pstm.setString(4, f.getLogin());
            pstm.setString(5, f.getSenha());
            pstm.setString(6, f.getTelefone());
            pstm.setString(7, f.getSexo());
            pstm.setDouble(8, f.getSalario());
            pstm.setString(9, f.getCargo());
            pstm.setDate(10, new java.sql.Date(f.getDatanascimento().getTime()));
            pstm.setInt(11, f.getEndereco().getCodigo());
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

            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionario" + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
            }
        }
        return status;
    }

    public List<Funcionario> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionario = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setCodigo(rs.getInt("codigo"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setRg(rs.getString("rg"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                f.setTelefone(rs.getString("telefone"));
                f.setSexo(rs.getString("sexo"));
                f.setSalario(rs.getDouble("salario"));
                f.setCargo(rs.getString("cargo"));
                f.setDatanascimento(rs.getDate("data_nascimento"));
                funcionario.add(f);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os funcionarios" + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão" + e.getMessage());
            }

        }
        return funcionario;

    }

    public Funcionario listById(int codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Funcionario f = new Funcionario();

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                f.setCodigo(rs.getInt("codigo"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setRg(rs.getString("rg"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                f.setTelefone(rs.getString("telefone"));
                f.setSexo(rs.getString("sexo"));
                f.setSalario(rs.getDouble("salario"));
                f.setCargo(rs.getString("cargo"));
                f.setDatanascimento(rs.getDate("data_nascimento"));


            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o funcionario " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão " + e.getMessage());

            }
        }
        return f;
    }

    public int update(Funcionario f) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, f.getNome());
            pstm.setString(2, f.getCpf());
            pstm.setString(3, f.getRg());
            pstm.setString(4, f.getLogin());
            pstm.setString(5, f.getSenha());
            pstm.setString(6, f.getTelefone());
            pstm.setString(7, f.getSexo());
            pstm.setDouble(8, f.getSalario());
            pstm.setString(9, f.getCargo());
            pstm.setDate(10, new java.sql.Date(f.getDatanascimento().getTime()));
            retorno = f.getCodigo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar os dados do funcionario" + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro ao fecha a conexão" + e.getMessage());

            }
        }
        return retorno;

    }

    public List<Funcionario> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionario = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setCodigo(rs.getInt("codigo"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setRg(rs.getString("rg"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                f.setTelefone(rs.getString("telefone"));
                f.setSexo(rs.getString("sexo"));
                f.setSalario(rs.getDouble("salario"));
                f.setCargo(rs.getString("cargo"));
                f.setDatanascimento(rs.getDate("data_nascimento"));
                funcionario.add(f);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o funcionario " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão");
            }
        }
        return funcionario;

    }
      public boolean Login(String login, String senha) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LOGIN);
            pstm.setString(1,  login );
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            while (rs.next()) {
               result = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o login ou senha " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão");
            }
        }
        return result;

    }
    
}
