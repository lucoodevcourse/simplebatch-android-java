package edu.luc.etl.cs313.android.simplebatch;

public class ConcreteBatchTask extends AbstractBatchTask {

  public ConcreteBatchTask(final OutputStrategy output) {
    super(output);
  }

  public void run() {
    println("table of squares");
    println();
    for (int i = 0; i < 100; i ++) {
      println(i + "^2 = " + i * i);
    }
  }
}
