package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

public class ImportarPetsDoAbrigoCommand implements Command {


    @Override
    public void execute(){
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);
            petService.importarPetsDoAbrigo();
        } catch( IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}

