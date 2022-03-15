// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterNodeConfigSandboxConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigSandboxConfigArgs Empty = new ClusterNodeConfigSandboxConfigArgs();

    /**
     * Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     */
    @Import(name="sandboxType", required=true)
      private final Output<String> sandboxType;

    public Output<String> getSandboxType() {
        return this.sandboxType;
    }

    public ClusterNodeConfigSandboxConfigArgs(Output<String> sandboxType) {
        this.sandboxType = Objects.requireNonNull(sandboxType, "expected parameter 'sandboxType' to be non-null");
    }

    private ClusterNodeConfigSandboxConfigArgs() {
        this.sandboxType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigSandboxConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigSandboxConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder sandboxType(Output<String> sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }

        public Builder sandboxType(String sandboxType) {
            this.sandboxType = Output.of(Objects.requireNonNull(sandboxType));
            return this;
        }
        public ClusterNodeConfigSandboxConfigArgs build() {
            return new ClusterNodeConfigSandboxConfigArgs(sandboxType);
        }
    }
}
