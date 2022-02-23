// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.JobTemplateJobRetryFailureType;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how many times a failure type should be retried.
 * 
 */
public final class JobTemplateRetryCriteria extends io.pulumi.resources.InvokeArgs {

    public static final JobTemplateRetryCriteria Empty = new JobTemplateRetryCriteria();

    @InputImport(name="failureType")
        private final @Nullable JobTemplateJobRetryFailureType failureType;

    public Optional<JobTemplateJobRetryFailureType> getFailureType() {
        return this.failureType == null ? Optional.empty() : Optional.ofNullable(this.failureType);
    }

    @InputImport(name="numberOfRetries")
        private final @Nullable Integer numberOfRetries;

    public Optional<Integer> getNumberOfRetries() {
        return this.numberOfRetries == null ? Optional.empty() : Optional.ofNullable(this.numberOfRetries);
    }

    public JobTemplateRetryCriteria(
        @Nullable JobTemplateJobRetryFailureType failureType,
        @Nullable Integer numberOfRetries) {
        this.failureType = failureType;
        this.numberOfRetries = numberOfRetries;
    }

    private JobTemplateRetryCriteria() {
        this.failureType = null;
        this.numberOfRetries = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateRetryCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobTemplateJobRetryFailureType failureType;
        private @Nullable Integer numberOfRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateRetryCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureType = defaults.failureType;
    	      this.numberOfRetries = defaults.numberOfRetries;
        }

        public Builder setFailureType(@Nullable JobTemplateJobRetryFailureType failureType) {
            this.failureType = failureType;
            return this;
        }

        public Builder setNumberOfRetries(@Nullable Integer numberOfRetries) {
            this.numberOfRetries = numberOfRetries;
            return this;
        }
        public JobTemplateRetryCriteria build() {
            return new JobTemplateRetryCriteria(failureType, numberOfRetries);
        }
    }
}
