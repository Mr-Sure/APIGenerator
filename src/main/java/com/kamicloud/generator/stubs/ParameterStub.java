package com.kamicloud.generator.stubs;

public class ParameterStub extends BaseWithAnnotationStub {
    private String type;

    public ParameterStub(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean isModel() {
        return type.startsWith("Models");
    }

    public boolean isEnum() {
        return type.startsWith("Enums");
    }

    public boolean isArray() {
        return type.endsWith("[]");
    }
}
