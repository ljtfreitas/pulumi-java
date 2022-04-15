// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkmanagement;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs;
import io.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectivityTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectivityTestArgs Empty = new ConnectivityTestArgs();

    /**
     * The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, Compute
     * Engine VM instance, or VPC network to uniquely identify the
     * destination location.
     * Even if the destination IP address is not unique, the source IP
     * location is unique. Usually, the analysis can infer the destination
     * endpoint from route information.
     * If the destination you specify is a VM instance and the instance has
     * multiple network interfaces, then you must also specify either a
     * destination IP address or VPC network to identify the destination
     * interface.
     * A reachability analysis proceeds even if the destination location
     * is ambiguous. However, the result can include endpoints that you
     * don't intend to test.
     * Structure is documented below.
     * 
     */
    @Import(name="destination", required=true)
      private final Output<ConnectivityTestDestinationArgs> destination;

    public Output<ConnectivityTestDestinationArgs> destination() {
        return this.destination;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Unique name for the connectivity test.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * IP Protocol of the test. When not provided, "TCP" is assumed.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     * 
     */
    @Import(name="relatedProjects")
      private final @Nullable Output<List<String>> relatedProjects;

    public Output<List<String>> relatedProjects() {
        return this.relatedProjects == null ? Codegen.empty() : this.relatedProjects;
    }

    /**
     * Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, virtual machine
     * (VM) instance, or Compute Engine network to uniquely identify the
     * source location.
     * Examples: If the source IP address is an internal IP address within
     * a Google Cloud Virtual Private Cloud (VPC) network, then you must
     * also specify the VPC network. Otherwise, specify the VM instance,
     * which already contains its internal IP address and VPC network
     * information.
     * If the source of the test is within an on-premises network, then
     * you must provide the destination VPC network.
     * If the source endpoint is a Compute Engine VM instance with multiple
     * network interfaces, the instance itself is not sufficient to
     * identify the endpoint. So, you must also specify the source IP
     * address or VPC network.
     * A reachability analysis proceeds even if the source location is
     * ambiguous. However, the test result may include endpoints that
     * you don't intend to test.
     * Structure is documented below.
     * 
     */
    @Import(name="source", required=true)
      private final Output<ConnectivityTestSourceArgs> source;

    public Output<ConnectivityTestSourceArgs> source() {
        return this.source;
    }

    public ConnectivityTestArgs(
        @Nullable Output<String> description,
        Output<ConnectivityTestDestinationArgs> destination,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> protocol,
        @Nullable Output<List<String>> relatedProjects,
        Output<ConnectivityTestSourceArgs> source) {
        this.description = description;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.protocol = protocol;
        this.relatedProjects = relatedProjects;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private ConnectivityTestArgs() {
        this.description = Codegen.empty();
        this.destination = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.protocol = Codegen.empty();
        this.relatedProjects = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<ConnectivityTestDestinationArgs> destination;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> protocol;
        private @Nullable Output<List<String>> relatedProjects;
        private Output<ConnectivityTestSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.protocol = defaults.protocol;
    	      this.relatedProjects = defaults.relatedProjects;
    	      this.source = defaults.source;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destination(Output<ConnectivityTestDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(ConnectivityTestDestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder relatedProjects(@Nullable Output<List<String>> relatedProjects) {
            this.relatedProjects = relatedProjects;
            return this;
        }
        public Builder relatedProjects(@Nullable List<String> relatedProjects) {
            this.relatedProjects = Codegen.ofNullable(relatedProjects);
            return this;
        }
        public Builder relatedProjects(String... relatedProjects) {
            return relatedProjects(List.of(relatedProjects));
        }
        public Builder source(Output<ConnectivityTestSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(ConnectivityTestSourceArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }        public ConnectivityTestArgs build() {
            return new ConnectivityTestArgs(description, destination, labels, name, project, protocol, relatedProjects, source);
        }
    }
}
