/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto;

import java.util.ArrayList;

/**
 *
 * @author pronatec
 */
public class PessoaDAO {
    
    private ArrayList<Pessoa> pessoas;
    
    public PessoaDAO(){
        this.pessoas = new ArrayList<Pessoa>();
    }
    
    public boolean adicionar(Pessoa pessoa){
       return  this.pessoas.add(pessoa);
    }
}
