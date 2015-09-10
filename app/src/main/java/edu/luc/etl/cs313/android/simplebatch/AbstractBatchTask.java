package edu.luc.etl.cs313.android.simplebatch;

public abstract class AbstractBatchTask {

  private final OutputStrategy output;

  private final String lineSeparator = System.getProperty("line.separator");

  public AbstractBatchTask(final OutputStrategy output) {
    this.output = output;
  }

  protected void print(final String text) {
    output.print(text);
  }

  protected void println() {
    output.print(lineSeparator);
  }

  protected void println(final String text) {
    print(text);
    println();
  }

  public abstract void run();
}
