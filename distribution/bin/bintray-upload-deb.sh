#!/bin/bash

# bintray repo setup:
# - add Debian repository with checkbox "Trivial index" enabled (name openHAB)
# - add a new Package named openHAB
# - add new Versions: 1.6.2, 1.7.0-M1
# - build openHAB: mvn clean package
# - cd into distribution/target/apt-repo
# - upload the files using this script:
#     bintray-upload-deb.sh theoweiss 9999999999999999999999999 1.6.2
# - publish files using the webinterface (could also be done with curl)

if [ $# -eq 3 ]; then
	username="$1"
	apikey="$2"
	version="$3"
else
	echo $@
	echo "usage: $0 <username> <apikey> <version>"
	exit 2
fi
for debfile in *.deb; do
	ls ${debfile}
	msg=`curl -T ${debfile} -u${username}:${apikey} https://api.bintray.com/content/theoweiss/openHAB/openHAB/${version}/${debfile} 2>/dev/null`
	echo $msg | awk -F ":" '{ if ( $2 == "\"success\"}" )  exit 0 ; else { print $0 ; exit 1 }} '
	if [ $? -eq 0 ]; then
		echo "ok"
	else
		echo "failed"
		exit 1
	fi
done
