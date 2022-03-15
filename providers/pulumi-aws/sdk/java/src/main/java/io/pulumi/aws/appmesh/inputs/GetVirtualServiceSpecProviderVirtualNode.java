// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualServiceSpecProviderVirtualNode extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualServiceSpecProviderVirtualNode Empty = new GetVirtualServiceSpecProviderVirtualNode();

    /**
     * The name of the virtual node that is acting as a service provider.
     * 
     */
    @Import(name="virtualNodeName", required=true)
      private final String virtualNodeName;

    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public GetVirtualServiceSpecProviderVirtualNode(String virtualNodeName) {
        this.virtualNodeName = Objects.requireNonNull(virtualNodeName, "expected parameter 'virtualNodeName' to be non-null");
    }

    private GetVirtualServiceSpecProviderVirtualNode() {
        this.virtualNodeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpecProviderVirtualNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String virtualNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceSpecProviderVirtualNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodeName = defaults.virtualNodeName;
        }

        public Builder virtualNodeName(String virtualNodeName) {
            this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
            return this;
        }
        public GetVirtualServiceSpecProviderVirtualNode build() {
            return new GetVirtualServiceSpecProviderVirtualNode(virtualNodeName);
        }
    }
}
