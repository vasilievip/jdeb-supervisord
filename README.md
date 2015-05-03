## Example demonstrating how to build ".deb" package from java program which runtime status will be maintained by supervisord service.

### External reading:

* http://stackoverflow.com/a/21883404 
* http://ae.koroglu.org/best-way-to-daemonize-applications-on-linux/ 

### Pre-requisites installation:

* http://supervisord.org/installing.html#installing-a-distribution-package
* http://www.webupd8.org/2012/09/install-oracle-java-8-in-ubuntu-via-ppa.html

### Build:

```
mvn clean install
```

### Project installation/upgrade on ubuntu:

```
﻿> sudo dpkg -i jdeb-example_1.0~[.. hostname ..]_all.deb
```

### Removal on ubuntu:

```
> sudo dpkg -P jdeb-example
```