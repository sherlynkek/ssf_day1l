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
> mvn clean

package the compiled bytecode classes into jar/war file
> mvn package

delete target, redownload dependencies, recompile to class files, package to jar/war 
> mvn clean package

run the application in embedded localhost server
> mvn spring-boot:run