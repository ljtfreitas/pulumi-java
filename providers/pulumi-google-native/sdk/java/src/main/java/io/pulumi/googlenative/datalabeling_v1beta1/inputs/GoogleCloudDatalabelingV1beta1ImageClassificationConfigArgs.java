// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datalabeling_v1beta1.enums.GoogleCloudDatalabelingV1beta1ImageClassificationConfigAnswerAggregationType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Config for image classification human labeling task.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs Empty = new GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs();

    /**
     * Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one image.
     * 
     */
    @InputImport(name="allowMultiLabel")
      private final @Nullable Input<Boolean> allowMultiLabel;

    public Input<Boolean> getAllowMultiLabel() {
        return this.allowMultiLabel == null ? Input.empty() : this.allowMultiLabel;
    }

    /**
     * Annotation spec set resource name.
     * 
     */
    @InputImport(name="annotationSpecSet", required=true)
      private final Input<String> annotationSpecSet;

    public Input<String> getAnnotationSpecSet() {
        return this.annotationSpecSet;
    }

    /**
     * Optional. The type of how to aggregate answers.
     * 
     */
    @InputImport(name="answerAggregationType")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigAnswerAggregationType> answerAggregationType;

    public Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigAnswerAggregationType> getAnswerAggregationType() {
        return this.answerAggregationType == null ? Input.empty() : this.answerAggregationType;
    }

    public GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs(
        @Nullable Input<Boolean> allowMultiLabel,
        Input<String> annotationSpecSet,
        @Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigAnswerAggregationType> answerAggregationType) {
        this.allowMultiLabel = allowMultiLabel;
        this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet, "expected parameter 'annotationSpecSet' to be non-null");
        this.answerAggregationType = answerAggregationType;
    }

    private GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs() {
        this.allowMultiLabel = Input.empty();
        this.annotationSpecSet = Input.empty();
        this.answerAggregationType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowMultiLabel;
        private Input<String> annotationSpecSet;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigAnswerAggregationType> answerAggregationType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultiLabel = defaults.allowMultiLabel;
    	      this.annotationSpecSet = defaults.annotationSpecSet;
    	      this.answerAggregationType = defaults.answerAggregationType;
        }

        public Builder setAllowMultiLabel(@Nullable Input<Boolean> allowMultiLabel) {
            this.allowMultiLabel = allowMultiLabel;
            return this;
        }

        public Builder setAllowMultiLabel(@Nullable Boolean allowMultiLabel) {
            this.allowMultiLabel = Input.ofNullable(allowMultiLabel);
            return this;
        }

        public Builder setAnnotationSpecSet(Input<String> annotationSpecSet) {
            this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
            return this;
        }

        public Builder setAnnotationSpecSet(String annotationSpecSet) {
            this.annotationSpecSet = Input.of(Objects.requireNonNull(annotationSpecSet));
            return this;
        }

        public Builder setAnswerAggregationType(@Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigAnswerAggregationType> answerAggregationType) {
            this.answerAggregationType = answerAggregationType;
            return this;
        }

        public Builder setAnswerAggregationType(@Nullable GoogleCloudDatalabelingV1beta1ImageClassificationConfigAnswerAggregationType answerAggregationType) {
            this.answerAggregationType = Input.ofNullable(answerAggregationType);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs build() {
            return new GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs(allowMultiLabel, annotationSpecSet, answerAggregationType);
        }
    }
}
