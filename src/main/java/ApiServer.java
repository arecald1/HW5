import static spark.Spark.*;

public class ApiServer {
    public static void main(String[] args) {
        get("/", (req, res) -> "Welcome to CourseSearch API!");
    }
}
