package services;

import models.Paragraph;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph p) {
        p.setText("######"+p.getText()+"######");
    }
}
