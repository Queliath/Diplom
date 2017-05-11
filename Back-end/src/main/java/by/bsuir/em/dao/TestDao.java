package by.bsuir.em.dao;

import by.bsuir.em.entity.Test;

import java.util.List;

public interface TestDao {
    List<Test> getTests();
    Test getTestById(Long id);
    List<Test> getTestsByNameFragment(String nameFragment);
    Test addTest(Test test);
}
