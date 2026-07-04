package com.elerandir.brunobatchprocessor.model;

import java.util.List;

public record BruDocument(List<BruNode> nodes) {

    public BruDocument {
        nodes = List.copyOf(nodes);
    }
}
