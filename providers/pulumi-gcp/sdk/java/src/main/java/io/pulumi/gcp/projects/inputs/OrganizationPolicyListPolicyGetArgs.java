// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyAllowGetArgs;
import io.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyDenyGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyGetArgs Empty = new OrganizationPolicyListPolicyGetArgs();

    /**
     * or `deny` - (Optional) One or the other must be set.
     * 
     */
    @Import(name="allow")
      private final @Nullable Output<OrganizationPolicyListPolicyAllowGetArgs> allow;

    public Output<OrganizationPolicyListPolicyAllowGetArgs> getAllow() {
        return this.allow == null ? Output.empty() : this.allow;
    }

    @Import(name="deny")
      private final @Nullable Output<OrganizationPolicyListPolicyDenyGetArgs> deny;

    public Output<OrganizationPolicyListPolicyDenyGetArgs> getDeny() {
        return this.deny == null ? Output.empty() : this.deny;
    }

    /**
     * If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    @Import(name="inheritFromParent")
      private final @Nullable Output<Boolean> inheritFromParent;

    public Output<Boolean> getInheritFromParent() {
        return this.inheritFromParent == null ? Output.empty() : this.inheritFromParent;
    }

    /**
     * The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    @Import(name="suggestedValue")
      private final @Nullable Output<String> suggestedValue;

    public Output<String> getSuggestedValue() {
        return this.suggestedValue == null ? Output.empty() : this.suggestedValue;
    }

    public OrganizationPolicyListPolicyGetArgs(
        @Nullable Output<OrganizationPolicyListPolicyAllowGetArgs> allow,
        @Nullable Output<OrganizationPolicyListPolicyDenyGetArgs> deny,
        @Nullable Output<Boolean> inheritFromParent,
        @Nullable Output<String> suggestedValue) {
        this.allow = allow;
        this.deny = deny;
        this.inheritFromParent = inheritFromParent;
        this.suggestedValue = suggestedValue;
    }

    private OrganizationPolicyListPolicyGetArgs() {
        this.allow = Output.empty();
        this.deny = Output.empty();
        this.inheritFromParent = Output.empty();
        this.suggestedValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyListPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OrganizationPolicyListPolicyAllowGetArgs> allow;
        private @Nullable Output<OrganizationPolicyListPolicyDenyGetArgs> deny;
        private @Nullable Output<Boolean> inheritFromParent;
        private @Nullable Output<String> suggestedValue;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyListPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        public Builder allow(@Nullable Output<OrganizationPolicyListPolicyAllowGetArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder allow(@Nullable OrganizationPolicyListPolicyAllowGetArgs allow) {
            this.allow = Output.ofNullable(allow);
            return this;
        }

        public Builder deny(@Nullable Output<OrganizationPolicyListPolicyDenyGetArgs> deny) {
            this.deny = deny;
            return this;
        }

        public Builder deny(@Nullable OrganizationPolicyListPolicyDenyGetArgs deny) {
            this.deny = Output.ofNullable(deny);
            return this;
        }

        public Builder inheritFromParent(@Nullable Output<Boolean> inheritFromParent) {
            this.inheritFromParent = inheritFromParent;
            return this;
        }

        public Builder inheritFromParent(@Nullable Boolean inheritFromParent) {
            this.inheritFromParent = Output.ofNullable(inheritFromParent);
            return this;
        }

        public Builder suggestedValue(@Nullable Output<String> suggestedValue) {
            this.suggestedValue = suggestedValue;
            return this;
        }

        public Builder suggestedValue(@Nullable String suggestedValue) {
            this.suggestedValue = Output.ofNullable(suggestedValue);
            return this;
        }
        public OrganizationPolicyListPolicyGetArgs build() {
            return new OrganizationPolicyListPolicyGetArgs(allow, deny, inheritFromParent, suggestedValue);
        }
    }
}
