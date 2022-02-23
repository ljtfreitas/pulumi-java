// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceGetArgs();

    /**
     * The client policy for the backend.
     * 
     */
    @InputImport(name="clientPolicy")
    private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs> clientPolicy;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs> getClientPolicy() {
        return this.clientPolicy == null ? Input.empty() : this.clientPolicy;
    }

    /**
     * The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="virtualServiceName", required=true)
    private final Input<String> virtualServiceName;

    public Input<String> getVirtualServiceName() {
        return this.virtualServiceName;
    }

    public VirtualNodeSpecBackendVirtualServiceGetArgs(
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs> clientPolicy,
        Input<String> virtualServiceName) {
        this.clientPolicy = clientPolicy;
        this.virtualServiceName = Objects.requireNonNull(virtualServiceName, "expected parameter 'virtualServiceName' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceGetArgs() {
        this.clientPolicy = Input.empty();
        this.virtualServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs> clientPolicy;
        private Input<String> virtualServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientPolicy = defaults.clientPolicy;
    	      this.virtualServiceName = defaults.virtualServiceName;
        }

        public Builder setClientPolicy(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs> clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }

        public Builder setClientPolicy(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs clientPolicy) {
            this.clientPolicy = Input.ofNullable(clientPolicy);
            return this;
        }

        public Builder setVirtualServiceName(Input<String> virtualServiceName) {
            this.virtualServiceName = Objects.requireNonNull(virtualServiceName);
            return this;
        }

        public Builder setVirtualServiceName(String virtualServiceName) {
            this.virtualServiceName = Input.of(Objects.requireNonNull(virtualServiceName));
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceGetArgs(clientPolicy, virtualServiceName);
        }
    }
}
