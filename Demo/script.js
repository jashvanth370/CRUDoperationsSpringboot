function getStudents() {
    fetch("http://localhost:8080/students/get") // API endpoint to get students
        .then((response) => response.json())
        .then((data) => {
            const studentsContainer = document.getElementById("studentsContainer");
            studentsContainer.innerHTML = ""; // Clear any previous data

            if (data.length === 0) {
                studentsContainer.innerHTML = "<p>No students found.</p>";
            } else {
                data.forEach((student) => {
                    const studentDiv = document.createElement("div");
                    studentDiv.classList.add("student");
                    studentDiv.innerHTML = `
                        <strong>ID:</strong> ${student.id} <br>
                        <strong>stuName:</strong> ${student.stuName} <br>
                        <strong>Gender</strong> ${student.gender} <br>
                        <strong>Email</strong> ${student.email} <br>
                        <hr>
                    `;
                    studentsContainer.appendChild(studentDiv);
                });
            }
        })
        .catch((error) => {
            console.error("Error fetching students:", error);
            const studentsContainer = document.getElementById("studentsContainer");
            studentsContainer.innerHTML = "<p>There was an error fetching the student data.</p>";
        });
}
