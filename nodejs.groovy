job('NodeJS exmple') {
    scm {
             git('git://github.com/Meghanath315/nodejs.git') { node -> // is hudson.pligins.git.GitSCM
                 node / gitConfigName('DSL User')
                 node / gitConfigEmail('1804megh@gmail.com')
                 }
        }
        triggers {
        scm('H/5 * * * *')
    }
        wrappers {
       nodejs('nodejs') // this is the namme of NodeJS installation in
                        // Manage Jenkins -> NodeJS Installations -> Name
        }
        steps {
            shell("npm install")
                }
}

