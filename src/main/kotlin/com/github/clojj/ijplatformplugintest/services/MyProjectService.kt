package com.github.clojj.ijplatformplugintest.services

import com.intellij.openapi.project.Project
import com.github.clojj.ijplatformplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
