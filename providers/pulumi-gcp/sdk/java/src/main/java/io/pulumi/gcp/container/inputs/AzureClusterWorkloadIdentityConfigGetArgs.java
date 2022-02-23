// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClusterWorkloadIdentityConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterWorkloadIdentityConfigGetArgs Empty = new AzureClusterWorkloadIdentityConfigGetArgs();

    @InputImport(name="identityProvider")
        private final @Nullable Input<String> identityProvider;

    public Input<String> getIdentityProvider() {
        return this.identityProvider == null ? Input.empty() : this.identityProvider;
    }

    @InputImport(name="issuerUri")
        private final @Nullable Input<String> issuerUri;

    public Input<String> getIssuerUri() {
        return this.issuerUri == null ? Input.empty() : this.issuerUri;
    }

    @InputImport(name="workloadPool")
        private final @Nullable Input<String> workloadPool;

    public Input<String> getWorkloadPool() {
        return this.workloadPool == null ? Input.empty() : this.workloadPool;
    }

    public AzureClusterWorkloadIdentityConfigGetArgs(
        @Nullable Input<String> identityProvider,
        @Nullable Input<String> issuerUri,
        @Nullable Input<String> workloadPool) {
        this.identityProvider = identityProvider;
        this.issuerUri = issuerUri;
        this.workloadPool = workloadPool;
    }

    private AzureClusterWorkloadIdentityConfigGetArgs() {
        this.identityProvider = Input.empty();
        this.issuerUri = Input.empty();
        this.workloadPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterWorkloadIdentityConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityProvider;
        private @Nullable Input<String> issuerUri;
        private @Nullable Input<String> workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterWorkloadIdentityConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProvider = defaults.identityProvider;
    	      this.issuerUri = defaults.issuerUri;
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder setIdentityProvider(@Nullable Input<String> identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder setIdentityProvider(@Nullable String identityProvider) {
            this.identityProvider = Input.ofNullable(identityProvider);
            return this;
        }

        public Builder setIssuerUri(@Nullable Input<String> issuerUri) {
            this.issuerUri = issuerUri;
            return this;
        }

        public Builder setIssuerUri(@Nullable String issuerUri) {
            this.issuerUri = Input.ofNullable(issuerUri);
            return this;
        }

        public Builder setWorkloadPool(@Nullable Input<String> workloadPool) {
            this.workloadPool = workloadPool;
            return this;
        }

        public Builder setWorkloadPool(@Nullable String workloadPool) {
            this.workloadPool = Input.ofNullable(workloadPool);
            return this;
        }
        public AzureClusterWorkloadIdentityConfigGetArgs build() {
            return new AzureClusterWorkloadIdentityConfigGetArgs(identityProvider, issuerUri, workloadPool);
        }
    }
}
