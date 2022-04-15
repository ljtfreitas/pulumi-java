// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIamBindingArgs Empty = new CaPoolIamBindingArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="caPool", required=true)
      private final Output<String> caPool;

    public Output<String> caPool() {
        return this.caPool;
    }

    @Import(name="condition")
      private final @Nullable Output<CaPoolIamBindingConditionArgs> condition;

    public Output<CaPoolIamBindingConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * Location of the CaPool. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.certificateauthority.CaPoolIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    public CaPoolIamBindingArgs(
        Output<String> caPool,
        @Nullable Output<CaPoolIamBindingConditionArgs> condition,
        @Nullable Output<String> location,
        Output<List<String>> members,
        @Nullable Output<String> project,
        Output<String> role) {
        this.caPool = Objects.requireNonNull(caPool, "expected parameter 'caPool' to be non-null");
        this.condition = condition;
        this.location = location;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private CaPoolIamBindingArgs() {
        this.caPool = Codegen.empty();
        this.condition = Codegen.empty();
        this.location = Codegen.empty();
        this.members = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> caPool;
        private @Nullable Output<CaPoolIamBindingConditionArgs> condition;
        private @Nullable Output<String> location;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPool = defaults.caPool;
    	      this.condition = defaults.condition;
    	      this.location = defaults.location;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder caPool(Output<String> caPool) {
            this.caPool = Objects.requireNonNull(caPool);
            return this;
        }
        public Builder caPool(String caPool) {
            this.caPool = Output.of(Objects.requireNonNull(caPool));
            return this;
        }
        public Builder condition(@Nullable Output<CaPoolIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable CaPoolIamBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public CaPoolIamBindingArgs build() {
            return new CaPoolIamBindingArgs(caPool, condition, location, members, project, role);
        }
    }
}
