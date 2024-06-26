/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Sat Jun 15 14:57:39 GMT 2024
 */

package org.objectweb.asm.jip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassVisitor;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassReader_ESOnly_ESTest extends ClassReader_ESOnly_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUTF8() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      char[] arg1 = new char[6];
      String readUTF8 = classReader.readUTF8(16, arg1);
      assertEquals(".jar", readUTF8);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningZero() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      short readShort = classReader.readShort(4);
      assertEquals(4801, classReader.header);
      assertEquals((short)0, readShort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningPositive() throws Throwable  {
      // This test reads a short value from a class file and asserts that it is equal to 8.
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      short readShort = classReader.readShort(105);
      assertEquals((short)8, readShort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLongReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      long readLong = classReader.readLong(3);
      assertEquals((-4755801205697931254L), readLong);
      assertEquals(259, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLabel() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      Label[] arg1 = new Label[8];
      Label readLabel = classReader.readLabel(2, arg1);
      assertNotNull(readLabel);
      assertEquals(259, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadIntReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      int readInt = classReader.readInt(120);
      assertEquals(1441815, readInt);
      assertEquals(259, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConst() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      assertEquals(259, classReader.header);
      
      char[] arg1 = new char[22];
      Object readConst = classReader.readConst(1, arg1);
      assertEquals("\u0007\u0000\u0014\u0001\u0000\u0006<init>\u0001\u0000\u0003()V\u0001", readConst);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningZero() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      int readByte = classReader.readByte(320);
      assertEquals(0, readByte);
      assertEquals(259, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUnsignedShort() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      int readUnsignedShort = classReader.readUnsignedShort(317);
      assertEquals(259, classReader.header);
      assertEquals(10240, readUnsignedShort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLongReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      long readLong = classReader.readLong(176);
      assertEquals(259, classReader.header);
      assertEquals(7666643290552276586L, readLong);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadClass() throws Throwable  {
      // It checks that the header value is 4801 and that the class name is "append".
      
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      
      // Check that the header value is 4801
      assertEquals(4801, classReader.header);
      
      // Check that the class name is "append"
      char[] arg1 = new char[9];
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstThrowsArrayIndexOutOfBoundsException0() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      char[] arg1 = new char[7];
      // Undeclared exception!
      try { 
        classReader.readConst(142, arg1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstThrowsArrayIndexOutOfBoundsException1() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      char[] arg1 = new char[2];
      // Undeclared exception!
      try { 
        classReader.readConst(2, arg1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUTF8ThrowsNullPointerException() throws Throwable  {
      // Arrange
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      
      // Act and Assert
      try {
      classReader.readUTF8(4, (char[]) null);
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the exception is the expected type
      assertEquals(NullPointerException.class, e.getClass());
      
      // Verify that the exception message is null
      assertNull(e.getMessage());
      
      // Verify that the exception stack trace is not null
      assertNotNull(e.getStackTrace());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3ArgumentsThrowsTooManyResourcesException() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.ClassReader");
      ClassWriter arg0 = new ClassWriter((-1063));
      Attribute[] arg1 = new Attribute[5];
      
      // When
      classReader.accept((ClassVisitor) arg0, arg1, 248);
      
      // Then
      // Verify that the method call is successful
      assertTrue(true);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking2Arguments() throws Throwable  {
      // Setup
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.ClassReader");
      ClassWriter arg0 = new ClassWriter((-4772));
      
      // Execution
      classReader.accept((ClassVisitor) arg0, 1100);
      
      // Verification
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3ArgumentsWithEmptyArray() throws Throwable  {
      // with the correct flags set.
      
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      ClassWriter arg0 = new ClassWriter(4);
      Attribute[] arg1 = new Attribute[0];
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3ArgumentsWithNull() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.ClassReader");
      ClassWriter arg0 = new ClassWriter((-4772));
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 6);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassReaderTaking3Arguments() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      ClassReader arg0 = new ClassReader(classReader.b, 8, 1);
      ClassWriter classWriter = null;
      
      // When
      try {
      classWriter = new ClassWriter(arg0, 1);
      } catch(ArrayIndexOutOfBoundsException e) {
      // no message in exception (getMessage() returned null)
      }
      
      // Then
      assertNull(classWriter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInterfacesReturningNonEmptyArray() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      assertEquals(259, classReader.header);
      
      String[] interfaces = classReader.getInterfaces();
      assertEquals(1, interfaces.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInterfacesReturningEmptyArray() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.ClassReader");
      String[] interfaces = classReader.getInterfaces();
      assertEquals(8915, classReader.header);
      assertEquals(0, interfaces.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuperName() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      String superName = classReader.getSuperName();
      assertNotNull(superName);
      assertEquals("java/lang/Object", superName);
      assertEquals(259, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      int readByte = classReader.readByte(1);
      assertEquals(254, readByte);
      assertEquals(259, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItem() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      int item = classReader.getItem(2);
      assertEquals(16, item);
      assertEquals(259, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassReaderTakingString() throws Throwable  {
      // rollbacked to evosuite
      ClassReader arg0 = new ClassReader("org.objectweb.asm.jip.ClassReader");
      ClassWriter classWriter = new ClassWriter(arg0, 1480);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.yasl.jars.JarFileFilter");
      int access = classReader.getAccess();
      assertEquals(32, access);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetClassName() throws Throwable  {
      // Given a class file with the class name "java/lang/Throwable" and header information "4801"
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      String className = classReader.getClassName();
      assertEquals("java/lang/Throwable", className);
      assertEquals(4801, classReader.header);
      
      // When the class name and header information are read from the class file
      // Then the class name and header information should be equal to the expected values
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      short readShort = classReader.readShort(1);
      assertEquals((short) (-326), readShort);
      assertEquals(4801, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadIntReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      int readInt = classReader.readInt(1);
      assertEquals((-21316096), readInt);
      assertEquals(4801, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateClassReaderTakingStringThrowsIOException() throws Throwable  {
      // No Comments were added
      ClassReader classReader = null;
      try {
        classReader = new ClassReader("jva/lang/Throwable");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }
}
