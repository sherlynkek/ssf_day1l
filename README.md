# Git command

In project root folder
> git init

Add files to staging
> git add *

Commit files to local repo
> git commit -m "initial commit"

Change branch name
> git branch -m main

Link up remote repo to local repo 
> git remote add origin

Push code up from local repo to remote repo 
> git push -u origin main

# Maven Compiler Command

In project root folder 
> mvnw.cmd clean

package the compiled bytecode classes into jar/war file
> mvnw.cmd package

delete target, redownload dependencies, recompile to class files, package to jar/war 
> mvnw.cmd clean package

run the application in embedded localhost server
> mvnw.cmd spring-boot:run