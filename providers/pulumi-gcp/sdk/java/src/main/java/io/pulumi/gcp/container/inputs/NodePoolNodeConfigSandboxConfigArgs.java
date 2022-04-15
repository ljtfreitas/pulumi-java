// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class NodePoolNodeConfigSandboxConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigSandboxConfigArgs Empty = new NodePoolNodeConfigSandboxConfigArgs();

    @Import(name="sandboxType", required=true)
      private final Output<String> sandboxType;

    public Output<String> sandboxType() {
        return this.sandboxType;
    }

    public NodePoolNodeConfigSandboxConfigArgs(Output<String> sandboxType) {
        this.sandboxType = Objects.requireNonNull(sandboxType, "expected parameter 'sandboxType' to be non-null");
    }

    private NodePoolNodeConfigSandboxConfigArgs() {
        this.sandboxType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigSandboxConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigSandboxConfigArgs defaults) {
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
        }        public NodePoolNodeConfigSandboxConfigArgs build() {
            return new NodePoolNodeConfigSandboxConfigArgs(sandboxType);
        }
    }
}
