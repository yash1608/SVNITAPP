package com.example.svnitapp;

import java.util.ArrayList;

public class SubjectList {


    public void SubjectName() {


    }

    public ArrayList<String> getlist(String listName) {
        ArrayList<String> list = new ArrayList<>();

        switch (listName) {
            case "ComputerSemester1":
                list.add("Engineering Mathematics-1");
                list.add("Engineering Physics  ");
                list.add("Engineering Chemistry ");
                list.add("Engineering Mechanics  ");
                list.add("FCP ");


                break;

            case "ComputerSemester2":
                list.add("English & Communication Skills ");
                list.add("Workshop Practice  ");
                list.add("Electro-Techniques  ");



                break;
            case "ComputerSemester3":
                list.add("Computer Organization ");
                list.add("Data Structures and Algorithms ");
                list.add("Digital Circuits");
                list.add("Electrical Network Analysis");
                list.add("Discrete Mathematics");
                list.add("Software Tools - I ");

                break;
            case "ComputerSemester4":
                list.add("Theoretical Computer Science ");
                list.add("Data Base Management System ");
                list.add("Communication Systems");
                list.add("Engineering Mathematics-III");
                list.add("Software Tools - II ");


                break;
            case "ComputerSemester5":
                list.add("Microprocessor and Interfacing Techniques ");
                list.add("Design and Analysis of Algorithms ");
                list.add("Artificial Intelligence and Machine Learning ");
                list.add("Computer Networks ");
                list.add("EIS - I ");
                list.add("\tSoftware Tools - III ");


                break;
            case "ComputerSemester6":
                list.add("Operating Systems ");
                list.add("Systems Software ");
                list.add("Computer Graphics ");
                list.add("Internet Technology and Applications ");
                list.add("EIS - II ");
                list.add("Software Tools - IV ");

                break;
            case "ComputerSemester7":
                list.add("Software Engineering ");
                list.add("Cryptography and Network Security ");
                list.add("Principles of Programming Language ");
                list.add("Elective - I(ES)");
                list.add("Project Preliminaries ");
                list.add("Seminar");

                break;
            case "ComputerSemester8":
                list.add("Distributed Algorithms ");
                list.add("Economics and Business Management");
                list.add("EIS - I");
                list.add("EIS - II ");
                list.add("Project ");

                break;

            case "CivilSemester1":
                list.add("Engineering Drawing");
                list.add("Energy and Environmental Engineering");
                list.add("Introduction to Surveying ");
                list.add("");
                list.add("");
                list.add("");
                list.add("");

                break;
            case "CivilSemester3":
                list.add("Building Technology ");
                list.add("Hydraulic Engineering");
                list.add("Basic Transportation Engineering");
                list.add("Mechanics of solid");
                list.add("Geotechnical Engineering");

                break;
            case "CivilSemeste2":
                list.add("");
                list.add("");
                list.add("");
                list.add("");
                list.add("");

                break;
            case "CivilSemester4":
                list.add("Environment Engineering -1");
                list.add("Concrete Technology");
                list.add("Structural Analysis -1");
                list.add("Geometric Surveying");
                list.add("BTP");

                break;
            case "CivilSemester5":
                list.add("Professional Ethics, Economics and Business Management");
                list.add("Estimation and cost analysis");
                list.add("Environment Engineering");

                break;
            case "CivilSemester6":
                list.add("Structural Analysis -2");
                list.add("Highway Engineering");
                list.add("Water Resources Engineering");
                list.add("Design od steel structures");

                break;
            case "CivilSemester7":
                list.add("Heavy construction and project management");
                list.add("design of concrete structure");

                break;
            case "CivilSemester8":
                list.add("Innovation,incubation and Entepreneurship");

                break;

            case "ChemicalSemester1":
                list.add("Mechanical operation");
                list.add("Mathematics - 3");
                list.add("Fluid Flow operation");
                list.add("Heat transfer operation");
                list.add("Applied Chemistry");

                break;
            case "ChemicalSemester2":
                list.add("Engineering Mathematics");
                list.add("Chemical Reaction Engineering-1");
                list.add("Mass transfer operation");
                list.add("Chemical Engineering thermodynamics-1");
                list.add("Material Science Technology");

                break;
            case "ChemicalSemester3":
                list.add("Mass transfer operation-2");
                list.add("Chemical Engineering thermodynamics-2");
                list.add("Institute Elective-1");
                list.add("Chemical Reaction Engineering-2");
                list.add("Core Elective");
                list.add("Seminar");


                break;
            case "ChemicalSemester4":
                list.add("");

                break;
            case "ChemicalSemester5":
                list.add("");

                break;
            case "ChemicalSemester6":
                list.add("Professional Ethics, economics & management");
                list.add("Instrumentation and Process control");
                list.add("Process Equipment Design and Drawing");
                list.add("Process Modelling and Simulations");
                list.add("Institute Elective -2");
                list.add("Core Electives -2");

                break;
            case "ChemicalSemester7":
                list.add("General chemical Theology");
                list.add("Elements of Transport Phenomena");
                list.add("Core Elective-3");
                list.add("Core Elective-4");

                break;
            case "ChemicalSemester8":
                list.add("Core Elective-5");
                list.add("Core Elective-6");
                list.add("Core Elective-7");
                list.add("Innovation incubation and Entrepreneu");

                break;

            case "ElectricalSemester1":
                list.add("");

                break;
            case "ElectricalSemester2":
                list.add("");

                break;
            case "ElectricalSemester3":
                list.add("Engineering Mathematics-III");
                list.add("Linear Electronics");
                list.add("Electrical Circuits");
                list.add("Electrical Machines-I");
                list.add("Solids and Fluids Mechanics");

                break;
            case "ElectricalSemester4":
                list.add("Applied Thermodynamics & Thermal Engineering");
                list.add("Digital Circuits ");
                list.add("Network and Systems");
                list.add("Electrical Machines-II");
                list.add("Computer Applications for Electrical Engineering");

                break;
            case "ElectricalSemester5":
                list.add("Elements of Power Systems");
                list.add("Control Systems");
                list.add("Electrical Measurements");
                list.add("Microprocessors & Micro Controllers");
                list.add("EIS - I");

                break;
            case "ElectricalSemester6":
                list.add("Microcontroller and Embedded System");
                list.add("Power Systems Analysis");
                list.add("Power Electronic Converters");
                list.add("Instrumentation");
                list.add("EIS - II");

                break;
            case "ElectricalSemester7":
                list.add("Electronic Instrumentation");
                list.add("Electrical Drives");
                list.add("Switch Gear & Protection");
                list.add("ES-I");
                list.add("Seminar");
                list.add("Project Preliminary");

                break;
            case "ElectricalSemester8":
                list.add("Power System Operation and Control ");
                list.add("Electrical Machine Design ");
                list.add("Advanced Power Electronic Converters & Applications");
                list.add("EIS - 3");
                list.add("Project ");

                break;

            case "ElectronicsSemester1":
                list.add("");

                break;
            case "ElectronicsSemester2":
                list.add("");

                break;
            case "ElectronicsSemester3":
                list.add("Engineering Mathematics-III");
                list.add("Electronic Circuits");
                list.add("Digital Logic Design");
                list.add("Signals and Systems");
                list.add("Network Analysis and Synthesis");

                break;
            case "ElectronicsSemester4":
                list.add("Statistical Signal Analsis");
                list.add("Principles of Communication Systems");
                list.add("Microprocessors and Microcontrollers");
                list.add("Linear IC Applications");
                list.add("Control Systems");

                break;
            case "ElectronicsSemester5":
                list.add("Transmission Lines and Electromagnetic Waves");
                list.add("Digital Communication");
                list.add("Digital Signal Processing");
                list.add("Seminar");
                list.add("Sensors and Transducers Neural Networks Multimedia Communication");
                list.add("Computer Architecture and Organization Data Structures and Algorithms VLSI Technology Digital Image Processing");

                break;
            case "ElectronicsSemester6":
                list.add("Professional Ethics, Economics and Business Management*");
                list.add("Wireless and Mobile Communication");
                list.add("Digital Integrated Circuits");
                list.add("Core Elective Lab Optical Fiber Commmunication lab Electronic Instrumentation lab Machine Learning lab Communication Networks lab");
                list.add("Institute Elective-2 High Performance Computing Computer Vision Micro Electromechanical sytems");
                list.add("Core Elective- II Optical Fiber Communication Electronic Instrumentation Machine Learning Communication Networks");

                break;
            case "ElectronicsSemester7":
                list.add("Microwave Engineering");
                list.add("VLSI Design");
                list.add("Core Elective - III");
                list.add("Core Elective - IV");
                list.add("Project Preliminaries");

                break;
            case "ElectronicsSemester8":
                list.add("Core Elective-4");
                list.add("Core Elective-5");
                list.add("Core Elective-6");
                list.add("Innovation, Incubation and Entrepreneurship");
                list.add("Project");

                break;
            case "MechanicalSemester1":
                list.add("");

                break;
            case "MechanicalSemester2":
                list.add("");

                break;
            case "MechanicalSemester3":
                list.add("Mathematics - III");
                list.add("Engineering Thermodynamics");
                list.add("Theory of Machines");
                list.add("Metallurgy");
                list.add("Measurement and Instrumentation");

                break;
            case "MechanicalSemester4":
                list.add("Fluid Mechanics ");
                list.add("Heat Transfer");
                list.add("Machine Design and Drawing");
                list.add("Dynamics of Machines");
                list.add("Industrial Engineering");

                break;
            case "MechanicalSemester5":
                list.add("Fluid Machines");
                list.add("Design of Machine  Components");
                list.add("Machining Processes");
                list.add("Institute Elective –1 ");
                list.add("Core Elective – 1");
                list.add("Seminar");

                break;
            case "MechanicalSemester6":
                list.add("Professional Ethics, Economics and Management\n");
                list.add("Tribology and Mechanical Vibration");
                list.add("Production Technology");
                list.add("Applied Thermal Engineering ");
                list.add("Institute Elective – 2");
                list.add("Core Elective - 2");

                break;
            case "MechanicalSemester7":
                list.add("Machine Design-II");
                list.add("Energy Systems");
                list.add("Production Technology-");
                list.add("CAD-CAM");
                list.add("Project Preliminaries ");
                list.add("Seminar");

                break;
            case "MechanicalSemester8":
                list.add("Elements of Gas Turbine");
                list.add("Industrial Management Techniques");
                list.add("Production Technology -II");
                list.add("Instrumentation & Control ");
                list.add("Project");
                list.add("Deptt. Elective-II");


                break;

            case "ChemistrySemester1":
                list.add("Chemistry-I ");
                list.add("Physics-I");
                list.add("Mathematics-I");
                list.add("Environmental Science");
                list.add("English-I");

                break;
            case "ChemistrySemester2":
                list.add("Chemistry-II");
                list.add("Physics-II");
                list.add("Mathematics-II");
                list.add("Introduction to Computers");
                list.add("English-II");

                break;
            case "ChemistrySemester3":
                list.add("Physical Chemistry-I");
                list.add("Inorganic Chemistry-I");
                list.add("Modern Physics and Physical Optics");
                list.add("Communication Skills-I");
                list.add("Basic Science Elective (BSE)*");

                break;
            case "ChemistrySemester4":
                list.add("Organic Chemistry-I");
                list.add("Introduction to Chemical Engineering-I");
                list.add("Introduction to Chemical Engineering-I");
                list.add("Communication Skills-II");
                list.add("Engineering Science Elective (ESE)");

                break;
            case "ChemistrySemester5":
                list.add("Physical Chemistry-II ");
                list.add("Organic Chemistry-II ");
                list.add("Inorganic Chemistry-II");
                list.add("Computers in Chemistry");
                list.add("Chemistry Lab. – I ");

                break;
            case "ChemistrySemester6":
                list.add("Physical Chemistry-III");
                list.add("Organic Chemistry-III");
                list.add("Inorganic Chemistry-III");
                list.add("Economics & Business Management");
                list.add("Chemistry Lab. – II");

                break;
            case "ChemistrySemester7":
                list.add("");

                break;
            case "ChemistrySemester8":
                list.add("");

                break;
            case "PhysicsSemester1":
                list.add("");

                break;
            case "PhysicsSemester2":
                list.add("");

                break;
            case "PhysicsSemester3":
                list.add("");

                break;
            case "PhysicsSemester4":
                list.add("");

                break;
            case "PhysicsSemester5":
                list.add("");

                break;
            case "PhysicsSemester6":
                list.add("");

                break;
            case "PhysicsSemester7":
                list.add("");

                break;
            case "PhysicsSemester8":
                list.add("");

                break;







        }

        return list;
    }


}
