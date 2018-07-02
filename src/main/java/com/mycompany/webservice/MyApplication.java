/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/**
 *
 * @author veneceo
 */
/*
Oi, veneceo aqui.
Então, o que fizemos até agora, foi adicionar umas dependências (jersey e gson)
do jersey nesse projeto maven web.
Esse @ApplicationPath("/"), pelo que entendi, é pra dizer que
nosso projeto rodará nesse diretório, e após esse "/", qualquer
caminho indicado (como o da outra classe) será executado como
método ou afins.
*/
@ApplicationPath("/")
public class MyApplication extends Application {
//Eu não sei oq é essa porra aqui, mas faz pegar, então...
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(MyApplicationController.class);
        return classes;
    }
}
