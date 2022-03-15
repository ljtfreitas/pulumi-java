// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodePoolNodeConfigSandboxConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolNodeConfigSandboxConfig Empty = new GetClusterNodePoolNodeConfigSandboxConfig();

    @Import(name="sandboxType", required=true)
      private final String sandboxType;

    public String getSandboxType() {
        return this.sandboxType;
    }

    public GetClusterNodePoolNodeConfigSandboxConfig(String sandboxType) {
        this.sandboxType = Objects.requireNonNull(sandboxType, "expected parameter 'sandboxType' to be non-null");
    }

    private GetClusterNodePoolNodeConfigSandboxConfig() {
        this.sandboxType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigSandboxConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder sandboxType(String sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }
        public GetClusterNodePoolNodeConfigSandboxConfig build() {
            return new GetClusterNodePoolNodeConfigSandboxConfig(sandboxType);
        }
    }
}
