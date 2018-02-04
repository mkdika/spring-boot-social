## Spring Boot Social
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](/LICENSE)

Example project for [Spring Boot](https://projects.spring.io/spring-boot/) and [Spring Social](https://projects.spring.io/spring-social/).

![Imgur](https://i.imgur.com/E0DD0lV.gifv)

This project consist of 3 different social network resource sharing (OAuth):

- [Facebook](https://projects.spring.io/spring-social-facebook/)
- [Twitter](https://projects.spring.io/spring-social-twitter/)
- [Google](https://github.com/spring-social/spring-social-google) (_On Progress_)




### Pre-requirement

- [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven3](https://maven.apache.org/index.html)
- [NetBeans IDE 8.2](https://netbeans.org/) (optional)




### Setup Environment Variable

You will need to setup OS environment variable for :

- Facebook App Id: `FACEBOOK_APP_ID`
- Facebook App Secret: `FACEBOOK_APP_SECRET`
- Twitter App Id: `TWITTER_APP_ID`
- Twitter App Secret: `TWITTER_APP_SECRET`
- Google App Id: `GOOGLE_APP_ID`  
- Google App Secret: `GOOGLE_APP_SECRET`

Or fill it directly inside the `application.properties` file.



### Running Application

From maven project (root) folder:
```
mvn spring-boot:run
```
Then access application URL from browser [http://localhost:8000](http://localhost:8000)



### Relevant Article & References

- - [A Secondary Facebook Login with Spring Social](http://www.baeldung.com/facebook-authentication-with-spring-security-and-social)
- [Spring Social Twitter Setup](http://www.baeldung.com/spring_social_twitter_setup)
- [Spring Social Google - Example](https://github.com/spring-social/spring-social-google-example)