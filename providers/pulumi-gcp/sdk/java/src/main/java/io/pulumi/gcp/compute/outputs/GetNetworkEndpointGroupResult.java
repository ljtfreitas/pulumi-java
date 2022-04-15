// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkEndpointGroupResult {
    /**
     * The NEG default port.
     * 
     */
    private final Integer defaultPort;
    /**
     * The NEG description.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String name;
    /**
     * The network to which all network endpoints in the NEG belong.
     * 
     */
    private final String network;
    /**
     * Type of network endpoints in this network endpoint group.
     * 
     */
    private final String networkEndpointType;
    private final @Nullable String project;
    private final @Nullable String selfLink;
    /**
     * Number of network endpoints in the network endpoint group.
     * 
     */
    private final Integer size;
    /**
     * subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    private final String subnetwork;
    private final @Nullable String zone;

    @CustomType.Constructor
    private GetNetworkEndpointGroupResult(
        @CustomType.Parameter("defaultPort") Integer defaultPort,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkEndpointType") String networkEndpointType,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("selfLink") @Nullable String selfLink,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("zone") @Nullable String zone) {
        this.defaultPort = defaultPort;
        this.description = description;
        this.id = id;
        this.name = name;
        this.network = network;
        this.networkEndpointType = networkEndpointType;
        this.project = project;
        this.selfLink = selfLink;
        this.size = size;
        this.subnetwork = subnetwork;
        this.zone = zone;
    }

    /**
     * The NEG default port.
     * 
    */
    public Integer defaultPort() {
        return this.defaultPort;
    }
    /**
     * The NEG description.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The network to which all network endpoints in the NEG belong.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * Type of network endpoints in this network endpoint group.
     * 
    */
    public String networkEndpointType() {
        return this.networkEndpointType;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }
    /**
     * Number of network endpoints in the network endpoint group.
     * 
    */
    public Integer size() {
        return this.size;
    }
    /**
     * subnetwork to which all network endpoints in the NEG belong.
     * 
    */
    public String subnetwork() {
        return this.subnetwork;
    }
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkEndpointGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultPort;
        private String description;
        private String id;
        private @Nullable String name;
        private String network;
        private String networkEndpointType;
        private @Nullable String project;
        private @Nullable String selfLink;
        private Integer size;
        private String subnetwork;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkEndpointGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.subnetwork = defaults.subnetwork;
    	      this.zone = defaults.zone;
        }

        public Builder defaultPort(Integer defaultPort) {
            this.defaultPort = Objects.requireNonNull(defaultPort);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkEndpointType(String networkEndpointType) {
            this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }        public GetNetworkEndpointGroupResult build() {
            return new GetNetworkEndpointGroupResult(defaultPort, description, id, name, network, networkEndpointType, project, selfLink, size, subnetwork, zone);
        }
    }
}
