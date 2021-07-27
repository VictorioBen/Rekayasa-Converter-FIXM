package dev.ale.fdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ale.fdx.dao.GenericDao;
import dev.ale.fdx.dao.SubmissionStatusDao;
import dev.ale.fdx.entity.messaging.SubmissionStatusType;
import dev.ale.fdx.service.SubmissionStatusService;

@Service
public class SubmissionStatusServiceImpl extends GenericServiceImpl<SubmissionStatusType, Long> implements SubmissionStatusService {

	private SubmissionStatusDao dao;
	
	@Autowired
	public SubmissionStatusServiceImpl(GenericDao<SubmissionStatusType, Long>genericDao) {
		super(genericDao);
		setDao((SubmissionStatusDao)genericDao);
		this.dao.setEntity(SubmissionStatusType.class);
	}

	public SubmissionStatusDao getDao() {
		return dao;
	}

	public void setDao(SubmissionStatusDao dao) {
		this.dao = dao;
	}

}
