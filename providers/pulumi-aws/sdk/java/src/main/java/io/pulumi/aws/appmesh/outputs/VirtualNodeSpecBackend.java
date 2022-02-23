// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualService;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecBackend {
    /**
     * Specifies a virtual service to use as a backend for a virtual node.
     * 
     */
    private final VirtualNodeSpecBackendVirtualService virtualService;

    @OutputCustomType.Constructor({"virtualService"})
    private VirtualNodeSpecBackend(VirtualNodeSpecBackendVirtualService virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService);
    }

    /**
     * Specifies a virtual service to use as a backend for a virtual node.
     * 
     */
    public VirtualNodeSpecBackendVirtualService getVirtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendVirtualService virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder setVirtualService(VirtualNodeSpecBackendVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public VirtualNodeSpecBackend build() {
            return new VirtualNodeSpecBackend(virtualService);
        }
    }
}
