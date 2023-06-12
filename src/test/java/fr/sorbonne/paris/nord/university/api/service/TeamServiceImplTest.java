package fr.sorbonne.paris.nord.university.api.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class TeamServiceImplTest {

    @Qualifier("teamService")
    @Autowired
    private ITeamService teamService;

    @Test
    public void shouldReturnAllTeams_whenGetAll(){

    }

}