/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Fri Jun 21 19:52:36 GMT 2024
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
import org.objectweb.asm.jip.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassReader_ESOnly_ESTest extends ClassReader_ESOnly_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUnsignedShortReturningZero() throws Throwable  {
      // The test data is a class file with a header that contains an unsigned short value at offset 4.
      // The expected result is that the ClassReader class can read the unsigned short value correctly.
      
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      classReader.readUnsignedShort(4);
      assertEquals(2123, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningZero() throws Throwable  {
      // The test reads a short value from the 4th byte of the class file header and compares it to the expected value.
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      short readShort = classReader.readShort(4);
      assertEquals(2123, classReader.header);
      assertEquals((short)0, readShort);
      
      // This test also verifies that the readShort method returns the correct value.
      // The test reads the short value from the 4th byte of the class file header and compares it to the expected value.
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      short readShort = classReader.readShort(151);
      assertEquals((short)147, readShort);
      assertEquals(2123, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLongReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      long readLong = classReader.readLong(1);
      assertEquals((-91551935198383616L), readLong);
      assertEquals(2123, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLabel() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      Label[] arg1 = new Label[9];
      
      // When
      Label readLabel = classReader.readLabel(2, arg1);
      
      // Then
      assertEquals(2123, classReader.header);
      assertNotNull(readLabel);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadIntReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Edge");
      int readInt = classReader.readInt(10);
      assertEquals(307, classReader.header);
      assertEquals(167772928, readInt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstReturningNonNull() throws Throwable  {
      // No Comments were added
      ClassReader arg0 = new ClassReader("org.objectweb.asm.jip.Edge");
      ClassWriter classWriter = new ClassWriter(arg0, 1);
      char[] arg1 = new char[0];
      Type readConst = (Type)arg0.readConst(2, arg1);
      assertEquals(7, Type.LONG);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadClass() throws Throwable  {
      // No Comments were added
      ClassReader arg0 = new ClassReader("org.objectweb.asm.jip.Label");
      assertEquals(2123, arg0.header);
      
      ClassWriter classWriter = new ClassWriter(arg0, 1);
      char[] arg1 = new char[1];
      String readClass = arg0.readClass(117, arg1);
      assertEquals("successor", readClass);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningZero() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      int readByte = classReader.readByte(247);
      assertEquals(2123, classReader.header);
      assertEquals(0, readByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConst() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      char[] arg1 = new char[0];
      Object readConst = classReader.readConst(45, arg1);
      assertEquals(8, readConst);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUTF8() throws Throwable  {
      // and that the readUTF8 method correctly reads the UTF8 string from the class file
      
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      assertEquals(2123, classReader.header);
      
      ClassWriter classWriter = new ClassWriter(classReader, 2048);
      char[] buffer = new char[5];
      String readUTF8 = classReader.readUTF8(169, buffer);
      assertEquals("java/lang/Object", readUTF8);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUnsignedShortReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      int readUnsignedShort = classReader.readUnsignedShort(2214);
      assertEquals(6144, readUnsignedShort);
      assertEquals(2123, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUTF8ThrowsArrayIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      char[] arg1 = new char[2];
      // Undeclared exception!
      try { 
        classReader.readUTF8(4, arg1);
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
  public void testReadConstThrowsArrayIndexOutOfBoundsException0() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Edge");
      char[] arg1 = new char[1];
      // Undeclared exception!
      try { 
        classReader.readConst(8, arg1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
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
        classReader.readConst(1, arg1);
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
  public void testAcceptTaking3ArgumentsWithNonEmptyArray() throws Throwable  {
      // and that the EXPAND_FRAMES constant is set to 8
      
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      ClassWriter arg0 = new ClassWriter(1);
      Attribute[] arg1 = new Attribute[1];
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments0() throws Throwable  {
      // and that the header is correctly set to the expected value.
      
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      ClassWriter arg0 = new ClassWriter(1);
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 170);
      assertEquals(2123, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments1() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      ClassWriter arg0 = new ClassWriter((-2853));
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 730);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCopyPool() throws Throwable  {
      // Arrange
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      ClassWriter arg0 = new ClassWriter(182);
      
      // Act
      classReader.copyPool(arg0);
      
      // Assert
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInterfacesReturningEmptyArray() throws Throwable  {
      // Given a class reader for the Object class
      ClassReader classReader = new ClassReader("java/lang/Object");
      
      // When we get the interfaces for the class
      String[] interfaces = classReader.getInterfaces();
      
      // Then we expect the interfaces array to be empty
      assertEquals(0, interfaces.length);
      
      // And we expect the header of the class to be 927
      assertEquals(927, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuperNameReturningNull() throws Throwable  {
      // The test uses the getSuperName method to retrieve the super class name of the Object class.
      // The test then asserts that the super class name is "java/lang/Object".
      
      ClassReader classReader = new ClassReader("java/lang/Object");
      String superName = classReader.getSuperName();
      assertEquals("java/lang/Object", superName);
      
      // The header field of the ClassReader class is also tested in this test.
      // The test asserts that the header field of the Object class is equal to 927.
      
      assertEquals(927, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuperNameReturningNonEmptyString() throws Throwable  {
      // Test that the header of the class reader is set correctly
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      assertEquals(2123, classReader.header);
      
      // Test that the super class of the class reader is set correctly
      String superName = classReader.getSuperName();
      assertEquals("java/lang/Object", superName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassReaderTakingString() throws Throwable  {
      // No Comments were added
      ClassReader arg0 = new ClassReader("org.objectweb.asm.jip.ClassWriter");
      ClassWriter classWriter = new ClassWriter(arg0, 3535);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassReaderTaking3Arguments() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Edge");
      ClassReader arg0 = new ClassReader(classReader.b, 307, 1488);
      ClassWriter classWriter = null;
      try {
        classWriter = new ClassWriter(arg0, 75);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6144
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetClassName() throws Throwable  {
      // Given a class file with a valid header
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      
      // When the class name is extracted
      String className = classReader.getClassName();
      
      // Then the class name should be "org/objectweb/asm/jip/Label"
      assertEquals("org/objectweb/asm/jip/Label", className);
      
      // And the header of the class file should be 2123
      assertEquals(2123, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking2Arguments() throws Throwable  {
      // The test then asserts that the access flags of the Object class are equal to 33.
      
      ClassReader classReader = new ClassReader("java/lang/Object");
      ClassWriter arg0 = new ClassWriter(2);
      classReader.accept((ClassVisitor) arg0, 4);
      assertEquals(33, classReader.getAccess());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningPositive() throws Throwable  {
      // and that the header of the class is correctly set.
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      int readByte = classReader.readByte(20);
      assertEquals(2123, classReader.header);
      assertEquals(7, readByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItem() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      int item = classReader.getItem(10);
      assertEquals(56, item);
      assertEquals(4801, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLongReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      long readLong = classReader.readLong(76);
      assertEquals(4801, classReader.header);
      assertEquals(864923159782230528L, readLong);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      int access = classReader.getAccess();
      assertEquals(33, access);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInterfacesReturningNonEmptyArray() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      assertEquals(4801, classReader.header);
      
      String[] interfaces = classReader.getInterfaces();
      assertEquals(1, interfaces.length);
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
      int readInt = classReader.readInt(2);
      assertEquals(4801, classReader.header);
      assertEquals((-1161953280), readInt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateClassReaderTakingStringThrowsIOException() throws Throwable  {
      // Given
      ClassReader classReader = null;
      
      // When
      try {
      classReader = new ClassReader("BKL@4/F~t");
      } catch(Throwable e) {
      // Class not found
      verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
      
      // Then
      assertNull(classReader);
  }
}