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

The function code is: 
```
function  processTranscript(path,inputfile,outputfile)

cd(path) % Find the path
a = readlines(inputfile); % get the transcript
if strncmpi(a(12),'00',2)==1 % determine the starting point and the step
    start=12;
    step=6;
else
    start=11;
    step=5;
end
a(1:start) =[];
b = a(1:step:end); % Keep every "stept"th line
ff = fopen(outputfile,'w'); % Create the file
fprintf(ff,'%s \n',b); % Write the file
```

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

* **Step 1:** [Download the function](https://momchil-terziev.github.io/Code/processTranscript.mlx)
* **Step 2:** Add the function's location to MATLAB's search path: `addpath 'function location' `, for example `addpath 'C:\Users\momchil-terziev\Downloads'`. 
* **Step 3:** Use `processTranscript(path, inputfile, outputfile)` where `path` is the transcript location `path = 'C:\Users\...\Scripts directory'`, give the transcript file name as `inputfile = 'transcript.vtt'`, and output file name as `outputfile = 'processedtranscript.txt'`
