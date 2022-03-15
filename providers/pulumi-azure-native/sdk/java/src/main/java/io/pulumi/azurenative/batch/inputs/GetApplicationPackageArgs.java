// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationPackageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationPackageArgs Empty = new GetApplicationPackageArgs();

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
     * The name of the application. This must be unique within the account.
     * 
     */
    @Import(name="applicationName", required=true)
      private final String applicationName;

    public String getApplicationName() {
        return this.applicationName;
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

    /**
     * The version of the application.
     * 
     */
    @Import(name="versionName", required=true)
      private final String versionName;

    public String getVersionName() {
        return this.versionName;
    }

    public GetApplicationPackageArgs(
        String accountName,
        String applicationName,
        String resourceGroupName,
        String versionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.versionName = Objects.requireNonNull(versionName, "expected parameter 'versionName' to be non-null");
    }

    private GetApplicationPackageArgs() {
        this.accountName = null;
        this.applicationName = null;
        this.resourceGroupName = null;
        this.versionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String applicationName;
        private String resourceGroupName;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.applicationName = defaults.applicationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.versionName = defaults.versionName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder versionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }
        public GetApplicationPackageArgs build() {
            return new GetApplicationPackageArgs(accountName, applicationName, resourceGroupName, versionName);
        }
    }
}
