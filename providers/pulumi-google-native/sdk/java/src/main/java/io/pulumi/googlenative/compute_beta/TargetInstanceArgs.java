// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.TargetInstanceNatPolicy;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetInstanceArgs Empty = new TargetInstanceArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A URL to the virtual machine instance that handles traffic for this target instance. When creating a target instance, you can provide the fully-qualified URL or a valid partial URL to the desired virtual machine. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * 
     */
    @InputImport(name="instance")
      private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default value) is supported.
     * 
     */
    @InputImport(name="natPolicy")
      private final @Nullable Input<TargetInstanceNatPolicy> natPolicy;

    public Input<TargetInstanceNatPolicy> getNatPolicy() {
        return this.natPolicy == null ? Input.empty() : this.natPolicy;
    }

    /**
     * The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public TargetInstanceArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> instance,
        @Nullable Input<String> name,
        @Nullable Input<TargetInstanceNatPolicy> natPolicy,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<String> zone) {
        this.description = description;
        this.instance = instance;
        this.name = name;
        this.natPolicy = natPolicy;
        this.network = network;
        this.project = project;
        this.requestId = requestId;
        this.zone = zone;
    }

    private TargetInstanceArgs() {
        this.description = Input.empty();
        this.instance = Input.empty();
        this.name = Input.empty();
        this.natPolicy = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> name;
        private @Nullable Input<TargetInstanceNatPolicy> natPolicy;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.natPolicy = defaults.natPolicy;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.zone = defaults.zone;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNatPolicy(@Nullable Input<TargetInstanceNatPolicy> natPolicy) {
            this.natPolicy = natPolicy;
            return this;
        }

        public Builder setNatPolicy(@Nullable TargetInstanceNatPolicy natPolicy) {
            this.natPolicy = Input.ofNullable(natPolicy);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public TargetInstanceArgs build() {
            return new TargetInstanceArgs(description, instance, name, natPolicy, network, project, requestId, zone);
        }
    }
}
