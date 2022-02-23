// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies the retention policy for the log.
 * 
 */
public final class RetentionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetentionPolicyResponse Empty = new RetentionPolicyResponse();

    /**
     * the number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
     */
    @InputImport(name="days", required=true)
        private final Integer days;

    public Integer getDays() {
        return this.days;
    }

    /**
     * a value indicating whether the retention policy is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
        private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public RetentionPolicyResponse(
        Integer days,
        Boolean enabled) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private RetentionPolicyResponse() {
        this.days = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer days;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDays(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public RetentionPolicyResponse build() {
            return new RetentionPolicyResponse(days, enabled);
        }
    }
}
