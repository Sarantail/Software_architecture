package Ports;

// через данный порт осущ-ся передача управляющей команды: объект userCommand

public interface iUserInput {
    public void handleUserInput(Object userCommand);
}