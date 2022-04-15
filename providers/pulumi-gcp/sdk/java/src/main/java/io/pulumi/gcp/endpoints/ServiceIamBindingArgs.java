// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceIamBindingArgs Empty = new ServiceIamBindingArgs();

    @Import(name="condition")
      private final @Nullable Output<ServiceIamBindingConditionArgs> condition;

    public Output<ServiceIamBindingConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.endpoints.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    public ServiceIamBindingArgs(
        @Nullable Output<ServiceIamBindingConditionArgs> condition,
        Output<List<String>> members,
        Output<String> role,
        Output<String> serviceName) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ServiceIamBindingArgs() {
        this.condition = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private Output<String> role;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder condition(@Nullable Output<ServiceIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable ServiceIamBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public ServiceIamBindingArgs build() {
            return new ServiceIamBindingArgs(condition, members, role, serviceName);
        }
    }
}
