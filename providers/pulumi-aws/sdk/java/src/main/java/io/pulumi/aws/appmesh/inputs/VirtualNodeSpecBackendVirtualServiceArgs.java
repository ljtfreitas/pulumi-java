// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceArgs Empty = new VirtualNodeSpecBackendVirtualServiceArgs();

    /**
     * The client policy for the backend.
     * 
     */
    @Import(name="clientPolicy")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyArgs> clientPolicy;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyArgs> getClientPolicy() {
        return this.clientPolicy == null ? Output.empty() : this.clientPolicy;
    }

    /**
     * The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualServiceName", required=true)
      private final Output<String> virtualServiceName;

    public Output<String> getVirtualServiceName() {
        return this.virtualServiceName;
    }

    public VirtualNodeSpecBackendVirtualServiceArgs(
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyArgs> clientPolicy,
        Output<String> virtualServiceName) {
        this.clientPolicy = clientPolicy;
        this.virtualServiceName = Objects.requireNonNull(virtualServiceName, "expected parameter 'virtualServiceName' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceArgs() {
        this.clientPolicy = Output.empty();
        this.virtualServiceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyArgs> clientPolicy;
        private Output<String> virtualServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientPolicy = defaults.clientPolicy;
    	      this.virtualServiceName = defaults.virtualServiceName;
        }

        public Builder clientPolicy(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyArgs> clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }

        public Builder clientPolicy(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyArgs clientPolicy) {
            this.clientPolicy = Output.ofNullable(clientPolicy);
            return this;
        }

        public Builder virtualServiceName(Output<String> virtualServiceName) {
            this.virtualServiceName = Objects.requireNonNull(virtualServiceName);
            return this;
        }

        public Builder virtualServiceName(String virtualServiceName) {
            this.virtualServiceName = Output.of(Objects.requireNonNull(virtualServiceName));
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceArgs(clientPolicy, virtualServiceName);
        }
    }
}
