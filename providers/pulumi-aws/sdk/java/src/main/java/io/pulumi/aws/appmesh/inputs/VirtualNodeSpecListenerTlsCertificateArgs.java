// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateAcmArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateFileArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateSdsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsCertificateArgs Empty = new VirtualNodeSpecListenerTlsCertificateArgs();

    /**
     * An AWS Certificate Manager (ACM) certificate.
     * 
     */
    @Import(name="acm")
      private final @Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmArgs> acm;

    public Output<VirtualNodeSpecListenerTlsCertificateAcmArgs> getAcm() {
        return this.acm == null ? Output.empty() : this.acm;
    }

    /**
     * A local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualNodeSpecListenerTlsCertificateFileArgs> file;

    public Output<VirtualNodeSpecListenerTlsCertificateFileArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsArgs> sds;

    public Output<VirtualNodeSpecListenerTlsCertificateSdsArgs> getSds() {
        return this.sds == null ? Output.empty() : this.sds;
    }

    public VirtualNodeSpecListenerTlsCertificateArgs(
        @Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmArgs> acm,
        @Nullable Output<VirtualNodeSpecListenerTlsCertificateFileArgs> file,
        @Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecListenerTlsCertificateArgs() {
        this.acm = Output.empty();
        this.file = Output.empty();
        this.sds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmArgs> acm;
        private @Nullable Output<VirtualNodeSpecListenerTlsCertificateFileArgs> file;
        private @Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmArgs> acm) {
            this.acm = acm;
            return this;
        }

        public Builder acm(@Nullable VirtualNodeSpecListenerTlsCertificateAcmArgs acm) {
            this.acm = Output.ofNullable(acm);
            return this;
        }

        public Builder file(@Nullable Output<VirtualNodeSpecListenerTlsCertificateFileArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable VirtualNodeSpecListenerTlsCertificateFileArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }

        public Builder sds(@Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder sds(@Nullable VirtualNodeSpecListenerTlsCertificateSdsArgs sds) {
            this.sds = Output.ofNullable(sds);
            return this;
        }
        public VirtualNodeSpecListenerTlsCertificateArgs build() {
            return new VirtualNodeSpecListenerTlsCertificateArgs(acm, file, sds);
        }
    }
}
