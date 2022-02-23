// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterNodePoolNodeConfigSandboxConfig {
    /**
     * Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     */
    private final String sandboxType;

    @OutputCustomType.Constructor({"sandboxType"})
    private ClusterNodePoolNodeConfigSandboxConfig(String sandboxType) {
        this.sandboxType = Objects.requireNonNull(sandboxType);
    }

    /**
     * Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     */
    public String getSandboxType() {
        return this.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigSandboxConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder setSandboxType(String sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }
        public ClusterNodePoolNodeConfigSandboxConfig build() {
            return new ClusterNodePoolNodeConfigSandboxConfig(sandboxType);
        }
    }
}
