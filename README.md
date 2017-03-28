# PSI Probe

[![Build Status](https://travis-ci.org/psi-probe/psi-probe-ojdbc.svg?branch=master)](https://travis-ci.org/psi-probe/psi-probe-ojdbc)
[![Coverage Status](https://coveralls.io/repos/github/psi-probe/psi-probe-ojdbc/badge.svg?branch=master)](https://coveralls.io/github/psi-probe/psi-probe-ojdbc?branch=master)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/com.github.psi-probe/psi-probe-ojdbc/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.psi-probe/psi-probe-ojdbc)
[![GPLv2 License](https://img.shields.io/badge/license-GPLv2-green.svg)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.html)

![psi-probe](src/site/resources/images/psi-probe-banner.jpg)

## PSI Probe OJDBC Module ##

Oracle's JDBC drivers and connection pool are protected by the OTN (Oracle Technology Network) Development and Distribution License.  For this reason, the .jar files cannot be legally hosted in any Maven repository or distributed with PSI Probe.  Thankfully Oracle has made it possible to pull from their maven repo and currently this is required to build psi-probe-ojdbc.

Follow instructions located [here](http://www.oracle.com/webfolder/application/maven/index.html)

[optionally]

    Retrieve ojdbc and ucp from location noted in following poms and then Execute the following commands:

        - mvn install:install-file -Dfile=/path/to/ojdbc7.jar -DpomFile=/path/to/ojdbc7-pom.xml
        - mvn install:install-file -Dfile=/path/to/ucp.jar -DpomFile=/path/to/ucp-pom.xml

[notes]

    Please note that this module was separated from the core psi-probe project due to Oracle licensing and
    security constraints making it almost impossible to keep this with the core code and get any level of
    successful build status on community driven pull requests.  While we will accept pull requests here
    as well they will be looked at a bit more carefully as we have no way to realistically have CI setup.
    This project will be released when needed with psi probe but most likely it will not change much.
