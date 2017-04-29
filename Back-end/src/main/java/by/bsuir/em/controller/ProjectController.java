package by.bsuir.em.controller;

import by.bsuir.em.dto.ProjectDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping
    public ResponseEntity<List<ProjectDto>> getProjects() {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(1L);
        projectDto.setName("Leffler Group");
        projectDto.setEmployeeCount(56);

        List<ProjectDto> projectDtoList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            projectDtoList.add(projectDto);
        }

        return ResponseEntity.ok(projectDtoList);
    }
}
