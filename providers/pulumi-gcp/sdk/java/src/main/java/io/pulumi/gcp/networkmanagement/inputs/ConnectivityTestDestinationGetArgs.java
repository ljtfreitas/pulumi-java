// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectivityTestDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectivityTestDestinationGetArgs Empty = new ConnectivityTestDestinationGetArgs();

    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="projectId")
    private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    public ConnectivityTestDestinationGetArgs(
        @Nullable Input<String> instance,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> network,
        @Nullable Input<Integer> port,
        @Nullable Input<String> projectId) {
        this.instance = instance;
        this.ipAddress = ipAddress;
        this.network = network;
        this.port = port;
        this.projectId = projectId;
    }

    private ConnectivityTestDestinationGetArgs() {
        this.instance = Input.empty();
        this.ipAddress = Input.empty();
        this.network = Input.empty();
        this.port = Input.empty();
        this.projectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityTestDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instance;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> network;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityTestDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.projectId = defaults.projectId;
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

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProjectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }

        public ConnectivityTestDestinationGetArgs build() {
            return new ConnectivityTestDestinationGetArgs(instance, ipAddress, network, port, projectId);
        }
    }
}