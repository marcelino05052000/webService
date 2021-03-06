/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelino
 */
public class PessoaDAO {

    private static PessoaDAO instance;

    private ArrayList<Pessoa> pessoas;

    private PessoaDAO() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public static PessoaDAO getInstance() {
        if (instance == null) {
            instance = new PessoaDAO();
        }
        return instance;
    }

    public boolean adicionar(Pessoa pessoa) {
        return this.pessoas.add(pessoa);
    }

    public boolean remover(Pessoa p) {
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getNome().equals(p.getNome())) {
                this.pessoas.remove(pessoa);
            }
        }
        /*return this.pessoas.remove(pessoa);*/
        return false;
    }

    public Pessoa consultar(String nome) {
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getNome().equals(nome)){
                return pessoa;
            }
        }
        return null;
    }
    
    public void alterar(Pessoa p) {
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getNome().equals(p.getNome())) {
                this.pessoas.remove(pessoa);
                this.pessoas.add(p);
            }
        }
    }

    public List<Pessoa> consultarTodos() {
        return this.pessoas;
    }
    
}
