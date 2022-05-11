// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheDefaultAccessPolicyAccessRule {
    /**
     * @return The access level for this rule. Possible values are: `rw`, `ro`, `no`.
     * 
     */
    private final String access;
    /**
     * @return The anonymous GID used when `root_squash_enabled` is `true`.
     * 
     */
    private final @Nullable Integer anonymousGid;
    /**
     * @return The anonymous UID used when `root_squash_enabled` is `true`.
     * 
     */
    private final @Nullable Integer anonymousUid;
    /**
     * @return The filter applied to the `scope` for this rule. The filter&#39;s format depends on its scope: `default` scope matches all clients and has no filter value; `network` scope takes a CIDR format; `host` takes an IP address or fully qualified domain name. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    private final @Nullable String filter;
    /**
     * @return Whether to enable [root squash](https://docs.microsoft.com/en-us/azure/hpc-cache/access-policies#root-squash)? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean rootSquashEnabled;
    /**
     * @return The scope of this rule. The `scope` and (potentially) the `filter` determine which clients match the rule. Possible values are: `default`, `network`, `host`.
     * 
     */
    private final String scope;
    /**
     * @return Whether allow access to subdirectories under the root export? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean submountAccessEnabled;
    /**
     * @return Whether [SUID](https://docs.microsoft.com/en-us/azure/hpc-cache/access-policies#suid) is allowed? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean suidEnabled;

    @CustomType.Constructor
    private CacheDefaultAccessPolicyAccessRule(
        @CustomType.Parameter("access") String access,
        @CustomType.Parameter("anonymousGid") @Nullable Integer anonymousGid,
        @CustomType.Parameter("anonymousUid") @Nullable Integer anonymousUid,
        @CustomType.Parameter("filter") @Nullable String filter,
        @CustomType.Parameter("rootSquashEnabled") @Nullable Boolean rootSquashEnabled,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("submountAccessEnabled") @Nullable Boolean submountAccessEnabled,
        @CustomType.Parameter("suidEnabled") @Nullable Boolean suidEnabled) {
        this.access = access;
        this.anonymousGid = anonymousGid;
        this.anonymousUid = anonymousUid;
        this.filter = filter;
        this.rootSquashEnabled = rootSquashEnabled;
        this.scope = scope;
        this.submountAccessEnabled = submountAccessEnabled;
        this.suidEnabled = suidEnabled;
    }

    /**
     * @return The access level for this rule. Possible values are: `rw`, `ro`, `no`.
     * 
     */
    public String access() {
        return this.access;
    }
    /**
     * @return The anonymous GID used when `root_squash_enabled` is `true`.
     * 
     */
    public Optional<Integer> anonymousGid() {
        return Optional.ofNullable(this.anonymousGid);
    }
    /**
     * @return The anonymous UID used when `root_squash_enabled` is `true`.
     * 
     */
    public Optional<Integer> anonymousUid() {
        return Optional.ofNullable(this.anonymousUid);
    }
    /**
     * @return The filter applied to the `scope` for this rule. The filter&#39;s format depends on its scope: `default` scope matches all clients and has no filter value; `network` scope takes a CIDR format; `host` takes an IP address or fully qualified domain name. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return Whether to enable [root squash](https://docs.microsoft.com/en-us/azure/hpc-cache/access-policies#root-squash)? Defaults to `false`.
     * 
     */
    public Optional<Boolean> rootSquashEnabled() {
        return Optional.ofNullable(this.rootSquashEnabled);
    }
    /**
     * @return The scope of this rule. The `scope` and (potentially) the `filter` determine which clients match the rule. Possible values are: `default`, `network`, `host`.
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return Whether allow access to subdirectories under the root export? Defaults to `false`.
     * 
     */
    public Optional<Boolean> submountAccessEnabled() {
        return Optional.ofNullable(this.submountAccessEnabled);
    }
    /**
     * @return Whether [SUID](https://docs.microsoft.com/en-us/azure/hpc-cache/access-policies#suid) is allowed? Defaults to `false`.
     * 
     */
    public Optional<Boolean> suidEnabled() {
        return Optional.ofNullable(this.suidEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheDefaultAccessPolicyAccessRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable Integer anonymousGid;
        private @Nullable Integer anonymousUid;
        private @Nullable String filter;
        private @Nullable Boolean rootSquashEnabled;
        private String scope;
        private @Nullable Boolean submountAccessEnabled;
        private @Nullable Boolean suidEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheDefaultAccessPolicyAccessRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.anonymousGid = defaults.anonymousGid;
    	      this.anonymousUid = defaults.anonymousUid;
    	      this.filter = defaults.filter;
    	      this.rootSquashEnabled = defaults.rootSquashEnabled;
    	      this.scope = defaults.scope;
    	      this.submountAccessEnabled = defaults.submountAccessEnabled;
    	      this.suidEnabled = defaults.suidEnabled;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder anonymousGid(@Nullable Integer anonymousGid) {
            this.anonymousGid = anonymousGid;
            return this;
        }
        public Builder anonymousUid(@Nullable Integer anonymousUid) {
            this.anonymousUid = anonymousUid;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder rootSquashEnabled(@Nullable Boolean rootSquashEnabled) {
            this.rootSquashEnabled = rootSquashEnabled;
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder submountAccessEnabled(@Nullable Boolean submountAccessEnabled) {
            this.submountAccessEnabled = submountAccessEnabled;
            return this;
        }
        public Builder suidEnabled(@Nullable Boolean suidEnabled) {
            this.suidEnabled = suidEnabled;
            return this;
        }        public CacheDefaultAccessPolicyAccessRule build() {
            return new CacheDefaultAccessPolicyAccessRule(access, anonymousGid, anonymousUid, filter, rootSquashEnabled, scope, submountAccessEnabled, suidEnabled);
        }
    }
}
