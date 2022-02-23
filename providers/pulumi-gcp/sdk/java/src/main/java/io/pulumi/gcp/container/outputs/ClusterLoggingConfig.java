// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ClusterLoggingConfig {
    /**
     * The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
     * 
     */
    private final List<String> enableComponents;

    @OutputCustomType.Constructor({"enableComponents"})
    private ClusterLoggingConfig(List<String> enableComponents) {
        this.enableComponents = Objects.requireNonNull(enableComponents);
    }

    /**
     * The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
     * 
     */
    public List<String> getEnableComponents() {
        return this.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder setEnableComponents(List<String> enableComponents) {
            this.enableComponents = Objects.requireNonNull(enableComponents);
            return this;
        }
        public ClusterLoggingConfig build() {
            return new ClusterLoggingConfig(enableComponents);
        }
    }
}
