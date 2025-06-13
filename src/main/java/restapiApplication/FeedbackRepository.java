package restapiApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import restapiApplication.FeedbackForm;


public interface FeedbackRepository extends JpaRepository<FeedbackForm, Integer> {
}
