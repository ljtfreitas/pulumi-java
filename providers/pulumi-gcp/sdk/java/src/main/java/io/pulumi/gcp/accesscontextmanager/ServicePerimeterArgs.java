// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterArgs Empty = new ServicePerimeterArgs();

    /**
     * Description of the ServicePerimeter and its use. Does not affect
     * behavior.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Resource name for the ServicePerimeter. The short_name component must
     * begin with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The AccessPolicy this ServicePerimeter lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    /**
     * Specifies the type of the Perimeter. There are two types: regular and
     * bridge. Regular Service Perimeter contains resources, access levels,
     * and restricted services. Every resource can be in at most
     * ONE regular Service Perimeter.
     * In addition to being in a regular service perimeter, a resource can also
     * be in zero or more perimeter bridges. A perimeter bridge only contains
     * resources. Cross project operations are permitted if all effected
     * resources share some perimeter (whether bridge or regular). Perimeter
     * Bridge does not contain access levels or services: those are governed
     * entirely by the regular perimeter that resource is in.
     * Perimeter Bridges are typically useful when building more complex
     * topologies with many independent perimeters that need to share some data
     * with a common perimeter, but should not be able to share data among
     * themselves.
     * Default value is `PERIMETER_TYPE_REGULAR`.
     * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
     * 
     */
    @Import(name="perimeterType")
      private final @Nullable Output<String> perimeterType;

    public Output<String> getPerimeterType() {
        return this.perimeterType == null ? Output.empty() : this.perimeterType;
    }

    /**
     * Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<ServicePerimeterSpecArgs> spec;

    public Output<ServicePerimeterSpecArgs> getSpec() {
        return this.spec == null ? Output.empty() : this.spec;
    }

    /**
     * ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<ServicePerimeterStatusArgs> status;

    public Output<ServicePerimeterStatusArgs> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> getTitle() {
        return this.title;
    }

    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
     * for all Service Perimeters, and that spec is identical to the status for those
     * Service Perimeters. When this flag is set, it inhibits the generation of the
     * implicit spec, thereby allowing the user to explicitly provide a
     * configuration ("spec") to use in a dry-run version of the Service Perimeter.
     * This allows the user to test changes to the enforced config ("status") without
     * actually enforcing them. This testing is done through analyzing the differences
     * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
     * bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    @Import(name="useExplicitDryRunSpec")
      private final @Nullable Output<Boolean> useExplicitDryRunSpec;

    public Output<Boolean> getUseExplicitDryRunSpec() {
        return this.useExplicitDryRunSpec == null ? Output.empty() : this.useExplicitDryRunSpec;
    }

    public ServicePerimeterArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> parent,
        @Nullable Output<String> perimeterType,
        @Nullable Output<ServicePerimeterSpecArgs> spec,
        @Nullable Output<ServicePerimeterStatusArgs> status,
        Output<String> title,
        @Nullable Output<Boolean> useExplicitDryRunSpec) {
        this.description = description;
        this.name = name;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.perimeterType = perimeterType;
        this.spec = spec;
        this.status = status;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.useExplicitDryRunSpec = useExplicitDryRunSpec;
    }

    private ServicePerimeterArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.parent = Output.empty();
        this.perimeterType = Output.empty();
        this.spec = Output.empty();
        this.status = Output.empty();
        this.title = Output.empty();
        this.useExplicitDryRunSpec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> parent;
        private @Nullable Output<String> perimeterType;
        private @Nullable Output<ServicePerimeterSpecArgs> spec;
        private @Nullable Output<ServicePerimeterStatusArgs> status;
        private Output<String> title;
        private @Nullable Output<Boolean> useExplicitDryRunSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.perimeterType = defaults.perimeterType;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.useExplicitDryRunSpec = defaults.useExplicitDryRunSpec;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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

        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }

        public Builder perimeterType(@Nullable Output<String> perimeterType) {
            this.perimeterType = perimeterType;
            return this;
        }

        public Builder perimeterType(@Nullable String perimeterType) {
            this.perimeterType = Output.ofNullable(perimeterType);
            return this;
        }

        public Builder spec(@Nullable Output<ServicePerimeterSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder spec(@Nullable ServicePerimeterSpecArgs spec) {
            this.spec = Output.ofNullable(spec);
            return this;
        }

        public Builder status(@Nullable Output<ServicePerimeterStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable ServicePerimeterStatusArgs status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }

        public Builder useExplicitDryRunSpec(@Nullable Output<Boolean> useExplicitDryRunSpec) {
            this.useExplicitDryRunSpec = useExplicitDryRunSpec;
            return this;
        }

        public Builder useExplicitDryRunSpec(@Nullable Boolean useExplicitDryRunSpec) {
            this.useExplicitDryRunSpec = Output.ofNullable(useExplicitDryRunSpec);
            return this;
        }
        public ServicePerimeterArgs build() {
            return new ServicePerimeterArgs(description, name, parent, perimeterType, spec, status, title, useExplicitDryRunSpec);
        }
    }
}
