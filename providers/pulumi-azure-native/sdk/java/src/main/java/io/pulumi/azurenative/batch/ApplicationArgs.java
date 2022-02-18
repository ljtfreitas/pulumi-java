// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * A value indicating whether packages within the application may be overwritten using the same version string.
     * 
     */
    @InputImport(name="allowUpdates")
    private final @Nullable Input<Boolean> allowUpdates;

    public Input<Boolean> getAllowUpdates() {
        return this.allowUpdates == null ? Input.empty() : this.allowUpdates;
    }

    /**
     * The name of the application. This must be unique within the account.
     * 
     */
    @InputImport(name="applicationName")
    private final @Nullable Input<String> applicationName;

    public Input<String> getApplicationName() {
        return this.applicationName == null ? Input.empty() : this.applicationName;
    }

    /**
     * The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     * 
     */
    @InputImport(name="defaultVersion")
    private final @Nullable Input<String> defaultVersion;

    public Input<String> getDefaultVersion() {
        return this.defaultVersion == null ? Input.empty() : this.defaultVersion;
    }

    /**
     * The display name for the application.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ApplicationArgs(
        Input<String> accountName,
        @Nullable Input<Boolean> allowUpdates,
        @Nullable Input<String> applicationName,
        @Nullable Input<String> defaultVersion,
        @Nullable Input<String> displayName,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.allowUpdates = allowUpdates;
        this.applicationName = applicationName;
        this.defaultVersion = defaultVersion;
        this.displayName = displayName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ApplicationArgs() {
        this.accountName = Input.empty();
        this.allowUpdates = Input.empty();
        this.applicationName = Input.empty();
        this.defaultVersion = Input.empty();
        this.displayName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<Boolean> allowUpdates;
        private @Nullable Input<String> applicationName;
        private @Nullable Input<String> defaultVersion;
        private @Nullable Input<String> displayName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.allowUpdates = defaults.allowUpdates;
    	      this.applicationName = defaults.applicationName;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.displayName = defaults.displayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setAllowUpdates(@Nullable Input<Boolean> allowUpdates) {
            this.allowUpdates = allowUpdates;
            return this;
        }

        public Builder setAllowUpdates(@Nullable Boolean allowUpdates) {
            this.allowUpdates = Input.ofNullable(allowUpdates);
            return this;
        }

        public Builder setApplicationName(@Nullable Input<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder setApplicationName(@Nullable String applicationName) {
            this.applicationName = Input.ofNullable(applicationName);
            return this;
        }

        public Builder setDefaultVersion(@Nullable Input<String> defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        public Builder setDefaultVersion(@Nullable String defaultVersion) {
            this.defaultVersion = Input.ofNullable(defaultVersion);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public ApplicationArgs build() {
            return new ApplicationArgs(accountName, allowUpdates, applicationName, defaultVersion, displayName, resourceGroupName);
        }
    }
}
