// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicenetworking;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeredDnsDomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeredDnsDomainArgs Empty = new PeeredDnsDomainArgs();

    /**
     * The DNS domain suffix of the peered DNS domain. Make sure to suffix with a `.` (dot).
     * 
     */
    @InputImport(name="dnsSuffix", required=true)
        private final Input<String> dnsSuffix;

    public Input<String> getDnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Internal name used for the peered DNS domain.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network in the consumer project.
     * 
     */
    @InputImport(name="network", required=true)
        private final Input<String> network;

    public Input<String> getNetwork() {
        return this.network;
    }

    /**
     * The producer project number. If not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Private service connection between service and consumer network, defaults to `servicenetworking.googleapis.com`
     * 
     */
    @InputImport(name="service")
        private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public PeeredDnsDomainArgs(
        Input<String> dnsSuffix,
        @Nullable Input<String> name,
        Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> service) {
        this.dnsSuffix = Objects.requireNonNull(dnsSuffix, "expected parameter 'dnsSuffix' to be non-null");
        this.name = name;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.project = project;
        this.service = service;
    }

    private PeeredDnsDomainArgs() {
        this.dnsSuffix = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeredDnsDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dnsSuffix;
        private @Nullable Input<String> name;
        private Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> service;

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

        public Builder setDnsSuffix(Input<String> dnsSuffix) {
            this.dnsSuffix = Objects.requireNonNull(dnsSuffix);
            return this;
        }

        public Builder setDnsSuffix(String dnsSuffix) {
            this.dnsSuffix = Input.of(Objects.requireNonNull(dnsSuffix));
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

        public Builder setNetwork(Input<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Input.of(Objects.requireNonNull(network));
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

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }
        public PeeredDnsDomainArgs build() {
            return new PeeredDnsDomainArgs(dnsSuffix, name, network, project, service);
        }
    }
}
