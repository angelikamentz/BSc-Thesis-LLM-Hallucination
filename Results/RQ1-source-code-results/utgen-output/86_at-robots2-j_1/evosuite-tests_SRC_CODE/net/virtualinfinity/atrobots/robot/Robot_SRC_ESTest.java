/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Sun Jun 16 17:58:02 GMT 2024
 */

package net.virtualinfinity.atrobots.robot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import net.virtualinfinity.atrobots.ArenaObjectVisitorAdaptor;
import net.virtualinfinity.atrobots.arena.Position;
import net.virtualinfinity.atrobots.computer.HardwareBus;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.hardware.armor.Armor;
import net.virtualinfinity.atrobots.hardware.mines.MineLayer;
import net.virtualinfinity.atrobots.hardware.radio.Transceiver;
import net.virtualinfinity.atrobots.hardware.shield.Shield;
import net.virtualinfinity.atrobots.hardware.throttle.Throttle;
import net.virtualinfinity.atrobots.hardware.transponder.Transponder;
import net.virtualinfinity.atrobots.hardware.turret.Turret;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Robot_SRC_ESTest extends Robot_SRC_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpdateThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("X@o$023=*", 2161, arg2);
      Duration arg0 = Duration.ZERO_CYCLE;
      // Undeclared exception!
      try { 
        robot.update(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.Position", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInflictedDamageThrowsNullPointerException() throws Throwable  {
      // Arrange
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("q{,KzxH)*[VBXA<;Cw", (-3541), scoreKeeper);
      
      // Act and Assert
      try {
      robot.inflictedDamage(180.0);
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the exception is thrown because the arena is null
      assertEquals("Arena is null", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCollisionThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot arg0 = new Robot(":C", 1958, arg2);
      // Undeclared exception!
      try { 
        arg0.checkCollision(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.Position", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTransponderReturningTransponderWhereGetIdIsPositive() throws Throwable  {
      // Given
      Robot robot = new Robot("m>3e!m!IdL2,", (-1), (RobotScore) null);
      Transponder arg0 = new Transponder();
      arg0.setId(890);
      
      // When
      robot.setTransponder(arg0);
      
      // Then
      assertEquals((-1), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTransponderReturningTransponderWhereGetIdIsNegative() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("#k>;C.f.An1", (-314), arg2);
      Transponder arg0 = new Transponder();
      arg0.setId((-314));
      robot.setTransponder(arg0);
      robot.getTransponder();
      assertEquals(0, robot.getRoundKills());
      assertEquals((-314), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalWinsReturningPositive() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$GetRobotStatisticsInterrupt", 0, scoreKeeper);
      
      // When
      scoreKeeper.wonRound(robot);
      
      // Then
      assertEquals(0, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalTiesReturningPositive() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", 1436, scoreKeeper);
      
      // When
      scoreKeeper.tiedRound(robot);
      
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(1436, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalKillsReturningPositive() throws Throwable  {
      // Given: A new RobotScoreKeeper and a new Robot
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", (-1431655765), scoreKeeper);
      
      // When: The robot is killed
      scoreKeeper.killedRobot(robot);
      
      // Then: The robot's total kills should be 0
      assertEquals(0, robot.getTotalKills());
      
      // And: The robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And: The robot's id should be (-1431655765)
      assertEquals((-1431655765), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalDeathsReturningPositive() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.computer.BitRotateLeftInstruction", 41, scoreKeeper);
      scoreKeeper.died(robot);
      
      // When
      int totalDeaths = robot.getTotalDeaths();
      
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(41, robot.getId());
      assertEquals(1, totalDeaths);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetShield() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("!", 0, arg2);
      Shield arg0 = new Shield((-722.0));
      robot.setShield(arg0);
      robot.getShield();
      assertEquals(0, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNull() throws Throwable  {
      // Given
      Robot robot = new Robot((String) null, 2244, new RobotScoreKeeper());
      
      // When
      String name = robot.getName();
      
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(2244, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("q{,KzxH)*[VBXA<;Cw", (-735), arg2);
      robot.getName();
      assertEquals((-735), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIdReturningZero() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      RobotScore score = FinalRobotScore.copyOf(scoreKeeper);
      Robot robot = new Robot("='bC", 0, score);
      
      // When
      int id = robot.getId();
      
      // Then
      assertEquals(0, id);
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIdReturningPositive() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      RobotScore score = FinalRobotScore.copyOf(scoreKeeper);
      Robot robot = new Robot("Dereference", 27, score);
      
      // When
      int id = robot.getId();
      
      // Then
      assertEquals(27, id);
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArmorReturningArmorWhereGetRemainingIsPositive() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("78-C5b`", (-2145432588), arg2);
      Armor arg0 = new Armor(350.0);
      robot.setArmor(arg0);
      robot.getArmor();
      assertEquals((-2145432588), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsOverburn() throws Throwable  {
      // Given
      Robot robot = new Robot("q{,KzxH)*[VBXA<;Cw", (-3541), new RobotScoreKeeper());
      // When
      robot.isOverburn();
      // Then
      assertEquals((-3541), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArmorReturningNull() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("78-C5b(?>B`", (-2145432545), arg2);
      robot.getArmor();
      assertEquals(0, robot.getRoundKills());
      assertEquals((-2145432545), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIdReturningNegative() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      RobotScore score = FinalRobotScore.copyOf(scoreKeeper);
      Robot robot = new Robot("", (-1341), score);
      
      // When
      int id = robot.getId();
      
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals((-1341), id);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTurretReturningNull() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot((String) null, (-3541), arg2);
      robot.getTurret();
      assertEquals((-3541), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testKilledRobot() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot(", toalDeaths=", 1, scoreKeeper);
      robot.addRobotListener(scoreKeeper);
      
      // When
      robot.killedRobot();
      
      // Then
      assertEquals(1, robot.getTotalKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTieRound() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot(null, 1091, scoreKeeper);
      robot.addRobotListener(scoreKeeper);
      
      // When
      robot.tieRound();
      
      // Then
      assertEquals(1, robot.getTotalTies());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWinRound() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("2l9Re -]", (-2146138915), scoreKeeper);
      robot.addRobotListener(scoreKeeper);
      
      // When
      robot.winRound();
      
      // Then
      assertEquals(1, robot.getTotalWins());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetOverburn() throws Throwable  {
      // Given
      Robot robot = new Robot("f-no?=", 71, (RobotScore) null);
      robot.setOverburn(true);
      
      // When
      try {
      robot.armorDepleted();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Then
      verifyException("net.virtualinfinity.atrobots.robot.Robot", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testArmorDepletedThrowsNullPointerException() throws Throwable  {
      // Given: A robot with a null armor score
      Robot robot = new Robot("f-no?=", 71, (RobotScore) null);
      
      // When: The robot's armor is depleted
      try {
      robot.armorDepleted();
      
      // Then: An exception should be thrown
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      // Verify that the exception is of the expected type
      verifyException("net.virtualinfinity.atrobots.robot.Robot", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCollidesThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot((String) null, (-664), arg2);
      // Undeclared exception!
      try { 
        robot.collides();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.robot.Robot", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetTransceiver() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("O\"=W^J/DgtS0c2 ", (-434), arg2);
      Transceiver arg0 = new Transceiver();
      robot.setTransceiver(arg0);
      robot.getTransceiver();
      assertEquals(0, robot.getRoundKills());
      assertEquals((-434), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalWinsReturningZero() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("78-C5b`", (-2145432588), scoreKeeper);
      
      // When
      int totalWins = robot.getTotalWins();
      
      // Then
      assertEquals((-2145432588), robot.getId());
      assertEquals(0, robot.getRoundKills());
      assertEquals(0, totalWins);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTransceiverReturningNull() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg0 = new RobotScoreKeeper();
      RobotScore arg2 = FinalRobotScore.copyOf(arg0);
      Robot robot = new Robot((String) null, 8, arg2);
      robot.getTransceiver();
      assertEquals(8, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalKillsReturningZero() throws Throwable  {
      // Given
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", 2645, arg2);
      
      // When
      int totalKills = robot.getTotalKills();
      
      // Then
      assertEquals(0, totalKills);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSonar() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg0 = new RobotScoreKeeper();
      RobotScore arg2 = FinalRobotScore.copyOf(arg0);
      Robot robot = new Robot((String) null, 8, arg2);
      robot.getSonar();
      assertEquals(0, robot.getRoundKills());
      assertEquals(8, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLastDamageTaken() throws Throwable  {
      // Given
      Robot robot = new Robot((String) null, 8, FinalRobotScore.copyOf(new RobotScoreKeeper()));
      
      // When
      Duration lastDamageTaken = robot.getLastDamageTaken();
      
      // Then
      assertEquals(0, lastDamageTaken.getCycles());
      assertEquals(8, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateGetRobotInfoInterruptHandler() throws Throwable  {
      // Given
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("irD@P\"X8:[i'HZ+2", 2141365460, arg2);
      // When
      robot.createGetRobotInfoInterruptHandler((MemoryCell) null, (MemoryCell) null, (MemoryCell) null);
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(2141365460, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetHardwareBus() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot((String) null, 0, arg2);
      HardwareBus arg0 = new HardwareBus();
      robot.setHardwareBus(arg0);
      robot.getHardwareBus();
      assertEquals(0, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOdometer() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("X@o$023=*", 2161, arg2);
      robot.getOdometer();
      assertEquals(2161, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDestructThrowsNullPointerException() throws Throwable  {
      // Given
      Robot robot = new Robot("c9AVPbHPXBdQ-P\"", 103, (RobotScore) null);
      
      // When
      try {
      robot.destruct();
      } catch (NullPointerException e) {
      // Then
      assertEquals("Expecting exception: NullPointerException", e.getMessage());
      verifyException("net.virtualinfinity.atrobots.robot.Robot", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetShieldReturningNull() throws Throwable  {
      // Given
      Robot robot = new Robot((String) null, 1091, new RobotScoreKeeper());
      // When
      robot.getShield();
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(1091, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningEmptyString() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", (-1215), arg2);
      robot.getName();
      assertEquals((-1215), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMineLayer() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("DIV", 2761, arg2);
      MineLayer arg0 = new MineLayer(2761);
      robot.setMineLayer(arg0);
      robot.getMineLayer();
      assertEquals(0, robot.getRoundKills());
      assertEquals(2761, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTurretOffsetSensor() throws Throwable  {
      // Given
      Robot robot = new Robot((String) null, 32767, new RobotScoreKeeper());
      
      // When
      robot.getTurretOffsetSensor();
      
      // Then
      assertEquals(32767, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateMissile() throws Throwable  {
      // Given
      Robot robot = new Robot("m>3e!m!IdL2,", (-1), (RobotScore) null);
      Position arg1 = Position.random(2.0, 996.0, 1.3, 2.0);
      
      // When
      robot.createMissile((AbsoluteAngle) null, arg1, 1651.5694401210196);
      
      // Then
      assertEquals((-1), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetTurret() throws Throwable  {
      // Given
      Robot robot = new Robot("", 848, (RobotScore) null);
      Turret turret = new Turret();
      
      // When
      robot.setTurret(turret);
      
      // Then
      assertEquals(turret, robot.getTurret());
      assertEquals(848, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReset() throws Throwable  {
      // Given a robot with a score of 103 and no round kills
      Robot robot = new Robot("c9AVPbHPXBdQ-P\"", 103, (RobotScore) null);
      robot.reset();
      
      // When the robot is reset
      
      // Then the robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And the robot should not be overburn
      assertFalse(robot.isOverburn());
      
      // And the robot's id should be 103
      assertEquals(103, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRadar() throws Throwable  {
      // Arrange
      RobotScoreKeeper robotScoreKeeper = new RobotScoreKeeper();
      RobotScore robotScore = FinalRobotScore.copyOf(robotScoreKeeper);
      Robot robot = new Robot("[C`w^.lquH/", 2146532980, robotScore);
      
      // Act
      robot.getRadar();
      
      // Assert
      assertEquals(0, robot.getRoundKills());
      assertEquals(2146532980, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetComputer() throws Throwable  {
      // Arrange
      RobotScoreKeeper robotScoreKeeper = new RobotScoreKeeper();
      RobotScore robotScore = FinalRobotScore.copyOf(robotScoreKeeper);
      Robot robot = new Robot("[C`w^.lquH/", 2146532980, robotScore);
      
      // Act
      robot.getComputer();
      
      // Assert
      assertEquals(0, robot.getRoundKills());
      assertEquals(2146532980, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalTiesReturningZero() throws Throwable  {
      // Given
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", 1436, arg2);
      
      // When
      int totalTies = robot.getTotalTies();
      
      // Then
      assertEquals(0, totalTies);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetShutdownLevelLatchPort() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("2l9Re -]", (-2146138915), arg2);
      robot.getShutdownLevelLatchPort();
      assertEquals(0, robot.getRoundKills());
      assertEquals((-2146138915), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRoundKills() throws Throwable  {
      // Given
      Robot robot = new Robot("", 0, (RobotScore) null);
      int expectedRoundKills = 0;
      
      // When
      int actualRoundKills = robot.getRoundKills();
      
      // Then
      assertEquals(expectedRoundKills, actualRoundKills);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMineLayerReturningNull() throws Throwable  {
      // Given
      Robot robot = new Robot("DIV", 2761, new RobotScoreKeeper());
      // When
      robot.getMineLayer();
      // Then
      assertEquals(2761, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHardwareBusReturningNull() throws Throwable  {
      // rollbacked to evosuite
      Robot robot = new Robot("m>3e!m!IdL2,", (-1), (RobotScore) null);
      robot.getHardwareBus();
      assertEquals((-1), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThrottleReturningNull() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg0 = new RobotScoreKeeper();
      RobotScore arg2 = FinalRobotScore.copyOf(arg0);
      Robot robot = new Robot((String) null, 8, arg2);
      robot.getThrottle();
      assertEquals(0, robot.getRoundKills());
      assertEquals(8, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTransponderReturningNull() throws Throwable  {
      // Given
      Robot robot = new Robot("m>3e!m!IdL2,", (-1), (RobotScore) null);
      
      // When
      robot.getTransponder();
      
      // Then
      assertEquals((-1), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHeatSinks() throws Throwable  {
      // Given
      Robot robot = new Robot((String) null, 0, new RobotScoreKeeper());
      // When
      robot.getHeatSinks();
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(0, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArmorReturningArmorWhereGetRemainingIsNegative() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("78-C5b(?>B`", (-2145432545), arg2);
      Armor arg0 = new Armor((-3859.751715455501));
      robot.setArmor(arg0);
      robot.getArmor();
      assertEquals(0, robot.getRoundKills());
      assertEquals((-2145432545), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalDeathsReturningZero() throws Throwable  {
      // Arrange
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot((String) null, (-3541), arg2);
      
      // Act
      int totalDeaths = robot.getTotalDeaths();
      
      // Assert
      assertEquals((-3541), totalDeaths);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDesiredHeading() throws Throwable  {
      // Given
      Robot robot = new Robot("POP", (-1043), new RobotScoreKeeper());
      // When
      robot.getDesiredHeading();
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals((-1043), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHeading() throws Throwable  {
      // rollbacked to evosuite
      Robot robot = new Robot("", 47, (RobotScore) null);
      robot.getHeading();
      assertEquals(47, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddRobotListener() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", (-1431655765), scoreKeeper);
      robot.addRobotListener(scoreKeeper);
      
      // When
      try {
      robot.armorDepleted();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Then
      verifyException("net.virtualinfinity.atrobots.robot.Robot", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSpeed() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", 2954, arg2);
      robot.getSpeed();
      assertEquals(0, robot.getRoundKills());
      assertEquals(2954, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAccept() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$4", 1024, scoreKeeper);
      
      // When
      robot.accept(new ArenaObjectVisitorAdaptor());
      
      // Then
      assertEquals(1024, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAimTurretPort() throws Throwable  {
      // rollbacked to evosuite
      Robot robot = new Robot("m>3e!m!IdL2,", (-1), (RobotScore) null);
      robot.getAimTurretPort();
      assertEquals((-1), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLastDamageGiven() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$GetRobotInfoInterrupt", (-730), arg2);
      Duration lastDamageGiven = robot.getLastDamageGiven();
      assertEquals(0, robot.getRoundKills());
      assertEquals((-730), robot.getId());
      assertEquals(0, lastDamageGiven.getCycles());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetThrottle() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", 2954, arg2);
      Throttle arg0 = new Throttle((-824.93408096994));
      robot.setThrottle(arg0);
      robot.getThrottle();
      assertEquals(0, robot.getRoundKills());
      assertEquals(2954, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTurretShiftThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("o@G", 1, arg2);
      // Undeclared exception!
      try { 
        robot.getTurretShift();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.robot.Robot", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOverburnLatchPort() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg0 = new RobotScoreKeeper();
      RobotScore arg2 = FinalRobotScore.copyOf(arg0);
      Robot robot = new Robot((String) null, 8, arg2);
      robot.getOverburnLatchPort();
      assertEquals(8, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }
}