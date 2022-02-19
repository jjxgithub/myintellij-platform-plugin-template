package com.github.jjxgithub.myintellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.jjxgithub.myintellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
