// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterCertificateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterCertificateGetArgs Empty = new ClusterClusterCertificateGetArgs();

    @Import(name="awsHardwareCertificate")
      private final @Nullable Output<String> awsHardwareCertificate;

    public Output<String> getAwsHardwareCertificate() {
        return this.awsHardwareCertificate == null ? Output.empty() : this.awsHardwareCertificate;
    }

    @Import(name="clusterCertificate")
      private final @Nullable Output<String> clusterCertificate;

    public Output<String> getClusterCertificate() {
        return this.clusterCertificate == null ? Output.empty() : this.clusterCertificate;
    }

    @Import(name="clusterCsr")
      private final @Nullable Output<String> clusterCsr;

    public Output<String> getClusterCsr() {
        return this.clusterCsr == null ? Output.empty() : this.clusterCsr;
    }

    @Import(name="hsmCertificate")
      private final @Nullable Output<String> hsmCertificate;

    public Output<String> getHsmCertificate() {
        return this.hsmCertificate == null ? Output.empty() : this.hsmCertificate;
    }

    @Import(name="manufacturerHardwareCertificate")
      private final @Nullable Output<String> manufacturerHardwareCertificate;

    public Output<String> getManufacturerHardwareCertificate() {
        return this.manufacturerHardwareCertificate == null ? Output.empty() : this.manufacturerHardwareCertificate;
    }

    public ClusterClusterCertificateGetArgs(
        @Nullable Output<String> awsHardwareCertificate,
        @Nullable Output<String> clusterCertificate,
        @Nullable Output<String> clusterCsr,
        @Nullable Output<String> hsmCertificate,
        @Nullable Output<String> manufacturerHardwareCertificate) {
        this.awsHardwareCertificate = awsHardwareCertificate;
        this.clusterCertificate = clusterCertificate;
        this.clusterCsr = clusterCsr;
        this.hsmCertificate = hsmCertificate;
        this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
    }

    private ClusterClusterCertificateGetArgs() {
        this.awsHardwareCertificate = Output.empty();
        this.clusterCertificate = Output.empty();
        this.clusterCsr = Output.empty();
        this.hsmCertificate = Output.empty();
        this.manufacturerHardwareCertificate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsHardwareCertificate;
        private @Nullable Output<String> clusterCertificate;
        private @Nullable Output<String> clusterCsr;
        private @Nullable Output<String> hsmCertificate;
        private @Nullable Output<String> manufacturerHardwareCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterCertificateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsHardwareCertificate = defaults.awsHardwareCertificate;
    	      this.clusterCertificate = defaults.clusterCertificate;
    	      this.clusterCsr = defaults.clusterCsr;
    	      this.hsmCertificate = defaults.hsmCertificate;
    	      this.manufacturerHardwareCertificate = defaults.manufacturerHardwareCertificate;
        }

        public Builder awsHardwareCertificate(@Nullable Output<String> awsHardwareCertificate) {
            this.awsHardwareCertificate = awsHardwareCertificate;
            return this;
        }

        public Builder awsHardwareCertificate(@Nullable String awsHardwareCertificate) {
            this.awsHardwareCertificate = Output.ofNullable(awsHardwareCertificate);
            return this;
        }

        public Builder clusterCertificate(@Nullable Output<String> clusterCertificate) {
            this.clusterCertificate = clusterCertificate;
            return this;
        }

        public Builder clusterCertificate(@Nullable String clusterCertificate) {
            this.clusterCertificate = Output.ofNullable(clusterCertificate);
            return this;
        }

        public Builder clusterCsr(@Nullable Output<String> clusterCsr) {
            this.clusterCsr = clusterCsr;
            return this;
        }

        public Builder clusterCsr(@Nullable String clusterCsr) {
            this.clusterCsr = Output.ofNullable(clusterCsr);
            return this;
        }

        public Builder hsmCertificate(@Nullable Output<String> hsmCertificate) {
            this.hsmCertificate = hsmCertificate;
            return this;
        }

        public Builder hsmCertificate(@Nullable String hsmCertificate) {
            this.hsmCertificate = Output.ofNullable(hsmCertificate);
            return this;
        }

        public Builder manufacturerHardwareCertificate(@Nullable Output<String> manufacturerHardwareCertificate) {
            this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
            return this;
        }

        public Builder manufacturerHardwareCertificate(@Nullable String manufacturerHardwareCertificate) {
            this.manufacturerHardwareCertificate = Output.ofNullable(manufacturerHardwareCertificate);
            return this;
        }
        public ClusterClusterCertificateGetArgs build() {
            return new ClusterClusterCertificateGetArgs(awsHardwareCertificate, clusterCertificate, clusterCsr, hsmCertificate, manufacturerHardwareCertificate);
        }
    }
}
