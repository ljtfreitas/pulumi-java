// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestorIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final AttestorIamMemberState Empty = new AttestorIamMemberState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="attestor")
      private final @Nullable Output<String> attestor;

    public Output<String> getAttestor() {
        return this.attestor == null ? Output.empty() : this.attestor;
    }

    @Import(name="condition")
      private final @Nullable Output<AttestorIamMemberConditionGetArgs> condition;

    public Output<AttestorIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Output.empty() : this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.binaryauthorization.AttestorIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public AttestorIamMemberState(
        @Nullable Output<String> attestor,
        @Nullable Output<AttestorIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.attestor = attestor;
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.role = role;
    }

    private AttestorIamMemberState() {
        this.attestor = Output.empty();
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.member = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attestor;
        private @Nullable Output<AttestorIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestor = defaults.attestor;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder attestor(@Nullable Output<String> attestor) {
            this.attestor = attestor;
            return this;
        }

        public Builder attestor(@Nullable String attestor) {
            this.attestor = Output.ofNullable(attestor);
            return this;
        }

        public Builder condition(@Nullable Output<AttestorIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable AttestorIamMemberConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }

        public Builder member(@Nullable String member) {
            this.member = Output.ofNullable(member);
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

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public AttestorIamMemberState build() {
            return new AttestorIamMemberState(attestor, condition, etag, member, project, role);
        }
    }
}
