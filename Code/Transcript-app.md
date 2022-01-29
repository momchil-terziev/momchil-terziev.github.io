---
layout: archive
title: "Transcript processing function and app"
---

---

**On this page:**

* TOC
{:toc}

# Introduction

After I recorded some tutorials for students on MS Stream, I had to download the transcript. The transcript looked as shown below:

| As shown on MS stream | As downloaded |
|---------------------- | ------------- |
| ![transcript example](/files/transcript-example.png) |![transcript example 2](/files/transcript-example2.png) |

# Code

At the time, I didn't know there is an online tool able to remove the additional text, so I wrote a bit of code. Later, I added a graphical user interface. You can get the app and function code in the table below:

| Type  | Description | Requirements | Link | Instructions |
| ---------- | ----------- | ------------ | ---- | ----- |
| **MATLAB app**  | A MATLAB app with a graphical user interface  | No coding or MATLAB background requirements. See the documentation below for details on how to install and run the app | [Download app](https://momchil-terziev.github.io/Code/Transcript%20processing%20app.mlappinstall) | [How to install and use the app](https://momchil-terziev.github.io/Code/Transcript-app/#how-to-download-and-install-the-app) |
| **MATLAB function**  | A MATLAB function for those who prefer code. The function has identical functionality to the app  | Minimal coding requirements, see below for details       | [Download function](https://momchil-terziev.github.io/Code/processTranscript.mlx) | [How to use the function]() |

# Instructions

## How to download and install the app

![MATLAB app](/files/transcript-app-screenshot.png) 

* **Step 1:** [Download the app](https://momchil-terziev.github.io/Code/Transcript%20processing%20app.mlappinstall)
* **Step 2:** Within MATLAB, navigate to the Apps tab and click on install app
* **Step 3:** Launch the app through apps list:
* **Step 4:** Copy the filepath of your transcript and paste it into the 'Path' field
* **Step 5:** Copy the file name, including any extensions into the 'Input filename' filed
* **Step 6:** Name the output file, including the extension, for example, note1.txt
* **Step 7:** Click 'Execute', and find your processed transcript

## How to use the function

