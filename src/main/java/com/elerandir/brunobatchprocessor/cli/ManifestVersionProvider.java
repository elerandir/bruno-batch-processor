package com.elerandir.brunobatchprocessor.cli;

import picocli.CommandLine.IVersionProvider;

public class ManifestVersionProvider implements IVersionProvider {

    @Override
    public String[] getVersion() {
        String version = getClass().getPackage().getImplementationVersion();
        return new String[]{"bruno-batch-processor " + (version != null ? version : "development")};
    }
}
