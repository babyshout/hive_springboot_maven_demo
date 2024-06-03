package org.example.hive_springboot_maven_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.hive_springboot_maven_demo.dto.HiveDTO;
import org.example.hive_springboot_maven_demo.service.IHiveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@Slf4j
@RestController
public class HiveController {
    @Resource(name = "HiveService")
    private IHiveService hiveService;

    @GetMapping("hive/getComediesCount")
    public ResponseEntity getComediesCount() {
        log.info(this.getClass().getName() + ".getComediesCount START!!!");

        HiveDTO rDTO = Optional.ofNullable(hiveService.getComediesCount()
        ).orElseGet(HiveDTO::new);

        Optional<HiveDTO> optionalRDTO = Optional.of(hiveService.getComediesCount());

        log.info("rDTO.getCnt() : " + rDTO.getCnt());
//        return ResponseEntity.status(HttpStatus.OK).body(rDTO);
        return ResponseEntity.of(optionalRDTO);
//        return rDTO;
    }
}
