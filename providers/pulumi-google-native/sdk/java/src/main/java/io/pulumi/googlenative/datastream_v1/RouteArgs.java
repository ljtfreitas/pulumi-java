// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * Destination address for connection
     * 
     */
    @Import(name="destinationAddress", required=true)
      private final Output<String> destinationAddress;

    public Output<String> getDestinationAddress() {
        return this.destinationAddress;
    }

    /**
     * Destination port for connection
     * 
     */
    @Import(name="destinationPort")
      private final @Nullable Output<Integer> destinationPort;

    public Output<Integer> getDestinationPort() {
        return this.destinationPort == null ? Output.empty() : this.destinationPort;
    }

    /**
     * Display name.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="privateConnectionId", required=true)
      private final Output<String> privateConnectionId;

    public Output<String> getPrivateConnectionId() {
        return this.privateConnectionId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    @Import(name="routeId", required=true)
      private final Output<String> routeId;

    public Output<String> getRouteId() {
        return this.routeId;
    }

    public RouteArgs(
        Output<String> destinationAddress,
        @Nullable Output<Integer> destinationPort,
        Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        Output<String> privateConnectionId,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        Output<String> routeId) {
        this.destinationAddress = Objects.requireNonNull(destinationAddress, "expected parameter 'destinationAddress' to be non-null");
        this.destinationPort = destinationPort;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.labels = labels;
        this.location = location;
        this.privateConnectionId = Objects.requireNonNull(privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
        this.project = project;
        this.requestId = requestId;
        this.routeId = Objects.requireNonNull(routeId, "expected parameter 'routeId' to be non-null");
    }

    private RouteArgs() {
        this.destinationAddress = Output.empty();
        this.destinationPort = Output.empty();
        this.displayName = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.privateConnectionId = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.routeId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationAddress;
        private @Nullable Output<Integer> destinationPort;
        private Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private Output<String> privateConnectionId;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private Output<String> routeId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationPort = defaults.destinationPort;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.privateConnectionId = defaults.privateConnectionId;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.routeId = defaults.routeId;
        }

        public Builder destinationAddress(Output<String> destinationAddress) {
            this.destinationAddress = Objects.requireNonNull(destinationAddress);
            return this;
        }

        public Builder destinationAddress(String destinationAddress) {
            this.destinationAddress = Output.of(Objects.requireNonNull(destinationAddress));
            return this;
        }

        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Output.ofNullable(destinationPort);
            return this;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder privateConnectionId(Output<String> privateConnectionId) {
            this.privateConnectionId = Objects.requireNonNull(privateConnectionId);
            return this;
        }

        public Builder privateConnectionId(String privateConnectionId) {
            this.privateConnectionId = Output.of(Objects.requireNonNull(privateConnectionId));
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder routeId(Output<String> routeId) {
            this.routeId = Objects.requireNonNull(routeId);
            return this;
        }

        public Builder routeId(String routeId) {
            this.routeId = Output.of(Objects.requireNonNull(routeId));
            return this;
        }
        public RouteArgs build() {
            return new RouteArgs(destinationAddress, destinationPort, displayName, labels, location, privateConnectionId, project, requestId, routeId);
        }
    }
}
