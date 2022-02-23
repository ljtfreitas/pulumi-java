// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualNodeArgs;
import io.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualRouterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualServiceSpecProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualServiceSpecProviderArgs Empty = new VirtualServiceSpecProviderArgs();

    /**
     * The virtual node associated with a virtual service.
     * 
     */
    @InputImport(name="virtualNode")
    private final @Nullable Input<VirtualServiceSpecProviderVirtualNodeArgs> virtualNode;

    public Input<VirtualServiceSpecProviderVirtualNodeArgs> getVirtualNode() {
        return this.virtualNode == null ? Input.empty() : this.virtualNode;
    }

    /**
     * The virtual router associated with a virtual service.
     * 
     */
    @InputImport(name="virtualRouter")
    private final @Nullable Input<VirtualServiceSpecProviderVirtualRouterArgs> virtualRouter;

    public Input<VirtualServiceSpecProviderVirtualRouterArgs> getVirtualRouter() {
        return this.virtualRouter == null ? Input.empty() : this.virtualRouter;
    }

    public VirtualServiceSpecProviderArgs(
        @Nullable Input<VirtualServiceSpecProviderVirtualNodeArgs> virtualNode,
        @Nullable Input<VirtualServiceSpecProviderVirtualRouterArgs> virtualRouter) {
        this.virtualNode = virtualNode;
        this.virtualRouter = virtualRouter;
    }

    private VirtualServiceSpecProviderArgs() {
        this.virtualNode = Input.empty();
        this.virtualRouter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpecProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualServiceSpecProviderVirtualNodeArgs> virtualNode;
        private @Nullable Input<VirtualServiceSpecProviderVirtualRouterArgs> virtualRouter;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualServiceSpecProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNode = defaults.virtualNode;
    	      this.virtualRouter = defaults.virtualRouter;
        }

        public Builder setVirtualNode(@Nullable Input<VirtualServiceSpecProviderVirtualNodeArgs> virtualNode) {
            this.virtualNode = virtualNode;
            return this;
        }

        public Builder setVirtualNode(@Nullable VirtualServiceSpecProviderVirtualNodeArgs virtualNode) {
            this.virtualNode = Input.ofNullable(virtualNode);
            return this;
        }

        public Builder setVirtualRouter(@Nullable Input<VirtualServiceSpecProviderVirtualRouterArgs> virtualRouter) {
            this.virtualRouter = virtualRouter;
            return this;
        }

        public Builder setVirtualRouter(@Nullable VirtualServiceSpecProviderVirtualRouterArgs virtualRouter) {
            this.virtualRouter = Input.ofNullable(virtualRouter);
            return this;
        }
        public VirtualServiceSpecProviderArgs build() {
            return new VirtualServiceSpecProviderArgs(virtualNode, virtualRouter);
        }
    }
}
