// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceIamBindingState Empty = new ServiceIamBindingState();

    @Import(name="condition")
      private final @Nullable Output<ServiceIamBindingConditionGetArgs> condition;

    public Output<ServiceIamBindingConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.endpoints.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    public ServiceIamBindingState(
        @Nullable Output<ServiceIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> role,
        @Nullable Output<String> serviceName) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.role = role;
        this.serviceName = serviceName;
    }

    private ServiceIamBindingState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> role;
        private @Nullable Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder condition(@Nullable Output<ServiceIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable ServiceIamBindingConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }        public ServiceIamBindingState build() {
            return new ServiceIamBindingState(condition, etag, members, role, serviceName);
        }
    }
}
