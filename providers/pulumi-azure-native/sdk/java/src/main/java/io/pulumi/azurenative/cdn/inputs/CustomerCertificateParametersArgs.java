// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Customer Certificate used for https
 * 
 */
public final class CustomerCertificateParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerCertificateParametersArgs Empty = new CustomerCertificateParametersArgs();

    /**
     * Certificate issuing authority.
     * 
     */
    @Import(name="certificateAuthority")
      private final @Nullable Output<String> certificateAuthority;

    public Output<String> getCertificateAuthority() {
        return this.certificateAuthority == null ? Output.empty() : this.certificateAuthority;
    }

    /**
     * Resource reference to the KV secret
     * 
     */
    @Import(name="secretSource", required=true)
      private final Output<ResourceReferenceArgs> secretSource;

    public Output<ResourceReferenceArgs> getSecretSource() {
        return this.secretSource;
    }

    /**
     * Version of the secret to be used
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable Output<String> secretVersion;

    public Output<String> getSecretVersion() {
        return this.secretVersion == null ? Output.empty() : this.secretVersion;
    }

    /**
     * The list of SANs.
     * 
     */
    @Import(name="subjectAlternativeNames")
      private final @Nullable Output<List<String>> subjectAlternativeNames;

    public Output<List<String>> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Output.empty() : this.subjectAlternativeNames;
    }

    /**
     * The type of the Secret to create.
     * Expected value is 'CustomerCertificate'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Whether to use the latest version for the certificate
     * 
     */
    @Import(name="useLatestVersion")
      private final @Nullable Output<Boolean> useLatestVersion;

    public Output<Boolean> getUseLatestVersion() {
        return this.useLatestVersion == null ? Output.empty() : this.useLatestVersion;
    }

    public CustomerCertificateParametersArgs(
        @Nullable Output<String> certificateAuthority,
        Output<ResourceReferenceArgs> secretSource,
        @Nullable Output<String> secretVersion,
        @Nullable Output<List<String>> subjectAlternativeNames,
        Output<String> type,
        @Nullable Output<Boolean> useLatestVersion) {
        this.certificateAuthority = certificateAuthority;
        this.secretSource = Objects.requireNonNull(secretSource, "expected parameter 'secretSource' to be non-null");
        this.secretVersion = secretVersion;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useLatestVersion = useLatestVersion;
    }

    private CustomerCertificateParametersArgs() {
        this.certificateAuthority = Output.empty();
        this.secretSource = Output.empty();
        this.secretVersion = Output.empty();
        this.subjectAlternativeNames = Output.empty();
        this.type = Output.empty();
        this.useLatestVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerCertificateParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateAuthority;
        private Output<ResourceReferenceArgs> secretSource;
        private @Nullable Output<String> secretVersion;
        private @Nullable Output<List<String>> subjectAlternativeNames;
        private Output<String> type;
        private @Nullable Output<Boolean> useLatestVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerCertificateParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.secretSource = defaults.secretSource;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
    	      this.useLatestVersion = defaults.useLatestVersion;
        }

        public Builder certificateAuthority(@Nullable Output<String> certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder certificateAuthority(@Nullable String certificateAuthority) {
            this.certificateAuthority = Output.ofNullable(certificateAuthority);
            return this;
        }

        public Builder secretSource(Output<ResourceReferenceArgs> secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }

        public Builder secretSource(ResourceReferenceArgs secretSource) {
            this.secretSource = Output.of(Objects.requireNonNull(secretSource));
            return this;
        }

        public Builder secretVersion(@Nullable Output<String> secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = Output.ofNullable(secretVersion);
            return this;
        }

        public Builder subjectAlternativeNames(@Nullable Output<List<String>> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Output.ofNullable(subjectAlternativeNames);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder useLatestVersion(@Nullable Output<Boolean> useLatestVersion) {
            this.useLatestVersion = useLatestVersion;
            return this;
        }

        public Builder useLatestVersion(@Nullable Boolean useLatestVersion) {
            this.useLatestVersion = Output.ofNullable(useLatestVersion);
            return this;
        }
        public CustomerCertificateParametersArgs build() {
            return new CustomerCertificateParametersArgs(certificateAuthority, secretSource, secretVersion, subjectAlternativeNames, type, useLatestVersion);
        }
    }
}
