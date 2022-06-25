package com.example.homework3.Usr.Enum;

public enum EnumUsrUserType {
    USER("USER"),
   // VENDOR("VENDOR")
    ;

    private String type;

    EnumUsrUserType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
