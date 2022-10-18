# Architecture

## Storage
StorJ is a decentralized cloud storage platform.
Every file is splitted into 80 parts and spreaded accross the net based on DHT (distributed hashtable).
Even when a few server will fall out the whole file can be reconstructed.


## Registration 
A user downloads the app and creates an account with StorJ to get 150 GB free storage.
The user edits his profile and pushes it to StorJ as a file <uuid>.profile.

## Spreading
A second user is also doing the registration with StorJ.
Now they exchange their accounts and user A can now read(only) the profile from user B because he knows his address.

## Posts
Now user A creates a post and stores it under the name <uuid>.post.<datetime>
User B can now see all posts from user A searching StorJ for <uuid>.post ordered by <datetime>.
Posts will be displayed similar to Facebook, so that the users will have the same behaviour and look and feel.

## Messages
A user puts a message to the server. Only the receiver can view this message.
We will copy the rules for messages from Telegram, so that the users will have the same behaviour.
