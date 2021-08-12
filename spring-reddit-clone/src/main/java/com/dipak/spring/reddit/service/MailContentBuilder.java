package com.dipak.spring.reddit.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MailContentBuilder {

    private final TemplateEngine templateEngine;

    public String build(String message) {
    	Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }
}
