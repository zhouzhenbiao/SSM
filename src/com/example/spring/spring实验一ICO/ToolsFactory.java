package com.example.spring.spring实验一ICO;

public class ToolsFactory {

    public static Tools getStaticTools(String name) {
        if (name.equalsIgnoreCase("Axe"))
            return new Axe();
        else
            return new Saw();
    }

    public Tools getInstanceTools(String name) {
        if (name.equalsIgnoreCase("Axe"))
            return new Axe();
        else
            return new Saw();
    }
}
