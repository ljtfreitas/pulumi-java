// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodeConfigSandboxConfig {
    private final String sandboxType;

    @CustomType.Constructor
    private GetClusterNodeConfigSandboxConfig(@CustomType.Parameter("sandboxType") String sandboxType) {
        this.sandboxType = sandboxType;
    }

    public String getSandboxType() {
        return this.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigSandboxConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder sandboxType(String sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }
        public GetClusterNodeConfigSandboxConfig build() {
            return new GetClusterNodeConfigSandboxConfig(sandboxType);
        }
    }
}
