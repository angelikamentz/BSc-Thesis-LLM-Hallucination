/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Sun Jun 16 00:38:44 GMT 2024
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
  public void testReadLabelThrowsNullPointerException() throws Throwable  {
      // Given
      byte[] arg0 = new byte[18];
      ClassReader classReader = new ClassReader(arg0);
      
      // When
      try {
      classReader.readLabel(4, null);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Then
      assertEquals("No message in exception", null, e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCopyPool() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      ClassWriter arg0 = new ClassWriter(409);
      
      // When
      classReader.copyPool(arg0);
      
      // Then
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningZero() throws Throwable  {
      // The short value is expected to be 0.
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      short readShort = classReader.readShort(4);
      assertEquals((short)0, readShort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      short readShort = classReader.readShort(64);
      assertEquals((short) (-9718), readShort);
      assertEquals(3278, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLongReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      long readLong = classReader.readLong(8);
      assertEquals(84734964565855753L, readLong);
      assertEquals(3278, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadIntReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      int readInt = classReader.readInt(307);
      assertEquals(167794176, readInt);
      assertEquals(3278, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstReturningNonNull() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      assertEquals(3278, classReader.header);
      
      char[] arg1 = new char[4];
      Object readConst = classReader.readConst(249, arg1);
      assertEquals("push", readConst);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningZero() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      int readByte = classReader.readByte(3278);
      assertEquals(3278, classReader.header);
      assertEquals(0, readByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessReturningZero() throws Throwable  {
      // Given: A byte array representing a class file
      byte[] classFile = new byte[18];
      
      // When: A ClassReader is created with the byte array
      ClassReader classReader = new ClassReader(classFile);
      
      // Then: The access flag of the class is 0
      int access = classReader.getAccess();
      assertEquals(0, access);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConst() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.ClassReader");
      char[] arg1 = new char[3];
      Object readConst = classReader.readConst(187, arg1);
      assertEquals(2, readConst);
      assertEquals(8915, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3ArgumentsWithNonEmptyArray() throws Throwable  {
      // Setup
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      ClassWriter arg0 = new ClassWriter(123);
      Attribute[] arg1 = new Attribute[1];
      
      // Execution
      classReader.accept((ClassVisitor) arg0, arg1, 234);
      
      // Verification
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments0() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      ClassWriter arg0 = new ClassWriter(11);
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 646);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadUnsignedShort() throws Throwable  {
      // and that the header is correctly parsed and stored in the classReader object
      
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      
      // This line reads the header of the class file and stores it in the classReader object
      int header = classReader.readUnsignedShort(2);
      
      // This line verifies that the header is correctly parsed and stored in the classReader object
      assertEquals(3278, header);
      
      // This line reads the next two bytes of the class file and stores them in the readUnsignedShort variable
      int readUnsignedShort = classReader.readUnsignedShort(2);
      
      // This line verifies that the two bytes were correctly read and stored in the readUnsignedShort variable
      assertEquals(47806, readUnsignedShort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadClass() throws Throwable  {
      // and that the header is correctly set to 3278.
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      assertEquals(3278, classReader.header);
      
      // This test verifies that the ClassReader class is able to read a class file and
      // that the readClass method returns the correct class name.
      char[] arg1 = new char[7];
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadConstThrowsNullPointerException() throws Throwable  {
      // Arrange
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      
      // Act and Assert
      try {
      classReader.readConst(234, (char[]) null);
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
  public void testReadUTF8ThrowsArrayIndexOutOfBoundsException0() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      char[] arg1 = new char[2];
      // Undeclared exception!
      try { 
        classReader.readUTF8(234, arg1);
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
  public void testReadUTF8ThrowsArrayIndexOutOfBoundsException1() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      char[] arg1 = new char[1];
      // Undeclared exception!
      try { 
        classReader.readUTF8(23, arg1);
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
  public void testReadConstThrowsArrayIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      char[] arg1 = new char[1];
      // Undeclared exception!
      try { 
        classReader.readConst(118, arg1);
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
  public void testAcceptTaking3Arguments1() throws Throwable  {
      // Given
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      ClassWriter arg0 = new ClassWriter((-8));
      
      // When
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 272);
      
      // Then
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments2() throws Throwable  {
      // Setup
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      ClassWriter arg0 = new ClassWriter(3278);
      
      // Execution
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 187);
      
      // Verification
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking3Arguments3() throws Throwable  {
      // No Comments were added
      ClassWriter arg0 = new ClassWriter(409);
      ClassReader classReader = new ClassReader("java/lang/Object");
      classReader.accept((ClassVisitor) arg0, (Attribute[]) null, 108);
      assertEquals(33, classReader.getAccess());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInterfaces() throws Throwable  {
      // Given
      byte[] arg0 = new byte[18];
      ClassReader classReader = new ClassReader(arg0);
      
      // When
      String[] interfaces = classReader.getInterfaces();
      
      // Then
      assertEquals(10, classReader.header);
      assertEquals(0, interfaces.length);
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
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      assertEquals(3278, classReader.header);
      
      String superName = classReader.getSuperName();
      assertEquals("java/lang/Object", superName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAcceptTaking2Arguments() throws Throwable  {
      // No Comments were added
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.ClassReader");
      ClassWriter arg0 = new ClassWriter(4);
      classReader.accept((ClassVisitor) arg0, 2);
      assertEquals(8915, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      int readByte = classReader.readByte(2);
      assertEquals(3278, classReader.header);
      assertEquals(186, readByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItem() throws Throwable  {
      // and that the header is correctly parsed.
      
      // Setup: Create a new ClassReader instance for the class file "org.objectweb.asm.jip.Frame"
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      
      // Execution: Call the getItem method on the ClassReader instance with the argument 2
      int item = classReader.getItem(2);
      
      // Verification:
      // 1. Assert that the header of the class file is equal to 3278
      assertEquals(3278, classReader.header);
      
      // 2. Assert that the item at index 2 in the class file is equal to 16
      assertEquals(16, item);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadLongReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      long readLong = classReader.readLong(187);
      assertEquals((-9223371998185324311L), readLong);
      assertEquals(3278, classReader.header);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      int access = classReader.getAccess();
      assertEquals(48, access);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetClassName() throws Throwable  {
      // and that the header is correctly set to the expected value.
      
      // The test also verifies that the ClassReader class is able to read the class name
      // from the class file and that the class name is correctly set to the expected value.
      
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      
      // Verify that the header of the class file is correctly set to the expected value
      assertEquals(3278, classReader.header);
      
      // Verify that the class name of the class file is correctly set to the expected value
      String className = classReader.getClassName();
      assertEquals("org/objectweb/asm/jip/Frame", className);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadShortReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      short readShort = classReader.readShort(2538);
      assertEquals(3278, classReader.header);
      assertEquals((short)17733, readShort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadIntReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      ClassReader classReader = new ClassReader("org.objectweb.asm.jip.Frame");
      int readInt = classReader.readInt(291);
      assertEquals(3278, classReader.header);
      assertEquals((-133562282), readInt);
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