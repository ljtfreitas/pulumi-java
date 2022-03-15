// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateArgs Empty = new GetCertificateArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The identifier for the certificate. This must be made up of algorithm and thumbprint separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * 
     */
    @Import(name="certificateName", required=true)
      private final String certificateName;

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCertificateArgs(
        String accountName,
        String certificateName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.certificateName = Objects.requireNonNull(certificateName, "expected parameter 'certificateName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCertificateArgs() {
        this.accountName = null;
        this.certificateName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String certificateName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.certificateName = defaults.certificateName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder certificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetCertificateArgs build() {
            return new GetCertificateArgs(accountName, certificateName, resourceGroupName);
        }
    }
}
