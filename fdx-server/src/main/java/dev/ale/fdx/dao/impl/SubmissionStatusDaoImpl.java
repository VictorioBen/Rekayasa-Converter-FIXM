package dev.ale.fdx.dao.impl;

import org.springframework.stereotype.Repository;
import dev.ale.fdx.dao.SubmissionStatusDao;
import dev.ale.fdx.entity.messaging.SubmissionStatusType;

@Repository
public class SubmissionStatusDaoImpl extends GenericDaoImpl<SubmissionStatusType, Long> implements SubmissionStatusDao {

}
