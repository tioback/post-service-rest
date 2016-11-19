package br.ufsc.grad.renatoback.tcc.post.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@Autowired
	PostService service;

	@RequestMapping(path = "/{userId}", method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void sendPackage(@PathVariable("userID") Long userId) {
		service.sendPackage(userId);
	}

}
