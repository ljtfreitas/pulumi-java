// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsIdpArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainSamlOptionsSamlOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainSamlOptionsSamlOptionsArgs Empty = new DomainSamlOptionsSamlOptionsArgs();

    /**
     * Whether SAML authentication is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Information from your identity provider.
     * 
     */
    @Import(name="idp")
      private final @Nullable Output<DomainSamlOptionsSamlOptionsIdpArgs> idp;

    public Output<DomainSamlOptionsSamlOptionsIdpArgs> getIdp() {
        return this.idp == null ? Output.empty() : this.idp;
    }

    /**
     * This backend role from the SAML IdP receives full permissions to the cluster, equivalent to a new master user.
     * 
     */
    @Import(name="masterBackendRole")
      private final @Nullable Output<String> masterBackendRole;

    public Output<String> getMasterBackendRole() {
        return this.masterBackendRole == null ? Output.empty() : this.masterBackendRole;
    }

    /**
     * This username from the SAML IdP receives full permissions to the cluster, equivalent to a new master user.
     * 
     */
    @Import(name="masterUserName")
      private final @Nullable Output<String> masterUserName;

    public Output<String> getMasterUserName() {
        return this.masterUserName == null ? Output.empty() : this.masterUserName;
    }

    /**
     * Element of the SAML assertion to use for backend roles. Default is roles.
     * 
     */
    @Import(name="rolesKey")
      private final @Nullable Output<String> rolesKey;

    public Output<String> getRolesKey() {
        return this.rolesKey == null ? Output.empty() : this.rolesKey;
    }

    /**
     * Duration of a session in minutes after a user logs in. Default is 60. Maximum value is 1,440.
     * 
     */
    @Import(name="sessionTimeoutMinutes")
      private final @Nullable Output<Integer> sessionTimeoutMinutes;

    public Output<Integer> getSessionTimeoutMinutes() {
        return this.sessionTimeoutMinutes == null ? Output.empty() : this.sessionTimeoutMinutes;
    }

    /**
     * Element of the SAML assertion to use for username. Default is NameID.
     * 
     */
    @Import(name="subjectKey")
      private final @Nullable Output<String> subjectKey;

    public Output<String> getSubjectKey() {
        return this.subjectKey == null ? Output.empty() : this.subjectKey;
    }

    public DomainSamlOptionsSamlOptionsArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<DomainSamlOptionsSamlOptionsIdpArgs> idp,
        @Nullable Output<String> masterBackendRole,
        @Nullable Output<String> masterUserName,
        @Nullable Output<String> rolesKey,
        @Nullable Output<Integer> sessionTimeoutMinutes,
        @Nullable Output<String> subjectKey) {
        this.enabled = enabled;
        this.idp = idp;
        this.masterBackendRole = masterBackendRole;
        this.masterUserName = masterUserName;
        this.rolesKey = rolesKey;
        this.sessionTimeoutMinutes = sessionTimeoutMinutes;
        this.subjectKey = subjectKey;
    }

    private DomainSamlOptionsSamlOptionsArgs() {
        this.enabled = Output.empty();
        this.idp = Output.empty();
        this.masterBackendRole = Output.empty();
        this.masterUserName = Output.empty();
        this.rolesKey = Output.empty();
        this.sessionTimeoutMinutes = Output.empty();
        this.subjectKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSamlOptionsSamlOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<DomainSamlOptionsSamlOptionsIdpArgs> idp;
        private @Nullable Output<String> masterBackendRole;
        private @Nullable Output<String> masterUserName;
        private @Nullable Output<String> rolesKey;
        private @Nullable Output<Integer> sessionTimeoutMinutes;
        private @Nullable Output<String> subjectKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSamlOptionsSamlOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.idp = defaults.idp;
    	      this.masterBackendRole = defaults.masterBackendRole;
    	      this.masterUserName = defaults.masterUserName;
    	      this.rolesKey = defaults.rolesKey;
    	      this.sessionTimeoutMinutes = defaults.sessionTimeoutMinutes;
    	      this.subjectKey = defaults.subjectKey;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder idp(@Nullable Output<DomainSamlOptionsSamlOptionsIdpArgs> idp) {
            this.idp = idp;
            return this;
        }

        public Builder idp(@Nullable DomainSamlOptionsSamlOptionsIdpArgs idp) {
            this.idp = Output.ofNullable(idp);
            return this;
        }

        public Builder masterBackendRole(@Nullable Output<String> masterBackendRole) {
            this.masterBackendRole = masterBackendRole;
            return this;
        }

        public Builder masterBackendRole(@Nullable String masterBackendRole) {
            this.masterBackendRole = Output.ofNullable(masterBackendRole);
            return this;
        }

        public Builder masterUserName(@Nullable Output<String> masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }

        public Builder masterUserName(@Nullable String masterUserName) {
            this.masterUserName = Output.ofNullable(masterUserName);
            return this;
        }

        public Builder rolesKey(@Nullable Output<String> rolesKey) {
            this.rolesKey = rolesKey;
            return this;
        }

        public Builder rolesKey(@Nullable String rolesKey) {
            this.rolesKey = Output.ofNullable(rolesKey);
            return this;
        }

        public Builder sessionTimeoutMinutes(@Nullable Output<Integer> sessionTimeoutMinutes) {
            this.sessionTimeoutMinutes = sessionTimeoutMinutes;
            return this;
        }

        public Builder sessionTimeoutMinutes(@Nullable Integer sessionTimeoutMinutes) {
            this.sessionTimeoutMinutes = Output.ofNullable(sessionTimeoutMinutes);
            return this;
        }

        public Builder subjectKey(@Nullable Output<String> subjectKey) {
            this.subjectKey = subjectKey;
            return this;
        }

        public Builder subjectKey(@Nullable String subjectKey) {
            this.subjectKey = Output.ofNullable(subjectKey);
            return this;
        }
        public DomainSamlOptionsSamlOptionsArgs build() {
            return new DomainSamlOptionsSamlOptionsArgs(enabled, idp, masterBackendRole, masterUserName, rolesKey, sessionTimeoutMinutes, subjectKey);
        }
    }
}
