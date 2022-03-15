// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.inputs.GcfsConfigResponse;
import java.util.Objects;


/**
 * Subset of NodeConfig message that has defaults.
 * 
 */
public final class NodeConfigDefaultsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeConfigDefaultsResponse Empty = new NodeConfigDefaultsResponse();

    /**
     * GCFS (Google Container File System, a.k.a Riptide) options.
     * 
     */
    @Import(name="gcfsConfig", required=true)
      private final GcfsConfigResponse gcfsConfig;

    public GcfsConfigResponse getGcfsConfig() {
        return this.gcfsConfig;
    }

    public NodeConfigDefaultsResponse(GcfsConfigResponse gcfsConfig) {
        this.gcfsConfig = Objects.requireNonNull(gcfsConfig, "expected parameter 'gcfsConfig' to be non-null");
    }

    private NodeConfigDefaultsResponse() {
        this.gcfsConfig = null;
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

        public Builder gcfsConfig(GcfsConfigResponse gcfsConfig) {
            this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
            return this;
        }
        public NodeConfigDefaultsResponse build() {
            return new NodeConfigDefaultsResponse(gcfsConfig);
        }
    }
}
