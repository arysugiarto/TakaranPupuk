package arysugiarto10.project.skripsi.takaranpupuk.customview;

import java.util.List;
import arysugiarto10.project.skripsi.takaranpupuk.tflite.Classifier.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
