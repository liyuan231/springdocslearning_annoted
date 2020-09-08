package com.liyuan.editor;

import java.beans.PropertyEditorSupport;

public class ExoticTypeEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new ExoticType(text.toUpperCase()));
    }
}
