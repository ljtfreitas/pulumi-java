// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * OAuth scopes are a way to define data and permissions on data. For example, there are scopes defined for "Read-only access to Google Calendar" and "Access to Cloud Platform". Users can consent to a scope for an application, giving it permission to access that data on their behalf. OAuth scope specifications should be fairly coarse grained; a user will need to see and understand the text description of what your scope means. In most cases: use one or at most two OAuth scopes for an entire family of products. If your product has multiple APIs, you should probably be sharing the OAuth scope across all of those APIs. When you need finer grained OAuth consent screens: talk with your product management about how developers will use them in practice. Please note that even though each of the canonical scopes is enough for a request to be accepted and passed to the backend, a request can still fail due to the backend requiring additional scopes or permissions.
 * 
 */
public final class OAuthRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OAuthRequirementsArgs Empty = new OAuthRequirementsArgs();

    /**
     * The list of publicly documented OAuth scopes that are allowed access. An OAuth token containing any of these scopes will be accepted. Example: canonical_scopes: https://www.googleapis.com/auth/calendar, https://www.googleapis.com/auth/calendar.read
     * 
     */
    @Import(name="canonicalScopes")
      private final @Nullable Output<String> canonicalScopes;

    public Output<String> getCanonicalScopes() {
        return this.canonicalScopes == null ? Output.empty() : this.canonicalScopes;
    }

    public OAuthRequirementsArgs(@Nullable Output<String> canonicalScopes) {
        this.canonicalScopes = canonicalScopes;
    }

    private OAuthRequirementsArgs() {
        this.canonicalScopes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuthRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> canonicalScopes;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuthRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalScopes = defaults.canonicalScopes;
        }

        public Builder canonicalScopes(@Nullable Output<String> canonicalScopes) {
            this.canonicalScopes = canonicalScopes;
            return this;
        }

        public Builder canonicalScopes(@Nullable String canonicalScopes) {
            this.canonicalScopes = Output.ofNullable(canonicalScopes);
            return this;
        }
        public OAuthRequirementsArgs build() {
            return new OAuthRequirementsArgs(canonicalScopes);
        }
    }
}
