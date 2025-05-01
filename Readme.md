Gmail AI Reply Generation Chrome Extension
Overview
This project is a Chrome extension that integrates with Gmail, allowing users to generate AI-powered replies to emails. The extension adds an "AI Reply" button in the Gmail reply box. When clicked, the email content is sent to a backend server built with Spring Boot, which forwards it to an AI model (like Gemini or others). The AI model processes the email and generates a response that is automatically inserted back into the reply box.


Chrome Extension



Gmail AI Reply Button


Features
Adds an "AI Reply" button to Gmail's reply interface.
Sends email content to a Spring Boot backend for AI-powered reply generation.
Automatically inserts the generated reply into the Gmail reply box.
Built using Chrome Extension API, JavaScript (for front-end), and Spring Boot (for back-end).
Technologies Used
Chrome Extension API: For creating the browser extension and interacting with Gmail.
Spring Boot: For the back-end server that processes the email content and interacts with the AI model.
AI Model: The backend sends requests to an AI model (e.g., Gemini) for reply generation.
Setup Instructions
Frontend (Chrome Extension)
Clone this repository to your local machine.
Navigate to the Chrome Extensions page: chrome://extensions/
Enable Developer mode.
Click on Load unpacked and select the folder containing the Chrome extension files.
The extension should now be loaded into Chrome, and you should see the "AI Reply" button appear in Gmail.
Backend (Spring Boot Server)
Clone this repository (or the backend folder if separated) to your local machine.
Make sure you have Java 11+ and Maven installed.
Navigate to the backend folder and run the following command:
The backend server should now be running on http://localhost:8080.
API Integration
Make sure the backend is configured to connect to the AI model (e.g., Gemini API).
Update the backend with your AI API key and the correct AI API endpoint.
Usage
After setting up both the frontend and backend, open Gmail in Chrome.
Start composing a reply to an email.
You should see the "AI Reply" button appear in the reply box.
Click the "AI Reply" button, and the extension will generate a reply using the AI model and insert it into the reply box.
Contributing
Fork this repository and submit pull requests with improvements, bug fixes, or new features.
Please ensure your code is properly formatted and add tests where necessary.
License
This project is licensed under the MIT License - see the LICENSE file for details.