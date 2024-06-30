#
# Copyright (c) 2024.
# @author Patrick Mutwiri <dev@patric.xyz> on 6/30/24, 10:24 AM
#
#

podman run -d -p 8080:8080 \
  -e DB_URL=jdbc:postgresql://127.0.0.1:5432/callbacks \
  -e DB_USERNAME=postgres \
  -e DB_PASSWORD=pat1 \
  --name callback-handler callback-handler:latest
