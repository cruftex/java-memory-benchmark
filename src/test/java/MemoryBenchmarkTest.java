import org.junit.Test;

/**
 * @author Jens Wilke; created: 2015-01-07
 */
public class MemoryBenchmarkTest {

  static Object memoryConsumer;

  byte[] allocateByteArray(int _size) {
    byte[] ba = new byte[_size];
    // initialize with some data. not sure if it make a difference
    // this should avoid that there is no memory mapped in
    for (int i = 0; i < _size; i++) {
      ba[i] = 0;
    }
    return ba;
  }


  @Test
  public void testBaseline() {
    Util.printUsedMemory();
  }

  @Test
  public void testBaseline1() {
    Util.printUsedMemory();
  }

  @Test
  public void testBaseline2() {
    Util.printUsedMemory();
  }

  @Test
  public void test10MBytes() {
    memoryConsumer = allocateByteArray(1024 * 1024 * 10);
    Util.printUsedMemory();
  }

  @Test
  public void test100MBytes() {
    memoryConsumer = allocateByteArray(1024 * 1024 * 100);
    Util.printUsedMemory();
  }

  @Test
  public void test27MBytes() {
    memoryConsumer = allocateByteArray(1024 * 1024 * 27);
    Util.printUsedMemory();
  }

  @Test
  public void test127MBytes() {
    memoryConsumer = allocateByteArray(1024 * 1024 * 127);
    Util.printUsedMemory();
  }

  @Test
  public void testBaseline3() {
    Util.printUsedMemory();
  }

  @Test
  public void testBaseline4() {
    Util.printUsedMemory();
  }



}
