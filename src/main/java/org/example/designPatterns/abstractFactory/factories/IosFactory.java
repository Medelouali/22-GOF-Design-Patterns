package org.example.designPatterns.abstractFactory.factories;

import org.example.designPatterns.abstractFactory.abstracts.Button;
import org.example.designPatterns.abstractFactory.abstracts.Dialog;
import org.example.designPatterns.abstractFactory.abstracts.Input;
import org.example.designPatterns.abstractFactory.conreteWidgets.IosButton;
import org.example.designPatterns.abstractFactory.conreteWidgets.IosDialog;
import org.example.designPatterns.abstractFactory.conreteWidgets.IosInput;

public class IosFactory implements Factory {
    @Override
    public Button getButton() {
        return new IosButton();
    }

    @Override
    public Dialog getDialog() {
        return new IosDialog();
    }

    @Override
    public Input getInput() {
        return new IosInput();
    }
}
