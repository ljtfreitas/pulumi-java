// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NfsAccessRuleResponse {
    /**
     * Access allowed by this rule.
     * 
     */
    private final String access;
    /**
     * GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
     * 
     */
    private final @Nullable String anonymousGID;
    /**
     * UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
     * 
     */
    private final @Nullable String anonymousUID;
    /**
     * Filter applied to the scope for this rule. The filter's format depends on its scope. 'default' scope matches all clients and has no filter value. 'network' scope takes a filter in CIDR format (for example, 10.99.1.0/24). 'host' takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    private final @Nullable String filter;
    /**
     * Map root accesses to anonymousUID and anonymousGID.
     * 
     */
    private final @Nullable Boolean rootSquash;
    /**
     * Scope for this rule. The scope and filter determine which clients match the rule.
     * 
     */
    private final String scope;
    /**
     * For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path '/'. If set to yes, clients can mount a deeper path, like '/a/b'.
     * 
     */
    private final @Nullable Boolean submountAccess;
    /**
     * Allow SUID semantics.
     * 
     */
    private final @Nullable Boolean suid;

    @OutputCustomType.Constructor({"access","anonymousGID","anonymousUID","filter","rootSquash","scope","submountAccess","suid"})
    private NfsAccessRuleResponse(
        String access,
        @Nullable String anonymousGID,
        @Nullable String anonymousUID,
        @Nullable String filter,
        @Nullable Boolean rootSquash,
        String scope,
        @Nullable Boolean submountAccess,
        @Nullable Boolean suid) {
        this.access = Objects.requireNonNull(access);
        this.anonymousGID = anonymousGID;
        this.anonymousUID = anonymousUID;
        this.filter = filter;
        this.rootSquash = rootSquash;
        this.scope = Objects.requireNonNull(scope);
        this.submountAccess = submountAccess;
        this.suid = suid;
    }

    /**
     * Access allowed by this rule.
     * 
     */
    public String getAccess() {
        return this.access;
    }
    /**
     * GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
     * 
     */
    public Optional<String> getAnonymousGID() {
        return Optional.ofNullable(this.anonymousGID);
    }
    /**
     * UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
     * 
     */
    public Optional<String> getAnonymousUID() {
        return Optional.ofNullable(this.anonymousUID);
    }
    /**
     * Filter applied to the scope for this rule. The filter's format depends on its scope. 'default' scope matches all clients and has no filter value. 'network' scope takes a filter in CIDR format (for example, 10.99.1.0/24). 'host' takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * Map root accesses to anonymousUID and anonymousGID.
     * 
     */
    public Optional<Boolean> getRootSquash() {
        return Optional.ofNullable(this.rootSquash);
    }
    /**
     * Scope for this rule. The scope and filter determine which clients match the rule.
     * 
     */
    public String getScope() {
        return this.scope;
    }
    /**
     * For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path '/'. If set to yes, clients can mount a deeper path, like '/a/b'.
     * 
     */
    public Optional<Boolean> getSubmountAccess() {
        return Optional.ofNullable(this.submountAccess);
    }
    /**
     * Allow SUID semantics.
     * 
     */
    public Optional<Boolean> getSuid() {
        return Optional.ofNullable(this.suid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsAccessRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable String anonymousGID;
        private @Nullable String anonymousUID;
        private @Nullable String filter;
        private @Nullable Boolean rootSquash;
        private String scope;
        private @Nullable Boolean submountAccess;
        private @Nullable Boolean suid;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsAccessRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.anonymousGID = defaults.anonymousGID;
    	      this.anonymousUID = defaults.anonymousUID;
    	      this.filter = defaults.filter;
    	      this.rootSquash = defaults.rootSquash;
    	      this.scope = defaults.scope;
    	      this.submountAccess = defaults.submountAccess;
    	      this.suid = defaults.suid;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setAnonymousGID(@Nullable String anonymousGID) {
            this.anonymousGID = anonymousGID;
            return this;
        }

        public Builder setAnonymousUID(@Nullable String anonymousUID) {
            this.anonymousUID = anonymousUID;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setRootSquash(@Nullable Boolean rootSquash) {
            this.rootSquash = rootSquash;
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setSubmountAccess(@Nullable Boolean submountAccess) {
            this.submountAccess = submountAccess;
            return this;
        }

        public Builder setSuid(@Nullable Boolean suid) {
            this.suid = suid;
            return this;
        }

        public NfsAccessRuleResponse build() {
            return new NfsAccessRuleResponse(access, anonymousGID, anonymousUID, filter, rootSquash, scope, submountAccess, suid);
        }
    }
}
