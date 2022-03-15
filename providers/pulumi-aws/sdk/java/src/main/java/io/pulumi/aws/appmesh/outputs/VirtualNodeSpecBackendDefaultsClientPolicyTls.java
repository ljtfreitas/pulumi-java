// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicyTls {
    /**
     * The listener's TLS certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate certificate;
    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    private final @Nullable Boolean enforce;
    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    private final @Nullable List<Integer> ports;
    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    private final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation validation;

    @CustomType.Constructor
    private VirtualNodeSpecBackendDefaultsClientPolicyTls(
        @CustomType.Parameter("certificate") @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate certificate,
        @CustomType.Parameter("enforce") @Nullable Boolean enforce,
        @CustomType.Parameter("ports") @Nullable List<Integer> ports,
        @CustomType.Parameter("validation") VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = validation;
    }

    /**
     * The listener's TLS certificate.
     * 
    */
    public Optional<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * Whether the policy is enforced. Default is `true`.
     * 
    */
    public Optional<Boolean> getEnforce() {
        return Optional.ofNullable(this.enforce);
    }
    /**
     * One or more ports that the policy is enforced for.
     * 
    */
    public List<Integer> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
    */
    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation getValidation() {
        return this.validation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate certificate;
        private @Nullable Boolean enforce;
        private @Nullable List<Integer> ports;
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder enforce(@Nullable Boolean enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = ports;
            return this;
        }

        public Builder validation(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTls build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTls(certificate, enforce, ports, validation);
        }
    }
}
