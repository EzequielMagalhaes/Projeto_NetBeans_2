/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulabancodedados.DAL;

import aulabancodedados.DTO.ClienteDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author autologon
 */
public class ClienteDAL extends ConexaoMYSQL{
    public void incluirCliente(ClienteDTO cliente) throws Exception
    {
        //Prepara a conexão com o MySQL
        abrirBD();
        SQL = "INSERT INTO clientes (cliNome, cliDtInclusao, cliEndereco, cliBairro, cliEmail, cliTel, cliCidade, cliUF) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        ps = con.prepareStatement(SQL);
        //Busca os valores da classe clienteDTO
        ps.setString(1, cliente.getCliNome());
        ps.setDate(2, (java.sql.Date) (Date) cliente.getCliDtInclusao());
        ps.setString(3, cliente.getCliEndereco());
        ps.setString(4, cliente.getCliBairro());
        ps.setString(5, cliente.getCliEmail());
        ps.setString(6, cliente.getCliTel());
        ps.setString(7, cliente.getCliCidade());
        ps.setString(8, cliente.getCliUF());
        ps.execute();
        fecharBD();
    }
        public ClienteDTO selecionarClientePorID(Integer cliID)throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM clientes WHERE cliID=?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, cliID);
        rs = ps.executeQuery();
        ClienteDTO cliente = new ClienteDTO();
        if(rs.next())
        {
            cliente.setCliID(rs.getInt("cliID"));
            cliente.setCliNome(rs.getString("cliNome"));
            cliente.setCliDtInclusao(rs.getDate("cliDtInclusao"));
            cliente.setCliEndereco(rs.getString("cliEndereco"));
            cliente.setCliBairro(rs.getString("cliBairro"));
            cliente.setCliEmail(rs.getString("cliEmail"));
            cliente.setCliTel(rs.getString("cliTel"));
            cliente.setCliCidade(rs.getString("cliCidade"));
            cliente.setCliUF(rs.getString("cliUF"));
            fecharBD();            
        }
        return cliente;
    }
            //Método que vai selecionar todos os clientes no nosso Banco de Dados
    //e ordenar por nome do cliente
     public List selecionarListaClientes() throws Exception
     {
         abrirBD();
         SQL = "SELECT * FROM clientes ORDER BY cli_nome";
         ps = con.prepareStatement(SQL);
         rs = ps.executeQuery();
         List listaClientes = new ArrayList();
         while(rs.next())
         {
             clientesDTO cliente = new clientesDTO();
             cliente.setCliID(rs.getInt("cliID"));
             cliente.setCliNome(rs.getString("cliNome"));
             cliente.setCliDtInclusao(rs.getDate("cliDtInclusao"));
             cliente.setCliEndereco(rs.getString("cliEndereco"));
             cliente.setCliBairro(rs.getString("cliBairro"));
             cliente.setCliEmail(rs.getString("cliEmail"));
             cliente.setCliTel(rs.getString("cliTel"));
             cliente.setCliCidade(rs.getString("cliCidade"));
             cliente.setCliUF(rs.getString("cliUF"));
             listaClientes.add(cliente);         
         }
         fecharBD();
         return listaClientes;
     }

}