# Gryadka App build 
# Gradle Spring Boot Project Template
Project Structure
|
|
----|Gryadka (root directory)
    |----gryadka-ui (frontend code)
    |----gryadka-core (backend code)
    |----gryadka-app (runnable application artifact which contains and depends on gryadka-ui & core).
    


To build , pack, and pushing artifact into maven repository :


> gryadika-ui 
simply execute "gradle :gryadka-ui:publish" command if you want to build and push this artifact into maven repository. The ui src code is > src/
> gryadika-core
simply execute "gradle :gryadka-core:publish" command if you want to build and push this artifact into maven repository. The core src code is in > src/main/java
>gryadika-app
 execute "gradle :grydka-app:build" it will automatically pull all dependencies, build jar, pack as docker images & also push into heroku container.
 execute "gradle :gryadka-app:bootRun" it will run application locally on your machine. as an alternatives you can run : 
	java - jar gryadika-app/build/lib/gryadika-app-0.0.1.SNAPSHOT.jar  (need to execute "gradle :gryadika-app:build" first.


*** NOTES :
> 	All code change will only applied if you push the artifact contain the changes. and rebuild/repack the "gryadika-app". with : 
 		- gradle :gryadka-app:build  --refresh-dependencies.
		*--refresh-dependencies is to tell gradle to force download new artifact from maven repo.
 		- use gradle publishToMavenLocal , to publish into local maven repository. 

> 	I still make the project nested , and using  root directory since we're now only using 1 git repository. if you want to make it independent  just move out the 	project outside of the Gryadka root directory.
	and the build command is change to "gradle $command" without mention spesific project to build/pack/publish .  

