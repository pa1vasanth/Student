function submitForm() {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;

    var studentData = {
        name: name,
        email: email
    };

    fetch('/students', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(studentData),
    })
        .then(response => response.json())
        .then(data => console.log('Server Response:', data))
        .catch(error => console.error('Error:', error));
}
