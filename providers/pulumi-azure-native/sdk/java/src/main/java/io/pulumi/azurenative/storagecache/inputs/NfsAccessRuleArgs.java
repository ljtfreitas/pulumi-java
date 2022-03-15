// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.enums.NfsAccessRuleAccess;
import io.pulumi.azurenative.storagecache.enums.NfsAccessRuleScope;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule to place restrictions on portions of the cache namespace being presented to clients.
 * 
 */
public final class NfsAccessRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsAccessRuleArgs Empty = new NfsAccessRuleArgs();

    /**
     * Access allowed by this rule.
     * 
     */
    @Import(name="access", required=true)
      private final Output<Either<String,NfsAccessRuleAccess>> access;

    public Output<Either<String,NfsAccessRuleAccess>> getAccess() {
        return this.access;
    }

    /**
     * GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
     * 
     */
    @Import(name="anonymousGID")
      private final @Nullable Output<String> anonymousGID;

    public Output<String> getAnonymousGID() {
        return this.anonymousGID == null ? Output.empty() : this.anonymousGID;
    }

    /**
     * UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
     * 
     */
    @Import(name="anonymousUID")
      private final @Nullable Output<String> anonymousUID;

    public Output<String> getAnonymousUID() {
        return this.anonymousUID == null ? Output.empty() : this.anonymousUID;
    }

    /**
     * Filter applied to the scope for this rule. The filter's format depends on its scope. 'default' scope matches all clients and has no filter value. 'network' scope takes a filter in CIDR format (for example, 10.99.1.0/24). 'host' takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * Map root accesses to anonymousUID and anonymousGID.
     * 
     */
    @Import(name="rootSquash")
      private final @Nullable Output<Boolean> rootSquash;

    public Output<Boolean> getRootSquash() {
        return this.rootSquash == null ? Output.empty() : this.rootSquash;
    }

    /**
     * Scope for this rule. The scope and filter determine which clients match the rule.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<Either<String,NfsAccessRuleScope>> scope;

    public Output<Either<String,NfsAccessRuleScope>> getScope() {
        return this.scope;
    }

    /**
     * For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path '/'. If set to yes, clients can mount a deeper path, like '/a/b'.
     * 
     */
    @Import(name="submountAccess")
      private final @Nullable Output<Boolean> submountAccess;

    public Output<Boolean> getSubmountAccess() {
        return this.submountAccess == null ? Output.empty() : this.submountAccess;
    }

    /**
     * Allow SUID semantics.
     * 
     */
    @Import(name="suid")
      private final @Nullable Output<Boolean> suid;

    public Output<Boolean> getSuid() {
        return this.suid == null ? Output.empty() : this.suid;
    }

    public NfsAccessRuleArgs(
        Output<Either<String,NfsAccessRuleAccess>> access,
        @Nullable Output<String> anonymousGID,
        @Nullable Output<String> anonymousUID,
        @Nullable Output<String> filter,
        @Nullable Output<Boolean> rootSquash,
        Output<Either<String,NfsAccessRuleScope>> scope,
        @Nullable Output<Boolean> submountAccess,
        @Nullable Output<Boolean> suid) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.anonymousGID = anonymousGID;
        this.anonymousUID = anonymousUID;
        this.filter = filter;
        this.rootSquash = rootSquash;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.submountAccess = submountAccess;
        this.suid = suid;
    }

    private NfsAccessRuleArgs() {
        this.access = Output.empty();
        this.anonymousGID = Output.empty();
        this.anonymousUID = Output.empty();
        this.filter = Output.empty();
        this.rootSquash = Output.empty();
        this.scope = Output.empty();
        this.submountAccess = Output.empty();
        this.suid = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsAccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,NfsAccessRuleAccess>> access;
        private @Nullable Output<String> anonymousGID;
        private @Nullable Output<String> anonymousUID;
        private @Nullable Output<String> filter;
        private @Nullable Output<Boolean> rootSquash;
        private Output<Either<String,NfsAccessRuleScope>> scope;
        private @Nullable Output<Boolean> submountAccess;
        private @Nullable Output<Boolean> suid;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsAccessRuleArgs defaults) {
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

        public Builder access(Output<Either<String,NfsAccessRuleAccess>> access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder access(Either<String,NfsAccessRuleAccess> access) {
            this.access = Output.of(Objects.requireNonNull(access));
            return this;
        }

        public Builder anonymousGID(@Nullable Output<String> anonymousGID) {
            this.anonymousGID = anonymousGID;
            return this;
        }

        public Builder anonymousGID(@Nullable String anonymousGID) {
            this.anonymousGID = Output.ofNullable(anonymousGID);
            return this;
        }

        public Builder anonymousUID(@Nullable Output<String> anonymousUID) {
            this.anonymousUID = anonymousUID;
            return this;
        }

        public Builder anonymousUID(@Nullable String anonymousUID) {
            this.anonymousUID = Output.ofNullable(anonymousUID);
            return this;
        }

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }

        public Builder rootSquash(@Nullable Output<Boolean> rootSquash) {
            this.rootSquash = rootSquash;
            return this;
        }

        public Builder rootSquash(@Nullable Boolean rootSquash) {
            this.rootSquash = Output.ofNullable(rootSquash);
            return this;
        }

        public Builder scope(Output<Either<String,NfsAccessRuleScope>> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(Either<String,NfsAccessRuleScope> scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder submountAccess(@Nullable Output<Boolean> submountAccess) {
            this.submountAccess = submountAccess;
            return this;
        }

        public Builder submountAccess(@Nullable Boolean submountAccess) {
            this.submountAccess = Output.ofNullable(submountAccess);
            return this;
        }

        public Builder suid(@Nullable Output<Boolean> suid) {
            this.suid = suid;
            return this;
        }

        public Builder suid(@Nullable Boolean suid) {
            this.suid = Output.ofNullable(suid);
            return this;
        }
        public NfsAccessRuleArgs build() {
            return new NfsAccessRuleArgs(access, anonymousGID, anonymousUID, filter, rootSquash, scope, submountAccess, suid);
        }
    }
}
