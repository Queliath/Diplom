package by.bsuir.em.controller;

import by.bsuir.em.dto.ProjectDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping
    public ResponseEntity<List<ProjectDto>> getProjects() {
        List<ProjectDto> projectDtoList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            ProjectDto projectDto = new ProjectDto();
            projectDto.setId((long) i + 1);
            projectDto.setName("Leffler Group");
            projectDto.setEmployeeCount(56);
            projectDtoList.add(projectDto);
        }

        return ResponseEntity.ok(projectDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getProjectById(@PathVariable Long id) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(id);
        projectDto.setName("Leffler Group");
        projectDto.setEmployeeCount(56);

        return ResponseEntity.ok(projectDto);
    }
}
