package fr.traning.book.controller;

import fr.traning.book.controller.dto.SigninRequest;
import fr.traning.book.controller.dto.SignupRequest;
import fr.traning.book.repository.entity.User;
import fr.traning.book.security.jwt.JwtResponse;
import fr.traning.book.security.jwt.JwtUtils;
import fr.traning.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@Valid @RequestBody SignupRequest dto) {

        boolean userAlreadyExist = userService.checkUsernameExist(dto.getUsername());

        if (userAlreadyExist) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        User createdUser = userService.signup(dto.getUsername(), dto.getPassword());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticate(@Valid @RequestBody SigninRequest dto) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String tokenJwtGenerated = jwtUtils.generateJwtToken(authentication);

        User user = (User) authentication.getPrincipal();

        return ResponseEntity
                .ok(new JwtResponse(
                        user.getId(),
                        user.getUsername(),
                        tokenJwtGenerated
                ));
    }


}
