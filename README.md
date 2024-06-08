What is Apache POI
=====================
->Apache POI is an open-source java library to create and manipulate various file formats.

->Java doesn't have built-in support for working with excel files.

->We can use Apache POI Api in java to work with Excel files.

->Apache POI HSSF and XSSF API provide mechanisms to read, write or modify excel spreadsheets.

![apache poi](https://github.com/Debarjitmohanty/SpringBoot--Excel-Export/assets/91021174/c3e25fe3-91b9-447f-bcf7-da00d034fc36)


Apache POI Components
======================
     Workbook
     Sheet
      Row
      Cell

Create Data Base Table "COURSE_DTLS"and insert record "courseId","courseName","coursePrice"

Add Dependency
==============
 1.data jpa
 2.lombok
 3.devtools
 4.mysql connector
 5.Apache POI API Based On OPC and OOXML Schemas (Added externally from mvnrepository)

          <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>4.1.0</version>
		</dependency>

