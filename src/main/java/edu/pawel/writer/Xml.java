package edu.pawel.writer;

import edu.pawel.writer.Jason;
import edu.pawel.writer.Writer;

public class Xml implements Writer {
    @Override
    public void writeData() {

        Jason jason = new Jason();
        jason.jason();

    }
}
