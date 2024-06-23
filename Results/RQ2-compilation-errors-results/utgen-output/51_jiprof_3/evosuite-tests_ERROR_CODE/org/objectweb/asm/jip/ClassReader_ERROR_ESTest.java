/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Fri Jun 21 21:47:23 GMT 2024
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
public class ClassReader_ERROR_CODE_ESTest extends ClassReader_ERROR_CODE_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUnsignedShortReturningZero() throws Throwable  {
      // The header contains information about the class, such as the major and minor version numbers.
      
      ClassReader classReader = new ClassReader("java/lang/Object");
      
      // This method reads the header of the class file and returns the value of the "header" field.
      int header = classReader.readUnsignedShort(4);
      
      // This assertion checks that the value of the "header" field is equal to 927, which is the expected value.
      assertEquals(927, header);
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
  public void testReadLongReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      long readLong = classReader.readLong(5);
      assertEquals(927, classReader.header);
      assertEquals(57175913726001L, readLong);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLabel() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      Label[] arg1 = new Label[5];
      Label readLabel = classReader.readLabel(2, arg1);
      assertNotNull(readLabel);
      assertEquals(927, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadIntReturningPositive() throws Throwable  {
      // The test data is a class file with a header value of 2123 and an integer value at offset 270 with the value 1157824512.
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      int readInt = classReader.readInt(270);
      assertEquals(2123, classReader.header);
      assertEquals(1157824512, readInt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstReturningNonNull() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      char[] arg1 = new char[5];
      ClassWriter arg0 = new ClassWriter((-1));
      classReader.copyPool(arg0);
      Type readConst = (Type)classReader.readConst(1, arg1);
      assertEquals(1, readConst.getDimensions());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConst() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Opcodes");
      assertEquals(3150, classReader.header);
      
      char[] arg1 = new char[8];
      Object readConst = classReader.readConst(354, arg1);
      assertEquals(180, readConst);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUTF8() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      assertEquals(927, classReader.header);
      
      char[] arg1 = new char[5];
      ClassWriter arg0 = new ClassWriter((-1));
      classReader.copyPool(arg0);
      String readUTF8 = classReader.readUTF8(927, arg1);
      assertEquals("()Ljava/lang/Object;", readUTF8);
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
  public void testReadUnsignedShortReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      int readUnsignedShort = classReader.readUnsignedShort(10);
      assertEquals(1792, readUnsignedShort);
      assertEquals(927, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadClassThrowsArrayIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("java/lang/Object");
      char[] arg1 = new char[9];
      // Undeclared exception!
      try { 
        classReader.readClass(1, arg1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstThrowsArrayIndexOutOfBoundsException0() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      char[] arg1 = new char[3];
      // Undeclared exception!
      try { 
        classReader.readConst(1, arg1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstThrowsArrayIndexOutOfBoundsException1() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      char[] arg1 = new char[3];
      // Undeclared exception!
      try { 
        classReader.readConst(9, arg1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUTF8ThrowsArrayIndexOutOfBoundsException() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      char[] arg1 = new char[5];
      // Undeclared exception!
      try { 
        classReader.readUTF8(4, arg1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments0() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      ClassWriter arg0 = new ClassWriter(8);
      
      // When
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 128);
      
      // Then
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments1() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      ClassWriter arg0 = new ClassWriter(285212675);
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 4);
      assertEquals(33, classReader.getAccess());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3ArgumentsWithEmptyArray() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      ClassWriter arg0 = new ClassWriter(304);
      Attribute[] arg1 = new Attribute[0];
      
      // When
      classReader.accept((ClassVisitor) arg0, arg1, 285212682);
      
      // Then
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments2() throws Throwable  {
      // and then compares the result to the expected value of 4801.
      
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      ClassWriter arg0 = new ClassWriter(8);
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 10);
      assertEquals(4801, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments3() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("java/lang/Object");
      ClassWriter arg0 = new ClassWriter(1);
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 1477);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassReaderTaking3Arguments() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      ClassReader arg0 = new ClassReader(classReader.b, 8, 2);
      ClassWriter classWriter = null;
      
      // When
      try {
      classWriter = new ClassWriter(arg0, 57);
      } catch(ArrayIndexOutOfBoundsException e) {
      // no message in exception (getMessage() returned null)
      }
      
      // Then
      assertNull(classWriter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassReaderTakingString() throws Throwable  {
      // No Comments were added
      ClassReader arg0 = new ClassReader("org.objectweb.asm.jip.ClassReader");
      ClassWriter classWriter = new ClassWriter(arg0, 8915);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInterfacesReturningNonEmptyArray() throws Throwable  {
      // Given a class reader for the Throwable class
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      
      // When the getInterfaces method is called
      String[] interfaces = classReader.getInterfaces();
      
      // Then the array of interfaces should have a length of 1
      assertEquals(1, interfaces.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInterfacesReturningEmptyArray() throws Throwable  {
      // Given a class reader for the Label class
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      
      // When we get the interfaces for the class
      String[] interfaces = classReader.getInterfaces();
      
      // Then we expect the header to be 2123
      assertEquals(2123, classReader.header);
      
      // And we expect the interfaces array to be empty
      assertEquals(0, interfaces.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuperNameReturningNull() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      String superName = classReader.getSuperName();
      assertEquals(927, classReader.header);
      assertNull(superName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuperNameReturningNonEmptyString() throws Throwable  {
      // The test uses the getSuperName method to retrieve the super class name of the Throwable class.
      // The test then asserts that the super class name is "java/lang/Object".
      
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      String superName = classReader.getSuperName();
      assertEquals(4801, classReader.header);
      assertEquals("java/lang/Object", superName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateClassReaderTaking3ArgumentsThrowsArrayIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      byte[] arg0 = ClassWriter.TYPE;
      ClassReader classReader = null;
      try {
        classReader = new ClassReader(arg0, 15, 106);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1471
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking2ArgumentsThrowsTooManyResourcesException() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.ClassReader");
      ClassWriter arg0 = new ClassWriter(8915);
      
      // When
      classReader.accept(arg0, 304);
      
      // Then
      // Verify that the method call does not throw an exception
      assertDoesNotThrow(() -> classReader.accept(arg0, 304));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByte() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Throwable");
      int readByte = classReader.readByte(2);
      assertEquals(4801, classReader.header);
      assertEquals(186, readByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItem() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Label");
      int item = classReader.getItem(1);
      assertEquals(2123, classReader.header);
      assertEquals(11, item);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      int access = classReader.getAccess();
      assertEquals(33, access);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetClassName() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      assertEquals(927, classReader.header);
      
      String className = classReader.getClassName();
      assertEquals("java/lang/Object", className);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      short readShort = classReader.readShort(83);
      assertEquals((short)256, readShort);
      assertEquals(927, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLongReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("java/lang/Object");
      long readLong = classReader.readLong(1);
      assertEquals(927, classReader.header);
      assertEquals((-91551935198383104L), readLong);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateClassReaderTakingStringThrowsIOException() throws Throwable  {
      // Arrange
      ClassReader classReader = null;
      
      // Act
      try {
      classReader = new ClassReader("StackMapTable");
      } catch (IOException e) {
      // Assert
      fail("Expecting exception: IOException");
      }
      
      // Assert
  }
}
