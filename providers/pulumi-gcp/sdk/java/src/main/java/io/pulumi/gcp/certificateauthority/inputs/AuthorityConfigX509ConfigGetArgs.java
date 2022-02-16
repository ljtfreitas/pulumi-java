// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigCaOptionsGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigPolicyIdGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigGetArgs Empty = new AuthorityConfigX509ConfigGetArgs();

    @InputImport(name="additionalExtensions")
    private final @Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions;

    public Input<List<AuthorityConfigX509ConfigAdditionalExtensionGetArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Input.empty() : this.additionalExtensions;
    }

    @InputImport(name="aiaOcspServers")
    private final @Nullable Input<List<String>> aiaOcspServers;

    public Input<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Input.empty() : this.aiaOcspServers;
    }

    @InputImport(name="caOptions", required=true)
    private final Input<AuthorityConfigX509ConfigCaOptionsGetArgs> caOptions;

    public Input<AuthorityConfigX509ConfigCaOptionsGetArgs> getCaOptions() {
        return this.caOptions;
    }

    @InputImport(name="keyUsage", required=true)
    private final Input<AuthorityConfigX509ConfigKeyUsageGetArgs> keyUsage;

    public Input<AuthorityConfigX509ConfigKeyUsageGetArgs> getKeyUsage() {
        return this.keyUsage;
    }

    @InputImport(name="policyIds")
    private final @Nullable Input<List<AuthorityConfigX509ConfigPolicyIdGetArgs>> policyIds;

    public Input<List<AuthorityConfigX509ConfigPolicyIdGetArgs>> getPolicyIds() {
        return this.policyIds == null ? Input.empty() : this.policyIds;
    }

    public AuthorityConfigX509ConfigGetArgs(
        @Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions,
        @Nullable Input<List<String>> aiaOcspServers,
        Input<AuthorityConfigX509ConfigCaOptionsGetArgs> caOptions,
        Input<AuthorityConfigX509ConfigKeyUsageGetArgs> keyUsage,
        @Nullable Input<List<AuthorityConfigX509ConfigPolicyIdGetArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = Objects.requireNonNull(caOptions, "expected parameter 'caOptions' to be non-null");
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = policyIds;
    }

    private AuthorityConfigX509ConfigGetArgs() {
        this.additionalExtensions = Input.empty();
        this.aiaOcspServers = Input.empty();
        this.caOptions = Input.empty();
        this.keyUsage = Input.empty();
        this.policyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions;
        private @Nullable Input<List<String>> aiaOcspServers;
        private Input<AuthorityConfigX509ConfigCaOptionsGetArgs> caOptions;
        private Input<AuthorityConfigX509ConfigKeyUsageGetArgs> keyUsage;
        private @Nullable Input<List<AuthorityConfigX509ConfigPolicyIdGetArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<AuthorityConfigX509ConfigAdditionalExtensionGetArgs> additionalExtensions) {
            this.additionalExtensions = Input.ofNullable(additionalExtensions);
            return this;
        }

        public Builder setAiaOcspServers(@Nullable Input<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder setAiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Input.ofNullable(aiaOcspServers);
            return this;
        }

        public Builder setCaOptions(Input<AuthorityConfigX509ConfigCaOptionsGetArgs> caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }

        public Builder setCaOptions(AuthorityConfigX509ConfigCaOptionsGetArgs caOptions) {
            this.caOptions = Input.of(Objects.requireNonNull(caOptions));
            return this;
        }

        public Builder setKeyUsage(Input<AuthorityConfigX509ConfigKeyUsageGetArgs> keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder setKeyUsage(AuthorityConfigX509ConfigKeyUsageGetArgs keyUsage) {
            this.keyUsage = Input.of(Objects.requireNonNull(keyUsage));
            return this;
        }

        public Builder setPolicyIds(@Nullable Input<List<AuthorityConfigX509ConfigPolicyIdGetArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder setPolicyIds(@Nullable List<AuthorityConfigX509ConfigPolicyIdGetArgs> policyIds) {
            this.policyIds = Input.ofNullable(policyIds);
            return this;
        }

        public AuthorityConfigX509ConfigGetArgs build() {
            return new AuthorityConfigX509ConfigGetArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}