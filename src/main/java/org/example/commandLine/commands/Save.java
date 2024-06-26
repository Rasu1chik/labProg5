package org.example.commandLine.commands;

import org.example.commandLine.Console;
import org.example.commandLine.ConsoleColors;
import org.example.exeptions.IllegalArguments;
import org.example.managers.FileManager;
import org.example.models.Flat;

/**
 * Команда 'save'
 * Сохраняет коллекцию в файл
 */
public class Save extends Command{
    private FileManager fileManager;
    private Console console;

    public Save(Console console, FileManager fileManager) {
        super("save", ": сохранить коллекцию в файл");
        this.fileManager = fileManager;
        this.console = console;
    }

    /**
     * Исполнить команду
     * @param args аргументы команды
     * @throws IllegalArguments неверные аргументы команды
     */
    @Override
    public void execute(String args) throws IllegalArguments {
        if (!args.isBlank()) throw new IllegalArguments();
        fileManager.saveObjects();
        console.println(ConsoleColors.toColor("Объекты сохранены успешно", ConsoleColors.GREEN));
    }
}