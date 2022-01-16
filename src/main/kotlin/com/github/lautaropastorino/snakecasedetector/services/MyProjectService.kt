package com.github.lautaropastorino.snakecasedetector.services

import com.intellij.openapi.project.Project
import com.github.lautaropastorino.snakecasedetector.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
