// "Replace Collection.stream().count() with Collection.size()" "true"

import java.util.Arrays;

class Test {
  long cnt() {
    return Arrays.asList('d', 'e', 'f').stream().c<caret>ount();
  }
}