# TheHive
Assigment 6: The Hive Bstewar8
To Run The Project:
It can be run with gradle using ‘gradle run’ or run in eclipse by selecting the Main.java class and running as a java application.
Testing can be run using eclipse and selecting the test class and running as a Junit test.
Gradle build will run the Junit test along with the checkstyle. SpotBugs was not implemented because gradle will not run spot bugs on my machine. This is a known issue confirmed with Dr. Mehlhase..
Developmental Patterns
Creational pattern: Builder Pattern: the builder.java.theHive package was used to build the Apiary and fill the hives. It implemented the following requirements. The was implemented on the CreationalPatternBuilder branch
• An apiary can have many beehives in them
• A beehive should only have one species of bees. Each species should have some kind of bonus to them. Perhaps they harvest nectar from flowers faster. Perhaps they have a higher chance to kill other bees (or anything else, be creative).
Creational pattern: Singleton Pattern: The Apiary in the singleton.java.theHive package is an example of a singleton. It was implemented on the CreationalPatternSingleton branch. It addressed the following requirements.
• An apiary can have many beehives in them. For this assignment, only ever allow one apiary to exist.
• An apiary should be capable of spawning an unlimited number of beehives.
Structural pattern: Decorator Pattern; The decorator.java.theHive package implemented a decorator patter. Each bee is the same before they are decorated to be a specific be type. This also handles decorating the winner of the battles. It was implemented on the StructuralPatternDecorator branch.
It addressed the following requirements.
• A beehive should only have one species of bees. Each species should have some kind of bonus to them. Perhaps they harvest nectar from flowers faster. Perhaps they have a higher chance to kill other bees (or anything else, be creative).
Behavioral Pattern: Template pattern: the template.java.theHive package created the template to run each battle. The winner of the battle replaced their black stripe with the signature stripe of the type of
bee they killed. For example, electric bees are black and blue while wood bees are black and brown. If the electric be wins, his colors are now brown and blue. This was implemented on BehavioralPatternTemplate branch and addressed the following requirement.
• Bees should be able to battle other bees (unconventional). When they do, the loser of the battle should die (it’s beehives can no longer command it), and the winner of the battle should get the attributes of that bee.
Checkstyle
There are checkstyle failures. The failures are from the names of the packages not following a specific “pattern” and for the imports not be in lexicographic order. I tried rearranging the imports multiple times but the would revert every time I saved. If found the setting to change their order but I couldn’t remove them being separated by type. It was this separation that created the fail. For the naming convention, I could not find an example of what it wanted my package names to be. I tried to refactor the names a few time but always got an error at the end of the refactoring AND I was warned by eclipse that I was not following convention.
SpotBugs.
2 bugs were for “dead store” and were low threat. They could possibly cause a problem if the application was threaded. I was unable to fix them without completely changing my code.
2 bugs were for writing to a field of a static instance method. This bug creates problems on multiple instances of the same static object. This is not a concern because the Apiary is a singleton and there will on ever be one instance.
https://github.com/bstewar8/TheHive
