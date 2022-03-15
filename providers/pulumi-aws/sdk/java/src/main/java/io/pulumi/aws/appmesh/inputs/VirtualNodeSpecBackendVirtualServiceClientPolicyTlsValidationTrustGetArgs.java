// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs();

    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    @Import(name="acm")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> getAcm() {
        return this.acm == null ? Output.empty() : this.acm;
    }

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> getSds() {
        return this.sds == null ? Output.empty() : this.sds;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs(
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm,
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file,
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs() {
        this.acm = Output.empty();
        this.file = Output.empty();
        this.sds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm;
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file;
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm) {
            this.acm = acm;
            return this;
        }

        public Builder acm(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs acm) {
            this.acm = Output.ofNullable(acm);
            return this;
        }

        public Builder file(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }

        public Builder sds(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder sds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs sds) {
            this.sds = Output.ofNullable(sds);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs(acm, file, sds);
        }
    }
}
