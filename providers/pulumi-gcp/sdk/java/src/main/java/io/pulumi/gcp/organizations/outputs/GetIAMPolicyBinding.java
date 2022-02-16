// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.organizations.outputs.GetIAMPolicyBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIAMPolicyBinding {
    private final @Nullable GetIAMPolicyBindingCondition condition;
    private final List<String> members;
    private final String role;

    @OutputCustomType.Constructor({"condition","members","role"})
    private GetIAMPolicyBinding(
        @Nullable GetIAMPolicyBindingCondition condition,
        List<String> members,
        String role) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members);
        this.role = Objects.requireNonNull(role);
    }

    public Optional<GetIAMPolicyBindingCondition> getCondition() {
        return Optional.ofNullable(this.condition);
    }
    public List<String> getMembers() {
        return this.members;
    }
    public String getRole() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyBinding defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetIAMPolicyBindingCondition condition;
        private List<String> members;
        private String role;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable GetIAMPolicyBindingCondition condition) {
            this.condition = condition;
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public GetIAMPolicyBinding build() {
            return new GetIAMPolicyBinding(condition, members, role);
        }
    }
}