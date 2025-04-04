package com.github.asm0dey.botassistant.controller;

import gg.jte.generated.precompiled.Templates;
import gg.jte.models.runtime.JteModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_HTML_VALUE;

/**
 * Controller for web pages.
 */
@RestController
public class WebController {

    private final Templates templates;

    public WebController(Templates templates) {
        this.templates = templates;
    }

    /**
     * Renders the home page.
     *
     * @return the view model
     */
    @GetMapping(value = "/", produces = TEXT_HTML_VALUE)
    public JteModel index() {
        return templates.index("Bot Assistant - Home");
    }

    /**
     * Renders the assistant page.
     *
     * @return the view model
     */
    @GetMapping(value = "/assistant", produces = TEXT_HTML_VALUE)
    public JteModel assistant() {
        return templates.assistantView("Bot Assistant - Chat");
    }

    /**
     * Renders the admin page.
     *
     * @return the view model
     */
    @GetMapping(value = "/admin", produces = TEXT_HTML_VALUE)
    public JteModel admin() {
        return templates.botAdmin("Bot Assistant - Admin");
    }
}
