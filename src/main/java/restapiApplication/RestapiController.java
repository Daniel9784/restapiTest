package restapiApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/feedback")
public class RestapiController {
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public FeedbackForm submitFeedback(@RequestBody FeedbackForm feedbackForm) {
        return feedbackService.saveFeedback(feedbackForm);
    }
}
