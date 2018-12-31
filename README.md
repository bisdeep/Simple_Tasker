# Pre-work - Simple Tasker

Simple Tasker is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Deep Biswas

Time spent: 5 hours spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can **successfully add and remove items** from the todo list
* [X] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [X] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file (In Progress)
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] Include image support?
* [ ] FB OAuthorization? (Probably not a good idea realistically, but for practice)

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://i.imgur.com/s4G9Ytz.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** 
   Although this was roughly an introductory project, it opened me up to the simplicity in using Android Studio. I know there are many complex apps to be developed, but even then, using Android Studio just shows you how ergonomic app development could be. I've developed applications for Android previously using React-Native IDEs such as Atom and Create-React-App, and although it's more of an old-school coding experience (utilizing the latest libraries ofcourse), Android Studio makes developing Android applications as simple as coding HTML-5 websites on Adobe Dreamweaver. I anticipate to progress this skill within the next 2 years by creating a diverse portfolio utilizing numerous libraries and APIs. 

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** 
   ArrayAdapters make it possible to implement a "slideshow"-esque sequence of data objects. Examples of this could be  sequence of images that present the utilization of an app that viewers see when opening the app instantly upon installation, or a simple animation with objects. These said data objects could also be Views (allowing sequencing of Views). The method convertView allows older views to be re-used which comes in handy especially for rendering new objects because convertView can already have the previous View loaded, only needing to load the said new object. Technically, within getView, convertView loads the current state and prepares it to render the new object and then through getView each View is placed within the ArrayAdapter to create the sequence of views. Applications can  therefore enhance usability through the integrate of ArrayAdapters, providing interactive sequences in the UI and basically every other aspect in user experience.

## Notes

   There were specifically two difficulties I encountered while building this app. The first being the walkthrough videos presented used a previous version of android studio, which in turn caused a lot of confusion and debugging. The second being the VCS system.
   The common error I would get was due to lack of "constrainments" in the objects from the design tab of the xml files, I didn't recall there being any constrainments, but just the handles for resizing in the youtube video, so I realized the version of Android Studio being utilized was definitely a much older version of it (given it's also from 2017). However, this is a nifty feature for precise placement in UIs and I highly appreciated it. 
   Although I was able to share my project on gitHub through Android Studio's VCS tab, I had a hard time comitting changes. Firstly, I tried the  default command line terminal, to which after git commit, git push would bring up an error prohibiting any changes to upload. After some searching I came across the command git push master origin force (mine which had to be git push master todo force because that was what I defined the project with), and this finally allowed me to upload the changes to upgrade the app with the item editing feature. I was also aware of the manual uploading feature on the gitHub website, but, as the video suggested, I tried familiarizing myself in the command line aspect.
   
## License

    Copyright [2018] [Deep Biswas]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
