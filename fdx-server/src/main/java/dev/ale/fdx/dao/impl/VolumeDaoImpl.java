package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.VolumeDao;
import dev.ale.fdx.entity.base.VolumeType;

@Repository
public class VolumeDaoImpl extends GenericDaoImpl<VolumeType, Long> implements VolumeDao {

}
