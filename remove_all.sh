#
# Copyright (c) 2024.
# @author Patrick Mutwiri <dev@patric.xyz> on 6/30/24, 10:24 AM
#
#

podman rmi $(podman images -qa) -f
