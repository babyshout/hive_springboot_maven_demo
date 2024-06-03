package org.example.hive_springboot_maven_demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.hive_springboot_maven_demo.dto.HiveDTO;
import org.example.hive_springboot_maven_demo.persistence.mapper.IHiveMapper;
import org.example.hive_springboot_maven_demo.service.IHiveService;
import org.springframework.stereotype.Service;

@Slf4j
@Service("HiveService")
public class HiveService implements IHiveService {
    private final IHiveMapper hiveMapper;

    public HiveService(IHiveMapper hiveMapper) {
        this.hiveMapper = hiveMapper;
    }

    @Override
    public HiveDTO getComediesCount() {
        log.info(this.getClass().getName() + ".getComediesCount start!");

        return hiveMapper.getComediesCount();
    }
}
