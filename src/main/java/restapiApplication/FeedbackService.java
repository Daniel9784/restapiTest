package restapiApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public FeedbackForm saveFeedback(FeedbackForm feedbackForm) {
        feedbackForm.setCreated_at(new Date());
        return feedbackRepository.save(feedbackForm);
    }
}

