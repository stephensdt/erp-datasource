package com.erpdatasource.app.domain.service;

import com.erpdatasource.app.domain.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vagner Fellipe
 */
@Service
public class ClienteService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Cliente> buscarClientes() {
        List<Cliente> clienteList = new ArrayList<Cliente>();

        System.out.println("CHAMOU A FUNÇÃO");
        jdbcTemplate.query("SELECT * FROM pedi_010", (rs)-> {
            Cliente cliente = new Cliente();
            cliente.setCgc_9(rs.getInt("cgc_9"));
            cliente.setCgc_4(rs.getInt("cgc_4"));
            cliente.setCgc_2(rs.getInt("cgc_2"));
            cliente.setNome_cliente(rs.getString("nome_cliente"));
            cliente.setFantasia_cliente(rs.getString("fantasia_cliente"));
            cliente.setSituacao_cliente(rs.getInt("situacao_cliente"));
            cliente.setTelefone_cliente(rs.getInt("telefone_cliente"));
            cliente.setTelex_cliente(rs.getInt("telex_cliente"));
            cliente.setFax_cliente(rs.getInt("fax_cliente"));
            cliente.setEndereco_cliente(rs.getString("endereco_cliente"));

            clienteList.add(cliente);
        });


        return clienteList;
    }
}
