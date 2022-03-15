// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicenetworking;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeredDnsDomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeredDnsDomainArgs Empty = new PeeredDnsDomainArgs();

    /**
     * The DNS domain suffix of the peered DNS domain. Make sure to suffix with a `.` (dot).
     * 
     */
    @Import(name="dnsSuffix", required=true)
      private final Output<String> dnsSuffix;

    public Output<String> getDnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Internal name used for the peered DNS domain.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The network in the consumer project.
     * 
     */
    @Import(name="network", required=true)
      private final Output<String> network;

    public Output<String> getNetwork() {
        return this.network;
    }

    /**
     * The producer project number. If not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Private service connection between service and consumer network, defaults to `servicenetworking.googleapis.com`
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    public PeeredDnsDomainArgs(
        Output<String> dnsSuffix,
        @Nullable Output<String> name,
        Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> service) {
        this.dnsSuffix = Objects.requireNonNull(dnsSuffix, "expected parameter 'dnsSuffix' to be non-null");
        this.name = name;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.project = project;
        this.service = service;
    }

    private PeeredDnsDomainArgs() {
        this.dnsSuffix = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.project = Output.empty();
        this.service = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeredDnsDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dnsSuffix;
        private @Nullable Output<String> name;
        private Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeredDnsDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        public Builder dnsSuffix(Output<String> dnsSuffix) {
            this.dnsSuffix = Objects.requireNonNull(dnsSuffix);
            return this;
        }

        public Builder dnsSuffix(String dnsSuffix) {
            this.dnsSuffix = Output.of(Objects.requireNonNull(dnsSuffix));
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

        public Builder network(Output<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder network(String network) {
            this.network = Output.of(Objects.requireNonNull(network));
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

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public PeeredDnsDomainArgs build() {
            return new PeeredDnsDomainArgs(dnsSuffix, name, network, project, service);
        }
    }
}
