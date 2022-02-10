// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionFeatureRegistrationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionFeatureRegistrationArgs Empty = new GetSubscriptionFeatureRegistrationArgs();

    @InputImport(name="featureName", required=true)
    private final String featureName;

    public String getFeatureName() {
        return this.featureName;
    }

    @InputImport(name="providerNamespace", required=true)
    private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    public GetSubscriptionFeatureRegistrationArgs(
        String featureName,
        String providerNamespace) {
        this.featureName = Objects.requireNonNull(featureName, "expected parameter 'featureName' to be non-null");
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
    }

    private GetSubscriptionFeatureRegistrationArgs() {
        this.featureName = null;
        this.providerNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionFeatureRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String featureName;
        private String providerNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionFeatureRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureName = defaults.featureName;
    	      this.providerNamespace = defaults.providerNamespace;
        }

        public Builder setFeatureName(String featureName) {
            this.featureName = Objects.requireNonNull(featureName);
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public GetSubscriptionFeatureRegistrationArgs build() {
            return new GetSubscriptionFeatureRegistrationArgs(featureName, providerNamespace);
        }
    }
}