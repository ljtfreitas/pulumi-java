// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFeedbackMessageResult {
    /**
     * String content of the feedback. Maximum of 10000 characters.
     * 
     */
    private final String body;
    /**
     * Create time.
     * 
     */
    private final String createTime;
    /**
     * The image storing this feedback if the feedback is an image representing operator's comments.
     * 
     */
    private final String image;
    /**
     * Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}'
     * 
     */
    private final String name;
    private final GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata;
    private final GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata;

    @OutputCustomType.Constructor({"body","createTime","image","name","operatorFeedbackMetadata","requesterFeedbackMetadata"})
    private GetFeedbackMessageResult(
        String body,
        String createTime,
        String image,
        String name,
        GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata,
        GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata) {
        this.body = Objects.requireNonNull(body);
        this.createTime = Objects.requireNonNull(createTime);
        this.image = Objects.requireNonNull(image);
        this.name = Objects.requireNonNull(name);
        this.operatorFeedbackMetadata = Objects.requireNonNull(operatorFeedbackMetadata);
        this.requesterFeedbackMetadata = Objects.requireNonNull(requesterFeedbackMetadata);
    }

    /**
     * String content of the feedback. Maximum of 10000 characters.
     * 
     */
    public String getBody() {
        return this.body;
    }
    /**
     * Create time.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The image storing this feedback if the feedback is an image representing operator's comments.
     * 
     */
    public String getImage() {
        return this.image;
    }
    /**
     * Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}'
     * 
     */
    public String getName() {
        return this.name;
    }
    public GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse getOperatorFeedbackMetadata() {
        return this.operatorFeedbackMetadata;
    }
    public GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse getRequesterFeedbackMetadata() {
        return this.requesterFeedbackMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeedbackMessageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private String createTime;
        private String image;
        private String name;
        private GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata;
        private GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFeedbackMessageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.createTime = defaults.createTime;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.operatorFeedbackMetadata = defaults.operatorFeedbackMetadata;
    	      this.requesterFeedbackMetadata = defaults.requesterFeedbackMetadata;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperatorFeedbackMetadata(GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata) {
            this.operatorFeedbackMetadata = Objects.requireNonNull(operatorFeedbackMetadata);
            return this;
        }

        public Builder setRequesterFeedbackMetadata(GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata) {
            this.requesterFeedbackMetadata = Objects.requireNonNull(requesterFeedbackMetadata);
            return this;
        }
        public GetFeedbackMessageResult build() {
            return new GetFeedbackMessageResult(body, createTime, image, name, operatorFeedbackMetadata, requesterFeedbackMetadata);
        }
    }
}
