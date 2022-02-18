// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RetentionPolicyResponse {
    /**
     * The number of days to retain an untagged manifest after which it gets purged.
     * 
     */
    private final @Nullable Integer days;
    /**
     * The timestamp when the policy was last updated.
     * 
     */
    private final String lastUpdatedTime;
    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"days","lastUpdatedTime","status"})
    private RetentionPolicyResponse(
        @Nullable Integer days,
        String lastUpdatedTime,
        @Nullable String status) {
        this.days = days;
        this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
        this.status = status;
    }

    /**
     * The number of days to retain an untagged manifest after which it gets purged.
     * 
     */
    public Optional<Integer> getDays() {
        return Optional.ofNullable(this.days);
    }
    /**
     * The timestamp when the policy was last updated.
     * 
     */
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private String lastUpdatedTime;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.status = defaults.status;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = days;
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public RetentionPolicyResponse build() {
            return new RetentionPolicyResponse(days, lastUpdatedTime, status);
        }
    }
}
