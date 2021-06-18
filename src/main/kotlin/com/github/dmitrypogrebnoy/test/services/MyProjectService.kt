package com.github.dmitrypogrebnoy.test.services

import com.github.dmitrypogrebnoy.test.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
