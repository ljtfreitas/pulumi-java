// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterCertificates extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterCertificates Empty = new GetClusterClusterCertificates();

    @InputImport(name="awsHardwareCertificate", required=true)
    private final String awsHardwareCertificate;

    public String getAwsHardwareCertificate() {
        return this.awsHardwareCertificate;
    }

    @InputImport(name="clusterCertificate", required=true)
    private final String clusterCertificate;

    public String getClusterCertificate() {
        return this.clusterCertificate;
    }

    @InputImport(name="clusterCsr", required=true)
    private final String clusterCsr;

    public String getClusterCsr() {
        return this.clusterCsr;
    }

    @InputImport(name="hsmCertificate", required=true)
    private final String hsmCertificate;

    public String getHsmCertificate() {
        return this.hsmCertificate;
    }

    @InputImport(name="manufacturerHardwareCertificate", required=true)
    private final String manufacturerHardwareCertificate;

    public String getManufacturerHardwareCertificate() {
        return this.manufacturerHardwareCertificate;
    }

    public GetClusterClusterCertificates(
        String awsHardwareCertificate,
        String clusterCertificate,
        String clusterCsr,
        String hsmCertificate,
        String manufacturerHardwareCertificate) {
        this.awsHardwareCertificate = Objects.requireNonNull(awsHardwareCertificate, "expected parameter 'awsHardwareCertificate' to be non-null");
        this.clusterCertificate = Objects.requireNonNull(clusterCertificate, "expected parameter 'clusterCertificate' to be non-null");
        this.clusterCsr = Objects.requireNonNull(clusterCsr, "expected parameter 'clusterCsr' to be non-null");
        this.hsmCertificate = Objects.requireNonNull(hsmCertificate, "expected parameter 'hsmCertificate' to be non-null");
        this.manufacturerHardwareCertificate = Objects.requireNonNull(manufacturerHardwareCertificate, "expected parameter 'manufacturerHardwareCertificate' to be non-null");
    }

    private GetClusterClusterCertificates() {
        this.awsHardwareCertificate = null;
        this.clusterCertificate = null;
        this.clusterCsr = null;
        this.hsmCertificate = null;
        this.manufacturerHardwareCertificate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterCertificates defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsHardwareCertificate;
        private String clusterCertificate;
        private String clusterCsr;
        private String hsmCertificate;
        private String manufacturerHardwareCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterCertificates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsHardwareCertificate = defaults.awsHardwareCertificate;
    	      this.clusterCertificate = defaults.clusterCertificate;
    	      this.clusterCsr = defaults.clusterCsr;
    	      this.hsmCertificate = defaults.hsmCertificate;
    	      this.manufacturerHardwareCertificate = defaults.manufacturerHardwareCertificate;
        }

        public Builder setAwsHardwareCertificate(String awsHardwareCertificate) {
            this.awsHardwareCertificate = Objects.requireNonNull(awsHardwareCertificate);
            return this;
        }

        public Builder setClusterCertificate(String clusterCertificate) {
            this.clusterCertificate = Objects.requireNonNull(clusterCertificate);
            return this;
        }

        public Builder setClusterCsr(String clusterCsr) {
            this.clusterCsr = Objects.requireNonNull(clusterCsr);
            return this;
        }

        public Builder setHsmCertificate(String hsmCertificate) {
            this.hsmCertificate = Objects.requireNonNull(hsmCertificate);
            return this;
        }

        public Builder setManufacturerHardwareCertificate(String manufacturerHardwareCertificate) {
            this.manufacturerHardwareCertificate = Objects.requireNonNull(manufacturerHardwareCertificate);
            return this;
        }
        public GetClusterClusterCertificates build() {
            return new GetClusterClusterCertificates(awsHardwareCertificate, clusterCertificate, clusterCsr, hsmCertificate, manufacturerHardwareCertificate);
        }
    }
}
