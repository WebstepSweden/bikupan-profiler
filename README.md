# Bikupan-profile

This is only a first draft of the micro service architecture. Will implement a few methods stubbed methods within
the next days.

## Environments

- Version control server: [GitHub](https://github.com/Diversify/bikupan-profiler)
- Build server: [Cloudbees](https://diversify.ci.cloudbees.com/job/Bikupan-profiler/)
- Scrum board: [Trello](https://trello.com/b/4eRZhdcp/bikupan)
- Skype group: [bikupan@diversify](skype:?chat&blob=Xjp4yd4lgklwq965NXTyqNcnZpFoqWTxEy2-EVD2iMP00J8Th1RFa1eG319xpNP9x7r3iPdEwp_EyN_bnlMA8AZ3qj1fwAyhhIM)


## Build
- You need JDK 1.8
- Maven

Just run `mvn clean install` from the root of the project


## Start server

Just run the:

`RunBootstrap`

class within your IDE or you can just run it from the console:

`java -jar bikupan-profile-service-0.0.3-SNAPSHOT-standalone.jar server ../src/test/resources/bikupan-service.yml`


## API documentation

Point your browser to

`http://localhost:3010/api-ui`

