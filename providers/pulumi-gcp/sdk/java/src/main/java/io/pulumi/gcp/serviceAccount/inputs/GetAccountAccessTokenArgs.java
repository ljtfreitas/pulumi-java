// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountAccessTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccountAccessTokenArgs Empty = new GetAccountAccessTokenArgs();

    /**
     * Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.  (e.g. `["projects/-/serviceAccounts/delegate-svc-account@project-id.iam.gserviceaccount.com"]`)
     * 
     */
    @InputImport(name="delegates")
        private final @Nullable List<String> delegates;

    public List<String> getDelegates() {
        return this.delegates == null ? List.of() : this.delegates;
    }

    /**
     * Lifetime of the impersonated token (defaults to its max: `3600s`).
     * 
     */
    @InputImport(name="lifetime")
        private final @Nullable String lifetime;

    public Optional<String> getLifetime() {
        return this.lifetime == null ? Optional.empty() : Optional.ofNullable(this.lifetime);
    }

    /**
     * The scopes the new credential should have (e.g. `["cloud-platform"]`)
     * 
     */
    @InputImport(name="scopes", required=true)
        private final List<String> scopes;

    public List<String> getScopes() {
        return this.scopes;
    }

    /**
     * The service account _to_ impersonate (e.g. `service_B@your-project-id.iam.gserviceaccount.com`)
     * 
     */
    @InputImport(name="targetServiceAccount", required=true)
        private final String targetServiceAccount;

    public String getTargetServiceAccount() {
        return this.targetServiceAccount;
    }

    public GetAccountAccessTokenArgs(
        @Nullable List<String> delegates,
        @Nullable String lifetime,
        List<String> scopes,
        String targetServiceAccount) {
        this.delegates = delegates;
        this.lifetime = lifetime;
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
        this.targetServiceAccount = Objects.requireNonNull(targetServiceAccount, "expected parameter 'targetServiceAccount' to be non-null");
    }

    private GetAccountAccessTokenArgs() {
        this.delegates = List.of();
        this.lifetime = null;
        this.scopes = List.of();
        this.targetServiceAccount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> delegates;
        private @Nullable String lifetime;
        private List<String> scopes;
        private String targetServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountAccessTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegates = defaults.delegates;
    	      this.lifetime = defaults.lifetime;
    	      this.scopes = defaults.scopes;
    	      this.targetServiceAccount = defaults.targetServiceAccount;
        }

        public Builder setDelegates(@Nullable List<String> delegates) {
            this.delegates = delegates;
            return this;
        }

        public Builder setLifetime(@Nullable String lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder setTargetServiceAccount(String targetServiceAccount) {
            this.targetServiceAccount = Objects.requireNonNull(targetServiceAccount);
            return this;
        }
        public GetAccountAccessTokenArgs build() {
            return new GetAccountAccessTokenArgs(delegates, lifetime, scopes, targetServiceAccount);
        }
    }
}
