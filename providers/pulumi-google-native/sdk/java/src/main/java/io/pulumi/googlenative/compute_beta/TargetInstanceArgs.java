// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A URL to the virtual machine instance that handles traffic for this target instance. When creating a target instance, you can provide the fully-qualified URL or a valid partial URL to the desired virtual machine. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Output.empty() : this.instance;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default value) is supported.
     * 
     */
    @Import(name="natPolicy")
      private final @Nullable Output<TargetInstanceNatPolicy> natPolicy;

    public Output<TargetInstanceNatPolicy> getNatPolicy() {
        return this.natPolicy == null ? Output.empty() : this.natPolicy;
    }

    /**
     * The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
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

    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public TargetInstanceArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> instance,
        @Nullable Output<String> name,
        @Nullable Output<TargetInstanceNatPolicy> natPolicy,
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<String> zone) {
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
        this.description = Output.empty();
        this.instance = Output.empty();
        this.name = Output.empty();
        this.natPolicy = Output.empty();
        this.network = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> name;
        private @Nullable Output<TargetInstanceNatPolicy> natPolicy;
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> zone;

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

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = Output.ofNullable(instance);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder natPolicy(@Nullable Output<TargetInstanceNatPolicy> natPolicy) {
            this.natPolicy = natPolicy;
            return this;
        }

        public Builder natPolicy(@Nullable TargetInstanceNatPolicy natPolicy) {
            this.natPolicy = Output.ofNullable(natPolicy);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
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

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public TargetInstanceArgs build() {
            return new TargetInstanceArgs(description, instance, name, natPolicy, network, project, requestId, zone);
        }
    }
}
