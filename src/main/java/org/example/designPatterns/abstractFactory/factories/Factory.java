package org.example.designPatterns.abstractFactory.factories;

import org.example.designPatterns.abstractFactory.abstracts.Button;
import org.example.designPatterns.abstractFactory.abstracts.Dialog;
import org.example.designPatterns.abstractFactory.abstracts.Input;

public interface Factory {

    Button getButton();
    Dialog getDialog();
    Input getInput();
}
