// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.ServicePerimeterPerimeterType;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.ServicePerimeterConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterArgs Empty = new ServicePerimeterArgs();

    @Import(name="accessPolicyId", required=true)
      private final Output<String> accessPolicyId;

    public Output<String> getAccessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy}/servicePerimeters/{service_perimeter}`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
     * 
     */
    @Import(name="perimeterType")
      private final @Nullable Output<ServicePerimeterPerimeterType> perimeterType;

    public Output<ServicePerimeterPerimeterType> getPerimeterType() {
        return this.perimeterType == null ? Output.empty() : this.perimeterType;
    }

    /**
     * Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the "use_explicit_dry_run_spec" flag is set.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<ServicePerimeterConfigArgs> spec;

    public Output<ServicePerimeterConfigArgs> getSpec() {
        return this.spec == null ? Output.empty() : this.spec;
    }

    /**
     * Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<ServicePerimeterConfigArgs> status;

    public Output<ServicePerimeterConfigArgs> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration ("spec") to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config ("status") without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    @Import(name="useExplicitDryRunSpec")
      private final @Nullable Output<Boolean> useExplicitDryRunSpec;

    public Output<Boolean> getUseExplicitDryRunSpec() {
        return this.useExplicitDryRunSpec == null ? Output.empty() : this.useExplicitDryRunSpec;
    }

    public ServicePerimeterArgs(
        Output<String> accessPolicyId,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<ServicePerimeterPerimeterType> perimeterType,
        @Nullable Output<ServicePerimeterConfigArgs> spec,
        @Nullable Output<ServicePerimeterConfigArgs> status,
        @Nullable Output<String> title,
        @Nullable Output<Boolean> useExplicitDryRunSpec) {
        this.accessPolicyId = Objects.requireNonNull(accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
        this.description = description;
        this.name = name;
        this.perimeterType = perimeterType;
        this.spec = spec;
        this.status = status;
        this.title = title;
        this.useExplicitDryRunSpec = useExplicitDryRunSpec;
    }

    private ServicePerimeterArgs() {
        this.accessPolicyId = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
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
        private Output<String> accessPolicyId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<ServicePerimeterPerimeterType> perimeterType;
        private @Nullable Output<ServicePerimeterConfigArgs> spec;
        private @Nullable Output<ServicePerimeterConfigArgs> status;
        private @Nullable Output<String> title;
        private @Nullable Output<Boolean> useExplicitDryRunSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyId = defaults.accessPolicyId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.perimeterType = defaults.perimeterType;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.useExplicitDryRunSpec = defaults.useExplicitDryRunSpec;
        }

        public Builder accessPolicyId(Output<String> accessPolicyId) {
            this.accessPolicyId = Objects.requireNonNull(accessPolicyId);
            return this;
        }

        public Builder accessPolicyId(String accessPolicyId) {
            this.accessPolicyId = Output.of(Objects.requireNonNull(accessPolicyId));
            return this;
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

        public Builder perimeterType(@Nullable Output<ServicePerimeterPerimeterType> perimeterType) {
            this.perimeterType = perimeterType;
            return this;
        }

        public Builder perimeterType(@Nullable ServicePerimeterPerimeterType perimeterType) {
            this.perimeterType = Output.ofNullable(perimeterType);
            return this;
        }

        public Builder spec(@Nullable Output<ServicePerimeterConfigArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder spec(@Nullable ServicePerimeterConfigArgs spec) {
            this.spec = Output.ofNullable(spec);
            return this;
        }

        public Builder status(@Nullable Output<ServicePerimeterConfigArgs> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable ServicePerimeterConfigArgs status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
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
            return new ServicePerimeterArgs(accessPolicyId, description, name, perimeterType, spec, status, title, useExplicitDryRunSpec);
        }
    }
}
