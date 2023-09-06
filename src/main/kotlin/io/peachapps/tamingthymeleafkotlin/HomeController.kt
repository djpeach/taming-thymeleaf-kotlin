package io.peachapps.tamingthymeleafkotlin

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HomeController {

  @GetMapping
  fun index(model: Model): String {
    model["pageTitle"] = "Taming Thymeleaf"
    model["scientists"] = listOf("Albert Einstein", "Neils Bohr", "James Clerk Maxwell")
    return "index"
  }
}