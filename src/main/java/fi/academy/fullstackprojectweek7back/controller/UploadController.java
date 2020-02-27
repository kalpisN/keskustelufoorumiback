package fi.academy.fullstackprojectweek7back.controller;

import fi.academy.fullstackprojectweek7back.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.Map;


@RestController
public class UploadController {

    @Autowired
    private CloudinaryService cloudinaryService;

    @RequestMapping(value="/upload", method = RequestMethod.POST, consumes = "multipart/form-data", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map uploadFile(@RequestParam(value = "image") MultipartFile file) {
        String url = cloudinaryService.uploadFile(file);
        return  Collections.singletonMap("url", url);
    }

}

