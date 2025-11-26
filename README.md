hosting the Contanirized application on the slave node of the jenkins.

- Add the apllication and it's respective Dockerfile which we need to contanirize.
- Then write the jenkins pipelin script to build the job that will push the running the container into slave node of the jenkins.
- you can check the running apllication on port you enabled via public IP of that instance.
- Everytime a new commit is made and the jenkins pipeline will be build, with building the new image of the application. 
