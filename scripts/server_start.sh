#!/usr/bin/env bash
cd /home/ec2-user/server
#sudo java -jar -Dserver.port=80 \
#  *.jar > /dev/null 2> /dev/null < /dev/null &
#  *.jar < /dev/null &

sudo java -jar -Dserver.port=80 *.jar > "../logs/$(date +%F_%T).log" 2>&1 < /dev/null &