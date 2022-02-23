// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.GcfsConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class NodeConfigDefaultsResponse {
    /**
     * GCFS (Google Container File System, a.k.a Riptide) options.
     * 
     */
    private final GcfsConfigResponse gcfsConfig;

    @OutputCustomType.Constructor({"gcfsConfig"})
    private NodeConfigDefaultsResponse(GcfsConfigResponse gcfsConfig) {
        this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
    }

    /**
     * GCFS (Google Container File System, a.k.a Riptide) options.
     * 
     */
    public GcfsConfigResponse getGcfsConfig() {
        return this.gcfsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcfsConfigResponse gcfsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcfsConfig = defaults.gcfsConfig;
        }

        public Builder setGcfsConfig(GcfsConfigResponse gcfsConfig) {
            this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
            return this;
        }
        public NodeConfigDefaultsResponse build() {
            return new NodeConfigDefaultsResponse(gcfsConfig);
        }
    }
}
