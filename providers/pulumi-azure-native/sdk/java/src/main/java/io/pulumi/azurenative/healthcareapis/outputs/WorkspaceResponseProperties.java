// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkspaceResponseProperties {
    private final String provisioningState;

    @OutputCustomType.Constructor({"provisioningState"})
    private WorkspaceResponseProperties(String provisioningState) {
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public WorkspaceResponseProperties build() {
            return new WorkspaceResponseProperties(provisioningState);
        }
    }
}