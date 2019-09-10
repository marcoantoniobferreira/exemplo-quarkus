package org.acme.quarkus.sample;

import javax.enterprise.context.ApplicationScoped;

/**
 * NovoTeste
 */
@ApplicationScoped
public class NovoTeste {
    public String teste(String name) {
        return "Olá " + name + "\n";
    }
    
}