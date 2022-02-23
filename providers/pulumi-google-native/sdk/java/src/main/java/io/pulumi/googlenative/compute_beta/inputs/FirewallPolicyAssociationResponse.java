// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyAssociationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyAssociationResponse Empty = new FirewallPolicyAssociationResponse();

    /**
     * The target that the firewall policy is attached to.
     * 
     */
    @InputImport(name="attachmentTarget", required=true)
      private final String attachmentTarget;

    public String getAttachmentTarget() {
        return this.attachmentTarget;
    }

    /**
     * Deprecated, please use short name instead. The display name of the firewall policy of the association.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The firewall policy ID of the association.
     * 
     */
    @InputImport(name="firewallPolicyId", required=true)
      private final String firewallPolicyId;

    public String getFirewallPolicyId() {
        return this.firewallPolicyId;
    }

    /**
     * The name for an association.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The short name of the firewall policy of the association.
     * 
     */
    @InputImport(name="shortName", required=true)
      private final String shortName;

    public String getShortName() {
        return this.shortName;
    }

    public FirewallPolicyAssociationResponse(
        String attachmentTarget,
        String displayName,
        String firewallPolicyId,
        String name,
        String shortName) {
        this.attachmentTarget = Objects.requireNonNull(attachmentTarget, "expected parameter 'attachmentTarget' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.firewallPolicyId = Objects.requireNonNull(firewallPolicyId, "expected parameter 'firewallPolicyId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.shortName = Objects.requireNonNull(shortName, "expected parameter 'shortName' to be non-null");
    }

    private FirewallPolicyAssociationResponse() {
        this.attachmentTarget = null;
        this.displayName = null;
        this.firewallPolicyId = null;
        this.name = null;
        this.shortName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyAssociationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachmentTarget;
        private String displayName;
        private String firewallPolicyId;
        private String name;
        private String shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyAssociationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentTarget = defaults.attachmentTarget;
    	      this.displayName = defaults.displayName;
    	      this.firewallPolicyId = defaults.firewallPolicyId;
    	      this.name = defaults.name;
    	      this.shortName = defaults.shortName;
        }

        public Builder setAttachmentTarget(String attachmentTarget) {
            this.attachmentTarget = Objects.requireNonNull(attachmentTarget);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFirewallPolicyId(String firewallPolicyId) {
            this.firewallPolicyId = Objects.requireNonNull(firewallPolicyId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setShortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        public FirewallPolicyAssociationResponse build() {
            return new FirewallPolicyAssociationResponse(attachmentTarget, displayName, firewallPolicyId, name, shortName);
        }
    }
}
