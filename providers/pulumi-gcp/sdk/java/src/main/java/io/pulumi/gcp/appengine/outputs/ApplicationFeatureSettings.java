// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ApplicationFeatureSettings {
    /**
     * Set to false to use the legacy health check instead of the readiness
     * and liveness checks.
     * 
     */
    private final Boolean splitHealthChecks;

    @CustomType.Constructor
    private ApplicationFeatureSettings(@CustomType.Parameter("splitHealthChecks") Boolean splitHealthChecks) {
        this.splitHealthChecks = splitHealthChecks;
    }

    /**
     * Set to false to use the legacy health check instead of the readiness
     * and liveness checks.
     * 
    */
    public Boolean getSplitHealthChecks() {
        return this.splitHealthChecks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationFeatureSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean splitHealthChecks;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationFeatureSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitHealthChecks = defaults.splitHealthChecks;
        }

        public Builder splitHealthChecks(Boolean splitHealthChecks) {
            this.splitHealthChecks = Objects.requireNonNull(splitHealthChecks);
            return this;
        }
        public ApplicationFeatureSettings build() {
            return new ApplicationFeatureSettings(splitHealthChecks);
        }
    }
}
