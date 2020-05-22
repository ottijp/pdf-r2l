import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfViewerPreferences;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.File;
import java.io.IOException;

public class PdfR2L {

  public enum  Mode {
    R2L,
    L2R
  }

  protected void convert(String src, String dest, Mode mode) throws IOException {
    // create dest dir
    File destFile = new File(dest);
    if (destFile.getParentFile() != null) {
      destFile.getParentFile().mkdirs();
    }

    PdfDocument pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(dest));

    // get or create view preference
    PdfViewerPreferences viewerPreferences = pdfDoc.getCatalog().getViewerPreferences();
    if (viewerPreferences == null) {
      viewerPreferences = new PdfViewerPreferences();
      pdfDoc.getCatalog().setViewerPreferences(viewerPreferences);
    }

    // set reading direction
    viewerPreferences.setDirection(mode == Mode.R2L ?
        PdfViewerPreferences.PdfViewerPreferencesConstants.RIGHT_TO_LEFT :
        PdfViewerPreferences.PdfViewerPreferencesConstants.LEFT_TO_RIGHT);

    pdfDoc.close();
  }
}
