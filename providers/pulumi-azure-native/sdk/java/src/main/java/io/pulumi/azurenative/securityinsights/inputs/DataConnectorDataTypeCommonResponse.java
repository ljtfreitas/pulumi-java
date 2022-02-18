// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Common field for data type in data connectors.
 * 
 */
public final class DataConnectorDataTypeCommonResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataConnectorDataTypeCommonResponse Empty = new DataConnectorDataTypeCommonResponse();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @InputImport(name="state")
    private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public DataConnectorDataTypeCommonResponse(@Nullable String state) {
        this.state = state;
    }

    private DataConnectorDataTypeCommonResponse() {
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataConnectorDataTypeCommonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(DataConnectorDataTypeCommonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public DataConnectorDataTypeCommonResponse build() {
            return new DataConnectorDataTypeCommonResponse(state);
        }
    }
}
