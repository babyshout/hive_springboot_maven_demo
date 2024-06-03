package org.example.hive_springboot_maven_demo.persistence.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.hive_springboot_maven_demo.dto.HiveDTO;

@Mapper
public interface IHiveMapper {
    HiveDTO getComediesCount();
}

