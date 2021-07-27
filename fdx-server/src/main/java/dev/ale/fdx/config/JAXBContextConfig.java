package dev.ale.fdx.config;

public class JAXBContextConfig {
	public static final String JAXB_CONTEXT_FIXM_BASE = "dev.ale.fdx.entity.base";
	public static final String JAXB_CONTEXT_FIXM_FLIGHT = "dev.ale.fdx.entity.flight";
	public static final String JAXB_CONTEXT_FIXM_MESSAGING = "dev.ale.fdx.entity.messaging";
	public static final String JAXB_CONTEXT_FIXM = JAXB_CONTEXT_FIXM_BASE+":"+
			JAXB_CONTEXT_FIXM_FLIGHT+":"+
			JAXB_CONTEXT_FIXM_MESSAGING;
}
