grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.war.file = "target/ROOT.war"
def gebVersion = "0.9.2"
def seleniumVersion = "2.35.0"

// uncomment (and adjust settings) to fork the JVM to isolate classpaths
//grails.project.fork = [
//   run: [maxMemory:1024, minMemory:64, debug:false, maxPerm:256]
//]

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false
    // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    credentials {
        realm = "Artifactory Realm"
        host = "gr-artmaven.appnor.net:8081"
        username = "gdboling"
        password = ""
    }

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // mavenRepo "http://gr-artmaven.appnor.net:8081/artifactory/ext-release-local"
        // Details from docx4j Getting Started Guide at http://dev.plutext.org/svn/docx4j/trunk/docx4j/docs/Docx4j_GettingStarted.html
//    mavenRepo "http://dev.plutext.org/svn/docx4j/trunk/docx4j/m2"
//    mavenRepo "https://webdavclient4j.svn.sourceforge.net/svnroot/webdavclient4j/trunk/m2"

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
        mavenRepo "http://repo.grails.org/grails/plugins/"
//    mavenRepo "http://repo.grails.org/grails/core"
//
//    mavenRepo "http://maven.springframework.org/milestone/"
//    mavenRepo "http://download.java.net/maven/2/"
//    mavenRepo "http://oss.sonatype.org/content/repositories/snapshots"

        //mavenRepo "http://m2repo.spockframework.org/snapshots"
        // mavenRepo "http://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-support"
    }

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.

        runtime 'mysql:mysql-connector-java:5.1.29'
//        test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
        //compile "genrocket:genrocket:1.0"
//    compile 'org.docx4j:docx4j:2.5.0'
//    compile ":excel-export:0.2.1"

        // test("org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion")

        //test "org.gebish:geb-spock:$gebVersion"
        //test "org.gebish:geb-junit4:$gebVersion"
        //test "org.gebish:geb-junit3:${gebVersion}"
        //test "org.grails:grails-datastore-test-support:1.0.2-grails-2.4"
        //compile 'org.apache.httpcomponents:httpcore:4.3'
        //compile 'org.apache.httpcomponents:httpclient:4.3'
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":resources:1.2"
        compile ":cache:1.1.1"
        build ":tomcat:$grailsVersion"

    }
}
