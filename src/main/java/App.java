import java.io.IOException;

public class App {

  public static void main(String[] args) {
    try {
      var mode = PdfR2L.Mode.valueOf(args[0]);
      var src = args[1];
      var dest = args[2];

      var converter = new PdfR2L();
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
