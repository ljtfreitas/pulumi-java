// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.projects.outputs.OrganizationPolicyListPolicyAllow;
import io.pulumi.gcp.projects.outputs.OrganizationPolicyListPolicyDeny;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrganizationPolicyListPolicy {
    /**
     * or `deny` - (Optional) One or the other must be set.
     * 
     */
    private final @Nullable OrganizationPolicyListPolicyAllow allow;
    private final @Nullable OrganizationPolicyListPolicyDeny deny;
    /**
     * If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    private final @Nullable Boolean inheritFromParent;
    /**
     * The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    private final @Nullable String suggestedValue;

    @OutputCustomType.Constructor({"allow","deny","inheritFromParent","suggestedValue"})
    private OrganizationPolicyListPolicy(
        @Nullable OrganizationPolicyListPolicyAllow allow,
        @Nullable OrganizationPolicyListPolicyDeny deny,
        @Nullable Boolean inheritFromParent,
        @Nullable String suggestedValue) {
        this.allow = allow;
        this.deny = deny;
        this.inheritFromParent = inheritFromParent;
        this.suggestedValue = suggestedValue;
    }

    /**
     * or `deny` - (Optional) One or the other must be set.
     * 
     */
    public Optional<OrganizationPolicyListPolicyAllow> getAllow() {
        return Optional.ofNullable(this.allow);
    }
    public Optional<OrganizationPolicyListPolicyDeny> getDeny() {
        return Optional.ofNullable(this.deny);
    }
    /**
     * If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    public Optional<Boolean> getInheritFromParent() {
        return Optional.ofNullable(this.inheritFromParent);
    }
    /**
     * The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    public Optional<String> getSuggestedValue() {
        return Optional.ofNullable(this.suggestedValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyListPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OrganizationPolicyListPolicyAllow allow;
        private @Nullable OrganizationPolicyListPolicyDeny deny;
        private @Nullable Boolean inheritFromParent;
        private @Nullable String suggestedValue;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyListPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        public Builder setAllow(@Nullable OrganizationPolicyListPolicyAllow allow) {
            this.allow = allow;
            return this;
        }

        public Builder setDeny(@Nullable OrganizationPolicyListPolicyDeny deny) {
            this.deny = deny;
            return this;
        }

        public Builder setInheritFromParent(@Nullable Boolean inheritFromParent) {
            this.inheritFromParent = inheritFromParent;
            return this;
        }

        public Builder setSuggestedValue(@Nullable String suggestedValue) {
            this.suggestedValue = suggestedValue;
            return this;
        }
        public OrganizationPolicyListPolicy build() {
            return new OrganizationPolicyListPolicy(allow, deny, inheritFromParent, suggestedValue);
        }
    }
}
