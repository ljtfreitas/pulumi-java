// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildAvailableSecretsSecretManager;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TriggerBuildAvailableSecrets {
    /**
     * Pairs a secret environment variable with a SecretVersion in Secret Manager.
     * Structure is documented below.
     * 
     */
    private final List<TriggerBuildAvailableSecretsSecretManager> secretManagers;

    @CustomType.Constructor
    private TriggerBuildAvailableSecrets(@CustomType.Parameter("secretManagers") List<TriggerBuildAvailableSecretsSecretManager> secretManagers) {
        this.secretManagers = secretManagers;
    }

    /**
     * Pairs a secret environment variable with a SecretVersion in Secret Manager.
     * Structure is documented below.
     * 
    */
    public List<TriggerBuildAvailableSecretsSecretManager> getSecretManagers() {
        return this.secretManagers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildAvailableSecrets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TriggerBuildAvailableSecretsSecretManager> secretManagers;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildAvailableSecrets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretManagers = defaults.secretManagers;
        }

        public Builder secretManagers(List<TriggerBuildAvailableSecretsSecretManager> secretManagers) {
            this.secretManagers = Objects.requireNonNull(secretManagers);
            return this;
        }
        public TriggerBuildAvailableSecrets build() {
            return new TriggerBuildAvailableSecrets(secretManagers);
        }
    }
}
