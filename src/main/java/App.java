import java.io.IOException;

public class App {

  public static void main(String[] args) {
    try {
      PdfR2L.Mode mode = PdfR2L.Mode.valueOf(args[0]);
      String src = args[1];
      String dest = args[2];

      PdfR2L converter = new PdfR2L();
      converter.convert(src, dest, mode);
    }
    catch (IllegalArgumentException e) {
      showUsage();
    }
    catch (IndexOutOfBoundsException e) {
      showUsage();
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }

  static void showUsage() {
    System.err.println("Usage: pdf-r2l R2L|L2R input-file outout-file");
  }

}
