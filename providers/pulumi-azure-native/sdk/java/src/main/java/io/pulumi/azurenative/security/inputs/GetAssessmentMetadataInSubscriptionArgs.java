// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssessmentMetadataInSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssessmentMetadataInSubscriptionArgs Empty = new GetAssessmentMetadataInSubscriptionArgs();

    /**
     * The Assessment Key - Unique key for the assessment type
     * 
     */
    @Import(name="assessmentMetadataName", required=true)
      private final String assessmentMetadataName;

    public String getAssessmentMetadataName() {
        return this.assessmentMetadataName;
    }

    public GetAssessmentMetadataInSubscriptionArgs(String assessmentMetadataName) {
        this.assessmentMetadataName = Objects.requireNonNull(assessmentMetadataName, "expected parameter 'assessmentMetadataName' to be non-null");
    }

    private GetAssessmentMetadataInSubscriptionArgs() {
        this.assessmentMetadataName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssessmentMetadataInSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentMetadataName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssessmentMetadataInSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentMetadataName = defaults.assessmentMetadataName;
        }

        public Builder assessmentMetadataName(String assessmentMetadataName) {
            this.assessmentMetadataName = Objects.requireNonNull(assessmentMetadataName);
            return this;
        }
        public GetAssessmentMetadataInSubscriptionArgs build() {
            return new GetAssessmentMetadataInSubscriptionArgs(assessmentMetadataName);
        }
    }
}
