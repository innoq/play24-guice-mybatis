# Play 2.4 (Dependancy Injection) with MyBatis

This is a minimum sample project to demonstrate what is explained in the corresponding [blog post]
on the innoQ site.

Compared to what is described in the blog post it adds some details and other things
that are useful for demonstrating, but not relevant to the message from the post,
e.g. this sample uses a [h2 database] instead of an Oracle one (for obvious reasons) and adds
some minor sample data.

## How to run
You should be able to run the sample out of the box by running

     activator run
          
from the command line. This should start a server listening on `localhost:9000`.

## Stepping through the steps

This project has [SBT Groll] included, meaning you can step through the steps.
For this to work you need to be inside the *activator shell*, so you must first run

     activator
                
on the shell and enter it.
From there you can enter `groll show`, `groll next` or `groll prev` (for a full list see [Groll Arguments]) to navigate through the steps.

## Steps

### Step 0
Create a new project with

     activator new
                        
choosing option (`5`), a `play-java` project and choose whatever name you want the project to have.


### Step 2
Added a MyBatis Module and the configuration for it.
Also included a database file (H2 not Oracle) and the necessary configuration for it.

### Step 3
Added the MyBatis mapper and XML configuration to the project.
Used the layout provided by [inoio] and [AlexKlibisz].

Also changed the routing to provide data from the database instead of the welcome page.

### Step 4
Moved `app/service/UserMapper.xml` to `conf/service/UserMapper.xml` and removed the now superfluous entries from the `build.sbt` file.


[inoio]: http://inoio.de/blog/2013/02/07/integrating-mybatis-guice-play2/

[AlexKlibisz]: http://alexklibisz.github.io/setting-up-play-framework-2.3.6-with-mybatis/

[blog post]: https://www.innoq.com/en/blog/play24-guice-mybatis/
[h2 database]: http://www.h2database.com
[SBT Groll]: https://github.com/sbt/sbt-groll
[Groll Arguments]: https://github.com/sbt/sbt-groll#argumentsoptions

