// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusterLoggingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingConfigGetArgs Empty = new ClusterLoggingConfigGetArgs();

    /**
     * The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
     * 
     */
    @Import(name="enableComponents", required=true)
      private final Output<List<String>> enableComponents;

    public Output<List<String>> enableComponents() {
        return this.enableComponents;
    }

    public ClusterLoggingConfigGetArgs(Output<List<String>> enableComponents) {
        this.enableComponents = Objects.requireNonNull(enableComponents, "expected parameter 'enableComponents' to be non-null");
    }

    private ClusterLoggingConfigGetArgs() {
        this.enableComponents = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder enableComponents(Output<List<String>> enableComponents) {
            this.enableComponents = Objects.requireNonNull(enableComponents);
            return this;
        }
        public Builder enableComponents(List<String> enableComponents) {
            this.enableComponents = Output.of(Objects.requireNonNull(enableComponents));
            return this;
        }
        public Builder enableComponents(String... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }        public ClusterLoggingConfigGetArgs build() {
            return new ClusterLoggingConfigGetArgs(enableComponents);
        }
    }
}
