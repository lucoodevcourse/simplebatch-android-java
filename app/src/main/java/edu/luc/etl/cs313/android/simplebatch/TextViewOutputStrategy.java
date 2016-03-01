package edu.luc.etl.cs313.android.simplebatch;

import android.widget.TextView;

public class TextViewOutputStrategy implements OutputStrategy {

  private final TextView textView;

  public TextViewOutputStrategy(final TextView textView) {
    this.textView = textView;
  }

  @Override
  public void print(final String text) {
    textView.append(text);
  }
}
