# <span style="color: #007acc;">Scala Learning Project</span>

## <span style="color: #ff6600;">Purpose</span>

This project is for learning Scala as part of the module <strong>COMP40070 Design Patterns</strong> for the Advanced Software Engineering MSc program at University College Dublin (UCD).

## <span style="color: #33cc33;">Description</span>

This repository contains Scala 3 projects to help with learning and experimenting with Scala. It includes instructions for setting up Scala 3 on a PC, including Java JDK, Scala CLI, SBT, and using IntelliJ IDEA Ultimate.

## <span style="color: #ffcc00;">Prerequisites</span>

- <strong>Java JDK</strong>: 18.0.2
- <strong>Scala Version</strong>: 3.5.0 (or the version specified in your project)
- <strong>SBT Version</strong>: 1.10.1

## <span style="color: #ff3399;">Setup Instructions</span>

### 1. Install Java JDK

1. Download Java JDK 18.0.2 from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk18-downloads.html).
2. Follow the installation instructions for your operating system.
3. Set up the `JAVA_HOME` environment variable:
   - **Windows**:
      1. Right-click on "This PC" or "Computer" on the desktop or in File Explorer, then click "Properties".
      2. Click "Advanced system settings" on the left.
      3. Click "Environment Variables".
      4. Under "System variables", click "New" and enter `JAVA_HOME` as the variable name and the path to your JDK installation as the variable value (e.g., `C:\Program Files\Java\jdk-18.0.2`).
      5. Add `%JAVA_HOME%\bin` to the `Path` variable in the "System variables" section.

### 2. Install Scala 3

1. **Using Scala CLI**:
   - Download and install Scala CLI from [Scala CLI GitHub releases](https://github.com/VirtusLab/scala-cli/releases).
   - Follow the installation instructions provided.

2. **Install SBT**:
   - **Using Chocolatey**:
      1. Install Chocolatey if you haven't already. Follow the installation instructions at [Chocolatey's website](https://chocolatey.org/install).
      2. Open PowerShell as Administrator and run:
         <br><span style="color: #009900;">choco install sbt</span>
   - **Alternative Installation**:
      - Download the SBT installer from [SBT's official website](https://www.scala-sbt.org/download.html) and follow the installation instructions.

3. **Set Up Environment Variables**:
   - Ensure that SBT's installation directory is included in the `Path` environment variable.

### 3. Clone the Repository and Set Up the Project

1. **Clone the Repository**:
   <br><span style="color: #009900;">git clone https://github.com/kyriakidisdimitrios/scala-learning.git</span>
   <br><span style="color: #009900;">cd scala-learning</span>

2. **Run Project Setup**:
   If you need to create a new Scala 3 project based on a template, use the following command:
   <br><span style="color: #009900;">sbt new scala/scala3.g8</span>

3. **Pull Latest Changes**:
   If you already have a project set up and want to update it with the latest changes from the repository, use:
   <br><span style="color: #009900;">git pull origin main</span>

4. **Compile and Run**:
   To compile and run your Scala project, navigate to your project directory (if not already there) and use:
   <br><span style="color: #009900;">sbt run</span>

### 4. <span style="color: #3399ff;">Compiling and Running the Project Using PowerShell</span>

To compile and run your Scala project using PowerShell, follow these steps:

1. **Open PowerShell**:
   - Click on the **Start** menu, type "PowerShell," and press **Enter**.

2. **Navigate to the Project Directory**:
   - Use the `cd` command to move to your project directory. If your project is located at `C:\Users\YourUsername\Documents\scala-learning`, you would type:
     ```powershell
     cd C:\Users\YourUsername\Documents\scala-learning
     ```
   - Press **Enter** to execute the command. PowerShell will now be set to your project directory.

3. **Compile the Project**:
   - To compile your Scala project, use the following command:
     ```powershell
     sbt compile
     ```
   - Press **Enter** to run this command. SBT will start the compilation process, compiling all the Scala source files in your project.

4. **Run the Project**:
   - After successfully compiling your project, you can run it with:
     ```powershell
     sbt run
     ```
   - Press **Enter** to execute this command. SBT will compile the project again if necessary and then run the main class specified in your `build.sbt` file. If your project has multiple main classes, SBT will ask you to select which one to run.

### 5. <span style="color: #cc3333;">Opening the Project in IntelliJ IDEA Ultimate</span>

1. **Open IntelliJ IDEA Ultimate**.

2. **Open Your Project**:
   - Click on **"Open"** from the welcome screen or use `File > Open` from the menu bar.
   - Navigate to your project directory (e.g., `D:\Github_repos\scala-learning\scala-learning`) and select it.
   - IntelliJ will detect that it is an SBT project and will prompt you to import the project. Click **"Import Project"** to proceed.

3. **Configure Scala SDK**:
   - During the import process, ensure that IntelliJ IDEA is set to use the Scala SDK that matches your project's version.
   - Go to `File > Project Structure > Project`.
   - Set the **"Project SDK"** to the installed JDK (18.0.2) and ensure that the **"Project Language Level"** is set to Scala 3.

4. **Run Configurations**:
   - To run Scala applications within IntelliJ IDEA, you might need to configure run configurations.
   - Go to `Run > Edit Configurations`.
   - Click on the **"+"** icon to add a new configuration and select **"Application"**.
   - Set the main class and other parameters as needed for your Scala application.

### <span style="color: #ff6666;">Important Note on IntelliJ and Scala Compiler Issues</span>

IntelliJ IDEA uses its own embedded Scala compiler implementation, which may report errors in the editor even though SBT can compile and run the project without any problems. This issue arises because IntelliJ's embedded compiler might not be fully compatible with Scala 3 features or your project's specific setup. However, as long as your project runs correctly using SBT (as described in the PowerShell instructions), you can ignore these IntelliJ errors.

## <span style="color: #ff6600;">License</span>

This project is licensed under the MIT License - see the LICENSE file for details.

## <span style="color: #ff6600;">Contact</span>

For any questions or issues, please open an issue in the GitHub repository or contact the project maintainer:

**Name**: Kyriakidis Dimitrios  
**GitHub**: [kyriakidisdimitrios](https://github.com/kyriakidisdimitrios)  
**LinkedIn**: [kyriakidis-demetrios](https://www.linkedin.com/in/kyriakidis-demetrios)
# scala-learning
