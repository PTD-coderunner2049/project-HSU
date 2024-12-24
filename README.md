# Project-Vessel-Tracker-HSU
Student project for the OOAD & OOP subject, group of 2.
In this one, we simulate a system that track and control traffic through a storage or yard by processing requests, provide intructions and managing the flow of vehicles through mother's infrastructure.



some info to know:
    - Account with "admin" in username will gain admin privilege (case insensitive).
    - Admin would view and perform action on all document belong to other users.
    - Each created request idealy get accept instancely due to small scope, but a delay of 10second is set in new thread before user can be informed about it.
    - User clear finished contact on their UI will remove thouse document from theirs list, but all data remain on localdatabase JSON files. (Admin still view them all)