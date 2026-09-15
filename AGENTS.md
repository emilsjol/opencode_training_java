## Atlas Inventory Application

This is a hardware inventory management application designed as a sample codebase for training purposes with OpenCode.

### Key Facts
- **Purpose**: Simple inventory management system with browser interface and HTTP API
- **Technology Stack**: Java 17, JDK HttpServer, SQLite, Maven, JUnit 5
- **Frontend**: Vanilla HTML/CSS/JavaScript (no frameworks)
- **Architecture**: Minimalist, focused on agentic coding concepts

### Developer Commands
- Build: `mvn clean verify`
- Run: `java -jar target/inventory-app.jar`
- Test: `mvn test`
- Run single test: `mvn -Dtest=TestClassName test`

### Project Structure
- `src/main/java/com/atlas/inventory/`: Main application code
- `src/main/resources/db/`: Database schema and seed data
- `src/main/resources/static/`: Static files for browser interface
- `src/test/java/com/atlas/inventory/`: Test code

### API Endpoints
- Health check: `/health`
- Inventory operations: `/inventory` (CRUD)
- JSON responses with form-urlencoded request bodies

### Environment
- Runs on port 8080 by default
- Supports environment variables for configuration (port, database path)

### Usage Notes
- Designed for agentic training with OpenCode
- No external frameworks or build tools
- Simple REST API with browser interface
- Focus on understanding, testing, and modifying code

### Important Constraints
- Must use exact commands above
- No framework dependencies
- Follow repository conventions strictly

### Testing
- Use `mvn test` for full test suite
- Use `mvn -Dtest=TestClassName test` for specific tests
- Test with default SQLite database

### Development Workflow
1. Build with `mvn clean verify`
2. Run with `java -jar target/inventory-app.jar`
3. Test with `mvn test`
4. Verify changes with `mvn clean verify` again

### Gotchas
- No build tools or frameworks used
- Environment variables for configuration
- SQLite database used for persistence
- REST API with JSON responses
- Browser interface accessible at http://localhost:8080