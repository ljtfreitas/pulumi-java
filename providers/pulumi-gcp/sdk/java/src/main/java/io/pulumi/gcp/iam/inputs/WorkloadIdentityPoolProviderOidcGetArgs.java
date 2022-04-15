// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadIdentityPoolProviderOidcGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityPoolProviderOidcGetArgs Empty = new WorkloadIdentityPoolProviderOidcGetArgs();

    /**
     * Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange
     * requests are rejected if the token audience does not match one of the configured
     * values. Each audience may be at most 256 characters. A maximum of 10 audiences may
     * be configured.
     * If this list is empty, the OIDC token audience must be equal to the full canonical
     * resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix.
     * For example:
     * 
     */
    @Import(name="allowedAudiences")
      private final @Nullable Output<List<String>> allowedAudiences;

    public Output<List<String>> allowedAudiences() {
        return this.allowedAudiences == null ? Codegen.empty() : this.allowedAudiences;
    }

    /**
     * The OIDC issuer URL.
     * 
     */
    @Import(name="issuerUri", required=true)
      private final Output<String> issuerUri;

    public Output<String> issuerUri() {
        return this.issuerUri;
    }

    public WorkloadIdentityPoolProviderOidcGetArgs(
        @Nullable Output<List<String>> allowedAudiences,
        Output<String> issuerUri) {
        this.allowedAudiences = allowedAudiences;
        this.issuerUri = Objects.requireNonNull(issuerUri, "expected parameter 'issuerUri' to be non-null");
    }

    private WorkloadIdentityPoolProviderOidcGetArgs() {
        this.allowedAudiences = Codegen.empty();
        this.issuerUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityPoolProviderOidcGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedAudiences;
        private Output<String> issuerUri;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityPoolProviderOidcGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.issuerUri = defaults.issuerUri;
        }

        public Builder allowedAudiences(@Nullable Output<List<String>> allowedAudiences) {
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(@Nullable List<String> allowedAudiences) {
            this.allowedAudiences = Codegen.ofNullable(allowedAudiences);
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        public Builder issuerUri(Output<String> issuerUri) {
            this.issuerUri = Objects.requireNonNull(issuerUri);
            return this;
        }
        public Builder issuerUri(String issuerUri) {
            this.issuerUri = Output.of(Objects.requireNonNull(issuerUri));
            return this;
        }        public WorkloadIdentityPoolProviderOidcGetArgs build() {
            return new WorkloadIdentityPoolProviderOidcGetArgs(allowedAudiences, issuerUri);
        }
    }
}
