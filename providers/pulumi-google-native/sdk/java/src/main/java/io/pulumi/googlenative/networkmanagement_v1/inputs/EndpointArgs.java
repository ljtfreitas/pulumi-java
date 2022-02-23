// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networkmanagement_v1.enums.EndpointNetworkType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source or destination of the Connectivity Test.
 * 
 */
public final class EndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
     * 
     */
    @InputImport(name="cloudSqlInstance")
      private final @Nullable Input<String> cloudSqlInstance;

    public Input<String> getCloudSqlInstance() {
        return this.cloudSqlInstance == null ? Input.empty() : this.cloudSqlInstance;
    }

    /**
     * A cluster URI for [Google Kubernetes Engine master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
     * 
     */
    @InputImport(name="gkeMasterCluster")
      private final @Nullable Input<String> gkeMasterCluster;

    public Input<String> getGkeMasterCluster() {
        return this.gkeMasterCluster == null ? Input.empty() : this.gkeMasterCluster;
    }

    /**
     * A Compute Engine instance URI.
     * 
     */
    @InputImport(name="instance")
      private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is only allowed when the test's destination is a [global load balancer VIP](/load-balancing/docs/load-balancing-overview).
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * A Compute Engine network URI.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Type of the network where the endpoint is located. Applicable only to source endpoint, as destination network type can be inferred from the source.
     * 
     */
    @InputImport(name="networkType")
      private final @Nullable Input<EndpointNetworkType> networkType;

    public Input<EndpointNetworkType> getNetworkType() {
        return this.networkType == null ? Input.empty() : this.networkType;
    }

    /**
     * The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Project ID where the endpoint is located. The Project ID can be derived from the URI if you provide a VM instance or network URI. The following are two cases where you must provide the project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2. When you are using Shared VPC and the IP address that you provide is from the service project. In this case, the network that the IP address resides in is defined in the host project.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public EndpointArgs(
        @Nullable Input<String> cloudSqlInstance,
        @Nullable Input<String> gkeMasterCluster,
        @Nullable Input<String> instance,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> network,
        @Nullable Input<EndpointNetworkType> networkType,
        @Nullable Input<Integer> port,
        @Nullable Input<String> project) {
        this.cloudSqlInstance = cloudSqlInstance;
        this.gkeMasterCluster = gkeMasterCluster;
        this.instance = instance;
        this.ipAddress = ipAddress;
        this.network = network;
        this.networkType = networkType;
        this.port = port;
        this.project = project;
    }

    private EndpointArgs() {
        this.cloudSqlInstance = Input.empty();
        this.gkeMasterCluster = Input.empty();
        this.instance = Input.empty();
        this.ipAddress = Input.empty();
        this.network = Input.empty();
        this.networkType = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudSqlInstance;
        private @Nullable Input<String> gkeMasterCluster;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> network;
        private @Nullable Input<EndpointNetworkType> networkType;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.gkeMasterCluster = defaults.gkeMasterCluster;
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.network = defaults.network;
    	      this.networkType = defaults.networkType;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
        }

        public Builder setCloudSqlInstance(@Nullable Input<String> cloudSqlInstance) {
            this.cloudSqlInstance = cloudSqlInstance;
            return this;
        }

        public Builder setCloudSqlInstance(@Nullable String cloudSqlInstance) {
            this.cloudSqlInstance = Input.ofNullable(cloudSqlInstance);
            return this;
        }

        public Builder setGkeMasterCluster(@Nullable Input<String> gkeMasterCluster) {
            this.gkeMasterCluster = gkeMasterCluster;
            return this;
        }

        public Builder setGkeMasterCluster(@Nullable String gkeMasterCluster) {
            this.gkeMasterCluster = Input.ofNullable(gkeMasterCluster);
            return this;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNetworkType(@Nullable Input<EndpointNetworkType> networkType) {
            this.networkType = networkType;
            return this;
        }

        public Builder setNetworkType(@Nullable EndpointNetworkType networkType) {
            this.networkType = Input.ofNullable(networkType);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public EndpointArgs build() {
            return new EndpointArgs(cloudSqlInstance, gkeMasterCluster, instance, ipAddress, network, networkType, port, project);
        }
    }
}
