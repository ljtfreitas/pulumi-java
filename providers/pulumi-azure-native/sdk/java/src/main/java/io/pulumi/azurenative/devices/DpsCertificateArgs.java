// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DpsCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final DpsCertificateArgs Empty = new DpsCertificateArgs();

    /**
     * Base-64 representation of the X509 leaf certificate .cer file or just .pem file content.
     * 
     */
    @InputImport(name="certificate")
        private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * The name of the certificate create or update.
     * 
     */
    @InputImport(name="certificateName")
        private final @Nullable Input<String> certificateName;

    public Input<String> getCertificateName() {
        return this.certificateName == null ? Input.empty() : this.certificateName;
    }

    /**
     * True indicates that the certificate will be created in verified state and proof of possession will not be required.
     * 
     */
    @InputImport(name="isVerified")
        private final @Nullable Input<Boolean> isVerified;

    public Input<Boolean> getIsVerified() {
        return this.isVerified == null ? Input.empty() : this.isVerified;
    }

    /**
     * The name of the provisioning service.
     * 
     */
    @InputImport(name="provisioningServiceName", required=true)
        private final Input<String> provisioningServiceName;

    public Input<String> getProvisioningServiceName() {
        return this.provisioningServiceName;
    }

    /**
     * Resource group identifier.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DpsCertificateArgs(
        @Nullable Input<String> certificate,
        @Nullable Input<String> certificateName,
        @Nullable Input<Boolean> isVerified,
        Input<String> provisioningServiceName,
        Input<String> resourceGroupName) {
        this.certificate = certificate;
        this.certificateName = certificateName;
        this.isVerified = isVerified;
        this.provisioningServiceName = Objects.requireNonNull(provisioningServiceName, "expected parameter 'provisioningServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DpsCertificateArgs() {
        this.certificate = Input.empty();
        this.certificateName = Input.empty();
        this.isVerified = Input.empty();
        this.provisioningServiceName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DpsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private @Nullable Input<String> certificateName;
        private @Nullable Input<Boolean> isVerified;
        private Input<String> provisioningServiceName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DpsCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateName = defaults.certificateName;
    	      this.isVerified = defaults.isVerified;
    	      this.provisioningServiceName = defaults.provisioningServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCertificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setCertificateName(@Nullable Input<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        public Builder setCertificateName(@Nullable String certificateName) {
            this.certificateName = Input.ofNullable(certificateName);
            return this;
        }

        public Builder setIsVerified(@Nullable Input<Boolean> isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public Builder setIsVerified(@Nullable Boolean isVerified) {
            this.isVerified = Input.ofNullable(isVerified);
            return this;
        }

        public Builder setProvisioningServiceName(Input<String> provisioningServiceName) {
            this.provisioningServiceName = Objects.requireNonNull(provisioningServiceName);
            return this;
        }

        public Builder setProvisioningServiceName(String provisioningServiceName) {
            this.provisioningServiceName = Input.of(Objects.requireNonNull(provisioningServiceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public DpsCertificateArgs build() {
            return new DpsCertificateArgs(certificate, certificateName, isVerified, provisioningServiceName, resourceGroupName);
        }
    }
}
