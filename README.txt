To Add Teacher -->> Post:http://localhost:8080/teachers Body--> {       "name": "Roaa",
                							"email": "roaa@gmail.com",
               								"mobileNumber": "33636",}
To Remove Teacher-->> Delete:http://localhost:8080/teachers/{teacherId} 

To View all Teachers -->> Get:http://localhost:8080/teachers

To View Teacher Details -->> Get:http://localhost:8080/teachers/{teacherId}

To update Teacher Data -->> Put:http://localhost:8080/teachers/{teacherId} with Body updated

To Add Student -->> Post:http://localhost:8080/students Body--> { "name": "Nancy",
    								  "email": "v.ofydjau@equxvgwip.ws",
   								  "mobileNumber": "336532",
    								  "age": 29,
 								  "address": "nqji",
    								  "gender": "Male"
   								 }
To Remove Student -->> Delete:http://localhost:8080/students/{studentId} 

To View all Student -->> Get:http://localhost:8080/students

To View Student Details -->> Get:http://localhost:8080/students/{studentId}

To update Student Data -->> Put:http://localhost:8080/students/{studentId} with Body updated

To View Student Assigned Courses -->> Get:http://localhost:8080/students/{studentId}/courses

To View Students In Course -->> Get:http://localhost:8080/courses/{courseId}/students

To View All Courses -->> Get:http://localhost:8080/courses

To Add Assignment -->> Post:http://localhost:8080/assignments Body--> {
              								 "description": "Eugkfzto vhpvpt eevifd yybnn tmjjj xipxtsf voaybhu jomwox fgoucoeam zpuohlmrj akwotkav pvzgng gjovcuffw zuu.",
                							 "due_date": "2003-10-29T22:00:00.000+00:00",
                							 "course_id":1
    }

To Submit Student Assignment -->> Post:http://localhost:8080/assignmentSubmissions Body--> {
    "submission_date": "2003-10-29T22:00:00.000+00:00",
    "content": "dfgvhbjnkml",
    "mark": 1.0,
    "assignment_id": 1,
    "student_id": 2
    }

To Submit Course Attendance -->> Post:http://localhost:8080/courseAttendances  Body--> {
    "attendanceDate": "2003-10-29T22:00:00.000+00:00",
    "status": "absent",
    "course_id": 1,
    "student_id": 2
    }
To Submit Multiple Course Attendance -->> Post:http://localhost:8080/courseAttendances/submitAll Body--> [{
             

    "attendanceDate": "2003-10-29T22:00:00.000+00:00",
    "status": "absent",
    "course_id": 1,


    "student_id": 2
    },
    {
             

    "attendanceDate": "2003-10-29T22:00:00.000+00:00",
    "status": "absent",
    "course_id": 1,


    "student_id": 3
    }]
To View Student Enrolled Courses -->> Get:http://localhost:8080/students/{studentId}/courses

To View Assignments -->> Get:http://localhost:8080/assignments
