/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.model.percistencia;

import br.com.karenaraujo.projetoloja.model.Endereco;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.EnderecoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ezio_joao
 */
public class EnderecoDAOImplements implements EnderecoDAO{
      private static final String INSERT = "insert into endereco (rua, bairro, cidade, numero, cep) values (?, ?, ?, ?, ?)";

  
    public int salvar(Endereco e) {
  if(e.getCodigo() == 0){
      return inserir(e);
  }
  return -1;
    }

    private int inserir(Endereco e) {
        int status = -1;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, e.getRua());
            pstm.setString(2, e.getBairro());
            pstm.setString(3, e.getCidade());
            pstm.setInt(4, e.getNumero());
            pstm.setString(5, e.getCep());
            
            pstm.execute();
            try (ResultSet rs = pstm.getGeneratedKeys()) {
                rs.next();
                status = rs.getInt(1);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir  um endereço: " + ex.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão" + ex.getMessage());
            }
        }
        return status;

    }
}


