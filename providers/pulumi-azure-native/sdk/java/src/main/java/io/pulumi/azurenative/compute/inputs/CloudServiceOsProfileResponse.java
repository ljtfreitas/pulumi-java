// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceVaultSecretGroupResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the OS profile for the cloud service.
 * 
 */
public final class CloudServiceOsProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudServiceOsProfileResponse Empty = new CloudServiceOsProfileResponse();

    /**
     * Specifies set of certificates that should be installed onto the role instances.
     * 
     */
    @InputImport(name="secrets")
        private final @Nullable List<CloudServiceVaultSecretGroupResponse> secrets;

    public List<CloudServiceVaultSecretGroupResponse> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }

    public CloudServiceOsProfileResponse(@Nullable List<CloudServiceVaultSecretGroupResponse> secrets) {
        this.secrets = secrets;
    }

    private CloudServiceOsProfileResponse() {
        this.secrets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceOsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CloudServiceVaultSecretGroupResponse> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceOsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secrets = defaults.secrets;
        }

        public Builder setSecrets(@Nullable List<CloudServiceVaultSecretGroupResponse> secrets) {
            this.secrets = secrets;
            return this;
        }
        public CloudServiceOsProfileResponse build() {
            return new CloudServiceOsProfileResponse(secrets);
        }
    }
}
