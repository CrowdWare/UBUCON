# Architecture

## StorJ
StorJ is a decentralized cloud storage platform.
Every file is splitted into 80 parts and spreaded across the net based on DHT (distributed hastable).

A user downloads the app and creates a local account (uuid).
The user edits the profile and pushes it to StorJ as a file <uuid>.profile
A second user is doing the same.
Now they exchange their userids and user A can now read the profile from user B because he knows the uuid.
A new file will be created that holds all friends. <uuid>.friends
This file can also be readed by user B.
Now user A creates a post and stores it under the name <uuid>.post.<datetime>
User B can now see all posts from used A searched IPFS for <uuid>.post ordered by <datetime>.