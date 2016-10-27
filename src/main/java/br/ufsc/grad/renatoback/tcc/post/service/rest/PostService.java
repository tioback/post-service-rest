package br.ufsc.grad.renatoback.tcc.post.service.rest;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	private Log logger = LogFactory.getLog(PostService.class);

	AtomicInteger counter = new AtomicInteger();

	public void sendWelcomePackage(Long time) {
		logger.info(String.format("OK Post #%d after %d ns", counter.incrementAndGet(), System.nanoTime() - time));
	}

}
