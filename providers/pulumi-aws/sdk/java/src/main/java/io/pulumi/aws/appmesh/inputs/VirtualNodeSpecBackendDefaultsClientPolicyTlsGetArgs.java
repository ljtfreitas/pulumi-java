// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs();

    /**
     * The listener's TLS certificate.
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    @Import(name="enforce")
      private final @Nullable Output<Boolean> enforce;

    public Output<Boolean> getEnforce() {
        return this.enforce == null ? Output.empty() : this.enforce;
    }

    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<Integer>> ports;

    public Output<List<Integer>> getPorts() {
        return this.ports == null ? Output.empty() : this.ports;
    }

    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    @Import(name="validation", required=true)
      private final Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> getValidation() {
        return this.validation;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs(
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate,
        @Nullable Output<Boolean> enforce,
        @Nullable Output<List<Integer>> ports,
        Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = Objects.requireNonNull(validation, "expected parameter 'validation' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs() {
        this.certificate = Output.empty();
        this.enforce = Output.empty();
        this.ports = Output.empty();
        this.validation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate;
        private @Nullable Output<Boolean> enforce;
        private @Nullable Output<List<Integer>> ports;
        private Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }

        public Builder enforce(@Nullable Output<Boolean> enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder enforce(@Nullable Boolean enforce) {
            this.enforce = Output.ofNullable(enforce);
            return this;
        }

        public Builder ports(@Nullable Output<List<Integer>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = Output.ofNullable(ports);
            return this;
        }

        public Builder validation(Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }

        public Builder validation(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs validation) {
            this.validation = Output.of(Objects.requireNonNull(validation));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs(certificate, enforce, ports, validation);
        }
    }
}
