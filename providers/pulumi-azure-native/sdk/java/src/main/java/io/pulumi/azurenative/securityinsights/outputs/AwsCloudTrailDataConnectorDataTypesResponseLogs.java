// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AwsCloudTrailDataConnectorDataTypesResponseLogs {
    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    private final @Nullable String state;

    @OutputCustomType.Constructor({"state"})
    private AwsCloudTrailDataConnectorDataTypesResponseLogs(@Nullable String state) {
        this.state = state;
    }

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCloudTrailDataConnectorDataTypesResponseLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsCloudTrailDataConnectorDataTypesResponseLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public AwsCloudTrailDataConnectorDataTypesResponseLogs build() {
            return new AwsCloudTrailDataConnectorDataTypesResponseLogs(state);
        }
    }
}
