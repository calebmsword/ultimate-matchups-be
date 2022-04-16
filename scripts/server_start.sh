#!/usr/bin/env bash
cd /home/ec2-user/server
sudo java -jar -D server.port=80 \
#  *.jar > /dev/null 2> /dev/null < /dev/null &
  *.jar < /dev/null &