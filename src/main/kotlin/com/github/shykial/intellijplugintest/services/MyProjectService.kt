package com.github.shykial.intellijplugintest.services

import com.github.shykial.intellijplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
