/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Fri Jun 21 19:11:34 GMT 2024
 */

package net.virtualinfinity.atrobots.robot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import net.virtualinfinity.atrobots.arena.Position;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.hardware.mines.MineLayer;
import net.virtualinfinity.atrobots.hardware.radio.Transceiver;
import net.virtualinfinity.atrobots.hardware.scanning.radar.Radar;
import net.virtualinfinity.atrobots.hardware.scanning.sonar.Sonar;
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
public class Robot_ESOnly_ESTest extends Robot_ESOnly_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpdateThrowsNullPointerException() throws Throwable  {
      // Arrange
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", -1309, scoreKeeper);
      Duration duration = Duration.ONE_CYCLE;
      
      // Act
      try {
      robot.update(duration);
      fail("Expected exception not thrown");
      } catch (NullPointerException e) {
      // Assert
      assertEquals("net.virtualinfinity.atrobots.arena.Position", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInflictedDamageThrowsNullPointerException() throws Throwable  {
      // Arrange
      Robot robot = new Robot("@p35kN", (-1264), (RobotScore) null);
      
      // Act and Assert
      try {
      robot.inflictedDamage(3.0);
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the exception is thrown due to the null pointer
      verifyException("net.virtualinfinity.atrobots.robot.Robot", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCollisionThrowsNullPointerException() throws Throwable  {
      // Setup
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot arg0 = new Robot("m^5afnA@x>x", 39, arg2);
      
      // Expected outcome
      NullPointerException expectedException = assertThrows(NullPointerException.class, () -> {
      arg0.checkCollision(arg0);
      });
      
      // Verification
      assertEquals("net.virtualinfinity.atrobots.arena.Position", expectedException.getMessage());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsOverburnReturningTrue() throws Throwable  {
      // Given a robot with overburn set to true
      Robot robot = new Robot((String) null, 3258, new RobotScoreKeeper());
      robot.setOverburn(true);
      
      // When the isOverburn method is called
      boolean overburn = robot.isOverburn();
      
      // Then the method should return true
      assertTrue(overburn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalWinsReturningPositive() throws Throwable  {
      // Given: A new RobotScoreKeeper and a new Robot
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.arena.Arena", 40, scoreKeeper);
      
      // When: The robot wins a round
      scoreKeeper.wonRound(robot);
      
      // Then: The robot's total wins should be 1
      assertEquals(1, robot.getTotalWins());
      
      // And: The robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And: The robot's ID should be 40
      assertEquals(40, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalTiesReturningPositive() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot arg0 = new Robot((String) null, (-1431655765), arg2);
      arg2.tiedRound(arg0);
      arg0.getTotalTies();
      assertEquals((-1431655765), arg0.getId());
      assertEquals(0, arg0.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalKillsReturningPositive() throws Throwable  {
      // Given: A new RobotScoreKeeper and a new Robot
      RobotScoreKeeper robotScoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", (-1309), robotScoreKeeper);
      
      // When: The robot is killed
      robotScoreKeeper.killedRobot(robot);
      
      // Then: The robot's total kills should be 1
      assertEquals(1, robot.getTotalKills());
      
      // And: The robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalDeathsReturningPositive() throws Throwable  {
      // Given: A robot with a score keeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", 1430, scoreKeeper);
      
      // When: The robot dies
      scoreKeeper.died(robot);
      
      // Then: The robot's total deaths should be 1
      assertEquals(1, robot.getTotalDeaths());
      
      // And: The robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetShield() throws Throwable  {
      // Given: A new robot with a shield
      Robot robot = new Robot("", 3097, (RobotScore) null);
      Shield arg0 = new Shield(3097);
      
      // When: The robot sets its shield
      robot.setShield(arg0);
      
      // Then: The robot's shield should be set
      assertEquals(arg0, robot.getShield());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNull() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created with a name and id
      Robot robot = new Robot("Robby", 1593, scoreKeeper);
      
      // Then the robot's name and id should be set correctly
      assertEquals("Robby", robot.getName());
      assertEquals(1593, robot.getId());
      
      // And the robot's round kills should be set to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNonEmptyString() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created with a name and id
      Robot robot = new Robot("ABtF4", (-583), scoreKeeper);
      
      // Then the robot's name and id should be set correctly
      assertEquals("ABtF4", robot.getName());
      assertEquals((-583), robot.getId());
      
      // And the robot's round kills should be set to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIdReturningZero() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with the given id and score keeper
      Robot robot = new Robot("net.virtualinfinity.atrobots.computer.AbstractCombiningInstruction", 0, scoreKeeper);
      
      // Get the id of the robot
      int robotId = robot.getId();
      
      // Assert that the id is 0
      assertEquals(0, robotId);
      
      // Assert that the round kills is 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIdReturningPositive() throws Throwable  {
      // Create a new RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot object with a specific ID and score keeper
      Robot robot = new Robot("", 1233, scoreKeeper);
      
      // Get the ID of the robot
      int robotId = robot.getId();
      
      // Assert that the ID is 0
      assertEquals(0, robotId);
      
      // Assert that the round kills is 1233
      assertEquals(1233, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsOverburnReturningFalse() throws Throwable  {
      // Given: A robot with an id of 3258 and a score keeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot(null, 3258, scoreKeeper);
      
      // When: The robot is overburn
      robot.isOverburn();
      
      // Then: The robot's id should be 3258 and its round kills should be 0
      assertEquals(3258, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArmor() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", 45, arg2);
      robot.getArmor();
      assertEquals(45, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIdReturningNegative() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a negative ID
      Robot robot = new Robot("", (-457), scoreKeeper);
      
      // Get the ID of the robot
      int id = robot.getId();
      
      // Assert that the ID is equal to the negative ID
      assertEquals((-457), id);
      
      // Assert that the round kills is equal to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTurretReturningNull() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, arg2);
      robot.getTurret();
      assertEquals(2146457915, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testKilledRobot() throws Throwable  {
      // Given: A robot with a score keeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("MOV", 30, scoreKeeper);
      
      // When: The robot is killed
      robot.addRobotListener(scoreKeeper);
      robot.killedRobot();
      
      // Then: The robot's total kills should be 1
      assertEquals(1, robot.getTotalKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesRobot() throws Throwable  {
      // Given: A robot with an id of 1233 and a score keeper
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", 1233, arg2);
      
      // When: The robot ties a round
      robot.tieRound();
      
      // Then: The robot's id should be 1233
      assertEquals(1233, robot.getId());
      
      // And: The robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWinRound() throws Throwable  {
      // Given: A new robot and a robot score keeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.measures.CartesianVector", 42, scoreKeeper);
      robot.addRobotListener(scoreKeeper);
      
      // When: The robot wins a round
      robot.winRound();
      
      // Then: The robot's total wins should be 1
      assertEquals(1, robot.getTotalWins());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetOverburn() throws Throwable  {
      // Arrange
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("l", 8, scoreKeeper);
      robot.setOverburn(true);
      
      // Act
      try {
      robot.armorDepleted();
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Assert
      assertEquals("net.virtualinfinity.atrobots.robot.Robot", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testArmorDepletedThrowsNullPointerException() throws Throwable  {
      // Setup
      RobotScoreKeeper arg0 = new RobotScoreKeeper();
      Robot robot = new Robot("", 1825, arg0);
      robot.addRobotListener(arg0);
      
      // Expected exception
      NullPointerException expectedException = assertThrows(NullPointerException.class, () -> {
      robot.armorDepleted();
      });
      
      // Verify
      assertEquals("Expecting exception: NullPointerException", expectedException.getMessage());
      verifyException("net.virtualinfinity.atrobots.robot.Robot", expectedException);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCollidesThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg0 = new RobotScoreKeeper();
      RobotScore arg2 = FinalRobotScore.copyOf(arg0);
      Robot robot = new Robot("", 1, arg2);
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
      // Create a new RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot object with a specific ID and score keeper
      Robot robot = new Robot("PDMz_HW7Qmz/O-", (-1953), scoreKeeper);
      
      // Set the transceiver for the robot
      Transceiver transceiver = new Transceiver();
      robot.setTransceiver(transceiver);
      
      // Get the transceiver for the robot
      Transceiver returnedTransceiver = robot.getTransceiver();
      
      // Assert that the transceiver is the same as the one set
      assertEquals(transceiver, returnedTransceiver);
      
      // Assert that the ID of the robot is the same as the one set
      assertEquals((-1953), robot.getId());
      
      // Assert that the round kills of the robot is 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetRadar() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a negative ID and the score keeper
      Robot robot = new Robot("net.virtualinfinity.atrobots.computer.SwapInstruction", (-518), scoreKeeper);
      
      // Set the Radar for the Robot
      Radar radar = new Radar();
      robot.setRadar(radar);
      
      // Get the Radar for the Robot
      Radar robotRadar = robot.getRadar();
      
      // Assert that the Radar is the same as the one set
      assertEquals(radar, robotRadar);
      
      // Assert that the round kills is 0
      assertEquals(0, robot.getRoundKills());
      
      // Assert that the ID is the same as the one set
      assertEquals((-518), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSonar() throws Throwable  {
      // Given a robot with a sonar
      Robot robot = new Robot("|S5Ag\"BbAHM", (-1596), (RobotScore) null);
      Sonar sonar = new Sonar();
      robot.setSonar(sonar);
      
      // When the robot's sonar is retrieved
      Sonar retrievedSonar = robot.getSonar();
      
      // Then the robot's sonar should be the same as the one set
      assertEquals(sonar, retrievedSonar);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalWinsReturningZero() throws Throwable  {
      // Given a new RobotScoreKeeper
      RobotScoreKeeper robotScoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot is created with a name, id, and score
      Robot robot = new Robot("=/X PyL Jg7e4+&oT~", 125, robotScoreKeeper);
      
      // Then the robot's total wins should be 0
      assertEquals(0, robot.getTotalWins());
      
      // And the robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And the robot's id should be 125
      assertEquals(125, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTransceiverReturningNull() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("PDMz_HW7Qmz/O-", (-1953), arg2);
      robot.getTransceiver();
      assertEquals((-1953), robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateGetRobotStatisticsInterruptAndHandleInterrupt() throws Throwable  {
      // Arrange
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("EWV", 2136582708, arg2);
      Robot.GetRobotStatisticsInterrupt createGetRobotStatisticsInterrupt = robot.createGetRobotStatisticsInterrupt((MemoryCell) null, (MemoryCell) null, (MemoryCell) null);
      
      // Act and Assert
      assertThrows(NullPointerException.class, () -> createGetRobotStatisticsInterrupt.handleInterrupt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalKillsReturningZero() throws Throwable  {
      // Given a robot with a negative ID and a score keeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", -1309, scoreKeeper);
      
      // When the robot's total kills are requested
      int totalKills = robot.getTotalKills();
      
      // Then the total kills should be equal to the robot's ID
      assertEquals(-1309, totalKills);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSonarReturningNull() throws Throwable  {
      // Given a robot with a specific name, id, and score
      Robot robot = new Robot("|S5Ag\"BbAHM", (-1596), (RobotScore) null);
      
      // When the robot's sonar is called
      robot.getSonar();
      
      // Then the robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And the robot's id should be (-1596)
      assertEquals((-1596), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLastDamageTaken() throws Throwable  {
      // Given: A new RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When: A new Robot object is created with a non-zero id
      Robot robot = new Robot("", 1430, scoreKeeper);
      
      // Then: The robot's lastDamageTaken field is set to 0
      assertEquals(0, robot.getLastDamageTaken().getCycles());
      
      // And: The robot's id is set to 1430
      assertEquals(1430, robot.getId());
      
      // And: The robot's roundKills field is set to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateGetRobotInfoInterruptHandler() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created with a negative ID
      Robot robot = new Robot("", (-16), scoreKeeper);
      
      // Then the robot's ID should be set to the negative value
      assertEquals((-16), robot.getId());
      
      // And the robot's round kills should be set to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOdometer() throws Throwable  {
      // Given: A new RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When: A new Robot object is created with a name, id, and score keeper
      Robot robot = new Robot("", 1787, scoreKeeper);
      
      // Then: The robot's odometer should be 0
      assertEquals(0, robot.getOdometer());
      
      // And: The robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And: The robot's id should be 1787
      assertEquals(1787, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDestructThrowsNullPointerException() throws Throwable  {
      // Arrange
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", 103, scoreKeeper);
      
      // Act
      try {
      robot.destruct();
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Assert
      assertEquals("no message in exception (getMessage() returned null)", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetShieldReturningNull() throws Throwable  {
      // Given: A new robot with a shield
      Robot robot = new Robot("", 3097, (RobotScore) null);
      
      // When: The robot gets a shield
      robot.getShield();
      
      // Then: The robot's shield should be non-null
      assertNotNull(robot.getShield());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningEmptyString() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created with a name and id
      Robot robot = new Robot("", 0, scoreKeeper);
      
      // Then the robot's name and id should be set correctly
      assertEquals("", robot.getName());
      assertEquals(0, robot.getId());
      
      // And the robot's score should be initialized to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMineLayer() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a MineLayer
      Robot robot = new Robot("UnresolvedLabel", 2038, scoreKeeper);
      MineLayer mineLayer = new MineLayer(2038);
      robot.setMineLayer(mineLayer);
      
      // Verify that the robot has the correct MineLayer
      assertEquals(mineLayer, robot.getMineLayer());
      
      // Verify that the robot has a round kill count of 0
      assertEquals(0, robot.getRoundKills());
      
      // Verify that the robot has the correct ID
      assertEquals(2038, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTurretOffsetSensor() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, scoreKeeper);
      
      // When
      robot.getTurretOffsetSensor();
      
      // Then
      assertEquals(2146457915, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateMissile() throws Throwable  {
      // Arrange
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      RobotScore initialScore = FinalRobotScore.copyOf(scoreKeeper);
      Robot robot = new Robot("", 1, initialScore);
      Position initialPosition = robot.getPosition();
      
      // Act
      robot.createMissile(null, initialPosition, 1);
      
      // Assert
      assertEquals(1, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetTurret() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, scoreKeeper);
      Turret turret = new Turret();
      robot.setTurret(turret);
      
      // When
      robot.getTurret();
      
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(2146457915, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReset() throws Throwable  {
      // Given a new RobotScoreKeeper instance
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot instance is created with a specific id and score keeper
      Robot robot = new Robot("net.virtualinfinity.atrobots.measures.CartesianVector", 1153, scoreKeeper);
      
      // Then the robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And the robot's id should be 1153
      assertEquals(1153, robot.getId());
      
      // And the robot should not be overburn
      assertFalse(robot.isOverburn());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRadarReturningNull() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a negative ID
      Robot robot = new Robot("net.virtualinfinity.atrobots.computer.SwapInstruction", (-518), scoreKeeper);
      
      // Get the radar of the robot
      robot.getRadar();
      
      // Assert that the robot's ID is equal to the negative ID
      assertEquals((-518), robot.getId());
      
      // Assert that the robot's round kills is equal to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetComputer() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, arg2);
      robot.getComputer();
      assertEquals(2146457915, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalTiesReturningZero() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // And a Robot object with a negative ID
      Robot robot = new Robot("", (-1309), scoreKeeper);
      
      // When the getTotalTies method is called
      int totalTies = robot.getTotalTies();
      
      // Then the method should return the negative ID
      assertEquals((-1309), totalTies);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetShutdownLevelLatchPort() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, scoreKeeper);
      
      // When
      robot.getShutdownLevelLatchPort();
      
      // Then
      assertEquals(2146457915, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRoundKills() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, arg2);
      int roundKills = robot.getRoundKills();
      assertEquals(2146457915, robot.getId());
      assertEquals(0, roundKills);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMineLayerReturningNull() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created with a mine layer
      Robot robot = new Robot("", 8, scoreKeeper);
      
      // Then the robot's mine layer should be set to the correct value
      assertEquals(8, robot.getMineLayer());
      
      // And the robot's round kills should be set to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHardwareBus() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a negative ID
      Robot robot = new Robot("", (-1309), scoreKeeper);
      
      // Get the hardware bus of the robot
      robot.getHardwareBus();
      
      // Assert that the robot's ID is equal to the negative ID
      assertEquals((-1309), robot.getId());
      
      // Assert that the robot's round kills is equal to 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetTransponder() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a Transponder
      Robot robot = new Robot("", 103, scoreKeeper);
      Transponder transponder = new Transponder();
      robot.setTransponder(transponder);
      
      // Verify that the Robot has a Transponder
      assertNotNull(robot.getTransponder());
      
      // Verify that the Robot's ID is 103
      assertEquals(103, robot.getId());
      
      // Verify that the Robot's round kills is 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThrottleReturningNull() throws Throwable  {
      // rollbacked to evosuite
      Robot robot = new Robot("{cLo*>m&]i&nauy;r", 160, (RobotScore) null);
      robot.getThrottle();
      assertEquals(0, robot.getRoundKills());
      assertEquals(160, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateSpecificSnapshotThrowsNullPointerException() throws Throwable  {
      // Arrange
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      RobotScore score = FinalRobotScore.copyOf(scoreKeeper);
      Robot robot = new Robot("=/X PyL Jg7e4+&oT~", 125, score);
      
      // Act and Assert
      try {
      robot.createSpecificSnapshot();
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Verify that the exception is the correct type and has the correct message
      assertEquals(NullPointerException.class, e.getClass());
      assertNull(e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTransponderReturningNull() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper robotScoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created with a transponder
      Robot robot = new Robot("=/X PyL Jg7e4+&oT~", 125, robotScoreKeeper);
      
      // Then the robot's id should be 125
      assertEquals(125, robot.getId());
      
      // And the robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHeatSinks() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created with a negative id
      Robot robot = new Robot("", (-1309), scoreKeeper);
      
      // Then the robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
      
      // And the robot's id should be the negative id
      assertEquals((-1309), robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalDeathsReturningZero() throws Throwable  {
      // Given a robot with a score keeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("", 1430, scoreKeeper);
      
      // When the robot's total deaths are requested
      int totalDeaths = robot.getTotalDeaths();
      
      // Then the robot's total deaths should be 0
      assertEquals(0, totalDeaths);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDesiredHeading() throws Throwable  {
      // Given: A new RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When: A new Robot object is created with a desired heading and ID
      Robot robot = new Robot("", 103, scoreKeeper);
      
      // Then: The robot's desired heading and ID are set correctly
      assertEquals(0, robot.getRoundKills());
      assertEquals(103, robot.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHeading() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a unique name and ID
      Robot robot = new Robot("=/X PyL Jg7e4+&oT~", 125, scoreKeeper);
      
      // Verify that the robot has the correct ID
      assertEquals(125, robot.getId());
      
      // Verify that the robot has a round kill count of 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddRobotListener() throws Throwable  {
      // Create a new RobotScoreKeeper
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // Create a new Robot with a name and a score of 1233
      Robot robot = new Robot("", 1233, scoreKeeper);
      
      // Add a RobotListener to the Robot
      robot.addRobotListener(scoreKeeper);
      
      // Call the tieRound method on the Robot
      robot.tieRound();
      
      // Assert that the totalTies property of the RobotScoreKeeper is 1
      assertEquals(1, scoreKeeper.getTotalTies());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSpeed() throws Throwable  {
      // Given a RobotScoreKeeper object
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      
      // When a new Robot object is created
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, scoreKeeper);
      
      // Then the robot's speed should be 0
      assertEquals(0, robot.getSpeed());
      
      // And the robot's ID should be 2146457915
      assertEquals(2146457915, robot.getId());
      
      // And the robot's round kills should be 0
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAimTurretPort() throws Throwable  {
      // rollbacked to evosuite
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("", 0, arg2);
      robot.getAimTurretPort();
      assertEquals(0, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLastDamageGiven() throws Throwable  {
      // No Comments were added
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.arena.Arena", 40, arg2);
      Duration lastDamageGiven = robot.getLastDamageGiven();
      assertEquals(0, lastDamageGiven.getCycles());
      assertEquals(40, robot.getId());
      assertEquals(0, robot.getRoundKills());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetThrottle() throws Throwable  {
      // Given
      Robot robot = new Robot("{cLo*>m&]i&nauy;r", 160, (RobotScore) null);
      Throttle arg0 = new Throttle(25.0);
      
      // When
      robot.setThrottle(arg0);
      Throttle result = robot.getThrottle();
      
      // Then
      assertEquals(160, robot.getId());
      assertEquals(0, robot.getRoundKills());
      assertEquals(arg0, result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTurretShiftThrowsNullPointerException() throws Throwable  {
      // Arrange
      RobotScoreKeeper arg2 = new RobotScoreKeeper();
      Robot robot = new Robot("PDMz_HW7Qmz/O-", (-1953), arg2);
      
      // Act and Assert
      try {
      robot.getTurretShift();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the exception is thrown because the turret shift is null
      assertEquals("NullPointerException is thrown because the turret shift is null", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOverburnLatchPort() throws Throwable  {
      // Given
      RobotScoreKeeper scoreKeeper = new RobotScoreKeeper();
      Robot robot = new Robot("net.virtualinfinity.atrobots.robot.Robot$3", 2146457915, scoreKeeper);
      
      // When
      robot.getOverburnLatchPort();
      
      // Then
      assertEquals(0, robot.getRoundKills());
      assertEquals(2146457915, robot.getId());
  }
}