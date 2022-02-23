// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionNetworkArgs Empty = new FlexibleAppVersionNetworkArgs();

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * 
     */
    @InputImport(name="forwardedPorts")
        private final @Nullable Input<List<String>> forwardedPorts;

    public Input<List<String>> getForwardedPorts() {
        return this.forwardedPorts == null ? Input.empty() : this.forwardedPorts;
    }

    /**
     * Tag to apply to the instance during creation.
     * 
     */
    @InputImport(name="instanceTag")
        private final @Nullable Input<String> instanceTag;

    public Input<String> getInstanceTag() {
        return this.instanceTag == null ? Input.empty() : this.instanceTag;
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Enable session affinity.
     * 
     */
    @InputImport(name="sessionAffinity")
        private final @Nullable Input<Boolean> sessionAffinity;

    public Input<Boolean> getSessionAffinity() {
        return this.sessionAffinity == null ? Input.empty() : this.sessionAffinity;
    }

    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.
     * If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range.
     * If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetworkName) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network.
     * If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetworkName must be specified and the IP address is created from the IPCidrRange of the subnetwork.
     * If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    @InputImport(name="subnetwork")
        private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    public FlexibleAppVersionNetworkArgs(
        @Nullable Input<List<String>> forwardedPorts,
        @Nullable Input<String> instanceTag,
        Input<String> name,
        @Nullable Input<Boolean> sessionAffinity,
        @Nullable Input<String> subnetwork) {
        this.forwardedPorts = forwardedPorts;
        this.instanceTag = instanceTag;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sessionAffinity = sessionAffinity;
        this.subnetwork = subnetwork;
    }

    private FlexibleAppVersionNetworkArgs() {
        this.forwardedPorts = Input.empty();
        this.instanceTag = Input.empty();
        this.name = Input.empty();
        this.sessionAffinity = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> forwardedPorts;
        private @Nullable Input<String> instanceTag;
        private Input<String> name;
        private @Nullable Input<Boolean> sessionAffinity;
        private @Nullable Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardedPorts = defaults.forwardedPorts;
    	      this.instanceTag = defaults.instanceTag;
    	      this.name = defaults.name;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setForwardedPorts(@Nullable Input<List<String>> forwardedPorts) {
            this.forwardedPorts = forwardedPorts;
            return this;
        }

        public Builder setForwardedPorts(@Nullable List<String> forwardedPorts) {
            this.forwardedPorts = Input.ofNullable(forwardedPorts);
            return this;
        }

        public Builder setInstanceTag(@Nullable Input<String> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }

        public Builder setInstanceTag(@Nullable String instanceTag) {
            this.instanceTag = Input.ofNullable(instanceTag);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSessionAffinity(@Nullable Input<Boolean> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        public Builder setSessionAffinity(@Nullable Boolean sessionAffinity) {
            this.sessionAffinity = Input.ofNullable(sessionAffinity);
            return this;
        }

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }
        public FlexibleAppVersionNetworkArgs build() {
            return new FlexibleAppVersionNetworkArgs(forwardedPorts, instanceTag, name, sessionAffinity, subnetwork);
        }
    }
}
