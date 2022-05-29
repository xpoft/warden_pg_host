package com.github.xpoft.wardenpghost.services

import com.intellij.openapi.project.Project
import com.github.xpoft.wardenpghost.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
