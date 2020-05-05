job('NodeJS Docker exmple') {
    scm {
             git('git://github.com/Meghanath315/dockertomcate.git') { node -> // is hudson.pligins.git.GitSCM
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
            dockerBuildAndPublish{
	        repositoryName('meghanath/nodejs-dsl')
		tag('${GIT_REVISION, length=9}'}
		registryCredentials('dockerhub')
		forcePull(false)
		forceTag(false)
		createFingerprints(false)
		skipDecorate()
                }
}

