// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class NodePoolNodeConfigEphemeralStorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigEphemeralStorageConfigArgs Empty = new NodePoolNodeConfigEphemeralStorageConfigArgs();

    @Import(name="localSsdCount", required=true)
      private final Output<Integer> localSsdCount;

    public Output<Integer> localSsdCount() {
        return this.localSsdCount;
    }

    public NodePoolNodeConfigEphemeralStorageConfigArgs(Output<Integer> localSsdCount) {
        this.localSsdCount = Objects.requireNonNull(localSsdCount, "expected parameter 'localSsdCount' to be non-null");
    }

    private NodePoolNodeConfigEphemeralStorageConfigArgs() {
        this.localSsdCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigEphemeralStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigEphemeralStorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder localSsdCount(Output<Integer> localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }
        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Output.of(Objects.requireNonNull(localSsdCount));
            return this;
        }        public NodePoolNodeConfigEphemeralStorageConfigArgs build() {
            return new NodePoolNodeConfigEphemeralStorageConfigArgs(localSsdCount);
        }
    }
}
