// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeedbackMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeedbackMessageArgs Empty = new FeedbackMessageArgs();

    @Import(name="annotatedDatasetId", required=true)
      private final Output<String> annotatedDatasetId;

    public Output<String> getAnnotatedDatasetId() {
        return this.annotatedDatasetId;
    }

    /**
     * String content of the feedback. Maximum of 10000 characters.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Create time.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    @Import(name="feedbackThreadId", required=true)
      private final Output<String> feedbackThreadId;

    public Output<String> getFeedbackThreadId() {
        return this.feedbackThreadId;
    }

    /**
     * The image storing this feedback if the feedback is an image representing operator's comments.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}'
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="operatorFeedbackMetadata")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataArgs> operatorFeedbackMetadata;

    public Output<GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataArgs> getOperatorFeedbackMetadata() {
        return this.operatorFeedbackMetadata == null ? Output.empty() : this.operatorFeedbackMetadata;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requesterFeedbackMetadata")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataArgs> requesterFeedbackMetadata;

    public Output<GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataArgs> getRequesterFeedbackMetadata() {
        return this.requesterFeedbackMetadata == null ? Output.empty() : this.requesterFeedbackMetadata;
    }

    public FeedbackMessageArgs(
        Output<String> annotatedDatasetId,
        @Nullable Output<String> body,
        @Nullable Output<String> createTime,
        Output<String> datasetId,
        Output<String> feedbackThreadId,
        @Nullable Output<String> image,
        @Nullable Output<String> name,
        @Nullable Output<GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataArgs> operatorFeedbackMetadata,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataArgs> requesterFeedbackMetadata) {
        this.annotatedDatasetId = Objects.requireNonNull(annotatedDatasetId, "expected parameter 'annotatedDatasetId' to be non-null");
        this.body = body;
        this.createTime = createTime;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.feedbackThreadId = Objects.requireNonNull(feedbackThreadId, "expected parameter 'feedbackThreadId' to be non-null");
        this.image = image;
        this.name = name;
        this.operatorFeedbackMetadata = operatorFeedbackMetadata;
        this.project = project;
        this.requesterFeedbackMetadata = requesterFeedbackMetadata;
    }

    private FeedbackMessageArgs() {
        this.annotatedDatasetId = Output.empty();
        this.body = Output.empty();
        this.createTime = Output.empty();
        this.datasetId = Output.empty();
        this.feedbackThreadId = Output.empty();
        this.image = Output.empty();
        this.name = Output.empty();
        this.operatorFeedbackMetadata = Output.empty();
        this.project = Output.empty();
        this.requesterFeedbackMetadata = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeedbackMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> annotatedDatasetId;
        private @Nullable Output<String> body;
        private @Nullable Output<String> createTime;
        private Output<String> datasetId;
        private Output<String> feedbackThreadId;
        private @Nullable Output<String> image;
        private @Nullable Output<String> name;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataArgs> operatorFeedbackMetadata;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataArgs> requesterFeedbackMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FeedbackMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotatedDatasetId = defaults.annotatedDatasetId;
    	      this.body = defaults.body;
    	      this.createTime = defaults.createTime;
    	      this.datasetId = defaults.datasetId;
    	      this.feedbackThreadId = defaults.feedbackThreadId;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.operatorFeedbackMetadata = defaults.operatorFeedbackMetadata;
    	      this.project = defaults.project;
    	      this.requesterFeedbackMetadata = defaults.requesterFeedbackMetadata;
        }

        public Builder annotatedDatasetId(Output<String> annotatedDatasetId) {
            this.annotatedDatasetId = Objects.requireNonNull(annotatedDatasetId);
            return this;
        }

        public Builder annotatedDatasetId(String annotatedDatasetId) {
            this.annotatedDatasetId = Output.of(Objects.requireNonNull(annotatedDatasetId));
            return this;
        }

        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable String body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder feedbackThreadId(Output<String> feedbackThreadId) {
            this.feedbackThreadId = Objects.requireNonNull(feedbackThreadId);
            return this;
        }

        public Builder feedbackThreadId(String feedbackThreadId) {
            this.feedbackThreadId = Output.of(Objects.requireNonNull(feedbackThreadId));
            return this;
        }

        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = Output.ofNullable(image);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder operatorFeedbackMetadata(@Nullable Output<GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataArgs> operatorFeedbackMetadata) {
            this.operatorFeedbackMetadata = operatorFeedbackMetadata;
            return this;
        }

        public Builder operatorFeedbackMetadata(@Nullable GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataArgs operatorFeedbackMetadata) {
            this.operatorFeedbackMetadata = Output.ofNullable(operatorFeedbackMetadata);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requesterFeedbackMetadata(@Nullable Output<GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataArgs> requesterFeedbackMetadata) {
            this.requesterFeedbackMetadata = requesterFeedbackMetadata;
            return this;
        }

        public Builder requesterFeedbackMetadata(@Nullable GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataArgs requesterFeedbackMetadata) {
            this.requesterFeedbackMetadata = Output.ofNullable(requesterFeedbackMetadata);
            return this;
        }
        public FeedbackMessageArgs build() {
            return new FeedbackMessageArgs(annotatedDatasetId, body, createTime, datasetId, feedbackThreadId, image, name, operatorFeedbackMetadata, project, requesterFeedbackMetadata);
        }
    }
}
