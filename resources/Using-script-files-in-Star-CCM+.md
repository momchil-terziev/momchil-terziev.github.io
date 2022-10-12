---
layout: archive
title: "Sending Star-CCM+ simulations to ARCHIE-WeST"
author_profile: false
---


**On this page:**

An example script and instructions on how to send jobs to ARCHIE-WeST to run Star-CCM+ simulations in parallel.


**Contents:**
* TOC
{:toc}

<div class="text-right">
<input type="button" value="Print this page" onClick="window.print()">
</div>




## Example script file
This is an example script file. Everything in square brackets `[]` must be removed for the script to run. 
```html
#!/bin/bash

#=================================================================================
#
# Job script for running StarCCM+ on a multiple nodes
#
#=================================================================================

# Propogate environment variables to the compute node
#SBATCH --export=ALL
#
# Run in the standard partition (queue)
#SBATCH --partition=[standard, or teaching if you are an UG student]
#
# Specify project account
#SBATCH --account=[Project name]
#
# Distribute processes in round-robin fashion
#SBATCH --distribution=cyclic
#
# No. of tasks required
#SBATCH --ntasks=[Number of cores, eg 5]
#
# Specify runtime (hard) (HH:MM:SS)
#SBATCH --time=[Runtime, eg:50:00:00]
#
# Job name
#SBATCH --job-name=[Some simple description]
#
# Output file
#SBATCH --output=slurm-%j.out

module purge 
module load [star-ccm/16.04.007-r8]

#=========================================================
# Prologue script to record job details
#=========================================================
/opt/software/scripts/job_prologue.sh 
#----------------------------------------------------------

# Following line is necessary for multinode jobs
srun hostname -s > hosts.$SLURM_JOB_ID

starccm+ -rsh /usr/bin/ssh  -np $SLURM_NPROCS  -mpi intel -machinefile $SLURM_SUBMIT_DIR/hosts.$SLURM_JOB_ID -batch \
          -power -podkey [Your star license] -licpath 1999@flex.cd-adapco.com $SLURM_SUBMIT_DIR/[Your star-ccm file.sim]

#=========================================================
# Epilogue script to record job endtime and runtime
#=========================================================
/opt/software/scripts/job_epilogue.sh 
#----------------------------------------------------------
```
Copy the script above and paste it into a notepad. The notepad must be saved with a `.sh` extension.


## Instructions on how to send a simulation to Archie through Thinlinc or MobaXterm
-	After you’ve logged in (Thinlinc only) open a terminal. 
-	Type in: `mount_hdrive`
-	Enter your password – the keys might not appear as you type.
-	Open a file explorer in Thinlinc (first option on the top left) and find your `h_drive` folder containing the script and simulation. In MobaXterm, navigate through the side panel – copy your files.
-	Go to your home on the file explorer, eg: `/users/abc12345`[^1] and create a new folder. Make sure there are no spaces in the name of the folder; eg `StarccmFolder`; paste your files there.
-	Copy the path eg `/users/abc12345/StarCCMFolder`, go back to the terminal and type in `cd /users/abc12345/StarCCMFolder`; the path should update.
-	Type in `sbatch scriptname.sh` to send your simulation to HPC.

## Instructions on how to open Star-CCM+ in Archie through Thinlinc of MobaXterm
-	Open a terminal in Thinlinc (top left) or type into MobaXterm `module avail` - press `Enter`
-	Press `Enter` if the version of your software does not immediately show until you find the correct version, for example, `star-ccm/16.02.009-r8`
-	Stop the listing of additional software by using `Ctrl+C`
-	Type into the terminal `module load star-ccm/16.02.009-r8` to open Star-CCM+ version `16.02.009-r8` - press `Enter`
-	Type into the terminal `starccm+ -mesa&` to open Star-CCM+
-	Use the software as you normally would, but **do not run simulations through Thinlinc or MobaXterm - _this is forbidden_**
-	Use the guide above to send simulations to Archie 

[^1]: Replace `abc12345` with your DS username
