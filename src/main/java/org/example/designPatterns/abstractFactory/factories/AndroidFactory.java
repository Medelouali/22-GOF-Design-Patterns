package org.example.designPatterns.abstractFactory.factories;

import org.example.designPatterns.abstractFactory.abstracts.Button;
import org.example.designPatterns.abstractFactory.abstracts.Dialog;
import org.example.designPatterns.abstractFactory.abstracts.Input;
import org.example.designPatterns.abstractFactory.conreteWidgets.AndroidButton;
import org.example.designPatterns.abstractFactory.conreteWidgets.AndroidDialog;
import org.example.designPatterns.abstractFactory.conreteWidgets.AndroidInput;

public class AndroidFactory implements Factory {
    @Override
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public Dialog getDialog() {
        return new AndroidDialog();
    }

    @Override
    public Input getInput() {
        return new AndroidInput();
    }
}
