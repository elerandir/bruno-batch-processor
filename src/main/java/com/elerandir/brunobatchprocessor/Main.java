package com.elerandir.brunobatchprocessor;

import com.elerandir.brunobatchprocessor.cli.ReplaceBodyCommand;
import lombok.experimental.UtilityClass;
import picocli.CommandLine;

@UtilityClass
public class Main {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ReplaceBodyCommand()).execute(args);
        System.exit(exitCode);
    }
}
