// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClassificationJobUserPausedDetail {
    private final @Nullable String jobExpiresAt;
    private final @Nullable String jobImminentExpirationHealthEventArn;
    private final @Nullable String jobPausedAt;

    @OutputCustomType.Constructor({"jobExpiresAt","jobImminentExpirationHealthEventArn","jobPausedAt"})
    private ClassificationJobUserPausedDetail(
        @Nullable String jobExpiresAt,
        @Nullable String jobImminentExpirationHealthEventArn,
        @Nullable String jobPausedAt) {
        this.jobExpiresAt = jobExpiresAt;
        this.jobImminentExpirationHealthEventArn = jobImminentExpirationHealthEventArn;
        this.jobPausedAt = jobPausedAt;
    }

    public Optional<String> getJobExpiresAt() {
        return Optional.ofNullable(this.jobExpiresAt);
    }
    public Optional<String> getJobImminentExpirationHealthEventArn() {
        return Optional.ofNullable(this.jobImminentExpirationHealthEventArn);
    }
    public Optional<String> getJobPausedAt() {
        return Optional.ofNullable(this.jobPausedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobUserPausedDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobExpiresAt;
        private @Nullable String jobImminentExpirationHealthEventArn;
        private @Nullable String jobPausedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobUserPausedDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobExpiresAt = defaults.jobExpiresAt;
    	      this.jobImminentExpirationHealthEventArn = defaults.jobImminentExpirationHealthEventArn;
    	      this.jobPausedAt = defaults.jobPausedAt;
        }

        public Builder setJobExpiresAt(@Nullable String jobExpiresAt) {
            this.jobExpiresAt = jobExpiresAt;
            return this;
        }

        public Builder setJobImminentExpirationHealthEventArn(@Nullable String jobImminentExpirationHealthEventArn) {
            this.jobImminentExpirationHealthEventArn = jobImminentExpirationHealthEventArn;
            return this;
        }

        public Builder setJobPausedAt(@Nullable String jobPausedAt) {
            this.jobPausedAt = jobPausedAt;
            return this;
        }
        public ClassificationJobUserPausedDetail build() {
            return new ClassificationJobUserPausedDetail(jobExpiresAt, jobImminentExpirationHealthEventArn, jobPausedAt);
        }
    }
}
