package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void Should_locationY_add_one_space_when_execute_command_given_direction_N_command_M() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "M";
        String expected = "0 1 N";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);

    }
    @Test
    void Should_locationX_add_one_space_when_execute_command_given_direction_E_command_M() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "E";
        String command = "M";
        String expected = "1 0 E";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);

    }

    @Test
    void Should_locationY_add_one_space_when_execute_command_given_direction_S_command_M() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "S";
        String command = "M";
        String expected = "0 -1 S";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Should_locationX_add_one_space_when_execute_command_given_direction_W_command_M() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "W";
        String command = "M";
        String expected = "-1 0 W";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Should_direction_turn_left_when_execute_command_given_direction_N_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "L";
        String expected = "0 0 W";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Should_direction_turn_left_when_execute_command_given_direction_S_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "S";
        String command = "L";
        String expected = "0 0 E";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void Should_direction_turn_left_when_execute_command_given_direction_E_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "E";
        String command = "L";
        String expected = "0 0 N";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Should_direction_turn_left_when_execute_command_given_direction_w_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "W";
        String command = "L";
        String expected = "0 0 S";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Should_direction_turn_right_when_execute_command_given_direction_N_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "R";
        String expected = "0 0 E";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Should_direction_turn_right_when_execute_command_given_direction_S_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "S";
        String command = "R";
        String expected = "0 0 W";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void Should_direction_turn_right_when_execute_command_given_direction_E_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "E";
        String command = "R";
        String expected = "0 0 S";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void Should_direction_turn_right_when_execute_command_given_direction_W_command_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "W";
        String command = "R";
        String expected = "0 0 N";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeCommand(command);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Should_direction_turn_right_when_execute_command_given_() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "RMLM";
        String expected = "1 1 N";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        String actual = marsRover.executeMultipleCommand(command);

        //then
        assertEquals(expected, actual);
    }
}
