package com.github.kishoretulsiani.myfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.kishoretulsiani.myfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
