// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs();

    /**
     * The listener's TLS certificate.
     * 
     */
    @InputImport(name="certificate")
    private final @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    @InputImport(name="enforce")
    private final @Nullable Input<Boolean> enforce;

    public Input<Boolean> getEnforce() {
        return this.enforce == null ? Input.empty() : this.enforce;
    }

    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    @InputImport(name="ports")
    private final @Nullable Input<List<Integer>> ports;

    public Input<List<Integer>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    @InputImport(name="validation", required=true)
    private final Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> getValidation() {
        return this.validation;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs(
        @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate,
        @Nullable Input<Boolean> enforce,
        @Nullable Input<List<Integer>> ports,
        Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = Objects.requireNonNull(validation, "expected parameter 'validation' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs() {
        this.certificate = Input.empty();
        this.enforce = Input.empty();
        this.ports = Input.empty();
        this.validation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate;
        private @Nullable Input<Boolean> enforce;
        private @Nullable Input<List<Integer>> ports;
        private Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder setCertificate(@Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setEnforce(@Nullable Input<Boolean> enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder setEnforce(@Nullable Boolean enforce) {
            this.enforce = Input.ofNullable(enforce);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<Integer>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<Integer> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder setValidation(Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }

        public Builder setValidation(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs validation) {
            this.validation = Input.of(Objects.requireNonNull(validation));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs(certificate, enforce, ports, validation);
        }
    }
}
