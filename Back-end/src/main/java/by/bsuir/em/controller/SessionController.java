package by.bsuir.em.controller;

import by.bsuir.em.dto.UserDto;
import by.bsuir.em.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
@RequestMapping("/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping
    public ResponseEntity<UserDto> createSession(@RequestBody UserDto userDto, HttpSession httpSession) {
        UserDto sessionData = sessionService.login(userDto);
        if (sessionData == null) {
            return ResponseEntity.badRequest().body(null);
        }
        httpSession.setAttribute("employeeId", sessionData.getEmployeeId());
        httpSession.setAttribute("userRole", sessionData.getRole());
        return ResponseEntity.ok(sessionData);
    }
}
