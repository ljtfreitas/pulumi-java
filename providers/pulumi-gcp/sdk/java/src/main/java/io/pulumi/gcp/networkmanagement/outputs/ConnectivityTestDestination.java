// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectivityTestDestination {
    /**
     * A Compute Engine instance URI.
     * 
     */
    private final @Nullable String instance;
    /**
     * The IP address of the endpoint, which can be an external or
     * internal IP. An IPv6 address is only allowed when the test's
     * destination is a global load balancer VIP.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * A Compute Engine network URI.
     * 
     */
    private final @Nullable String network;
    /**
     * The IP protocol port of the endpoint. Only applicable when
     * protocol is TCP or UDP.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Project ID where the endpoint is located. The Project ID can be
     * derived from the URI if you provide a VM instance or network URI.
     * The following are two cases where you must provide the project ID:
     * 1. Only the IP address is specified, and the IP address is within
     *    a GCP project. 2. When you are using Shared VPC and the IP address
     *    that you provide is from the service project. In this case, the
     *    network that the IP address resides in is defined in the host
     *    project.
     * 
     */
    private final @Nullable String projectId;

    @CustomType.Constructor
    private ConnectivityTestDestination(
        @CustomType.Parameter("instance") @Nullable String instance,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("network") @Nullable String network,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("projectId") @Nullable String projectId) {
        this.instance = instance;
        this.ipAddress = ipAddress;
        this.network = network;
        this.port = port;
        this.projectId = projectId;
    }

    /**
     * A Compute Engine instance URI.
     * 
    */
    public Optional<String> getInstance() {
        return Optional.ofNullable(this.instance);
    }
    /**
     * The IP address of the endpoint, which can be an external or
     * internal IP. An IPv6 address is only allowed when the test's
     * destination is a global load balancer VIP.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * A Compute Engine network URI.
     * 
    */
    public Optional<String> getNetwork() {
        return Optional.ofNullable(this.network);
    }
    /**
     * The IP protocol port of the endpoint. Only applicable when
     * protocol is TCP or UDP.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Project ID where the endpoint is located. The Project ID can be
     * derived from the URI if you provide a VM instance or network URI.
     * The following are two cases where you must provide the project ID:
     * 1. Only the IP address is specified, and the IP address is within
     *    a GCP project. 2. When you are using Shared VPC and the IP address
     *    that you provide is from the service project. In this case, the
     *    network that the IP address resides in is defined in the host
     *    project.
     * 
    */
    public Optional<String> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityTestDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instance;
        private @Nullable String ipAddress;
        private @Nullable String network;
        private @Nullable Integer port;
        private @Nullable String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityTestDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.projectId = defaults.projectId;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public ConnectivityTestDestination build() {
            return new ConnectivityTestDestination(instance, ipAddress, network, port, projectId);
        }
    }
}
