package br.com.alura;

import java.util.concurrent.Executor;

public class CommandExecutor {
    void executeCommand (Command command){
        command.execute();
    }
}

