// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.KubernetesIPConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeInfoResponse {
    /**
     * IP Configuration of the Kubernetes node.
     * 
     */
    private final @Nullable List<KubernetesIPConfigurationResponse> ipConfiguration;
    /**
     * Node name.
     * 
     */
    private final String name;
    /**
     * Node type - Master/Worker
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"ipConfiguration","name","type"})
    private NodeInfoResponse(
        @Nullable List<KubernetesIPConfigurationResponse> ipConfiguration,
        String name,
        String type) {
        this.ipConfiguration = ipConfiguration;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * IP Configuration of the Kubernetes node.
     * 
     */
    public List<KubernetesIPConfigurationResponse> getIpConfiguration() {
        return this.ipConfiguration == null ? List.of() : this.ipConfiguration;
    }
    /**
     * Node name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Node type - Master/Worker
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<KubernetesIPConfigurationResponse> ipConfiguration;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setIpConfiguration(@Nullable List<KubernetesIPConfigurationResponse> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public NodeInfoResponse build() {
            return new NodeInfoResponse(ipConfiguration, name, type);
        }
    }
}
